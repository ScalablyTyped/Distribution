package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  def clear(node: stdLib.Element): scala.Boolean
  def get(node: stdLib.Element, key: java.lang.String): js.Any
  def getAll(node: stdLib.Element, createIfNotFound: scala.Boolean): js.Any
  def set(node: stdLib.Element, key: java.lang.String, value: js.Any): scala.Unit
}

object Anon_Clear {
  @scala.inline
  def apply(
    clear: stdLib.Element => scala.Boolean,
    get: (stdLib.Element, java.lang.String) => js.Any,
    getAll: (stdLib.Element, scala.Boolean) => js.Any,
    set: (stdLib.Element, java.lang.String, js.Any) => scala.Unit
  ): Anon_Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3(set))
  
    __obj.asInstanceOf[Anon_Clear]
  }
}

