package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepricingRuleEffectiveTime extends js.Object {
  
  /** A list of fixed time periods combined with OR. The maximum number of entries is limited to 5. */
  var fixedTimePeriods: js.UndefOr[js.Array[RepricingRuleEffectiveTimeFixedTimePeriod]] = js.native
}
object RepricingRuleEffectiveTime {
  
  @scala.inline
  def apply(): RepricingRuleEffectiveTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleEffectiveTime]
  }
  
  @scala.inline
  implicit class RepricingRuleEffectiveTimeOps[Self <: RepricingRuleEffectiveTime] (val x: Self) extends AnyVal {
    
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
    def setFixedTimePeriodsVarargs(value: RepricingRuleEffectiveTimeFixedTimePeriod*): Self = this.set("fixedTimePeriods", js.Array(value :_*))
    
    @scala.inline
    def setFixedTimePeriods(value: js.Array[RepricingRuleEffectiveTimeFixedTimePeriod]): Self = this.set("fixedTimePeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedTimePeriods: Self = this.set("fixedTimePeriods", js.undefined)
  }
}
