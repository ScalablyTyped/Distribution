package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeSeriesQuery extends StObject {
  
  /**
    * Filter parameters to fetch time series.
    */
  var timeSeriesFilter: js.UndefOr[SchemaTimeSeriesFilter] = js.undefined
  
  /**
    * Parameters to fetch a ratio between two time series filters.
    */
  var timeSeriesFilterRatio: js.UndefOr[SchemaTimeSeriesFilterRatio] = js.undefined
  
  /**
    * A query used to fetch time series with MQL.
    */
  var timeSeriesQueryLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unit of data contained in fetched time series. If non-empty, this unit will override any unit that accompanies fetched data. The format is the same as the unit (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors) field in MetricDescriptor.
    */
  var unitOverride: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimeSeriesQuery {
  
  inline def apply(): SchemaTimeSeriesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeSeriesQuery]
  }
  
  extension [Self <: SchemaTimeSeriesQuery](x: Self) {
    
    inline def setTimeSeriesFilter(value: SchemaTimeSeriesFilter): Self = StObject.set(x, "timeSeriesFilter", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesFilterRatio(value: SchemaTimeSeriesFilterRatio): Self = StObject.set(x, "timeSeriesFilterRatio", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesFilterRatioUndefined: Self = StObject.set(x, "timeSeriesFilterRatio", js.undefined)
    
    inline def setTimeSeriesFilterUndefined: Self = StObject.set(x, "timeSeriesFilter", js.undefined)
    
    inline def setTimeSeriesQueryLanguage(value: String): Self = StObject.set(x, "timeSeriesQueryLanguage", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesQueryLanguageNull: Self = StObject.set(x, "timeSeriesQueryLanguage", null)
    
    inline def setTimeSeriesQueryLanguageUndefined: Self = StObject.set(x, "timeSeriesQueryLanguage", js.undefined)
    
    inline def setUnitOverride(value: String): Self = StObject.set(x, "unitOverride", value.asInstanceOf[js.Any])
    
    inline def setUnitOverrideNull: Self = StObject.set(x, "unitOverride", null)
    
    inline def setUnitOverrideUndefined: Self = StObject.set(x, "unitOverride", js.undefined)
  }
}
