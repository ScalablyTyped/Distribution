package typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIapTestServiceAccountInfo extends StObject {
  
  /**
    * Required. Describes OAuth2 client id of resources protected by Identity-Aware-Proxy (IAP).
    */
  var targetAudienceClientId: js.UndefOr[String | Null] = js.undefined
}
object SchemaIapTestServiceAccountInfo {
  
  inline def apply(): SchemaIapTestServiceAccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIapTestServiceAccountInfo]
  }
  
  extension [Self <: SchemaIapTestServiceAccountInfo](x: Self) {
    
    inline def setTargetAudienceClientId(value: String): Self = StObject.set(x, "targetAudienceClientId", value.asInstanceOf[js.Any])
    
    inline def setTargetAudienceClientIdNull: Self = StObject.set(x, "targetAudienceClientId", null)
    
    inline def setTargetAudienceClientIdUndefined: Self = StObject.set(x, "targetAudienceClientId", js.undefined)
  }
}
