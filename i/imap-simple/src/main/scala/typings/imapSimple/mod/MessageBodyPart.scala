package typings.imapSimple.mod

import typings.imap.mod.ImapMessageBodyInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageBodyPart extends ImapMessageBodyInfo {
  /** string type where which=='TEXT', complex Object where which=='HEADER' */
  var body: js.Any
}

object MessageBodyPart {
  @scala.inline
  def apply(body: js.Any, size: Double, which: String): MessageBodyPart = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBodyPart]
  }
}

