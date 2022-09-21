package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricRule extends StObject {
  
  /**
    * Metrics to update when the selected methods are called, and the associated cost applied to each metric. The key of the map is the metric name, and the values are the amount increased for the metric against which the quota limits are defined. The value must not be negative.
    */
  var metricCosts: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Selects the methods to which this rule applies. Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetricRule {
  
  inline def apply(): SchemaMetricRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricRule]
  }
  
  extension [Self <: SchemaMetricRule](x: Self) {
    
    inline def setMetricCosts(value: StringDictionary[String]): Self = StObject.set(x, "metricCosts", value.asInstanceOf[js.Any])
    
    inline def setMetricCostsNull: Self = StObject.set(x, "metricCosts", null)
    
    inline def setMetricCostsUndefined: Self = StObject.set(x, "metricCosts", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
