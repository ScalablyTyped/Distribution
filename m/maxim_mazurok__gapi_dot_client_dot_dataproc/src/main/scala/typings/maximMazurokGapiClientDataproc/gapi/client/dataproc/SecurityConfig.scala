package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfig extends StObject {
  
  /** Optional. Identity related configuration, including service account based secure multi-tenancy user mappings. */
  var identityConfig: js.UndefOr[IdentityConfig] = js.undefined
  
  /** Optional. Kerberos related configuration. */
  var kerberosConfig: js.UndefOr[KerberosConfig] = js.undefined
}
object SecurityConfig {
  
  inline def apply(): SecurityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfig]
  }
  
  extension [Self <: SecurityConfig](x: Self) {
    
    inline def setIdentityConfig(value: IdentityConfig): Self = StObject.set(x, "identityConfig", value.asInstanceOf[js.Any])
    
    inline def setIdentityConfigUndefined: Self = StObject.set(x, "identityConfig", js.undefined)
    
    inline def setKerberosConfig(value: KerberosConfig): Self = StObject.set(x, "kerberosConfig", value.asInstanceOf[js.Any])
    
    inline def setKerberosConfigUndefined: Self = StObject.set(x, "kerberosConfig", js.undefined)
  }
}
