package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  def clear(node: stdLib.Node): scala.Boolean
  def get(node: stdLib.Node, key: java.lang.String): js.Any
  def getAll(node: stdLib.Node, createIfNotFound: scala.Boolean): js.Any
  def set(node: stdLib.Node, key: java.lang.String, value: js.Any): scala.Unit
}

object Anon_Clear {
  @scala.inline
  def apply(
    clear: stdLib.Node => scala.Boolean,
    get: (stdLib.Node, java.lang.String) => js.Any,
    getAll: (stdLib.Node, scala.Boolean) => js.Any,
    set: (stdLib.Node, java.lang.String, js.Any) => scala.Unit
  ): Anon_Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3(set))
  
    __obj.asInstanceOf[Anon_Clear]
  }
}

