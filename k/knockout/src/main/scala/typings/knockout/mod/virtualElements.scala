package typings.knockout.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "virtualElements")
@js.native
object virtualElements extends js.Object {
  val allowedBindings: VirtualElementsAllowedBindings = js.native
  def childNodes(node: Node): js.Array[Node] = js.native
  def emptyNode(node: Node): Unit = js.native
  def firstChild(node: Node): Node = js.native
  def insertAfter(node: Node, nodeToInsert: Node, insertAfterNode: Node): Unit = js.native
  def nextSibling(node: Node): Node = js.native
  def prepend(node: Node, nodeToPrepend: Node): Unit = js.native
  def setDomNodeChildren(node: Node, childNodes: js.Array[Node]): Unit = js.native
}

