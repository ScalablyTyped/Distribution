package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalViewOptions extends StObject {
  
  var beforeOpen: js.UndefOr[js.Function1[/* e */ ModalViewBeforeOpenEvent, Unit]] = js.native
  
  var close: js.UndefOr[js.Function1[/* e */ ModalViewCloseEvent, Unit]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var init: js.UndefOr[js.Function1[/* e */ ModalViewInitEvent, Unit]] = js.native
  
  var modal: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ ModalViewOpenEvent, Unit]] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ModalViewOptions {
  
  @scala.inline
  def apply(): ModalViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalViewOptions]
  }
  
  @scala.inline
  implicit class ModalViewOptionsMutableBuilder[Self <: ModalViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeOpen(value: /* e */ ModalViewBeforeOpenEvent => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ ModalViewCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInit(value: /* e */ ModalViewInitEvent => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ ModalViewOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
