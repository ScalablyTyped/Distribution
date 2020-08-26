package typings.jqueryCycle2.JQueryCycle2

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transition extends js.Object {
  def before(opts: Options, curr: Element, next: Element, fwd: Boolean): Unit = js.native
}

object Transition {
  @scala.inline
  def apply(before: (Options, Element, Element, Boolean) => Unit): Transition = {
    val __obj = js.Dynamic.literal(before = js.Any.fromFunction4(before))
    __obj.asInstanceOf[Transition]
  }
  @scala.inline
  implicit class TransitionOps[Self <: Transition] (val x: Self) extends AnyVal {
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
    def setBefore(value: (Options, Element, Element, Boolean) => Unit): Self = this.set("before", js.Any.fromFunction4(value))
  }
  
}

