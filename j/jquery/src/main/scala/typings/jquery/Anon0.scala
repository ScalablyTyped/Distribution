package typings.jquery

import typings.jquery.JQuery_._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[TElement] extends _ValHook[TElement] {
  def get(elem: TElement): js.Any
}

object Anon0 {
  @scala.inline
  def apply[TElement](get: TElement => js.Any): Anon0[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Anon0[TElement]]
  }
}

