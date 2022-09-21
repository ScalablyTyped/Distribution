package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValueValidation extends StObject {
  
  /**
    * Required. List of allowed values for the parameter.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaValueValidation {
  
  inline def apply(): SchemaValueValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValueValidation]
  }
  
  extension [Self <: SchemaValueValidation](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
