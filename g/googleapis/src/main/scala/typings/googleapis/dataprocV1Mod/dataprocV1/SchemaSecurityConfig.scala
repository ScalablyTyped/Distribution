package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityConfig extends StObject {
  
  /**
    * Optional. Identity related configuration, including service account based secure multi-tenancy user mappings.
    */
  var identityConfig: js.UndefOr[SchemaIdentityConfig] = js.undefined
  
  /**
    * Optional. Kerberos related configuration.
    */
  var kerberosConfig: js.UndefOr[SchemaKerberosConfig] = js.undefined
}
object SchemaSecurityConfig {
  
  inline def apply(): SchemaSecurityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityConfig]
  }
  
  extension [Self <: SchemaSecurityConfig](x: Self) {
    
    inline def setIdentityConfig(value: SchemaIdentityConfig): Self = StObject.set(x, "identityConfig", value.asInstanceOf[js.Any])
    
    inline def setIdentityConfigUndefined: Self = StObject.set(x, "identityConfig", js.undefined)
    
    inline def setKerberosConfig(value: SchemaKerberosConfig): Self = StObject.set(x, "kerberosConfig", value.asInstanceOf[js.Any])
    
    inline def setKerberosConfigUndefined: Self = StObject.set(x, "kerberosConfig", js.undefined)
  }
}
