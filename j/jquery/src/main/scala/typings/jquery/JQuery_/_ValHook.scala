package typings.jquery.JQuery_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ValHook[TElement] extends js.Object

object _ValHook {
  @scala.inline
  def AnonElem[TElement](get: TElement => js.Any): _ValHook[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[_ValHook[TElement]]
  }
  @scala.inline
  def AnonElemSet[TElement](set: (TElement, js.Any) => js.Any): _ValHook[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[_ValHook[TElement]]
  }
}

