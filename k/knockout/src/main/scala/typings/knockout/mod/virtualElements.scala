package typings.knockout.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualElements {
  
  @JSImport("knockout", "virtualElements")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("knockout", "virtualElements.allowedBindings")
  @js.native
  val allowedBindings: VirtualElementsAllowedBindings = js.native
  
  @scala.inline
  def childNodes(node: Node): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("childNodes")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
  
  @scala.inline
  def emptyNode(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def firstChild(node: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("firstChild")(node.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  @scala.inline
  def insertAfter(node: Node, nodeToInsert: Node, insertAfterNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(node.asInstanceOf[js.Any], nodeToInsert.asInstanceOf[js.Any], insertAfterNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def nextSibling(node: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("nextSibling")(node.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  @scala.inline
  def prepend(node: Node, nodeToPrepend: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prepend")(node.asInstanceOf[js.Any], nodeToPrepend.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setDomNodeChildren(node: Node, childNodes: js.Array[Node]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDomNodeChildren")(node.asInstanceOf[js.Any], childNodes.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
