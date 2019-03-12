package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UITreeBase extends js.Object {
  def appendNode(args: js.Any*): UITreeNode
  def foldNode(index: java.lang.String): scala.Unit
  def foldNodeAll(index: java.lang.String): scala.Unit
  def getNode(index: java.lang.String): UITreeNode
  def getNodeAll(index: java.lang.String): js.Array[UITreeNode]
  def getNodeParent(index: java.lang.String): UITreeNode
  def getRoot(): UITreeNode
  def insertNode(index: java.lang.String, data: js.Any): UITreeNode
  def moveNode(index: java.lang.String, targetIndex: scala.Double): scala.Unit
  def openNode(index: java.lang.String): scala.Unit
  def openNodeAll(index: java.lang.String): scala.Unit
  def removeNode(index: java.lang.String): scala.Unit
  def removeNodes(): scala.Unit
  def updateNode(index: java.lang.String, data: js.Any): UITreeNode
}

object UITreeBase {
  @scala.inline
  def apply(
    appendNode: /* repeated */ js.Any => UITreeNode,
    foldNode: java.lang.String => scala.Unit,
    foldNodeAll: java.lang.String => scala.Unit,
    getNode: java.lang.String => UITreeNode,
    getNodeAll: java.lang.String => js.Array[UITreeNode],
    getNodeParent: java.lang.String => UITreeNode,
    getRoot: () => UITreeNode,
    insertNode: (java.lang.String, js.Any) => UITreeNode,
    moveNode: (java.lang.String, scala.Double) => scala.Unit,
    openNode: java.lang.String => scala.Unit,
    openNodeAll: java.lang.String => scala.Unit,
    removeNode: java.lang.String => scala.Unit,
    removeNodes: () => scala.Unit,
    updateNode: (java.lang.String, js.Any) => UITreeNode
  ): UITreeBase = {
    val __obj = js.Dynamic.literal(appendNode = js.Any.fromFunction1(appendNode), foldNode = js.Any.fromFunction1(foldNode), foldNodeAll = js.Any.fromFunction1(foldNodeAll), getNode = js.Any.fromFunction1(getNode), getNodeAll = js.Any.fromFunction1(getNodeAll), getNodeParent = js.Any.fromFunction1(getNodeParent), getRoot = js.Any.fromFunction0(getRoot), insertNode = js.Any.fromFunction2(insertNode), moveNode = js.Any.fromFunction2(moveNode), openNode = js.Any.fromFunction1(openNode), openNodeAll = js.Any.fromFunction1(openNodeAll), removeNode = js.Any.fromFunction1(removeNode), removeNodes = js.Any.fromFunction0(removeNodes), updateNode = js.Any.fromFunction2(updateNode))
  
    __obj.asInstanceOf[UITreeBase]
  }
}

