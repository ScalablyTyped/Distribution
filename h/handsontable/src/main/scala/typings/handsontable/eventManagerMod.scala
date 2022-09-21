package typings.handsontable

import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventManagerMod {
  
  @JSImport("handsontable/eventManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/eventManager", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with EventManager {
    def this(context: js.Object) = this()
  }
  
  inline def getListenersCounter(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getListenersCounter")().asInstanceOf[Double]
  
  @js.native
  trait EventManager extends StObject {
    
    def addEventListener(element: Element, eventName: String, callback: js.Function1[/* event */ Event, Unit]): js.Function0[Unit] = js.native
    def addEventListener(
      element: Element,
      eventName: String,
      callback: js.Function1[/* event */ Event, Unit],
      options: Boolean
    ): js.Function0[Unit] = js.native
    def addEventListener(
      element: Element,
      eventName: String,
      callback: js.Function1[/* event */ Event, Unit],
      options: AddEventListenerOptions
    ): js.Function0[Unit] = js.native
    
    def clear(): Unit = js.native
    
    var context: Any = js.native
    
    def destroy(): Unit = js.native
    
    def destroyWithOwnEventsOnly(): Unit = js.native
    
    def fireEvent(element: Element, eventName: String): Unit = js.native
    
    def removeEventListener(element: Element, eventName: String, callback: js.Function0[Unit]): Unit = js.native
    def removeEventListener(element: Element, eventName: String, callback: js.Function0[Unit], onlyOwnEvents: Boolean): Unit = js.native
  }
}
