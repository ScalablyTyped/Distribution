package typings.lobibox.LobiboxModule

import typings.lobibox.anon.IconClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertOptions
  extends StObject
     with MessageBoxesOptions {
  
  var error: js.UndefOr[IconClass] = js.undefined
  
  var info: js.UndefOr[IconClass] = js.undefined
  
  var success: js.UndefOr[IconClass] = js.undefined
  
  var warning: js.UndefOr[IconClass] = js.undefined
}
object AlertOptions {
  
  @scala.inline
  def apply(): AlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertOptions]
  }
  
  @scala.inline
  implicit class AlertOptionsMutableBuilder[Self <: AlertOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: IconClass): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInfo(value: IconClass): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setSuccess(value: IconClass): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWarning(value: IconClass): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
