package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRatioPart extends StObject {
  
  /**
    * By default, the raw time series data is returned. Use this field to combine multiple time series for different views of the data.
    */
  var aggregation: js.UndefOr[SchemaAggregation] = js.undefined
  
  /**
    * Required. The monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies the metric types, resources, and projects to query.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
}
object SchemaRatioPart {
  
  inline def apply(): SchemaRatioPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRatioPart]
  }
  
  extension [Self <: SchemaRatioPart](x: Self) {
    
    inline def setAggregation(value: SchemaAggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
