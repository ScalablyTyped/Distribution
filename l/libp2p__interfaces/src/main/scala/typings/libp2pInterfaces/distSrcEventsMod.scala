package typings.libp2pInterfaces

import typings.std.AddEventListenerOptions
import typings.std.CustomEventInit
import typings.std.EventListenerOptions
import typings.std.EventTarget
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEventsMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@libp2p/interfaces/dist/src/events", "CustomEvent")
  @js.native
  open class CustomEvent[T] protected ()
    extends StObject
       with typings.std.CustomEvent[T] {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: CustomEventInit[T]) = this()
  }
  
  @JSImport("@libp2p/interfaces/dist/src/events", "EventEmitter")
  @js.native
  open class EventEmitter[EventMap /* <: Record[String, Any] */] ()
    extends StObject
       with EventTarget {
    
    def addEventListener[K /* <: /* keyof EventMap */ String */](`type`: K): Unit = js.native
    def addEventListener[K /* <: /* keyof EventMap */ String */](`type`: K, listener: Null, options: Boolean): Unit = js.native
    def addEventListener[K /* <: /* keyof EventMap */ String */](`type`: K, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def addEventListener[K /* <: /* keyof EventMap */ String */](
      `type`: K,
      listener: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[K] */ js.Any
        ]
    ): Unit = js.native
    def addEventListener[K /* <: /* keyof EventMap */ String */](
      `type`: K,
      listener: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[K] */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener[K /* <: /* keyof EventMap */ String */](
      `type`: K,
      listener: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[K] */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    def listenerCount(`type`: String): Double = js.native
    
    /* private */ var `private`: Any = js.native
    
    def removeEventListener[K /* <: /* keyof EventMap */ String */](`type`: K): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](`type`: K, listener: Null, options: Boolean): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](`type`: K, listener: Null, options: EventListenerOptions): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](`type`: K, listener: Unit, options: Boolean): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](`type`: K, listener: Unit, options: EventListenerOptions): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](
      `type`: K,
      listener: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[K] */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](
      `type`: K,
      listener: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[K] */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](
      `type`: K,
      listener: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[K] */ js.Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    
    def safeDispatchEvent[Detail](`type`: /* keyof EventMap */ String, detail: CustomEventInit[Detail]): Boolean = js.native
  }
  
  type EventCallback[EventType] = js.Function1[/* evt */ EventType, Unit]
  
  type EventHandler[EventType] = EventCallback[EventType] | EventObject[EventType]
  
  trait EventObject[EventType] extends StObject {
    
    def handleEvent(evt: EventType): Unit
    @JSName("handleEvent")
    var handleEvent_Original: EventCallback[EventType]
  }
  object EventObject {
    
    inline def apply[EventType](handleEvent: EventType => Unit): EventObject[EventType] = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[EventObject[EventType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventObject[?], EventType] (val x: Self & EventObject[EventType]) extends AnyVal {
      
      inline def setHandleEvent(value: EventType => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
}
