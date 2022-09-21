package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeSeriesFilter extends StObject {
  
  /**
    * By default, the raw time series data is returned. Use this field to combine multiple time series for different views of the data.
    */
  var aggregation: js.UndefOr[SchemaAggregation] = js.undefined
  
  /**
    * Required. The monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies the metric types, resources, and projects to query.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ranking based time series filter.
    */
  var pickTimeSeriesFilter: js.UndefOr[SchemaPickTimeSeriesFilter] = js.undefined
  
  /**
    * Apply a second aggregation after aggregation is applied.
    */
  var secondaryAggregation: js.UndefOr[SchemaAggregation] = js.undefined
  
  /**
    * Statistics based time series filter. Note: This field is deprecated and completely ignored by the API.
    */
  var statisticalTimeSeriesFilter: js.UndefOr[SchemaStatisticalTimeSeriesFilter] = js.undefined
}
object SchemaTimeSeriesFilter {
  
  inline def apply(): SchemaTimeSeriesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeSeriesFilter]
  }
  
  extension [Self <: SchemaTimeSeriesFilter](x: Self) {
    
    inline def setAggregation(value: SchemaAggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPickTimeSeriesFilter(value: SchemaPickTimeSeriesFilter): Self = StObject.set(x, "pickTimeSeriesFilter", value.asInstanceOf[js.Any])
    
    inline def setPickTimeSeriesFilterUndefined: Self = StObject.set(x, "pickTimeSeriesFilter", js.undefined)
    
    inline def setSecondaryAggregation(value: SchemaAggregation): Self = StObject.set(x, "secondaryAggregation", value.asInstanceOf[js.Any])
    
    inline def setSecondaryAggregationUndefined: Self = StObject.set(x, "secondaryAggregation", js.undefined)
    
    inline def setStatisticalTimeSeriesFilter(value: SchemaStatisticalTimeSeriesFilter): Self = StObject.set(x, "statisticalTimeSeriesFilter", value.asInstanceOf[js.Any])
    
    inline def setStatisticalTimeSeriesFilterUndefined: Self = StObject.set(x, "statisticalTimeSeriesFilter", js.undefined)
  }
}
