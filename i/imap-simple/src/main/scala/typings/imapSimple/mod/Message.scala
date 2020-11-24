package typings.imapSimple.mod

import typings.imap.mod.ImapMessageAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  var attributes: ImapMessageAttributes = js.native
  
  var parts: js.Array[MessageBodyPart] = js.native
  
  var seqno: Double = js.native
}
object Message {
  
  @scala.inline
  def apply(attributes: ImapMessageAttributes, parts: js.Array[MessageBodyPart], seqno: Double): Message = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], seqno = seqno.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributes(value: ImapMessageAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsVarargs(value: MessageBodyPart*): Self = this.set("parts", js.Array(value :_*))
    
    @scala.inline
    def setParts(value: js.Array[MessageBodyPart]): Self = this.set("parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeqno(value: Double): Self = this.set("seqno", value.asInstanceOf[js.Any])
  }
}
