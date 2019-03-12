package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutVirtualElements extends js.Object {
  var allowedBindings: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  def childNodes(node: KnockoutVirtualElement): js.Array[stdLib.Node]
  def emptyNode(node: KnockoutVirtualElement): scala.Unit
  def firstChild(node: KnockoutVirtualElement): KnockoutVirtualElement
  def insertAfter(container: KnockoutVirtualElement, nodeToInsert: stdLib.Node, insertAfter: stdLib.Node): scala.Unit
  def nextSibling(node: KnockoutVirtualElement): stdLib.Node
  def prepend(node: KnockoutVirtualElement, toInsert: stdLib.Node): scala.Unit
  def setDomNodeChildren(node: KnockoutVirtualElement, newChildren: Anon_Index): scala.Unit
}

object KnockoutVirtualElements {
  @scala.inline
  def apply(
    allowedBindings: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    childNodes: KnockoutVirtualElement => js.Array[stdLib.Node],
    emptyNode: KnockoutVirtualElement => scala.Unit,
    firstChild: KnockoutVirtualElement => KnockoutVirtualElement,
    insertAfter: (KnockoutVirtualElement, stdLib.Node, stdLib.Node) => scala.Unit,
    nextSibling: KnockoutVirtualElement => stdLib.Node,
    prepend: (KnockoutVirtualElement, stdLib.Node) => scala.Unit,
    setDomNodeChildren: (KnockoutVirtualElement, Anon_Index) => scala.Unit
  ): KnockoutVirtualElements = {
    val __obj = js.Dynamic.literal(allowedBindings = allowedBindings, childNodes = js.Any.fromFunction1(childNodes), emptyNode = js.Any.fromFunction1(emptyNode), firstChild = js.Any.fromFunction1(firstChild), insertAfter = js.Any.fromFunction3(insertAfter), nextSibling = js.Any.fromFunction1(nextSibling), prepend = js.Any.fromFunction2(prepend), setDomNodeChildren = js.Any.fromFunction2(setDomNodeChildren))
  
    __obj.asInstanceOf[KnockoutVirtualElements]
  }
}

