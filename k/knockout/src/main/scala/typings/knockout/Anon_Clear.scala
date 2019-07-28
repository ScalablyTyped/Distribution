package typings.knockout

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  def clear(node: Node): Boolean
  def get(node: Node, key: String): js.Any
  def getAll(node: Node, createIfNotFound: Boolean): js.Any
  def set(node: Node, key: String, value: js.Any): Unit
}

object Anon_Clear {
  @scala.inline
  def apply(
    clear: Node => Boolean,
    get: (Node, String) => js.Any,
    getAll: (Node, Boolean) => js.Any,
    set: (Node, String, js.Any) => Unit
  ): Anon_Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3(set))
  
    __obj.asInstanceOf[Anon_Clear]
  }
}

