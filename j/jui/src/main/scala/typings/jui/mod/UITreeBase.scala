package typings.jui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UITreeBase extends js.Object {
  def appendNode(args: js.Any*): UITreeNode = js.native
  def foldNode(index: String): Unit = js.native
  def foldNodeAll(index: String): Unit = js.native
  def getNode(index: String): UITreeNode = js.native
  def getNodeAll(index: String): js.Array[UITreeNode] = js.native
  def getNodeParent(index: String): UITreeNode = js.native
  def getRoot(): UITreeNode = js.native
  def insertNode(index: String, data: js.Any): UITreeNode = js.native
  def moveNode(index: String, targetIndex: Double): Unit = js.native
  def openNode(index: String): Unit = js.native
  def openNodeAll(index: String): Unit = js.native
  def removeNode(index: String): Unit = js.native
  def removeNodes(): Unit = js.native
  def updateNode(index: String, data: js.Any): UITreeNode = js.native
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
  @scala.inline
  implicit class UITreeBaseOps[Self <: UITreeBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppendNode(value: /* repeated */ js.Any => UITreeNode): Self = this.set("appendNode", js.Any.fromFunction1(value))
    @scala.inline
    def setFoldNode(value: String => Unit): Self = this.set("foldNode", js.Any.fromFunction1(value))
    @scala.inline
    def setFoldNodeAll(value: String => Unit): Self = this.set("foldNodeAll", js.Any.fromFunction1(value))
    @scala.inline
    def setGetNode(value: String => UITreeNode): Self = this.set("getNode", js.Any.fromFunction1(value))
    @scala.inline
    def setGetNodeAll(value: String => js.Array[UITreeNode]): Self = this.set("getNodeAll", js.Any.fromFunction1(value))
    @scala.inline
    def setGetNodeParent(value: String => UITreeNode): Self = this.set("getNodeParent", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRoot(value: () => UITreeNode): Self = this.set("getRoot", js.Any.fromFunction0(value))
    @scala.inline
    def setInsertNode(value: (String, js.Any) => UITreeNode): Self = this.set("insertNode", js.Any.fromFunction2(value))
    @scala.inline
    def setMoveNode(value: (String, Double) => Unit): Self = this.set("moveNode", js.Any.fromFunction2(value))
    @scala.inline
    def setOpenNode(value: String => Unit): Self = this.set("openNode", js.Any.fromFunction1(value))
    @scala.inline
    def setOpenNodeAll(value: String => Unit): Self = this.set("openNodeAll", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveNode(value: String => Unit): Self = this.set("removeNode", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveNodes(value: () => Unit): Self = this.set("removeNodes", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateNode(value: (String, js.Any) => UITreeNode): Self = this.set("updateNode", js.Any.fromFunction2(value))
  }
  
}

