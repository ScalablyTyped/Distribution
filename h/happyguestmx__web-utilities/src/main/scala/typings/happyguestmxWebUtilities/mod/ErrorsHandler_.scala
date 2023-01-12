package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorsHandler_ extends StObject {
  
  def caolanFormErrorHandler(form: FormError): FormErrorHandlerOutput
}
object ErrorsHandler_ {
  
  inline def apply(caolanFormErrorHandler: FormError => FormErrorHandlerOutput): ErrorsHandler_ = {
    val __obj = js.Dynamic.literal(caolanFormErrorHandler = js.Any.fromFunction1(caolanFormErrorHandler))
    __obj.asInstanceOf[ErrorsHandler_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorsHandler_] (val x: Self) extends AnyVal {
    
    inline def setCaolanFormErrorHandler(value: FormError => FormErrorHandlerOutput): Self = StObject.set(x, "caolanFormErrorHandler", js.Any.fromFunction1(value))
  }
}
