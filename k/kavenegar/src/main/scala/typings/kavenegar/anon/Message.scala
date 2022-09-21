package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var date: Double
  
  var message: String
  
  var messageid: Double
  
  var receptor: String
  
  var sender: String
}
object Message {
  
  inline def apply(date: Double, message: String, messageid: Double, receptor: String, sender: String): Message = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageid = messageid.asInstanceOf[js.Any], receptor = receptor.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageid(value: Double): Self = StObject.set(x, "messageid", value.asInstanceOf[js.Any])
    
    inline def setReceptor(value: String): Self = StObject.set(x, "receptor", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
