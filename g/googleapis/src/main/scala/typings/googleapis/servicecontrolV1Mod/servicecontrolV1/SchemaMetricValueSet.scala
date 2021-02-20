package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a set of metric values in the same metric. Each metric value in
  * the set should have a unique combination of start time, end time, and label
  * values.
  */
@js.native
trait SchemaMetricValueSet extends StObject {
  
  /**
    * The metric name defined in the service configuration.
    */
  var metricName: js.UndefOr[String] = js.native
  
  /**
    * The values in this metric.
    */
  var metricValues: js.UndefOr[js.Array[SchemaMetricValue]] = js.native
}
object SchemaMetricValueSet {
  
  @scala.inline
  def apply(): SchemaMetricValueSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricValueSet]
  }
  
  @scala.inline
  implicit class SchemaMetricValueSetMutableBuilder[Self <: SchemaMetricValueSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    @scala.inline
    def setMetricValues(value: js.Array[SchemaMetricValue]): Self = StObject.set(x, "metricValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricValuesUndefined: Self = StObject.set(x, "metricValues", js.undefined)
    
    @scala.inline
    def setMetricValuesVarargs(value: SchemaMetricValue*): Self = StObject.set(x, "metricValues", js.Array(value :_*))
  }
}
