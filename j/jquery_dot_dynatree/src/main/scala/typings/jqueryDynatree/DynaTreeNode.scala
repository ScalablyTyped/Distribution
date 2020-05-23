package typings.jqueryDynatree

import typings.jquery.JQueryAjaxSettings
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynaTreeNode extends js.Object {
  var data: DynaTreeDataModel = js.native
  def activate(): Unit = js.native
  def activateSilently(): Unit = js.native
  def addChild(nodeData: js.Array[DynaTreeDataModel]): Unit = js.native
  def addChild(nodeData: js.Array[DynaTreeDataModel], beforeNode: DynaTreeNode): Unit = js.native
  def addChild(nodeData: DynaTreeDataModel): Unit = js.native
  def addChild(nodeData: DynaTreeDataModel, beforeNode: DynaTreeNode): Unit = js.native
  def appendAjax(ajaxOptions: JQueryAjaxSettings): Unit = js.native
  def countChildren(): Double = js.native
  def deactivate(): Unit = js.native
  def expand(flag: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def getChildren(): js.Array[DynaTreeNode] = js.native
  def getEventTargetType(event: Event): String = js.native
  def getLevel(): Double = js.native
  def getNextSibling(): DynaTreeNode = js.native
  def getParent(): DynaTreeNode = js.native
  def getPrevSibling(): DynaTreeNode = js.native
  def hasChildren(): Boolean = js.native
  def isActive(): Boolean = js.native
  def isChildOf(otherNode: DynaTreeNode): Boolean = js.native
  def isDescendantOf(otherNode: DynaTreeNode): Boolean = js.native
  def isExpanded(): Boolean = js.native
  def isFirstSibling(): Boolean = js.native
  def isFocused(): Boolean = js.native
  def isLastSibling(): Boolean = js.native
  def isLazy(): Boolean = js.native
  def isLoading(): Boolean = js.native
  def isSelected(): Boolean = js.native
  def isStatusNode(): Boolean = js.native
  def isVisible(): Boolean = js.native
  def makeVisible(): Boolean = js.native
  def move(targetNode: DynaTreeNode, mode: String): Boolean = js.native
  def reload(force: Boolean): Unit = js.native
  def reloadChildren(): Unit = js.native
  def reloadChildren(callback: js.Function2[/* node */ this.type, /* isOk */ Boolean, _]): Unit = js.native
  def remove(): Unit = js.native
  def removeChildren(): Unit = js.native
  def render(useEffects: Boolean, includeInvisible: Boolean): Unit = js.native
  def resetLazy(): Unit = js.native
  def scheduleAction(mode: String, ms: Double): Unit = js.native
  def select(flag: Boolean): Unit = js.native
  def setLazyNodeStatus(status: Double): Unit = js.native
  def setTitle(title: String): Unit = js.native
  def sortChildren(): Unit = js.native
  def sortChildren(cmp: js.Function2[/* a */ this.type, /* b */ this.type, Double]): Unit = js.native
  def sortChildren(cmp: js.Function2[/* a */ this.type, /* b */ this.type, Double], deep: Boolean): Unit = js.native
  def toDict(recursive: Boolean): js.Any = js.native
  def toDict(recursive: Boolean, callback: js.Function1[/* node */ js.Any, _]): js.Any = js.native
  def toggleExpand(): Unit = js.native
  def toggleSelect(): Unit = js.native
  def visit(fn: js.Function1[/* node */ this.type, Boolean], includeSelf: Boolean): Unit = js.native
  def visitParents(fn: js.Function1[/* node */ this.type, Boolean], includeSelf: Boolean): Unit = js.native
}

