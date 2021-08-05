package typings.lobibox.LobiboxModule

import typings.lobibox.anon.Icon
import typings.lobibox.anon.Width
import typings.lobibox.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyOptions
  extends StObject
     with NotifyDefault
     with NotifyMethods {
  
  var `class`: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[Icon] = js.undefined
  
  var info: js.UndefOr[Icon] = js.undefined
  
  //You can override options for large notifications from here
  var large: js.UndefOr[Width] = js.undefined
  
  //You can override options for small notifications from here
  var mini: js.UndefOr[`0`] = js.undefined
  
  //Default options of different style notifications
  var success: js.UndefOr[Icon] = js.undefined
  
  var warning: js.UndefOr[Icon] = js.undefined
}
object NotifyOptions {
  
  inline def apply(): NotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyOptions]
  }
  
  extension [Self <: NotifyOptions](x: Self) {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setError(value: Icon): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInfo(value: Icon): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setLarge(value: Width): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMini(value: `0`): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    inline def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    inline def setSuccess(value: Icon): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWarning(value: Icon): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
