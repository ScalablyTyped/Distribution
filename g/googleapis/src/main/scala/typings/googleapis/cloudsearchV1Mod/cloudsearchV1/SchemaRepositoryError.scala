package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepositoryError extends StObject {
  
  /**
    * Message that describes the error. The maximum allowable length of the message is 8192 characters.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Error codes. Matches the definition of HTTP status codes.
    */
  var httpStatusCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The type of error.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaRepositoryError {
  
  inline def apply(): SchemaRepositoryError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepositoryError]
  }
  
  extension [Self <: SchemaRepositoryError](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setHttpStatusCode(value: Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
    
    inline def setHttpStatusCodeNull: Self = StObject.set(x, "httpStatusCode", null)
    
    inline def setHttpStatusCodeUndefined: Self = StObject.set(x, "httpStatusCode", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
