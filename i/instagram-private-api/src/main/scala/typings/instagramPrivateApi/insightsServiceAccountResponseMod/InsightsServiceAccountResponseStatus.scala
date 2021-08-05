package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseStatus extends StObject {
  
  var account_type: String
}
object InsightsServiceAccountResponseStatus {
  
  inline def apply(account_type: String): InsightsServiceAccountResponseStatus = {
    val __obj = js.Dynamic.literal(account_type = account_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseStatus]
  }
  
  extension [Self <: InsightsServiceAccountResponseStatus](x: Self) {
    
    inline def setAccount_type(value: String): Self = StObject.set(x, "account_type", value.asInstanceOf[js.Any])
  }
}
