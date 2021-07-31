package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Errors when the connector is communicating to the source repository.
  */
trait SchemaRepositoryError extends StObject {
  
  /**
    * Message that describes the error. The maximum allowable length of the
    * message is 8192 characters.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Error codes.  Matches the definition of HTTP status codes.
    */
  var httpStatusCode: js.UndefOr[Double] = js.undefined
  
  /**
    * Type of error.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaRepositoryError {
  
  @scala.inline
  def apply(): SchemaRepositoryError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepositoryError]
  }
  
  @scala.inline
  implicit class SchemaRepositoryErrorMutableBuilder[Self <: SchemaRepositoryError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setHttpStatusCode(value: Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpStatusCodeUndefined: Self = StObject.set(x, "httpStatusCode", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
