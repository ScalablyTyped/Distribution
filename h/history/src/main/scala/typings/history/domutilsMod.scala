package typings.history

import typings.std.EventListener
import typings.std.EventListenerObject
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domutilsMod {
  
  @JSImport("history/DOMUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEventListener(node: EventTarget, event: String, listener: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener(node: EventTarget, event: String, listener: EventListenerObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getConfirmation(message: String, callback: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfirmation")(message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("history/DOMUtils", "isExtraneousPopstateEvent")
  @js.native
  val isExtraneousPopstateEvent: Boolean = js.native
  
  inline def removeEventListener(node: EventTarget, event: String, listener: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener(node: EventTarget, event: String, listener: EventListenerObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(node.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def supportsGoWithoutReloadUsingHash(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsGoWithoutReloadUsingHash")().asInstanceOf[Boolean]
  
  inline def supportsHistory(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsHistory")().asInstanceOf[Boolean]
}
