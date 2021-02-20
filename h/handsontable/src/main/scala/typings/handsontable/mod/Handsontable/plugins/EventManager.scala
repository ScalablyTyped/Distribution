package typings.handsontable.mod.Handsontable.plugins

import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventManager extends StObject {
  
  def addEventListener(element: Element, eventName: String, callback: js.Function1[/* event */ Event, Unit]): js.Function0[Unit] = js.native
  
  def clear(): Unit = js.native
  
  def clearEvents(): Unit = js.native
  
  var context: js.UndefOr[js.Object] = js.native
  
  def destroy(): Unit = js.native
  
  def extendEvent(context: js.Object, event: Event): js.Any = js.native
  
  def fireEvent(element: Element, eventName: String): Unit = js.native
  
  def removeEventListener(element: Element, eventName: String, callback: js.Function1[/* event */ Event, Unit]): Unit = js.native
}
object EventManager {
  
  @scala.inline
  def apply(
    addEventListener: (Element, String, js.Function1[/* event */ Event, Unit]) => js.Function0[Unit],
    clear: () => Unit,
    clearEvents: () => Unit,
    destroy: () => Unit,
    extendEvent: (js.Object, Event) => js.Any,
    fireEvent: (Element, String) => Unit,
    removeEventListener: (Element, String, js.Function1[/* event */ Event, Unit]) => Unit
  ): EventManager = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), clear = js.Any.fromFunction0(clear), clearEvents = js.Any.fromFunction0(clearEvents), destroy = js.Any.fromFunction0(destroy), extendEvent = js.Any.fromFunction2(extendEvent), fireEvent = js.Any.fromFunction2(fireEvent), removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.asInstanceOf[EventManager]
  }
  
  @scala.inline
  implicit class EventManagerMutableBuilder[Self <: EventManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventListener(value: (Element, String, js.Function1[/* event */ Event, Unit]) => js.Function0[Unit]): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearEvents(value: () => Unit): Self = StObject.set(x, "clearEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtendEvent(value: (js.Object, Event) => js.Any): Self = StObject.set(x, "extendEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFireEvent(value: (Element, String) => Unit): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveEventListener(value: (Element, String, js.Function1[/* event */ Event, Unit]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction3(value))
  }
}
