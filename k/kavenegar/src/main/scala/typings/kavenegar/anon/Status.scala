package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var messageid: Double
  
  var status: Double
  
  var statustext: String
}
object Status {
  
  inline def apply(messageid: Double, status: Double, statustext: String): Status = {
    val __obj = js.Dynamic.literal(messageid = messageid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statustext = statustext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setMessageid(value: Double): Self = StObject.set(x, "messageid", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatustext(value: String): Self = StObject.set(x, "statustext", value.asInstanceOf[js.Any])
  }
}
