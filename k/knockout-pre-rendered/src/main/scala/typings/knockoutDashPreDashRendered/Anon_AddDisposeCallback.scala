package typings.knockoutDashPreDashRendered

import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddDisposeCallback extends js.Object {
  def addDisposeCallback(node: Element, callback: js.Function): Unit
  def cleanNode(node: Node): Element
  def removeDisposeCallback(node: Element, callback: js.Function): Unit
  def removeNode(node: Node): Unit
}

object Anon_AddDisposeCallback {
  @scala.inline
  def apply(
    addDisposeCallback: (Element, js.Function) => Unit,
    cleanNode: Node => Element,
    removeDisposeCallback: (Element, js.Function) => Unit,
    removeNode: Node => Unit
  ): Anon_AddDisposeCallback = {
    val __obj = js.Dynamic.literal(addDisposeCallback = js.Any.fromFunction2(addDisposeCallback), cleanNode = js.Any.fromFunction1(cleanNode), removeDisposeCallback = js.Any.fromFunction2(removeDisposeCallback), removeNode = js.Any.fromFunction1(removeNode))
  
    __obj.asInstanceOf[Anon_AddDisposeCallback]
  }
}

