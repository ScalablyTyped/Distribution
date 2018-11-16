package typings
package mailparserLib.mailparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Text message content.
 */

trait MessageText extends js.Object {
  /**
  	 * Includes the HTML version of the message.
  	 *
  	 * Is set if the message has at least one `text/html` node.
  	 */
  var html: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
  	 * Includes the plaintext version of the message.
  	 *
  	 * Is set if the message has at least one `text/plain` node.
  	 */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Includes the plaintext version of the message in HTML format.
  	 *
  	 * Is set if the message has at least one `text/plain` node.
  	 */
  var textAsHtml: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Message type.
  	 */
  var `type`: mailparserLib.mailparserLibStrings.text
}

