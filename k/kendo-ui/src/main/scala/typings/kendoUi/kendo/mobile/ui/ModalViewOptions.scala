package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalViewOptions extends StObject {
  
  var beforeOpen: js.UndefOr[js.Function1[/* e */ ModalViewBeforeOpenEvent, Unit]] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ ModalViewCloseEvent, Unit]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* e */ ModalViewInitEvent, Unit]] = js.undefined
  
  var modal: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ ModalViewOpenEvent, Unit]] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ModalViewOptions {
  
  inline def apply(): ModalViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalViewOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModalViewOptions] (val x: Self) extends AnyVal {
    
    inline def setBeforeOpen(value: /* e */ ModalViewBeforeOpenEvent => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
    
    inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
    
    inline def setClose(value: /* e */ ModalViewCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInit(value: /* e */ ModalViewInitEvent => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ ModalViewOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
