package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepricingRuleEffectiveTimeFixedTimePeriod extends js.Object {
  
  /** The end time (exclusive) of the period. It can only be hour granularity. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The start time (inclusive) of the period. It can only be hour granularity. */
  var startTime: js.UndefOr[String] = js.native
}
object RepricingRuleEffectiveTimeFixedTimePeriod {
  
  @scala.inline
  def apply(): RepricingRuleEffectiveTimeFixedTimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleEffectiveTimeFixedTimePeriod]
  }
  
  @scala.inline
  implicit class RepricingRuleEffectiveTimeFixedTimePeriodOps[Self <: RepricingRuleEffectiveTimeFixedTimePeriod] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
