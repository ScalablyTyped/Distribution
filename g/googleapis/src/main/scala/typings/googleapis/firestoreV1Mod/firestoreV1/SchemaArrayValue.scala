package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaArrayValue extends StObject {
  
  /**
    * Values in the array.
    */
  var values: js.UndefOr[js.Array[SchemaValue]] = js.undefined
}
object SchemaArrayValue {
  
  inline def apply(): SchemaArrayValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArrayValue]
  }
  
  extension [Self <: SchemaArrayValue](x: Self) {
    
    inline def setValues(value: js.Array[SchemaValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
