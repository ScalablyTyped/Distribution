package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepricingRuleEffectiveTime extends StObject {
  
  /**
    * A list of fixed time periods combined with OR. The maximum number of entries is limited to 5.
    */
  var fixedTimePeriods: js.UndefOr[js.Array[SchemaRepricingRuleEffectiveTimeFixedTimePeriod]] = js.undefined
}
object SchemaRepricingRuleEffectiveTime {
  
  inline def apply(): SchemaRepricingRuleEffectiveTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepricingRuleEffectiveTime]
  }
  
  extension [Self <: SchemaRepricingRuleEffectiveTime](x: Self) {
    
    inline def setFixedTimePeriods(value: js.Array[SchemaRepricingRuleEffectiveTimeFixedTimePeriod]): Self = StObject.set(x, "fixedTimePeriods", value.asInstanceOf[js.Any])
    
    inline def setFixedTimePeriodsUndefined: Self = StObject.set(x, "fixedTimePeriods", js.undefined)
    
    inline def setFixedTimePeriodsVarargs(value: SchemaRepricingRuleEffectiveTimeFixedTimePeriod*): Self = StObject.set(x, "fixedTimePeriods", js.Array(value*))
  }
}
