package typings.jestMatcherUtils.replaceableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Replaceable extends js.Object {
  var `object`: js.Any = js.native
  var `type`: String = js.native
  def forEach(cb: ReplaceableForEachCallBack): Unit = js.native
  def get(key: js.Any): js.Any = js.native
  def set(key: js.Any, value: js.Any): Unit = js.native
}

object Replaceable {
  @scala.inline
  def apply(
    forEach: ReplaceableForEachCallBack => Unit,
    get: js.Any => js.Any,
    `object`: js.Any,
    set: (js.Any, js.Any) => Unit,
    `type`: String
  ): Replaceable = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replaceable]
  }
  @scala.inline
  implicit class ReplaceableOps[Self <: Replaceable] (val x: Self) extends AnyVal {
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
    def setForEach(value: ReplaceableForEachCallBack => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: js.Any => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setObject(value: js.Any): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: (js.Any, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

