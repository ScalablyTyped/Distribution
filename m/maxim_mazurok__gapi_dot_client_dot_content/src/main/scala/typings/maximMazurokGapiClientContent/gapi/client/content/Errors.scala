package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  /** The HTTP status of the first error in `errors`. */
  var code: js.UndefOr[Double] = js.undefined
  
  /** A list of errors. */
  var errors: js.UndefOr[js.Array[Error]] = js.undefined
  
  /** The message of the first error in `errors`. */
  var message: js.UndefOr[String] = js.undefined
}
object Errors {
  
  @scala.inline
  def apply(): Errors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Errors]
  }
  
  @scala.inline
  implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
