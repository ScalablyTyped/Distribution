package typings.jquery.anon

import typings.jquery.JQuery._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[TElement] extends _ValHook[TElement] {
  def get(elem: TElement): js.Any
}

object `0` {
  @scala.inline
  def apply[TElement](get: TElement => js.Any): `0`[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[`0`[TElement]]
  }
}

