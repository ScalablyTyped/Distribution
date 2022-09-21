package typings.historyEvents

import typings.std.EventListener
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object HistoryEvents {
    
    @JSGlobal("HistoryEvents")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addEventListener(el: EventTarget, `type`: String, handler: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def isHistorySupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHistorySupported")().asInstanceOf[Boolean]
    
    inline def removeEventListener(el: EventTarget, `type`: String, handler: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(el.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def triggerEvent(el: EventTarget, eventName: String, state: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEvent")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
