package typings
package historyLib.domutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/DOMUtils", JSImport.Namespace)
@js.native
object domutilsModMembers extends js.Object {
  val isExtraneousPopstateEvent: scala.Boolean = js.native
  def addEventListener(
    node: historyLib.domutilsMod.Global.EventTarget,
    event: java.lang.String,
    listener: historyLib.domutilsMod.Global.EventListener
  ): scala.Unit = js.native
  def addEventListener(
    node: historyLib.domutilsMod.Global.EventTarget,
    event: java.lang.String,
    listener: historyLib.domutilsMod.Global.EventListenerObject
  ): scala.Unit = js.native
  def getConfirmation(message: java.lang.String, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def removeEventListener(
    node: historyLib.domutilsMod.Global.EventTarget,
    event: java.lang.String,
    listener: historyLib.domutilsMod.Global.EventListener
  ): scala.Unit = js.native
  def removeEventListener(
    node: historyLib.domutilsMod.Global.EventTarget,
    event: java.lang.String,
    listener: historyLib.domutilsMod.Global.EventListenerObject
  ): scala.Unit = js.native
  def supportsGoWithoutReloadUsingHash(): scala.Boolean = js.native
  def supportsHistory(): scala.Boolean = js.native
}

