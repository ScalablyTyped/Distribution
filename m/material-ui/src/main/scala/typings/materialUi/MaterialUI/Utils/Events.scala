package typings.materialUi.MaterialUI.Utils

import typings.std.Element
import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends js.Object {
  def isKeyboard(e: Event): Boolean = js.native
  def off(el: Element, `type`: String, callback: EventListener): Unit = js.native
  def on(el: Element, `type`: String, callback: EventListener): Unit = js.native
  def once(el: Element, `type`: String, callback: EventListener): Unit = js.native
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
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsKeyboard(value: Event => Boolean): Self = this.set("isKeyboard", js.Any.fromFunction1(value))
    @scala.inline
    def setOff(value: (Element, String, EventListener) => Unit): Self = this.set("off", js.Any.fromFunction3(value))
    @scala.inline
    def setOn(value: (Element, String, EventListener) => Unit): Self = this.set("on", js.Any.fromFunction3(value))
    @scala.inline
    def setOnce(value: (Element, String, EventListener) => Unit): Self = this.set("once", js.Any.fromFunction3(value))
  }
  
}

