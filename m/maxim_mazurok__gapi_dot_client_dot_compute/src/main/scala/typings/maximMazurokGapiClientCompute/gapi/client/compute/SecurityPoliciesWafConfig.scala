package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPoliciesWafConfig extends StObject {
  
  var wafRules: js.UndefOr[PreconfiguredWafSet] = js.native
}
object SecurityPoliciesWafConfig {
  
  @scala.inline
  def apply(): SecurityPoliciesWafConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPoliciesWafConfig]
  }
  
  @scala.inline
  implicit class SecurityPoliciesWafConfigMutableBuilder[Self <: SecurityPoliciesWafConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWafRules(value: PreconfiguredWafSet): Self = StObject.set(x, "wafRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWafRulesUndefined: Self = StObject.set(x, "wafRules", js.undefined)
  }
}
