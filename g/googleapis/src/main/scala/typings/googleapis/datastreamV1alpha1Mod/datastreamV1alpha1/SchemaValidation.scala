package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidation extends StObject {
  
  /**
    * A custom code identifying this validation.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A short description of the validation.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Messages reflecting the validation results.
    */
  var message: js.UndefOr[js.Array[SchemaValidationMessage]] = js.undefined
  
  /**
    * Validation execution status.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaValidation {
  
  inline def apply(): SchemaValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidation]
  }
  
  extension [Self <: SchemaValidation](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMessage(value: js.Array[SchemaValidationMessage]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMessageVarargs(value: SchemaValidationMessage*): Self = StObject.set(x, "message", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
