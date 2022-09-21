package typings.historyEvents

import typings.std.Event
import typings.std.EventListener
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("history-events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEventListener(el: EventTarget, `type`: String, handler: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isHistorySupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHistorySupported")().asInstanceOf[Boolean]
  
  inline def removeEventListener(el: EventTarget, `type`: String, handler: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def triggerEvent(el: EventTarget, eventName: String, state: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEvent")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait HistoryEvent
    extends StObject
       with Event {
    
    /** The event name, eg. `changestate` */
    var eventName: String = js.native
    
    /** The state object passed to the history function */
    var state: Any = js.native
  }
  
  object global {
    
    trait Window extends StObject {
      
      /**
        * Called when either `history.pushState` or `history.replaceState` is called
        * or when the browser's back/forward buttons are pressed **only if window.dispatchEvent does not exist**.
        * No event is passed to this function
        * @listens window#changestate
        */
      var onchangestate: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * Called when `history.pushState` is called **only if window.dispatchEvent does not exist**.
        * No event is passed to this function
        * @listens window#pushstate
        */
      var onpushstate: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * Called when `history.replaceState` is called **only if window.dispatchEvent does not exist**.
        * No event is passed to this function
        * @listens window#replacestate
        */
      var onreplacestate: js.UndefOr[js.Function0[Unit]] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setOnchangestate(value: () => Unit): Self = StObject.set(x, "onchangestate", js.Any.fromFunction0(value))
        
        inline def setOnchangestateUndefined: Self = StObject.set(x, "onchangestate", js.undefined)
        
        inline def setOnpushstate(value: () => Unit): Self = StObject.set(x, "onpushstate", js.Any.fromFunction0(value))
        
        inline def setOnpushstateUndefined: Self = StObject.set(x, "onpushstate", js.undefined)
        
        inline def setOnreplacestate(value: () => Unit): Self = StObject.set(x, "onreplacestate", js.Any.fromFunction0(value))
        
        inline def setOnreplacestateUndefined: Self = StObject.set(x, "onreplacestate", js.undefined)
      }
    }
    
    trait WindowEventHandlersEventMap extends StObject {
      
      /**
        * Fired when `history.pushState` or `history.replaceState` is called,
        * or when the browser's back/forward buttons are pressed
        * @event window#changestate
        */
      var changestate: HistoryEvent
      
      /**
        * Fired when `history.pushState` is called
        * @event window#pushstate
        */
      var pushstate: HistoryEvent
      
      /**
        * Fired when `history.replaceState` is called
        * @event window#replacestate
        */
      var replacestate: HistoryEvent
    }
    object WindowEventHandlersEventMap {
      
      inline def apply(changestate: HistoryEvent, pushstate: HistoryEvent, replacestate: HistoryEvent): WindowEventHandlersEventMap = {
        val __obj = js.Dynamic.literal(changestate = changestate.asInstanceOf[js.Any], pushstate = pushstate.asInstanceOf[js.Any], replacestate = replacestate.asInstanceOf[js.Any])
        __obj.asInstanceOf[WindowEventHandlersEventMap]
      }
      
      extension [Self <: WindowEventHandlersEventMap](x: Self) {
        
        inline def setChangestate(value: HistoryEvent): Self = StObject.set(x, "changestate", value.asInstanceOf[js.Any])
        
        inline def setPushstate(value: HistoryEvent): Self = StObject.set(x, "pushstate", value.asInstanceOf[js.Any])
        
        inline def setReplacestate(value: HistoryEvent): Self = StObject.set(x, "replacestate", value.asInstanceOf[js.Any])
      }
    }
  }
}
