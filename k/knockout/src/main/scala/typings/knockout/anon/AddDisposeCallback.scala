package typings.knockout.anon

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddDisposeCallback extends js.Object {
  def addDisposeCallback(node: Node, callback: js.Function): Unit
  def cleanNode(node: Node): Node
  def removeDisposeCallback(node: Node, callback: js.Function): Unit
  def removeNode(node: Node): Unit
}

object AddDisposeCallback {
  @scala.inline
  def apply(
    addDisposeCallback: (Node, js.Function) => Unit,
    cleanNode: Node => Node,
    removeDisposeCallback: (Node, js.Function) => Unit,
    removeNode: Node => Unit
  ): AddDisposeCallback = {
    val __obj = js.Dynamic.literal(addDisposeCallback = js.Any.fromFunction2(addDisposeCallback), cleanNode = js.Any.fromFunction1(cleanNode), removeDisposeCallback = js.Any.fromFunction2(removeDisposeCallback), removeNode = js.Any.fromFunction1(removeNode))
    __obj.asInstanceOf[AddDisposeCallback]
  }
}

