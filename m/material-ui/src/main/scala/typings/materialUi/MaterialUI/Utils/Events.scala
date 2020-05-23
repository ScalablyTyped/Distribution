package typings.materialUi.MaterialUI.Utils

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

object Events {
  @scala.inline
  def apply(
    isKeyboard: Event => Boolean,
    off: (Element, String, EventListener) => Unit,
    on: (Element, String, EventListener) => Unit,
    once: (Element, String, EventListener) => Unit
  ): Events = {
    val __obj = js.Dynamic.literal(isKeyboard = js.Any.fromFunction1(isKeyboard), off = js.Any.fromFunction3(off), on = js.Any.fromFunction3(on), once = js.Any.fromFunction3(once))
    __obj.asInstanceOf[Events]
  }
}

