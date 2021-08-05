package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message carries publisher provided breakdown. E.g. {dimension_type:
  * &#39;COUNTRY&#39;, [{dimension_value: {id: 1, name: &#39;US&#39;}},
  * {dimension_value: {id: 2, name: &#39;UK&#39;}}]}
  */
trait SchemaDimension extends StObject {
  
  var dimensionType: js.UndefOr[String] = js.undefined
  
  var dimensionValues: js.UndefOr[js.Array[SchemaDimensionDimensionValue]] = js.undefined
}
object SchemaDimension {
  
  inline def apply(): SchemaDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimension]
  }
  
  extension [Self <: SchemaDimension](x: Self) {
    
    inline def setDimensionType(value: String): Self = StObject.set(x, "dimensionType", value.asInstanceOf[js.Any])
    
    inline def setDimensionTypeUndefined: Self = StObject.set(x, "dimensionType", js.undefined)
    
    inline def setDimensionValues(value: js.Array[SchemaDimensionDimensionValue]): Self = StObject.set(x, "dimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesUndefined: Self = StObject.set(x, "dimensionValues", js.undefined)
    
    inline def setDimensionValuesVarargs(value: SchemaDimensionDimensionValue*): Self = StObject.set(x, "dimensionValues", js.Array(value :_*))
  }
}
