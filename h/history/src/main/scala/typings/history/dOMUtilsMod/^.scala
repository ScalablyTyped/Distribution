package typings.history.dOMUtilsMod

import typings.history.dOMUtilsMod.Global.EventListener
import typings.history.dOMUtilsMod.Global.EventListenerObject
import typings.history.dOMUtilsMod.Global.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/DOMUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val isExtraneousPopstateEvent: Boolean = js.native
  def addEventListener(node: EventTarget, event: String, listener: EventListener): Unit = js.native
  def addEventListener(node: EventTarget, event: String, listener: EventListenerObject): Unit = js.native
  def getConfirmation(message: String, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def removeEventListener(node: EventTarget, event: String, listener: EventListener): Unit = js.native
  def removeEventListener(node: EventTarget, event: String, listener: EventListenerObject): Unit = js.native
  def supportsGoWithoutReloadUsingHash(): Boolean = js.native
  def supportsHistory(): Boolean = js.native
}

