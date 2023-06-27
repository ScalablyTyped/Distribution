package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSheetOptions extends StObject {
  
  var actionButtons: js.UndefOr[js.Array[ActionSheetActionButton]] = js.undefined
  
  var activate: js.UndefOr[js.Function1[/* e */ ActionSheetEvent, Unit]] = js.undefined
  
  var adaptive: js.UndefOr[Boolean] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ ActionSheetEvent, Unit]] = js.undefined
  
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  var contentTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var deactivate: js.UndefOr[js.Function1[/* e */ ActionSheetEvent, Unit]] = js.undefined
  
  var footerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  
  var items: js.UndefOr[js.Array[ActionSheetItem]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ ActionSheetEvent, Unit]] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object ActionSheetOptions {
  
  inline def apply(): ActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionSheetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionSheetOptions] (val x: Self) extends AnyVal {
    
    inline def setActionButtons(value: js.Array[ActionSheetActionButton]): Self = StObject.set(x, "actionButtons", value.asInstanceOf[js.Any])
    
    inline def setActionButtonsUndefined: Self = StObject.set(x, "actionButtons", js.undefined)
    
    inline def setActionButtonsVarargs(value: ActionSheetActionButton*): Self = StObject.set(x, "actionButtons", js.Array(value*))
    
    inline def setActivate(value: /* e */ ActionSheetEvent => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setAdaptive(value: Boolean): Self = StObject.set(x, "adaptive", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveUndefined: Self = StObject.set(x, "adaptive", js.undefined)
    
    inline def setClose(value: /* e */ ActionSheetEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setContentTemplate(value: String | js.Function): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
    
    inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
    
    inline def setDeactivate(value: /* e */ ActionSheetEvent => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction1(value))
    
    inline def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    inline def setFooterTemplate(value: String | js.Function): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setItems(value: js.Array[ActionSheetItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ActionSheetItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ ActionSheetEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
