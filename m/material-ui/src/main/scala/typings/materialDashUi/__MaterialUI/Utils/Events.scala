package typings.materialDashUi.__MaterialUI.Utils

import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  def isKeyboard(e: Event): Boolean
  def off(el: Element, `type`: String, callback: EventListener): Unit
  def on(el: Element, `type`: String, callback: EventListener): Unit
  def once(el: Element, `type`: String, callback: EventListener): Unit
}

@JSGlobal("__MaterialUI.Utils.Events")
@js.native
object Events extends TopLevel[Events]

