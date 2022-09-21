package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDataRealtimeGet
  extends StObject
     with StandardParameters {
  
  /**
    * A comma-separated list of real time dimensions. E.g., 'rt:medium,rt:city'.
    */
  var dimensions: js.UndefOr[String] = js.undefined
  
  /**
    * A comma-separated list of dimension or metric filters to be applied to real time data.
    */
  var filters: js.UndefOr[String] = js.undefined
  
  /**
    * Unique table ID for retrieving real time data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID.
    */
  var ids: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of entries to include in this feed.
    */
  var `max-results`: js.UndefOr[Double] = js.undefined
  
  /**
    * A comma-separated list of real time metrics. E.g., 'rt:activeUsers'. At least one metric must be specified.
    */
  var metrics: js.UndefOr[String] = js.undefined
  
  /**
    * A comma-separated list of dimensions or metrics that determine the sort order for real time data.
    */
  var sort: js.UndefOr[String] = js.undefined
}
object ParamsResourceDataRealtimeGet {
  
  inline def apply(): ParamsResourceDataRealtimeGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDataRealtimeGet]
  }
  
  extension [Self <: ParamsResourceDataRealtimeGet](x: Self) {
    
    inline def setDimensions(value: String): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setIds(value: String): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    inline def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    inline def setMetrics(value: String): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
