package typings.knockoutPreRendered.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clear extends js.Object {
  def clear(node: typings.std.Element): Boolean = js.native
  def get(node: typings.std.Element, key: String): js.Any = js.native
  def getAll(node: typings.std.Element, createIfNotFound: Boolean): js.Any = js.native
  def set(node: typings.std.Element, key: String, value: js.Any): Unit = js.native
}

object Clear {
  @scala.inline
  def apply(
    clear: typings.std.Element => Boolean,
    get: (typings.std.Element, String) => js.Any,
    getAll: (typings.std.Element, Boolean) => js.Any,
    set: (typings.std.Element, String, js.Any) => Unit
  ): Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[Clear]
  }
  @scala.inline
  implicit class ClearOps[Self <: Clear] (val x: Self) extends AnyVal {
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
    def setClear(value: typings.std.Element => Boolean): Self = this.set("clear", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: (typings.std.Element, String) => js.Any): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setGetAll(value: (typings.std.Element, Boolean) => js.Any): Self = this.set("getAll", js.Any.fromFunction2(value))
    @scala.inline
    def setSet(value: (typings.std.Element, String, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction3(value))
  }
  
}

