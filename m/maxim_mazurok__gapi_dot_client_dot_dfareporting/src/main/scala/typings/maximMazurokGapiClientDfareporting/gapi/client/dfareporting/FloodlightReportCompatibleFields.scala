package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloodlightReportCompatibleFields extends StObject {
  
  /** Dimensions which are compatible to be selected in the "dimensionFilters" section of the report. */
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.undefined
  
  /** Dimensions which are compatible to be selected in the "dimensions" section of the report. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#floodlightReportCompatibleFields. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
}
object FloodlightReportCompatibleFields {
  
  inline def apply(): FloodlightReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightReportCompatibleFields]
  }
  
  extension [Self <: FloodlightReportCompatibleFields](x: Self) {
    
    inline def setDimensionFilters(value: js.Array[Dimension]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    inline def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    inline def setDimensionFiltersVarargs(value: Dimension*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    inline def setDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
  }
}
