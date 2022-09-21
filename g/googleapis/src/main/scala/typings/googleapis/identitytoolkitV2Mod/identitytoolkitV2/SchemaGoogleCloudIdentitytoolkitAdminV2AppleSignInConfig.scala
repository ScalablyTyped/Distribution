package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2AppleSignInConfig extends StObject {
  
  /**
    * A list of Bundle ID's usable by this project
    */
  var bundleIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var codeFlowConfig: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2CodeFlowConfig] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2AppleSignInConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2AppleSignInConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2AppleSignInConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2AppleSignInConfig](x: Self) {
    
    inline def setBundleIds(value: js.Array[String]): Self = StObject.set(x, "bundleIds", value.asInstanceOf[js.Any])
    
    inline def setBundleIdsNull: Self = StObject.set(x, "bundleIds", null)
    
    inline def setBundleIdsUndefined: Self = StObject.set(x, "bundleIds", js.undefined)
    
    inline def setBundleIdsVarargs(value: String*): Self = StObject.set(x, "bundleIds", js.Array(value*))
    
    inline def setCodeFlowConfig(value: SchemaGoogleCloudIdentitytoolkitAdminV2CodeFlowConfig): Self = StObject.set(x, "codeFlowConfig", value.asInstanceOf[js.Any])
    
    inline def setCodeFlowConfigUndefined: Self = StObject.set(x, "codeFlowConfig", js.undefined)
  }
}
