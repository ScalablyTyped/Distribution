package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseData extends StObject {
  
  var user: InsightsServiceAccountResponseUser
}
object InsightsServiceAccountResponseData {
  
  inline def apply(user: InsightsServiceAccountResponseUser): InsightsServiceAccountResponseData = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseData]
  }
  
  extension [Self <: InsightsServiceAccountResponseData](x: Self) {
    
    inline def setUser(value: InsightsServiceAccountResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
