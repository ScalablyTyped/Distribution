package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopOverOptions extends StObject {
  
  var close: js.UndefOr[js.Function1[/* e */ PopOverCloseEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ PopOverOpenEvent, Unit]] = js.native
  
  var pane: js.UndefOr[PopOverPane] = js.native
  
  var popup: js.UndefOr[PopOverPopup] = js.native
}
object PopOverOptions {
  
  @scala.inline
  def apply(): PopOverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopOverOptions]
  }
  
  @scala.inline
  implicit class PopOverOptionsMutableBuilder[Self <: PopOverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: /* e */ PopOverCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ PopOverOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPane(value: PopOverPane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setPopup(value: PopOverPopup): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
  }
}
