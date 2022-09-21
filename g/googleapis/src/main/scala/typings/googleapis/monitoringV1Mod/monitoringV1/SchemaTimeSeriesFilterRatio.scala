package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeSeriesFilterRatio extends StObject {
  
  /**
    * The denominator of the ratio.
    */
  var denominator: js.UndefOr[SchemaRatioPart] = js.undefined
  
  /**
    * The numerator of the ratio.
    */
  var numerator: js.UndefOr[SchemaRatioPart] = js.undefined
  
  /**
    * Ranking based time series filter.
    */
  var pickTimeSeriesFilter: js.UndefOr[SchemaPickTimeSeriesFilter] = js.undefined
  
  /**
    * Apply a second aggregation after the ratio is computed.
    */
  var secondaryAggregation: js.UndefOr[SchemaAggregation] = js.undefined
  
  /**
    * Statistics based time series filter. Note: This field is deprecated and completely ignored by the API.
    */
  var statisticalTimeSeriesFilter: js.UndefOr[SchemaStatisticalTimeSeriesFilter] = js.undefined
}
object SchemaTimeSeriesFilterRatio {
  
  inline def apply(): SchemaTimeSeriesFilterRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeSeriesFilterRatio]
  }
  
  extension [Self <: SchemaTimeSeriesFilterRatio](x: Self) {
    
    inline def setDenominator(value: SchemaRatioPart): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
    
    inline def setDenominatorUndefined: Self = StObject.set(x, "denominator", js.undefined)
    
    inline def setNumerator(value: SchemaRatioPart): Self = StObject.set(x, "numerator", value.asInstanceOf[js.Any])
    
    inline def setNumeratorUndefined: Self = StObject.set(x, "numerator", js.undefined)
    
    inline def setPickTimeSeriesFilter(value: SchemaPickTimeSeriesFilter): Self = StObject.set(x, "pickTimeSeriesFilter", value.asInstanceOf[js.Any])
    
    inline def setPickTimeSeriesFilterUndefined: Self = StObject.set(x, "pickTimeSeriesFilter", js.undefined)
    
    inline def setSecondaryAggregation(value: SchemaAggregation): Self = StObject.set(x, "secondaryAggregation", value.asInstanceOf[js.Any])
    
    inline def setSecondaryAggregationUndefined: Self = StObject.set(x, "secondaryAggregation", js.undefined)
    
    inline def setStatisticalTimeSeriesFilter(value: SchemaStatisticalTimeSeriesFilter): Self = StObject.set(x, "statisticalTimeSeriesFilter", value.asInstanceOf[js.Any])
    
    inline def setStatisticalTimeSeriesFilterUndefined: Self = StObject.set(x, "statisticalTimeSeriesFilter", js.undefined)
  }
}
