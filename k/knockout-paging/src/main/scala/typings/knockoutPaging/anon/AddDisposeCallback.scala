package typings.knockoutPaging.anon

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddDisposeCallback extends js.Object {
  def addDisposeCallback(node: typings.std.Element, callback: js.Function): Unit
  def cleanNode(node: Node): typings.std.Element
  def removeDisposeCallback(node: typings.std.Element, callback: js.Function): Unit
  def removeNode(node: Node): Unit
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
}

