package typings.jui.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UITreeBase extends js.Object {
  def appendNode(args: js.Any*): UITreeNode
  def foldNode(index: String): Unit
  def foldNodeAll(index: String): Unit
  def getNode(index: String): UITreeNode
  def getNodeAll(index: String): js.Array[UITreeNode]
  def getNodeParent(index: String): UITreeNode
  def getRoot(): UITreeNode
  def insertNode(index: String, data: js.Any): UITreeNode
  def moveNode(index: String, targetIndex: Double): Unit
  def openNode(index: String): Unit
  def openNodeAll(index: String): Unit
  def removeNode(index: String): Unit
  def removeNodes(): Unit
  def updateNode(index: String, data: js.Any): UITreeNode
}

object UITreeBase {
  @scala.inline
  def apply(
    appendNode: /* repeated */ js.Any => UITreeNode,
    foldNode: String => Unit,
    foldNodeAll: String => Unit,
    getNode: String => UITreeNode,
    getNodeAll: String => js.Array[UITreeNode],
    getNodeParent: String => UITreeNode,
    getRoot: () => UITreeNode,
    insertNode: (String, js.Any) => UITreeNode,
    moveNode: (String, Double) => Unit,
    openNode: String => Unit,
    openNodeAll: String => Unit,
    removeNode: String => Unit,
    removeNodes: () => Unit,
    updateNode: (String, js.Any) => UITreeNode
  ): UITreeBase = {
    val __obj = js.Dynamic.literal(appendNode = js.Any.fromFunction1(appendNode), foldNode = js.Any.fromFunction1(foldNode), foldNodeAll = js.Any.fromFunction1(foldNodeAll), getNode = js.Any.fromFunction1(getNode), getNodeAll = js.Any.fromFunction1(getNodeAll), getNodeParent = js.Any.fromFunction1(getNodeParent), getRoot = js.Any.fromFunction0(getRoot), insertNode = js.Any.fromFunction2(insertNode), moveNode = js.Any.fromFunction2(moveNode), openNode = js.Any.fromFunction1(openNode), openNodeAll = js.Any.fromFunction1(openNodeAll), removeNode = js.Any.fromFunction1(removeNode), removeNodes = js.Any.fromFunction0(removeNodes), updateNode = js.Any.fromFunction2(updateNode))
  
    __obj.asInstanceOf[UITreeBase]
  }
}

