package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPivotHeaderEntry extends StObject {
  
  /**
    * The name of the dimensions in the pivot response.
    */
  var dimensionNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The values for the dimensions in the pivot.
    */
  var dimensionValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The metric header for the metric in the pivot.
    */
  var metric: js.UndefOr[SchemaMetricHeaderEntry] = js.undefined
}
object SchemaPivotHeaderEntry {
  
  inline def apply(): SchemaPivotHeaderEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotHeaderEntry]
  }
  
  extension [Self <: SchemaPivotHeaderEntry](x: Self) {
    
    inline def setDimensionNames(value: js.Array[String]): Self = StObject.set(x, "dimensionNames", value.asInstanceOf[js.Any])
    
    inline def setDimensionNamesNull: Self = StObject.set(x, "dimensionNames", null)
    
    inline def setDimensionNamesUndefined: Self = StObject.set(x, "dimensionNames", js.undefined)
    
    inline def setDimensionNamesVarargs(value: String*): Self = StObject.set(x, "dimensionNames", js.Array(value*))
    
    inline def setDimensionValues(value: js.Array[String]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesNull: Self = StObject.set(x, "dimensionValues", null)
    
    inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    inline def setDimensionValuesVarargs(value: String*): Self = StObject.set(x, "dimensionValues", js.Array(value*))
    
    inline def setMetric(value: SchemaMetricHeaderEntry): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
  }
}
