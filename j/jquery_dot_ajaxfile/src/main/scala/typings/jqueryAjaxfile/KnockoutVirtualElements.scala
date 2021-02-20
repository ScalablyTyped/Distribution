package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryAjaxfile.anon.Dictindex
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutVirtualElements extends StObject {
  
  var allowedBindings: StringDictionary[Boolean] = js.native
  
  def childNodes(node: KnockoutVirtualElement): js.Array[Node] = js.native
  
  def emptyNode(node: KnockoutVirtualElement): Unit = js.native
  
  def firstChild(node: KnockoutVirtualElement): KnockoutVirtualElement = js.native
  
  def insertAfter(container: KnockoutVirtualElement, nodeToInsert: Node, insertAfter: Node): Unit = js.native
  
  def nextSibling(node: KnockoutVirtualElement): Node = js.native
  
  def prepend(node: KnockoutVirtualElement, toInsert: Node): Unit = js.native
  
  def setDomNodeChildren(node: KnockoutVirtualElement, newChildren: Dictindex): Unit = js.native
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
    setDomNodeChildren: (KnockoutVirtualElement, Dictindex) => Unit
  ): KnockoutVirtualElements = {
    val __obj = js.Dynamic.literal(allowedBindings = allowedBindings.asInstanceOf[js.Any], childNodes = js.Any.fromFunction1(childNodes), emptyNode = js.Any.fromFunction1(emptyNode), firstChild = js.Any.fromFunction1(firstChild), insertAfter = js.Any.fromFunction3(insertAfter), nextSibling = js.Any.fromFunction1(nextSibling), prepend = js.Any.fromFunction2(prepend), setDomNodeChildren = js.Any.fromFunction2(setDomNodeChildren))
    __obj.asInstanceOf[KnockoutVirtualElements]
  }
  
  @scala.inline
  implicit class KnockoutVirtualElementsMutableBuilder[Self <: KnockoutVirtualElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedBindings(value: StringDictionary[Boolean]): Self = StObject.set(x, "allowedBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodes(value: KnockoutVirtualElement => js.Array[Node]): Self = StObject.set(x, "childNodes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmptyNode(value: KnockoutVirtualElement => Unit): Self = StObject.set(x, "emptyNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirstChild(value: KnockoutVirtualElement => KnockoutVirtualElement): Self = StObject.set(x, "firstChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertAfter(value: (KnockoutVirtualElement, Node, Node) => Unit): Self = StObject.set(x, "insertAfter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNextSibling(value: KnockoutVirtualElement => Node): Self = StObject.set(x, "nextSibling", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrepend(value: (KnockoutVirtualElement, Node) => Unit): Self = StObject.set(x, "prepend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDomNodeChildren(value: (KnockoutVirtualElement, Dictindex) => Unit): Self = StObject.set(x, "setDomNodeChildren", js.Any.fromFunction2(value))
  }
}
