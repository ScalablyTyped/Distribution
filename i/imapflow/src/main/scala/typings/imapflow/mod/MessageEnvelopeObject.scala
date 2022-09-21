package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEnvelopeObject extends StObject {
  
  var bcc: js.Array[MessageAddressObject]
  
  var cc: js.Array[MessageAddressObject]
  
  var date: js.Date
  
  var from: js.Array[MessageAddressObject]
  
  var inReplyTo: String
  
  var messageId: String
  
  var replyTo: js.Array[MessageAddressObject]
  
  var sender: js.Array[MessageAddressObject]
  
  var subject: String
  
  var to: js.Array[MessageAddressObject]
}
object MessageEnvelopeObject {
  
  inline def apply(
    bcc: js.Array[MessageAddressObject],
    cc: js.Array[MessageAddressObject],
    date: js.Date,
    from: js.Array[MessageAddressObject],
    inReplyTo: String,
    messageId: String,
    replyTo: js.Array[MessageAddressObject],
    sender: js.Array[MessageAddressObject],
    subject: String,
    to: js.Array[MessageAddressObject]
  ): MessageEnvelopeObject = {
    val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], inReplyTo = inReplyTo.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], replyTo = replyTo.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEnvelopeObject]
  }
  
  extension [Self <: MessageEnvelopeObject](x: Self) {
    
    inline def setBcc(value: js.Array[MessageAddressObject]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
    
    inline def setBccVarargs(value: MessageAddressObject*): Self = StObject.set(x, "bcc", js.Array(value*))
    
    inline def setCc(value: js.Array[MessageAddressObject]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    inline def setCcVarargs(value: MessageAddressObject*): Self = StObject.set(x, "cc", js.Array(value*))
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: js.Array[MessageAddressObject]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromVarargs(value: MessageAddressObject*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setInReplyTo(value: String): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setReplyTo(value: js.Array[MessageAddressObject]): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
    
    inline def setReplyToVarargs(value: MessageAddressObject*): Self = StObject.set(x, "replyTo", js.Array(value*))
    
    inline def setSender(value: js.Array[MessageAddressObject]): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderVarargs(value: MessageAddressObject*): Self = StObject.set(x, "sender", js.Array(value*))
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTo(value: js.Array[MessageAddressObject]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToVarargs(value: MessageAddressObject*): Self = StObject.set(x, "to", js.Array(value*))
  }
}
