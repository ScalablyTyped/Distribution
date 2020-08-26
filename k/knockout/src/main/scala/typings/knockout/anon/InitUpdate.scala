package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitUpdate extends js.Object {
  def init(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[_]], allBindings: AllBindings): Unit = js.native
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[_]]): Unit = js.native
}

object InitUpdate {
  @scala.inline
  def apply(
    init: (HTMLElement, js.Function0[MaybeSubscribable[_]], AllBindings) => Unit,
    update: (HTMLElement, js.Function0[MaybeSubscribable[_]]) => Unit
  ): InitUpdate = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction3(init), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[InitUpdate]
  }
  @scala.inline
  implicit class InitUpdateOps[Self <: InitUpdate] (val x: Self) extends AnyVal {
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
    def setInit(value: (HTMLElement, js.Function0[MaybeSubscribable[_]], AllBindings) => Unit): Self = this.set("init", js.Any.fromFunction3(value))
    @scala.inline
    def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[_]]) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

