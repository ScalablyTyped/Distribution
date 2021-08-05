package typings.jqueryNoty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotyCallbackOptions extends StObject {
  
  var afterClose: js.UndefOr[js.Function] = js.undefined
  
  var afterShow: js.UndefOr[js.Function] = js.undefined
  
  var onClose: js.UndefOr[js.Function] = js.undefined
  
  var onCloseClick: js.UndefOr[js.Function] = js.undefined
  
  var onShow: js.UndefOr[js.Function] = js.undefined
}
object NotyCallbackOptions {
  
  inline def apply(): NotyCallbackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotyCallbackOptions]
  }
  
  extension [Self <: NotyCallbackOptions](x: Self) {
    
    inline def setAfterClose(value: js.Function): Self = StObject.set(x, "afterClose", value.asInstanceOf[js.Any])
    
    inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
    
    inline def setAfterShow(value: js.Function): Self = StObject.set(x, "afterShow", value.asInstanceOf[js.Any])
    
    inline def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
    
    inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseClick(value: js.Function): Self = StObject.set(x, "onCloseClick", value.asInstanceOf[js.Any])
    
    inline def setOnCloseClickUndefined: Self = StObject.set(x, "onCloseClick", js.undefined)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnShow(value: js.Function): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
  }
}
