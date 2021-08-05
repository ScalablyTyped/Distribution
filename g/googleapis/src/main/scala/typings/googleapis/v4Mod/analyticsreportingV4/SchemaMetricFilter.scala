package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MetricFilter specifies the filter on a metric.
  */
trait SchemaMetricFilter extends StObject {
  
  /**
    * The value to compare against.
    */
  var comparisonValue: js.UndefOr[String] = js.undefined
  
  /**
    * The metric that will be filtered on. A metricFilter must contain a metric
    * name. A metric name can be an alias earlier defined as a metric or it can
    * also be a metric expression.
    */
  var metricName: js.UndefOr[String] = js.undefined
  
  /**
    * Logical `NOT` operator. If this boolean is set to true, then the matching
    * metric values will be excluded in the report. The default is false.
    */
  var not: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Is the metric `EQUAL`, `LESS_THAN` or `GREATER_THAN` the comparisonValue,
    * the default is `EQUAL`. If the operator is `IS_MISSING`, checks if the
    * metric is missing and would ignore the comparisonValue.
    */
  var operator: js.UndefOr[String] = js.undefined
}
object SchemaMetricFilter {
  
  inline def apply(): SchemaMetricFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricFilter]
  }
  
  extension [Self <: SchemaMetricFilter](x: Self) {
    
    inline def setComparisonValue(value: String): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
    
    inline def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}
