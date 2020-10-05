package typings.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _CSSHook[TElement] extends js.Object {
  def get(elem: TElement, computed: js.Any, extra: js.Any): js.Any = js.native
  def set(elem: TElement, value: js.Any): Unit = js.native
}

object _CSSHook {
  @scala.inline
  def apply[TElement](get: (TElement, js.Any, js.Any) => js.Any, set: (TElement, js.Any) => Unit): _CSSHook[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[_CSSHook[TElement]]
  }
  @scala.inline
  implicit class _CSSHookOps[Self <: _CSSHook[_], TElement] (val x: Self with _CSSHook[TElement]) extends AnyVal {
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
    def setGet(value: (TElement, js.Any, js.Any) => js.Any): Self = this.set("get", js.Any.fromFunction3(value))
    @scala.inline
    def setSet(value: (TElement, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

