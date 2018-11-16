package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataManager extends js.Object {
  var cache: js.Object = js.native
  var data: js.Object = js.native
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core = js.native
  var parentReference: js.Any = js.native
   //WeakMap
  var plugin: NestedRows = js.native
  def addChild(parent: js.Object): scala.Unit = js.native
  def addChild(parent: js.Object, element: js.Object): scala.Unit = js.native
  def addChildAtIndex(parent: js.Object, index: scala.Double): scala.Unit = js.native
  def addChildAtIndex(parent: js.Object, index: scala.Double, element: js.Object): scala.Unit = js.native
  def addChildAtIndex(parent: js.Object, index: scala.Double, element: js.Object, globalIndex: scala.Double): scala.Unit = js.native
  def addSibling(index: scala.Double): scala.Unit = js.native
  def addSibling(index: scala.Double, where: java.lang.String): scala.Unit = js.native
  def countAllRows(): scala.Double = js.native
  def countChildren(parent: js.Object): scala.Double = js.native
  def countChildren(parent: scala.Double): scala.Double = js.native
  def detachFromParent(elements: js.Array[_]): scala.Unit = js.native
  def detachFromParent(elements: js.Array[_], forceRender: scala.Boolean): scala.Unit = js.native
  def detachFromParent(elements: js.Object): scala.Unit = js.native
  def detachFromParent(elements: js.Object, forceRender: scala.Boolean): scala.Unit = js.native
  def getDataObject(row: scala.Double): js.Any | scala.Unit = js.native
  def getRowIndex(rowObj: js.Object): scala.Double | scala.Unit = js.native
  def getRowIndexWithinParent(row: js.Object): scala.Double = js.native
  def getRowIndexWithinParent(row: scala.Double): scala.Double = js.native
  def getRowLevel(row: scala.Double): scala.Double | scala.Unit = js.native
  def getRowParent(row: js.Object): js.Object | scala.Unit = js.native
  def getRowParent(row: scala.Double): js.Object | scala.Unit = js.native
  def hasChildren(row: js.Object): scala.Boolean = js.native
  def hasChildren(row: scala.Double): scala.Boolean = js.native
  def isParent(row: js.Object): scala.Boolean = js.native
  def isParent(row: scala.Double): scala.Boolean = js.native
  def moveRow(fromIndex: scala.Double, toIndex: scala.Double): scala.Unit = js.native
  def rewriteCache(): scala.Unit = js.native
}

