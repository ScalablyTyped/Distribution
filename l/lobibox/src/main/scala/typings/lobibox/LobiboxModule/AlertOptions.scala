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
  
  inline def apply(): AlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertOptions] (val x: Self) extends AnyVal {
    
    inline def setError(value: IconClass): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInfo(value: IconClass): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setSuccess(value: IconClass): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWarning(value: IconClass): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
