package typings.jquery

import typings.jquery.JQuery_._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1[TElement] extends _ValHook[TElement] {
  def set(elem: TElement, value: js.Any): js.Any
}

object Anon1 {
  @scala.inline
  def apply[TElement](set: (TElement, js.Any) => js.Any): Anon1[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Anon1[TElement]]
  }
}

