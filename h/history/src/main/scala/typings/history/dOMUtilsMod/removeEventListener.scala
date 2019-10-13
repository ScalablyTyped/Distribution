package typings.history.dOMUtilsMod

import typings.history.dOMUtilsMod._Global_.EventListener
import typings.history.dOMUtilsMod._Global_.EventListenerObject
import typings.history.dOMUtilsMod._Global_.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/DOMUtils", "removeEventListener")
@js.native
object removeEventListener extends js.Object {
  def apply(node: EventTarget, event: String, listener: EventListener): Unit = js.native
  def apply(node: EventTarget, event: String, listener: EventListenerObject): Unit = js.native
}

