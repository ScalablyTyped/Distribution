package typings.jasmineAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JasmineAjaxRequestStubErrorOptions extends StObject {
  
  var status: js.UndefOr[Double] = js.undefined
  
  var statusText: js.UndefOr[String] = js.undefined
}
object JasmineAjaxRequestStubErrorOptions {
  
  inline def apply(): JasmineAjaxRequestStubErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JasmineAjaxRequestStubErrorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JasmineAjaxRequestStubErrorOptions] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
