package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricFilter extends StObject {
  
  /** The value to compare against. */
  var comparisonValue: js.UndefOr[String] = js.native
  
  /** The metric that will be filtered on. A metricFilter must contain a metric name. A metric name can be an alias earlier defined as a metric or it can also be a metric expression. */
  var metricName: js.UndefOr[String] = js.native
  
  /** Logical `NOT` operator. If this boolean is set to true, then the matching metric values will be excluded in the report. The default is false. */
  var not: js.UndefOr[Boolean] = js.native
  
  /**
    * Is the metric `EQUAL`, `LESS_THAN` or `GREATER_THAN` the comparisonValue, the default is `EQUAL`. If the operator is `IS_MISSING`, checks if the metric is missing and would ignore
    * the comparisonValue.
    */
  var operator: js.UndefOr[String] = js.native
}
object MetricFilter {
  
  @scala.inline
  def apply(): MetricFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricFilter]
  }
  
  @scala.inline
  implicit class MetricFilterMutableBuilder[Self <: MetricFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonValue(value: String): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
    
    @scala.inline
    def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    @scala.inline
    def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}
