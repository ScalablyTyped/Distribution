package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParameters extends StObject {
  
  /**
    * Filters used to match traffic data in your report.
    */
  var filters: js.UndefOr[js.Array[SchemaFilterPair]] = js.undefined
  
  /**
    * Data is grouped by the filters listed in this field.
    */
  var groupBys: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Metrics to include as columns in your report.
    */
  var metrics: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Additional query options.
    */
  var options: js.UndefOr[SchemaOptions] = js.undefined
  
  /**
    * The type of the report. The type of the report will dictate what dimesions, filters, and metrics can be used.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaParameters {
  
  inline def apply(): SchemaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameters]
  }
  
  extension [Self <: SchemaParameters](x: Self) {
    
    inline def setFilters(value: js.Array[SchemaFilterPair]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SchemaFilterPair*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setGroupBys(value: js.Array[String]): Self = StObject.set(x, "groupBys", value.asInstanceOf[js.Any])
    
    inline def setGroupBysNull: Self = StObject.set(x, "groupBys", null)
    
    inline def setGroupBysUndefined: Self = StObject.set(x, "groupBys", js.undefined)
    
    inline def setGroupBysVarargs(value: String*): Self = StObject.set(x, "groupBys", js.Array(value*))
    
    inline def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsNull: Self = StObject.set(x, "metrics", null)
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setOptions(value: SchemaOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
