package typings.knockoutPreRendered

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends js.Object {
  def clear(node: Element): Boolean
  def get(node: Element, key: String): js.Any
  def getAll(node: Element, createIfNotFound: Boolean): js.Any
  def set(node: Element, key: String, value: js.Any): Unit
}

object AnonClear {
  @scala.inline
  def apply(
    clear: Element => Boolean,
    get: (Element, String) => js.Any,
    getAll: (Element, Boolean) => js.Any,
    set: (Element, String, js.Any) => Unit
  ): AnonClear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[AnonClear]
  }
}

