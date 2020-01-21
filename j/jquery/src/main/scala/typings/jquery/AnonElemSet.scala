package typings.jquery

import typings.jquery.JQuery_._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElemSet[TElement] extends _ValHook[TElement] {
  def set(elem: TElement, value: js.Any): js.Any
}

object AnonElemSet {
  @scala.inline
  def apply[TElement](set: (TElement, js.Any) => js.Any): AnonElemSet[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[AnonElemSet[TElement]]
  }
}

