package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cost extends StObject {
  
  var cost: Double
  
  var date: Double
  
  var message: String
  
  var messageid: Double
  
  var receptor: String
  
  var sender: String
  
  var status: Double
  
  var statustext: String
}
object Cost {
  
  inline def apply(
    cost: Double,
    date: Double,
    message: String,
    messageid: Double,
    receptor: String,
    sender: String,
    status: Double,
    statustext: String
  ): Cost = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageid = messageid.asInstanceOf[js.Any], receptor = receptor.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statustext = statustext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cost]
  }
  
  extension [Self <: Cost](x: Self) {
    
    inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageid(value: Double): Self = StObject.set(x, "messageid", value.asInstanceOf[js.Any])
    
    inline def setReceptor(value: String): Self = StObject.set(x, "receptor", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatustext(value: String): Self = StObject.set(x, "statustext", value.asInstanceOf[js.Any])
  }
}
