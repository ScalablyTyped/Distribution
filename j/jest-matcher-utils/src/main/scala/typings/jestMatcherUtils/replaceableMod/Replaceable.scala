package typings.jestMatcherUtils.replaceableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replaceable extends js.Object {
  var `object`: js.Any
  var `type`: String
  def forEach(cb: ReplaceableForEachCallBack): Unit
  def get(key: js.Any): js.Any
  def set(key: js.Any, value: js.Any): Unit
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
}

