package typings
package imapDashSimpleLib.imapDashSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var attributes: imapLib.imapMod.ImapMessageAttributes
  var parts: js.Array[MessageBodyPart]
  var seqno: scala.Double
}

object Message {
  @scala.inline
  def apply(
    attributes: imapLib.imapMod.ImapMessageAttributes,
    parts: js.Array[MessageBodyPart],
    seqno: scala.Double
  ): Message = {
    val __obj = js.Dynamic.literal(attributes = attributes, parts = parts, seqno = seqno)
  
    __obj.asInstanceOf[Message]
  }
}

