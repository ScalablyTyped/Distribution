package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfig extends StObject {
  
  /** Kerberos related configuration. */
  var kerberosConfig: js.UndefOr[KerberosConfig] = js.undefined
}
object SecurityConfig {
  
  inline def apply(): SecurityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfig]
  }
  
  extension [Self <: SecurityConfig](x: Self) {
    
    inline def setKerberosConfig(value: KerberosConfig): Self = StObject.set(x, "kerberosConfig", value.asInstanceOf[js.Any])
    
    inline def setKerberosConfigUndefined: Self = StObject.set(x, "kerberosConfig", js.undefined)
  }
}
