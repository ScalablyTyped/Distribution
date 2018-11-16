package typings
package mailparserLib.mailparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Attachment object.
 */

trait Attachment extends AttachmentCommon {
  /**
  	 * A Buffer that contains the attachment contents.
  	 */
  @JSName("content")
  var content_Attachment: nodeLib.Buffer
  /**
  	 * If true then this attachment should not be offered for download
  	 * (at least not in the main attachments list).
  	 */
  @JSName("related")
  var related_Attachment: scala.Boolean
}

