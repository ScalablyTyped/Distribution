package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait After extends js.Object {
  var after: js.Array[String] = js.native
  def init(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[_]], allBindings: AllBindings): Unit = js.native
  def update(args: js.Any*): Unit = js.native
}

object After {
  @scala.inline
  def apply(
    after: js.Array[String],
    init: (HTMLElement, js.Function0[MaybeSubscribable[_]], AllBindings) => Unit,
    update: /* repeated */ js.Any => Unit
  ): After = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], init = js.Any.fromFunction3(init), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[After]
  }
  @scala.inline
  implicit class AfterOps[Self <: After] (val x: Self) extends AnyVal {
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
    def setAfterVarargs(value: String*): Self = this.set("after", js.Array(value :_*))
    @scala.inline
    def setAfter(value: js.Array[String]): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: (HTMLElement, js.Function0[MaybeSubscribable[_]], AllBindings) => Unit): Self = this.set("init", js.Any.fromFunction3(value))
    @scala.inline
    def setUpdate(value: /* repeated */ js.Any => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

