package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ActionFailedSecurityPolicyApply extends StObject {
  
  /**
    * Resource name of one of the assets with failing security policy application. Populated for a lake or zone resource only.
    */
  var asset: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ActionFailedSecurityPolicyApply {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ActionFailedSecurityPolicyApply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ActionFailedSecurityPolicyApply]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ActionFailedSecurityPolicyApply](x: Self) {
    
    inline def setAsset(value: String): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetNull: Self = StObject.set(x, "asset", null)
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
  }
}
