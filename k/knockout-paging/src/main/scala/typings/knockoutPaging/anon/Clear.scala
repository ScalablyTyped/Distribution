package typings.knockoutPaging.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clear extends js.Object {
  def clear(node: typings.std.Element): Boolean
  def get(node: typings.std.Element, key: String): js.Any
  def getAll(node: typings.std.Element, createIfNotFound: Boolean): js.Any
  def set(node: typings.std.Element, key: String, value: js.Any): Unit
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
}

