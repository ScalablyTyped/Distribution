package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `8` extends js.Object {
  def init(
    element: HTMLElement,
    valueAccessor: js.Function0[MaybeSubscribable[String]],
    allBindings: AllBindings
  ): Unit = js.native
}

object `8` {
  @scala.inline
  def apply(init: (HTMLElement, js.Function0[MaybeSubscribable[String]], AllBindings) => Unit): `8` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction3(init))
    __obj.asInstanceOf[`8`]
  }
  @scala.inline
  implicit class `8Ops`[Self <: `8`] (val x: Self) extends AnyVal {
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
    def setInit(value: (HTMLElement, js.Function0[MaybeSubscribable[String]], AllBindings) => Unit): Self = this.set("init", js.Any.fromFunction3(value))
  }
  
}

