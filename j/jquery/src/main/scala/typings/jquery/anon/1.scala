package typings.jquery.anon

import typings.jquery.JQuery._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1`[TElement] extends _ValHook[TElement] {
  def set(elem: TElement, value: js.Any): js.Any
}

object `1` {
  @scala.inline
  def apply[TElement](set: (TElement, js.Any) => js.Any): `1`[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[`1`[TElement]]
  }
}

