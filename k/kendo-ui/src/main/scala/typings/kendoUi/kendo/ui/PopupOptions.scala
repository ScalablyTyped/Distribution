package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupOptions extends StObject {
  
  var activate: js.UndefOr[js.Function1[/* e */ PopupActivateEvent, Unit]] = js.undefined
  
  var adjustSize: js.UndefOr[js.Any] = js.undefined
  
  var anchor: js.UndefOr[String | JQuery] = js.undefined
  
  var animation: js.UndefOr[Boolean | PopupAnimation] = js.undefined
  
  var appendTo: js.UndefOr[String | JQuery] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ PopupCloseEvent, Unit]] = js.undefined
  
  var collision: js.UndefOr[String] = js.undefined
  
  var deactivate: js.UndefOr[js.Function1[/* e */ PopupDeactivateEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ PopupOpenEvent, Unit]] = js.undefined
  
  var origin: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object PopupOptions {
  
  inline def apply(): PopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupOptions]
  }
  
  extension [Self <: PopupOptions](x: Self) {
    
    inline def setActivate(value: /* e */ PopupActivateEvent => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setAdjustSize(value: js.Any): Self = StObject.set(x, "adjustSize", value.asInstanceOf[js.Any])
    
    inline def setAdjustSizeUndefined: Self = StObject.set(x, "adjustSize", js.undefined)
    
    inline def setAnchor(value: String | JQuery): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAnimation(value: Boolean | PopupAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAppendTo(value: String | JQuery): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setClose(value: /* e */ PopupCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setCollision(value: String): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
    
    inline def setDeactivate(value: /* e */ PopupDeactivateEvent => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction1(value))
    
    inline def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ PopupOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
