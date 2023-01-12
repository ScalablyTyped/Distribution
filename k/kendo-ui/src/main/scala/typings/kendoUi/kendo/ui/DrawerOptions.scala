package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawerOptions extends StObject {
  
  var hide: js.UndefOr[js.Function1[/* e */ DrawerHideEvent, Unit]] = js.undefined
  
  var itemClick: js.UndefOr[js.Function1[/* e */ DrawerEvent, Unit]] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var mini: js.UndefOr[Boolean | DrawerMini] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[js.Function1[/* e */ DrawerEvent, Unit]] = js.undefined
  
  var swipeToOpen: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
}
object DrawerOptions {
  
  inline def apply(): DrawerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawerOptions] (val x: Self) extends AnyVal {
    
    inline def setHide(value: /* e */ DrawerHideEvent => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setItemClick(value: /* e */ DrawerEvent => Unit): Self = StObject.set(x, "itemClick", js.Any.fromFunction1(value))
    
    inline def setItemClickUndefined: Self = StObject.set(x, "itemClick", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMini(value: Boolean | DrawerMini): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    inline def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShow(value: /* e */ DrawerEvent => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSwipeToOpen(value: Boolean): Self = StObject.set(x, "swipeToOpen", value.asInstanceOf[js.Any])
    
    inline def setSwipeToOpenUndefined: Self = StObject.set(x, "swipeToOpen", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
