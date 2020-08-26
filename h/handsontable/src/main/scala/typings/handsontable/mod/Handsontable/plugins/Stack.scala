package typings.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stack extends js.Object {
  var items: js.Array[_] = js.native
  def isEmpty(): Boolean = js.native
  def peek(): js.Any = js.native
  def pop(): js.Any = js.native
  def push(items: js.Any): Unit = js.native
  def size(): Double = js.native
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
  @scala.inline
  implicit class StackOps[Self <: Stack] (val x: Self) extends AnyVal {
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
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeek(value: () => js.Any): Self = this.set("peek", js.Any.fromFunction0(value))
    @scala.inline
    def setPop(value: () => js.Any): Self = this.set("pop", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: js.Any => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
  }
  
}

