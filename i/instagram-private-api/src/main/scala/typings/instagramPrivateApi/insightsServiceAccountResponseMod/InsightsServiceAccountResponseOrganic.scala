package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseOrganic extends StObject {
  
  var status: String
  
  var value: Double
}
object InsightsServiceAccountResponseOrganic {
  
  inline def apply(status: String, value: Double): InsightsServiceAccountResponseOrganic = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseOrganic]
  }
  
  extension [Self <: InsightsServiceAccountResponseOrganic](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
