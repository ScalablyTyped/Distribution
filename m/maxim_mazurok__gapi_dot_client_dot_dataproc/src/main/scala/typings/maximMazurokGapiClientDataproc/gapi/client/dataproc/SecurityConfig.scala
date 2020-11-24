package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityConfig extends js.Object {
  
  /** Kerberos related configuration. */
  var kerberosConfig: js.UndefOr[KerberosConfig] = js.native
}
object SecurityConfig {
  
  @scala.inline
  def apply(): SecurityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfig]
  }
  
  @scala.inline
  implicit class SecurityConfigOps[Self <: SecurityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKerberosConfig(value: KerberosConfig): Self = this.set("kerberosConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKerberosConfig: Self = this.set("kerberosConfig", js.undefined)
  }
}
