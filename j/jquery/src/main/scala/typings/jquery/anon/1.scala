package typings.jquery.anon

import typings.jquery.JQuery._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1`[TElement] extends _ValHook[TElement] {
  def set(elem: TElement, value: js.Any): js.Any = js.native
}

object `1` {
  @scala.inline
  def apply[TElement](set: (TElement, js.Any) => js.Any): `1`[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[`1`[TElement]]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`[_], TElement] (val x: Self with `1`[TElement]) extends AnyVal {
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
    def setSet(value: (TElement, js.Any) => js.Any): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

