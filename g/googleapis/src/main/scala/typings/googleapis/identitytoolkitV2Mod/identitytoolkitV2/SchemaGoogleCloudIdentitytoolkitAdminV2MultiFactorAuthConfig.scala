package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig extends StObject {
  
  /**
    * A list of usable second factors for this project.
    */
  var enabledProviders: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether MultiFactor Authentication has been enabled for this project.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig](x: Self) {
    
    inline def setEnabledProviders(value: js.Array[String]): Self = StObject.set(x, "enabledProviders", value.asInstanceOf[js.Any])
    
    inline def setEnabledProvidersNull: Self = StObject.set(x, "enabledProviders", null)
    
    inline def setEnabledProvidersUndefined: Self = StObject.set(x, "enabledProviders", js.undefined)
    
    inline def setEnabledProvidersVarargs(value: String*): Self = StObject.set(x, "enabledProviders", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
