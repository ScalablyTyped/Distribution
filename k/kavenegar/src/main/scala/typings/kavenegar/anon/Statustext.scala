package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statustext extends StObject {
  
  var localid: String
  
  var messageid: Double
  
  var status: Double
  
  var statustext: String
}
object Statustext {
  
  inline def apply(localid: String, messageid: Double, status: Double, statustext: String): Statustext = {
    val __obj = js.Dynamic.literal(localid = localid.asInstanceOf[js.Any], messageid = messageid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statustext = statustext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statustext]
  }
  
  extension [Self <: Statustext](x: Self) {
    
    inline def setLocalid(value: String): Self = StObject.set(x, "localid", value.asInstanceOf[js.Any])
    
    inline def setMessageid(value: Double): Self = StObject.set(x, "messageid", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatustext(value: String): Self = StObject.set(x, "statustext", value.asInstanceOf[js.Any])
  }
}
