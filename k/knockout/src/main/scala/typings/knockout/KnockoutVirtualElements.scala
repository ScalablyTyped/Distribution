package typings.knockout

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutVirtualElements extends js.Object {
  var allowedBindings: StringDictionary[Boolean]
  def childNodes(node: KnockoutVirtualElement): js.Array[Node]
  def emptyNode(node: KnockoutVirtualElement): Unit
  def firstChild(node: KnockoutVirtualElement): KnockoutVirtualElement
  def insertAfter(container: KnockoutVirtualElement, nodeToInsert: Node, insertAfter: Node): Unit
  def nextSibling(node: KnockoutVirtualElement): Node
  def prepend(node: KnockoutVirtualElement, toInsert: Node): Unit
  def setDomNodeChildren(node: KnockoutVirtualElement, newChildren: Anon_Index): Unit
}

object KnockoutVirtualElements {
  @scala.inline
  def apply(
    allowedBindings: StringDictionary[Boolean],
    childNodes: KnockoutVirtualElement => js.Array[Node],
    emptyNode: KnockoutVirtualElement => Unit,
    firstChild: KnockoutVirtualElement => KnockoutVirtualElement,
    insertAfter: (KnockoutVirtualElement, Node, Node) => Unit,
    nextSibling: KnockoutVirtualElement => Node,
    prepend: (KnockoutVirtualElement, Node) => Unit,
    setDomNodeChildren: (KnockoutVirtualElement, Anon_Index) => Unit
  ): KnockoutVirtualElements = {
    val __obj = js.Dynamic.literal(allowedBindings = allowedBindings.asInstanceOf[js.Any], childNodes = js.Any.fromFunction1(childNodes), emptyNode = js.Any.fromFunction1(emptyNode), firstChild = js.Any.fromFunction1(firstChild), insertAfter = js.Any.fromFunction3(insertAfter), nextSibling = js.Any.fromFunction1(nextSibling), prepend = js.Any.fromFunction2(prepend), setDomNodeChildren = js.Any.fromFunction2(setDomNodeChildren))
  
    __obj.asInstanceOf[KnockoutVirtualElements]
  }
}

