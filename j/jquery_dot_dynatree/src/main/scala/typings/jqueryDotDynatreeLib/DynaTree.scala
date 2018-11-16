package typings
package jqueryDotDynatreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynaTree extends js.Object {
  def activateKey(key: java.lang.String): DynaTreeNode = js.native
  def count(): scala.Double = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def enableUpdate(enable: scala.Boolean): scala.Unit = js.native
  def getActiveNode(): DynaTreeNode = js.native
  def getNodeByKey(key: java.lang.String): DynaTreeNode = js.native
  def getPersistData(): js.Any = js.native
  def getRoot(): DynaTreeNode = js.native
  def getSelectedNodes(stopOnParents: scala.Boolean): js.Array[DynaTreeNode] = js.native
  def initialize(): scala.Unit = js.native
  def isInitializing(): scala.Boolean = js.native
  def isReloading(): scala.Boolean = js.native
  def isUserEvent(): scala.Boolean = js.native
  def loadKeyPath(
    keyPath: java.lang.String,
    callback: js.Function2[/* node */ DynaTreeNode, /* status */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def reactivate(setFocus: scala.Boolean): scala.Unit = js.native
  def redraw(): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def renderInvisibleNodes(): scala.Unit = js.native
  def selectKey(key: java.lang.String, flag: java.lang.String): DynaTreeNode = js.native
  def serializeArray(stopOnParents: scala.Boolean): js.Array[_] = js.native
  def toDict(): js.Any = js.native
  def toDict(includeRoot: scala.Boolean): js.Any = js.native
  def visit(fn: js.Function1[/* node */ DynaTreeNode, scala.Boolean]): scala.Unit = js.native
  def visit(fn: js.Function1[/* node */ DynaTreeNode, scala.Boolean], includeRoot: scala.Boolean): scala.Unit = js.native
}

