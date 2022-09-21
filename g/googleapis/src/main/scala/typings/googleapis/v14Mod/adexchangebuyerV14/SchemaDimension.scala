package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDimension extends StObject {
  
  var dimensionType: js.UndefOr[String | Null] = js.undefined
  
  var dimensionValues: js.UndefOr[js.Array[SchemaDimensionDimensionValue]] = js.undefined
}
object SchemaDimension {
  
  inline def apply(): SchemaDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimension]
  }
  
  extension [Self <: SchemaDimension](x: Self) {
    
    inline def setDimensionType(value: String): Self = StObject.set(x, "dimensionType", value.asInstanceOf[js.Any])
    
    inline def setDimensionTypeNull: Self = StObject.set(x, "dimensionType", null)
    
    inline def setDimensionTypeUndefined: Self = StObject.set(x, "dimensionType", js.undefined)
    
    inline def setDimensionValues(value: js.Array[SchemaDimensionDimensionValue]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    inline def setDimensionValuesVarargs(value: SchemaDimensionDimensionValue*): Self = StObject.set(x, "dimensionValues", js.Array(value*))
  }
}
