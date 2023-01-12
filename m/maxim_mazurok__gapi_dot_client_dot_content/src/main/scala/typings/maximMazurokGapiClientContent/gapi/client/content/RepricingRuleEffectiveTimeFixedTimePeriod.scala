package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepricingRuleEffectiveTimeFixedTimePeriod extends StObject {
  
  /** The end time (exclusive) of the period. It can only be hour granularity. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The start time (inclusive) of the period. It can only be hour granularity. */
  var startTime: js.UndefOr[String] = js.undefined
}
object RepricingRuleEffectiveTimeFixedTimePeriod {
  
  inline def apply(): RepricingRuleEffectiveTimeFixedTimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleEffectiveTimeFixedTimePeriod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepricingRuleEffectiveTimeFixedTimePeriod] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
