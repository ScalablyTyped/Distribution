package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimensions extends StObject {
  
  /** List of analytics dimensions. */
  var dimensions: js.UndefOr[String] = js.undefined
  
  /** End date. */
  var `end-date`: js.UndefOr[String] = js.undefined
  
  /** Comma-separated list of dimension or metric filters. */
  var filters: js.UndefOr[String] = js.undefined
  
  /** Unique table ID. */
  var ids: js.UndefOr[String] = js.undefined
  
  /** Maximum results per page. */
  var `max-results`: js.UndefOr[Double] = js.undefined
  
  /** List of analytics metrics. */
  var metrics: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Desired sampling level */
  var samplingLevel: js.UndefOr[String] = js.undefined
  
  /** Analytics advanced segment. */
  var segment: js.UndefOr[String] = js.undefined
  
  /** List of dimensions or metrics based on which Analytics data is sorted. */
  var sort: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Start date. */
  var `start-date`: js.UndefOr[String] = js.undefined
  
  /** Start index. */
  var `start-index`: js.UndefOr[Double] = js.undefined
}
object Dimensions {
  
  inline def apply(): Dimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimensions]
  }
  
  extension [Self <: Dimensions](x: Self) {
    
    inline def setDimensions(value: String): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def `setEnd-date`(value: String): Self = StObject.set(x, "end-date", value.asInstanceOf[js.Any])
    
    inline def `setEnd-dateUndefined`: Self = StObject.set(x, "end-date", js.undefined)
    
    inline def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setIds(value: String): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    inline def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    inline def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    inline def setSamplingLevel(value: String): Self = StObject.set(x, "samplingLevel", value.asInstanceOf[js.Any])
    
    inline def setSamplingLevelUndefined: Self = StObject.set(x, "samplingLevel", js.undefined)
    
    inline def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setSort(value: js.Array[String]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value :_*))
    
    inline def `setStart-date`(value: String): Self = StObject.set(x, "start-date", value.asInstanceOf[js.Any])
    
    inline def `setStart-dateUndefined`: Self = StObject.set(x, "start-date", js.undefined)
    
    inline def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
    
    inline def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
  }
}
