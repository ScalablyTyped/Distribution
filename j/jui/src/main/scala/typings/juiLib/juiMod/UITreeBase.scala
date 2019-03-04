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
    appendNode: js.Function1[/* repeated */ js.Any, UITreeNode],
    foldNode: js.Function1[java.lang.String, scala.Unit],
    foldNodeAll: js.Function1[java.lang.String, scala.Unit],
    getNode: js.Function1[java.lang.String, UITreeNode],
    getNodeAll: js.Function1[java.lang.String, js.Array[UITreeNode]],
    getNodeParent: js.Function1[java.lang.String, UITreeNode],
    getRoot: js.Function0[UITreeNode],
    insertNode: js.Function2[java.lang.String, js.Any, UITreeNode],
    moveNode: js.Function2[java.lang.String, scala.Double, scala.Unit],
    openNode: js.Function1[java.lang.String, scala.Unit],
    openNodeAll: js.Function1[java.lang.String, scala.Unit],
    removeNode: js.Function1[java.lang.String, scala.Unit],
    removeNodes: js.Function0[scala.Unit],
    updateNode: js.Function2[java.lang.String, js.Any, UITreeNode]
  ): UITreeBase = {
    val __obj = js.Dynamic.literal(appendNode = appendNode, foldNode = foldNode, foldNodeAll = foldNodeAll, getNode = getNode, getNodeAll = getNodeAll, getNodeParent = getNodeParent, getRoot = getRoot, insertNode = insertNode, moveNode = moveNode, openNode = openNode, openNodeAll = openNodeAll, removeNode = removeNode, removeNodes = removeNodes, updateNode = updateNode)
  
    __obj.asInstanceOf[UITreeBase]
  }
}

