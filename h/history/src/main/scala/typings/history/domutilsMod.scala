package typings.history

import typings.std.EventListener
import typings.std.EventListenerObject
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domutilsMod {
  
  @JSImport("history/DOMUtils", "addEventListener")
  @js.native
  def addEventListener(node: EventTarget, event: String, listener: EventListener): Unit = js.native
  @JSImport("history/DOMUtils", "addEventListener")
  @js.native
  def addEventListener(node: EventTarget, event: String, listener: EventListenerObject): Unit = js.native
  
  @JSImport("history/DOMUtils", "getConfirmation")
  @js.native
  def getConfirmation(message: String, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  @JSImport("history/DOMUtils", "isExtraneousPopstateEvent")
  @js.native
  val isExtraneousPopstateEvent: Boolean = js.native
  
  @JSImport("history/DOMUtils", "removeEventListener")
  @js.native
  def removeEventListener(node: EventTarget, event: String, listener: EventListener): Unit = js.native
  @JSImport("history/DOMUtils", "removeEventListener")
  @js.native
  def removeEventListener(node: EventTarget, event: String, listener: EventListenerObject): Unit = js.native
  
  @JSImport("history/DOMUtils", "supportsGoWithoutReloadUsingHash")
  @js.native
  def supportsGoWithoutReloadUsingHash(): Boolean = js.native
  
  @JSImport("history/DOMUtils", "supportsHistory")
  @js.native
  def supportsHistory(): Boolean = js.native
}
