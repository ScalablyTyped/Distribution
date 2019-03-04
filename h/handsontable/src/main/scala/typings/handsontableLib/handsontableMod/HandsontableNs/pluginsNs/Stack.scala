package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stack extends js.Object {
  var items: js.Array[_]
  def isEmpty(): scala.Boolean
  def peek(): js.Any
  def pop(): js.Any
  def push(items: js.Any): scala.Unit
  def size(): scala.Double
}

object Stack {
  @scala.inline
  def apply(
    isEmpty: js.Function0[scala.Boolean],
    items: js.Array[_],
    peek: js.Function0[js.Any],
    pop: js.Function0[js.Any],
    push: js.Function1[js.Any, scala.Unit],
    size: js.Function0[scala.Double]
  ): Stack = {
    val __obj = js.Dynamic.literal(isEmpty = isEmpty, items = items, peek = peek, pop = pop, push = push, size = size)
  
    __obj.asInstanceOf[Stack]
  }
}

