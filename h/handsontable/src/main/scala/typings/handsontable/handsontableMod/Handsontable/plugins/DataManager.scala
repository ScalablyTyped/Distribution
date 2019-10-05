package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataManager extends js.Object {
  var cache: js.Object = js.native
  var data: js.Object = js.native
  var hot: Core = js.native
  var parentReference: js.Any = js.native
   //WeakMap
  var plugin: NestedRows = js.native
  def addChild(parent: js.Object): Unit = js.native
  def addChild(parent: js.Object, element: js.Object): Unit = js.native
  def addChildAtIndex(parent: js.Object, index: Double): Unit = js.native
  def addChildAtIndex(parent: js.Object, index: Double, element: js.Object): Unit = js.native
  def addChildAtIndex(parent: js.Object, index: Double, element: js.Object, globalIndex: Double): Unit = js.native
  def addSibling(index: Double): Unit = js.native
  def addSibling(index: Double, where: String): Unit = js.native
  def countAllRows(): Double = js.native
  def countChildren(parent: js.Object): Double = js.native
  def countChildren(parent: Double): Double = js.native
  def detachFromParent(elements: js.Array[_]): Unit = js.native
  def detachFromParent(elements: js.Array[_], forceRender: Boolean): Unit = js.native
  def detachFromParent(elements: js.Object): Unit = js.native
  def detachFromParent(elements: js.Object, forceRender: Boolean): Unit = js.native
  def getDataObject(row: Double): js.Any | Unit = js.native
  def getRowIndex(rowObj: js.Object): Double | Unit = js.native
  def getRowIndexWithinParent(row: js.Object): Double = js.native
  def getRowIndexWithinParent(row: Double): Double = js.native
  def getRowLevel(row: Double): Double | Unit = js.native
  def getRowParent(row: js.Object): js.Object | Unit = js.native
  def getRowParent(row: Double): js.Object | Unit = js.native
  def hasChildren(row: js.Object): Boolean = js.native
  def hasChildren(row: Double): Boolean = js.native
  def isParent(row: js.Object): Boolean = js.native
  def isParent(row: Double): Boolean = js.native
  def moveRow(fromIndex: Double, toIndex: Double): Unit = js.native
  def rewriteCache(): Unit = js.native
}

