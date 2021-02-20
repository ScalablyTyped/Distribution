package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepricingRuleEffectiveTime extends StObject {
  
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
  implicit class RepricingRuleEffectiveTimeMutableBuilder[Self <: RepricingRuleEffectiveTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedTimePeriods(value: js.Array[RepricingRuleEffectiveTimeFixedTimePeriod]): Self = StObject.set(x, "fixedTimePeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedTimePeriodsUndefined: Self = StObject.set(x, "fixedTimePeriods", js.undefined)
    
    @scala.inline
    def setFixedTimePeriodsVarargs(value: RepricingRuleEffectiveTimeFixedTimePeriod*): Self = StObject.set(x, "fixedTimePeriods", js.Array(value :_*))
  }
}
