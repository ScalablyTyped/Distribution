package typings.knockout.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualElements {
  
  @JSImport("knockout", "virtualElements.allowedBindings")
  @js.native
  val allowedBindings: VirtualElementsAllowedBindings = js.native
  
  @JSImport("knockout", "virtualElements.childNodes")
  @js.native
  def childNodes(node: Node): js.Array[Node] = js.native
  
  @JSImport("knockout", "virtualElements.emptyNode")
  @js.native
  def emptyNode(node: Node): Unit = js.native
  
  @JSImport("knockout", "virtualElements.firstChild")
  @js.native
  def firstChild(node: Node): Node = js.native
  
  @JSImport("knockout", "virtualElements.insertAfter")
  @js.native
  def insertAfter(node: Node, nodeToInsert: Node, insertAfterNode: Node): Unit = js.native
  
  @JSImport("knockout", "virtualElements.nextSibling")
  @js.native
  def nextSibling(node: Node): Node = js.native
  
  @JSImport("knockout", "virtualElements.prepend")
  @js.native
  def prepend(node: Node, nodeToPrepend: Node): Unit = js.native
  
  @JSImport("knockout", "virtualElements.setDomNodeChildren")
  @js.native
  def setDomNodeChildren(node: Node, childNodes: js.Array[Node]): Unit = js.native
}
