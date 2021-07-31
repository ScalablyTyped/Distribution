package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfig extends StObject {
  
  /** Kerberos related configuration. */
  var kerberosConfig: js.UndefOr[KerberosConfig] = js.undefined
}
object SecurityConfig {
  
  @scala.inline
  def apply(): SecurityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfig]
  }
  
  @scala.inline
  implicit class SecurityConfigMutableBuilder[Self <: SecurityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKerberosConfig(value: KerberosConfig): Self = StObject.set(x, "kerberosConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerberosConfigUndefined: Self = StObject.set(x, "kerberosConfig", js.undefined)
  }
}
