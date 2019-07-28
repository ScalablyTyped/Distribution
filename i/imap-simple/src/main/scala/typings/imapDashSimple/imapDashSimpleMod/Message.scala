package typings.imapDashSimple.imapDashSimpleMod

import typings.imap.imapMod.ImapMessageAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var attributes: ImapMessageAttributes
  var parts: js.Array[MessageBodyPart]
  var seqno: Double
}

object Message {
  @scala.inline
  def apply(attributes: ImapMessageAttributes, parts: js.Array[MessageBodyPart], seqno: Double): Message = {
    val __obj = js.Dynamic.literal(attributes = attributes, parts = parts, seqno = seqno)
  
    __obj.asInstanceOf[Message]
  }
}

