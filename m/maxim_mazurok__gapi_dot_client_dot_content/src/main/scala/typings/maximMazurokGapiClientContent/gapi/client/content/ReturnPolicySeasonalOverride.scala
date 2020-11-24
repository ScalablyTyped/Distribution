package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnPolicySeasonalOverride extends js.Object {
  
  /** Required. Last day on which the override applies. In ISO 8601 format. */
  var endDate: js.UndefOr[String] = js.native
  
  /** Required. The name of the seasonal override as shown in Merchant Center. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. The policy which is in effect during that time. */
  var policy: js.UndefOr[ReturnPolicyPolicy] = js.native
  
  /** Required. First day on which the override applies. In ISO 8601 format. */
  var startDate: js.UndefOr[String] = js.native
}
object ReturnPolicySeasonalOverride {
  
  @scala.inline
  def apply(): ReturnPolicySeasonalOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnPolicySeasonalOverride]
  }
  
  @scala.inline
  implicit class ReturnPolicySeasonalOverrideOps[Self <: ReturnPolicySeasonalOverride] (val x: Self) extends AnyVal {
    
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
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPolicy(value: ReturnPolicyPolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
}
