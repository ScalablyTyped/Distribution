package typings.jquery.anon

import typings.jquery.JQuery._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[TElement] extends _ValHook[TElement] {
  def get(elem: TElement): js.Any = js.native
}

object `0` {
  @scala.inline
  def apply[TElement](get: TElement => js.Any): `0`[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[`0`[TElement]]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_], TElement] (val x: Self with `0`[TElement]) extends AnyVal {
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
    def setGet(value: TElement => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

