package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopOverOptions extends StObject {
  
  var close: js.UndefOr[js.Function1[/* e */ PopOverCloseEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ PopOverOpenEvent, Unit]] = js.undefined
  
  var pane: js.UndefOr[PopOverPane] = js.undefined
  
  var popup: js.UndefOr[PopOverPopup] = js.undefined
}
object PopOverOptions {
  
  inline def apply(): PopOverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopOverOptions]
  }
  
  extension [Self <: PopOverOptions](x: Self) {
    
    inline def setClose(value: /* e */ PopOverCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ PopOverOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPane(value: PopOverPane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setPopup(value: PopOverPopup): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
  }
}
