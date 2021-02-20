package typings.jqueryContextmenu

import typings.jqueryContextmenu.anon.Duration
import typings.jqueryContextmenu.anon.Hide
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryContextMenuOptions extends StObject {
  
  var animation: js.UndefOr[Duration] = js.native
  
  var appendTo: js.UndefOr[String] = js.native
  
  var autoHide: js.UndefOr[Boolean] = js.native
  
  var build: js.UndefOr[js.Function2[/* triggerElement */ JQuery, /* e */ Event, _]] = js.native
  
  var callback: js.UndefOr[js.Function2[/* key */ js.Any, /* options */ js.Any, _]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var determinePosition: js.UndefOr[js.Function1[/* menu */ JQuery, Unit]] = js.native
  
  var events: js.UndefOr[Hide] = js.native
  
  var itemClickEvent: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Any] = js.native
  
  var position: js.UndefOr[js.Function3[/* opt */ JQuery, /* x */ Double, /* y */ Double, Unit]] = js.native
  
  var positionSubmenu: js.UndefOr[js.Function1[/* menu */ JQuery, Unit]] = js.native
  
  var reposition: js.UndefOr[Boolean] = js.native
  
  var selector: String = js.native
  
  var trigger: js.UndefOr[String] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object JQueryContextMenuOptions {
  
  @scala.inline
  def apply(selector: String): JQueryContextMenuOptions = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryContextMenuOptions]
  }
  
  @scala.inline
  implicit class JQueryContextMenuOptionsMutableBuilder[Self <: JQueryContextMenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Duration): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAppendTo(value: String): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    @scala.inline
    def setBuild(value: (/* triggerElement */ JQuery, /* e */ Event) => _): Self = StObject.set(x, "build", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    @scala.inline
    def setCallback(value: (/* key */ js.Any, /* options */ js.Any) => _): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDeterminePosition(value: /* menu */ JQuery => Unit): Self = StObject.set(x, "determinePosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeterminePositionUndefined: Self = StObject.set(x, "determinePosition", js.undefined)
    
    @scala.inline
    def setEvents(value: Hide): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setItemClickEvent(value: String): Self = StObject.set(x, "itemClickEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemClickEventUndefined: Self = StObject.set(x, "itemClickEvent", js.undefined)
    
    @scala.inline
    def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setPosition(value: (/* opt */ JQuery, /* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "position", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPositionSubmenu(value: /* menu */ JQuery => Unit): Self = StObject.set(x, "positionSubmenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPositionSubmenuUndefined: Self = StObject.set(x, "positionSubmenu", js.undefined)
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setReposition(value: Boolean): Self = StObject.set(x, "reposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositionUndefined: Self = StObject.set(x, "reposition", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
