package typings.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CSSHook[TElement] extends js.Object {
  def get(elem: TElement, computed: js.Any, extra: js.Any): js.Any
  def set(elem: TElement, value: js.Any): Unit
}

object _CSSHook {
  @scala.inline
  def apply[TElement](get: (TElement, js.Any, js.Any) => js.Any, set: (TElement, js.Any) => Unit): _CSSHook[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[_CSSHook[TElement]]
  }
}

