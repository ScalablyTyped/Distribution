package typings.knockoutPreRendered.anon

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddDisposeCallback extends js.Object {
  def addDisposeCallback(node: typings.std.Element, callback: js.Function): Unit = js.native
  def cleanNode(node: Node): typings.std.Element = js.native
  def removeDisposeCallback(node: typings.std.Element, callback: js.Function): Unit = js.native
  def removeNode(node: Node): Unit = js.native
}

object AddDisposeCallback {
  @scala.inline
  def apply(
    addDisposeCallback: (typings.std.Element, js.Function) => Unit,
    cleanNode: Node => typings.std.Element,
    removeDisposeCallback: (typings.std.Element, js.Function) => Unit,
    removeNode: Node => Unit
  ): AddDisposeCallback = {
    val __obj = js.Dynamic.literal(addDisposeCallback = js.Any.fromFunction2(addDisposeCallback), cleanNode = js.Any.fromFunction1(cleanNode), removeDisposeCallback = js.Any.fromFunction2(removeDisposeCallback), removeNode = js.Any.fromFunction1(removeNode))
    __obj.asInstanceOf[AddDisposeCallback]
  }
  @scala.inline
  implicit class AddDisposeCallbackOps[Self <: AddDisposeCallback] (val x: Self) extends AnyVal {
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
    def setAddDisposeCallback(value: (typings.std.Element, js.Function) => Unit): Self = this.set("addDisposeCallback", js.Any.fromFunction2(value))
    @scala.inline
    def setCleanNode(value: Node => typings.std.Element): Self = this.set("cleanNode", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveDisposeCallback(value: (typings.std.Element, js.Function) => Unit): Self = this.set("removeDisposeCallback", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveNode(value: Node => Unit): Self = this.set("removeNode", js.Any.fromFunction1(value))
  }
  
}

