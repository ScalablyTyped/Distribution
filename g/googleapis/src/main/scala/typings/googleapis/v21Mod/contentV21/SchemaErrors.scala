package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaErrors extends StObject {
  
  /**
    * The HTTP status of the first error in `errors`.
    */
  var code: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A list of errors.
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.undefined
  
  /**
    * The message of the first error in `errors`.
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaErrors {
  
  inline def apply(): SchemaErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrors]
  }
  
  extension [Self <: SchemaErrors](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setErrors(value: js.Array[SchemaError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
