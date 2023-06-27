package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogOptions extends StObject {
  
  var actions: js.UndefOr[js.Array[DialogAction]] = js.undefined
  
  var animation: js.UndefOr[Boolean | DialogAnimation] = js.undefined
  
  var buttonLayout: js.UndefOr[String] = js.undefined
  
  var closable: js.UndefOr[Boolean] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ DialogCloseEvent, Unit]] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var hide: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.undefined
  
  var initOpen: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var messages: js.UndefOr[DialogMessages] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var modal: js.UndefOr[Boolean | DialogModal] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.undefined
  
  var show: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var themeColor: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String | Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object DialogOptions {
  
  inline def apply(): DialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogOptions] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[DialogAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: DialogAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setAnimation(value: Boolean | DialogAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setButtonLayout(value: String): Self = StObject.set(x, "buttonLayout", value.asInstanceOf[js.Any])
    
    inline def setButtonLayoutUndefined: Self = StObject.set(x, "buttonLayout", js.undefined)
    
    inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
    
    inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
    
    inline def setClose(value: /* e */ DialogCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHide(value: /* e */ DialogEvent => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setInitOpen(value: /* e */ DialogEvent => Unit): Self = StObject.set(x, "initOpen", js.Any.fromFunction1(value))
    
    inline def setInitOpenUndefined: Self = StObject.set(x, "initOpen", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMessages(value: DialogMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setModal(value: Boolean | DialogModal): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ DialogEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setShow(value: /* e */ DialogEvent => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
    
    inline def setTitle(value: String | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
