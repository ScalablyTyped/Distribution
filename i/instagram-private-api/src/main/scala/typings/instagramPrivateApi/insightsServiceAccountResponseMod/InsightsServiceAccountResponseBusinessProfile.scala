package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseBusinessProfile extends StObject {
  
  var id: String
}
object InsightsServiceAccountResponseBusinessProfile {
  
  inline def apply(id: String): InsightsServiceAccountResponseBusinessProfile = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseBusinessProfile]
  }
  
  extension [Self <: InsightsServiceAccountResponseBusinessProfile](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
