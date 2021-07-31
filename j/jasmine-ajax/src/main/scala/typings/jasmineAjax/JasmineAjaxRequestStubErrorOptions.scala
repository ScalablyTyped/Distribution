package typings.jasmineAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JasmineAjaxRequestStubErrorOptions extends StObject {
  
  var status: js.UndefOr[Double] = js.undefined
  
  var statusText: js.UndefOr[String] = js.undefined
}
object JasmineAjaxRequestStubErrorOptions {
  
  @scala.inline
  def apply(): JasmineAjaxRequestStubErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JasmineAjaxRequestStubErrorOptions]
  }
  
  @scala.inline
  implicit class JasmineAjaxRequestStubErrorOptionsMutableBuilder[Self <: JasmineAjaxRequestStubErrorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
