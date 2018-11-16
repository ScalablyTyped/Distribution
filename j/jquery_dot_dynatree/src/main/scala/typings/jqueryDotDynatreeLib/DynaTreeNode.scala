package typings
package jqueryDotDynatreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynaTreeNode extends js.Object {
  var data: DynaTreeDataModel = js.native
  def activate(): scala.Unit = js.native
  def activateSilently(): scala.Unit = js.native
  def addChild(nodeData: DynaTreeDataModel): scala.Unit = js.native
  def addChild(nodeData: DynaTreeDataModel, beforeNode: DynaTreeNode): scala.Unit = js.native
  def addChild(nodeData: js.Array[DynaTreeDataModel]): scala.Unit = js.native
  def addChild(nodeData: js.Array[DynaTreeDataModel], beforeNode: DynaTreeNode): scala.Unit = js.native
  def appendAjax(ajaxOptions: jqueryLib.JQueryAjaxSettings): scala.Unit = js.native
  def countChildren(): scala.Double = js.native
  def deactivate(): scala.Unit = js.native
  def expand(flag: scala.Boolean): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getChildren(): js.Array[DynaTreeNode] = js.native
  def getEventTargetType(event: stdLib.Event): java.lang.String = js.native
  def getLevel(): scala.Double = js.native
  def getNextSibling(): DynaTreeNode = js.native
  def getParent(): DynaTreeNode = js.native
  def getPrevSibling(): DynaTreeNode = js.native
  def hasChildren(): scala.Boolean = js.native
  def isActive(): scala.Boolean = js.native
  def isChildOf(otherNode: DynaTreeNode): scala.Boolean = js.native
  def isDescendantOf(otherNode: DynaTreeNode): scala.Boolean = js.native
  def isExpanded(): scala.Boolean = js.native
  def isFirstSibling(): scala.Boolean = js.native
  def isFocused(): scala.Boolean = js.native
  def isLastSibling(): scala.Boolean = js.native
  def isLazy(): scala.Boolean = js.native
  def isLoading(): scala.Boolean = js.native
  def isSelected(): scala.Boolean = js.native
  def isStatusNode(): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def makeVisible(): scala.Boolean = js.native
  def move(targetNode: DynaTreeNode, mode: java.lang.String): scala.Boolean = js.native
  def reload(force: scala.Boolean): scala.Unit = js.native
  def reloadChildren(): scala.Unit = js.native
  def reloadChildren(callback: js.Function2[/* node */ this.type, /* isOk */ scala.Boolean, _]): scala.Unit = js.native
  def remove(): scala.Unit = js.native
  def removeChildren(): scala.Unit = js.native
  def render(useEffects: scala.Boolean, includeInvisible: scala.Boolean): scala.Unit = js.native
  def resetLazy(): scala.Unit = js.native
  def scheduleAction(mode: java.lang.String, ms: scala.Double): scala.Unit = js.native
  def select(flag: scala.Boolean): scala.Unit = js.native
  def setLazyNodeStatus(status: scala.Double): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  def sortChildren(): scala.Unit = js.native
  def sortChildren(cmp: js.Function2[/* a */ this.type, /* b */ this.type, scala.Double]): scala.Unit = js.native
  def sortChildren(cmp: js.Function2[/* a */ this.type, /* b */ this.type, scala.Double], deep: scala.Boolean): scala.Unit = js.native
  def toDict(recursive: scala.Boolean): js.Any = js.native
  def toDict(recursive: scala.Boolean, callback: js.Function1[/* node */ js.Any, _]): js.Any = js.native
  def toggleExpand(): scala.Unit = js.native
  def toggleSelect(): scala.Unit = js.native
  def visit(fn: js.Function1[/* node */ this.type, scala.Boolean], includeSelf: scala.Boolean): scala.Unit = js.native
  def visitParents(fn: js.Function1[/* node */ this.type, scala.Boolean], includeSelf: scala.Boolean): scala.Unit = js.native
}

