package typings.jqueryContextmenu

import typings.jqueryContextmenu.anon.Duration
import typings.jqueryContextmenu.anon.Hide
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryContextMenuOptions extends StObject {
  
  var animation: js.UndefOr[Duration] = js.undefined
  
  var appendTo: js.UndefOr[String] = js.undefined
  
  var autoHide: js.UndefOr[Boolean] = js.undefined
  
  var build: js.UndefOr[js.Function2[/* triggerElement */ JQuery, /* e */ Event, Any]] = js.undefined
  
  var callback: js.UndefOr[js.Function2[/* key */ Any, /* options */ Any, Any]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var determinePosition: js.UndefOr[js.Function1[/* menu */ JQuery, Unit]] = js.undefined
  
  var events: js.UndefOr[Hide] = js.undefined
  
  var itemClickEvent: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[Any] = js.undefined
  
  var position: js.UndefOr[js.Function3[/* opt */ JQuery, /* x */ Double, /* y */ Double, Unit]] = js.undefined
  
  var positionSubmenu: js.UndefOr[js.Function1[/* menu */ JQuery, Unit]] = js.undefined
  
  var reposition: js.UndefOr[Boolean] = js.undefined
  
  var selector: String
  
  var trigger: js.UndefOr[String] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object JQueryContextMenuOptions {
  
  inline def apply(selector: String): JQueryContextMenuOptions = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryContextMenuOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryContextMenuOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Duration): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAppendTo(value: String): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    inline def setBuild(value: (/* triggerElement */ JQuery, /* e */ Event) => Any): Self = StObject.set(x, "build", js.Any.fromFunction2(value))
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setCallback(value: (/* key */ Any, /* options */ Any) => Any): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDeterminePosition(value: /* menu */ JQuery => Unit): Self = StObject.set(x, "determinePosition", js.Any.fromFunction1(value))
    
    inline def setDeterminePositionUndefined: Self = StObject.set(x, "determinePosition", js.undefined)
    
    inline def setEvents(value: Hide): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setItemClickEvent(value: String): Self = StObject.set(x, "itemClickEvent", value.asInstanceOf[js.Any])
    
    inline def setItemClickEventUndefined: Self = StObject.set(x, "itemClickEvent", js.undefined)
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setPosition(value: (/* opt */ JQuery, /* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "position", js.Any.fromFunction3(value))
    
    inline def setPositionSubmenu(value: /* menu */ JQuery => Unit): Self = StObject.set(x, "positionSubmenu", js.Any.fromFunction1(value))
    
    inline def setPositionSubmenuUndefined: Self = StObject.set(x, "positionSubmenu", js.undefined)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setReposition(value: Boolean): Self = StObject.set(x, "reposition", value.asInstanceOf[js.Any])
    
    inline def setRepositionUndefined: Self = StObject.set(x, "reposition", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
