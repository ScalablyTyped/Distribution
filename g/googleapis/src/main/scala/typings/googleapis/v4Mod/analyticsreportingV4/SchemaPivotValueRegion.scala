package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metric values in the pivot region.
  */
trait SchemaPivotValueRegion extends StObject {
  
  /**
    * The values of the metrics in each of the pivot regions.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaPivotValueRegion {
  
  inline def apply(): SchemaPivotValueRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotValueRegion]
  }
  
  extension [Self <: SchemaPivotValueRegion](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
