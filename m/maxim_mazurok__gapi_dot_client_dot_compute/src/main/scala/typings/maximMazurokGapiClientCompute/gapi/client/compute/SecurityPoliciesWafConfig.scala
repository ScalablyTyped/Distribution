package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPoliciesWafConfig extends js.Object {
  
  var wafRules: js.UndefOr[PreconfiguredWafSet] = js.native
}
object SecurityPoliciesWafConfig {
  
  @scala.inline
  def apply(): SecurityPoliciesWafConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPoliciesWafConfig]
  }
  
  @scala.inline
  implicit class SecurityPoliciesWafConfigOps[Self <: SecurityPoliciesWafConfig] (val x: Self) extends AnyVal {
    
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
    def setWafRules(value: PreconfiguredWafSet): Self = this.set("wafRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWafRules: Self = this.set("wafRules", js.undefined)
  }
}
