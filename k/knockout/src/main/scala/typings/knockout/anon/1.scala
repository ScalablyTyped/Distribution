package typings.knockout.anon

import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1` extends js.Object {
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[String | js.Object]]): Unit = js.native
}

object `1` {
  @scala.inline
  def apply(update: (HTMLElement, js.Function0[MaybeSubscribable[String | js.Object]]) => Unit): `1` = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[`1`]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
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
    def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[String | js.Object]]) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

