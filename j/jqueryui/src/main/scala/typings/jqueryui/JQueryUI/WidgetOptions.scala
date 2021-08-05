package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Widget //////////////////////////////////////////////////
trait WidgetOptions extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var hide: js.UndefOr[js.Any] = js.undefined
  
  var show: js.UndefOr[js.Any] = js.undefined
}
object WidgetOptions {
  
  inline def apply(): WidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetOptions]
  }
  
  extension [Self <: WidgetOptions](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHide(value: js.Any): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setShow(value: js.Any): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
