package typings.mailparser.mailparserMod

import typings.mailparser.mailparserStrings.text
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
  var html: js.UndefOr[String | Boolean] = js.undefined
  /**
  	 * Includes the plaintext version of the message.
  	 *
  	 * Is set if the message has at least one `text/plain` node.
  	 */
  var text: js.UndefOr[String] = js.undefined
  /**
  	 * Includes the plaintext version of the message in HTML format.
  	 *
  	 * Is set if the message has at least one `text/plain` node.
  	 */
  var textAsHtml: js.UndefOr[String] = js.undefined
  /**
  	 * Message type.
  	 */
  var `type`: text
}

object MessageText {
  @scala.inline
  def apply(`type`: text, html: String | Boolean = null, text: String = null, textAsHtml: String = null): MessageText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAsHtml != null) __obj.updateDynamic("textAsHtml")(textAsHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageText]
  }
}

