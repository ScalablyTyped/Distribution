package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossDimensionReachReportCompatibleFields extends StObject {
  
  /** Dimensions which are compatible to be selected in the "breakdown" section of the report. */
  var breakdown: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** Dimensions which are compatible to be selected in the "dimensionFilters" section of the report. */
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** The kind of resource this is, in this case dfareporting#crossDimensionReachReportCompatibleFields. */
  var kind: js.UndefOr[String] = js.native
  
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  
  /** Metrics which are compatible to be selected in the "overlapMetricNames" section of the report. */
  var overlapMetrics: js.UndefOr[js.Array[Metric]] = js.native
}
object CrossDimensionReachReportCompatibleFields {
  
  @scala.inline
  def apply(): CrossDimensionReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossDimensionReachReportCompatibleFields]
  }
  
  @scala.inline
  implicit class CrossDimensionReachReportCompatibleFieldsMutableBuilder[Self <: CrossDimensionReachReportCompatibleFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakdown(value: js.Array[Dimension]): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakdownUndefined: Self = StObject.set(x, "breakdown", js.undefined)
    
    @scala.inline
    def setBreakdownVarargs(value: Dimension*): Self = StObject.set(x, "breakdown", js.Array(value :_*))
    
    @scala.inline
    def setDimensionFilters(value: js.Array[Dimension]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: Dimension*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setOverlapMetrics(value: js.Array[Metric]): Self = StObject.set(x, "overlapMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapMetricsUndefined: Self = StObject.set(x, "overlapMetrics", js.undefined)
    
    @scala.inline
    def setOverlapMetricsVarargs(value: Metric*): Self = StObject.set(x, "overlapMetrics", js.Array(value :_*))
  }
}
