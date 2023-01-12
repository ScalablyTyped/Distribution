package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains details about errors returned by client JavaScript
  * methods. Errors might not be displayed in a user-facing dialog.
  */
trait PaymentsError extends StObject {
  
  /**
    * Short code that describes the type of error.
    */
  var statusCode: PaymentsErrorStatusCode | String
  
  /**
    * Developer-facing message that describes the error encountered and
    * possible steps to correct it.
    */
  var statusMessage: String
}
object PaymentsError {
  
  inline def apply(statusCode: PaymentsErrorStatusCode | String, statusMessage: String): PaymentsError = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentsError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentsError] (val x: Self) extends AnyVal {
    
    inline def setStatusCode(value: PaymentsErrorStatusCode | String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
