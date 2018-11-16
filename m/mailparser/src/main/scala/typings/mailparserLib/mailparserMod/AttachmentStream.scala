package typings
package mailparserLib.mailparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * MailParser Attachment object.
 */

trait AttachmentStream extends AttachmentCommon {
  /**
  	 * A Buffer that contains the attachment contents.
  	 */
  @JSName("content")
  var content_AttachmentStream: nodeLib.streamMod.Stream
  /**
  	 * Method must be called once you have processed the attachment.
  	 */
  def release(): scala.Unit
}

