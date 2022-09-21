package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidationResult extends StObject {
  
  /**
    * A list of validations (includes both executed as well as not executed validations).
    */
  var validations: js.UndefOr[js.Array[SchemaValidation]] = js.undefined
}
object SchemaValidationResult {
  
  inline def apply(): SchemaValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidationResult]
  }
  
  extension [Self <: SchemaValidationResult](x: Self) {
    
    inline def setValidations(value: js.Array[SchemaValidation]): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    
    inline def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
    
    inline def setValidationsVarargs(value: SchemaValidation*): Self = StObject.set(x, "validations", js.Array(value*))
  }
}
