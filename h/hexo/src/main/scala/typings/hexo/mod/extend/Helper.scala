package typings.hexo.mod.extend

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Helper extends js.Object {
  def get(name: String): js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  def list(): StringDictionary[js.Function1[/* repeated */ js.Any, _]] = js.native
  def register(name: String, fn: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}

object Helper {
  @scala.inline
  def apply(
    get: String => js.UndefOr[js.Function1[/* repeated */ js.Any, _]],
    list: () => StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    register: (String, js.Function1[/* repeated */ js.Any, _]) => Unit
  ): Helper = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list), register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Helper]
  }
  @scala.inline
  implicit class HelperOps[Self <: Helper] (val x: Self) extends AnyVal {
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
    def setGet(value: String => js.UndefOr[js.Function1[/* repeated */ js.Any, _]]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: () => StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Self = this.set("list", js.Any.fromFunction0(value))
    @scala.inline
    def setRegister(value: (String, js.Function1[/* repeated */ js.Any, _]) => Unit): Self = this.set("register", js.Any.fromFunction2(value))
  }
  
}

