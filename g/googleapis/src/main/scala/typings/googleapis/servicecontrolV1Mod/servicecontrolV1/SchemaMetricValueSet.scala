package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricValueSet extends StObject {
  
  /**
    * The metric name defined in the service configuration.
    */
  var metricName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The values in this metric.
    */
  var metricValues: js.UndefOr[js.Array[SchemaMetricValue]] = js.undefined
}
object SchemaMetricValueSet {
  
  inline def apply(): SchemaMetricValueSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricValueSet]
  }
  
  extension [Self <: SchemaMetricValueSet](x: Self) {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameNull: Self = StObject.set(x, "metricName", null)
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setMetricValues(value: js.Array[SchemaMetricValue]): Self = StObject.set(x, "metricValues", value.asInstanceOf[js.Any])
    
    inline def setMetricValuesUndefined: Self = StObject.set(x, "metricValues", js.undefined)
    
    inline def setMetricValuesVarargs(value: SchemaMetricValue*): Self = StObject.set(x, "metricValues", js.Array(value*))
  }
}
