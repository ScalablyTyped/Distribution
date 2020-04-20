package typings.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stack extends js.Object {
  var items: js.Array[_]
  def isEmpty(): Boolean
  def peek(): js.Any
  def pop(): js.Any
  def push(items: js.Any): Unit
  def size(): Double
}

object Stack {
  @scala.inline
  def apply(
    isEmpty: () => Boolean,
    items: js.Array[_],
    peek: () => js.Any,
    pop: () => js.Any,
    push: js.Any => Unit,
    size: () => Double
  ): Stack = {
    val __obj = js.Dynamic.literal(isEmpty = js.Any.fromFunction0(isEmpty), items = items.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[Stack]
  }
}

