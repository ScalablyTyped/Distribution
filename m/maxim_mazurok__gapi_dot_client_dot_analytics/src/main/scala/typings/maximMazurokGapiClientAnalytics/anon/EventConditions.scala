package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventConditions extends StObject {
  
  /** List of event conditions. */
  var eventConditions: js.UndefOr[js.Array[ComparisonType]] = js.undefined
  
  /** Determines if the event value should be used as the value for this goal. */
  var useEventValue: js.UndefOr[Boolean] = js.undefined
}
object EventConditions {
  
  inline def apply(): EventConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventConditions]
  }
  
  extension [Self <: EventConditions](x: Self) {
    
    inline def setEventConditions(value: js.Array[ComparisonType]): Self = StObject.set(x, "eventConditions", value.asInstanceOf[js.Any])
    
    inline def setEventConditionsUndefined: Self = StObject.set(x, "eventConditions", js.undefined)
    
    inline def setEventConditionsVarargs(value: ComparisonType*): Self = StObject.set(x, "eventConditions", js.Array(value :_*))
    
    inline def setUseEventValue(value: Boolean): Self = StObject.set(x, "useEventValue", value.asInstanceOf[js.Any])
    
    inline def setUseEventValueUndefined: Self = StObject.set(x, "useEventValue", js.undefined)
  }
}
