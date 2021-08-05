package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to return a list of metrics for a single DateRange / dimension
  * combination
  */
trait SchemaDateRangeValues extends StObject {
  
  /**
    * The values of each pivot region.
    */
  var pivotValueRegions: js.UndefOr[js.Array[SchemaPivotValueRegion]] = js.undefined
  
  /**
    * Each value corresponds to each Metric in the request.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaDateRangeValues {
  
  inline def apply(): SchemaDateRangeValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateRangeValues]
  }
  
  extension [Self <: SchemaDateRangeValues](x: Self) {
    
    inline def setPivotValueRegions(value: js.Array[SchemaPivotValueRegion]): Self = StObject.set(x, "pivotValueRegions", value.asInstanceOf[js.Any])
    
    inline def setPivotValueRegionsUndefined: Self = StObject.set(x, "pivotValueRegions", js.undefined)
    
    inline def setPivotValueRegionsVarargs(value: SchemaPivotValueRegion*): Self = StObject.set(x, "pivotValueRegions", js.Array(value :_*))
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
