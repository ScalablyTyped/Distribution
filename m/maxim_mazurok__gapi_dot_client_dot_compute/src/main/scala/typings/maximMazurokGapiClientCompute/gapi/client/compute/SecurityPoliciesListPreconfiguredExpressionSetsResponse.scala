package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPoliciesListPreconfiguredExpressionSetsResponse extends js.Object {
  
  var preconfiguredExpressionSets: js.UndefOr[SecurityPoliciesWafConfig] = js.native
}
object SecurityPoliciesListPreconfiguredExpressionSetsResponse {
  
  @scala.inline
  def apply(): SecurityPoliciesListPreconfiguredExpressionSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPoliciesListPreconfiguredExpressionSetsResponse]
  }
  
  @scala.inline
  implicit class SecurityPoliciesListPreconfiguredExpressionSetsResponseOps[Self <: SecurityPoliciesListPreconfiguredExpressionSetsResponse] (val x: Self) extends AnyVal {
    
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
    def setPreconfiguredExpressionSets(value: SecurityPoliciesWafConfig): Self = this.set("preconfiguredExpressionSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreconfiguredExpressionSets: Self = this.set("preconfiguredExpressionSets", js.undefined)
  }
}
