package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListValue extends StObject {
  
  /**
    * Repeated field of dynamically typed values.
    */
  var values: js.UndefOr[js.Array[SchemaValue]] = js.undefined
}
object SchemaListValue {
  
  inline def apply(): SchemaListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListValue]
  }
  
  extension [Self <: SchemaListValue](x: Self) {
    
    inline def setValues(value: js.Array[SchemaValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
