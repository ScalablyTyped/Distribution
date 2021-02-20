package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportCompatibleFields extends StObject {
  
  /** Dimensions which are compatible to be selected in the "dimensionFilters" section of the report. */
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** Dimensions which are compatible to be selected in the "dimensions" section of the report. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** The kind of resource this is, in this case dfareporting#reportCompatibleFields. */
  var kind: js.UndefOr[String] = js.native
  
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  
  /** Metrics which are compatible to be selected as activity metrics to pivot on in the "activities" section of the report. */
  var pivotedActivityMetrics: js.UndefOr[js.Array[Metric]] = js.native
}
object ReportCompatibleFields {
  
  @scala.inline
  def apply(): ReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportCompatibleFields]
  }
  
  @scala.inline
  implicit class ReportCompatibleFieldsMutableBuilder[Self <: ReportCompatibleFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionFilters(value: js.Array[Dimension]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: Dimension*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
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
    def setPivotedActivityMetrics(value: js.Array[Metric]): Self = StObject.set(x, "pivotedActivityMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotedActivityMetricsUndefined: Self = StObject.set(x, "pivotedActivityMetrics", js.undefined)
    
    @scala.inline
    def setPivotedActivityMetricsVarargs(value: Metric*): Self = StObject.set(x, "pivotedActivityMetrics", js.Array(value :_*))
  }
}
