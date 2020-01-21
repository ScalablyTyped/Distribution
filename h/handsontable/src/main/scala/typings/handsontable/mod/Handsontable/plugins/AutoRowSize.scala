package typings.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoRowSize extends Base {
  var firstCalculation: Boolean = js.native
  var ghostTable: GhostTable = js.native
  var heights: js.Array[_] = js.native
  var inProgress: Boolean = js.native
  var sampleGenerator: SamplesGenerator = js.native
  def calculateAllRowsHeight(): Unit = js.native
  def calculateAllRowsHeight(colRange: js.Object): Unit = js.native
  def calculateAllRowsHeight(colRange: Double): Unit = js.native
  def calculateRowsHeight(): Unit = js.native
  def calculateRowsHeight(rowRange: js.Object): Unit = js.native
  def calculateRowsHeight(rowRange: js.Object, colRange: js.Object): Unit = js.native
  def calculateRowsHeight(rowRange: js.Object, colRange: js.Object, force: Boolean): Unit = js.native
  def calculateRowsHeight(rowRange: js.Object, colRange: Double): Unit = js.native
  def calculateRowsHeight(rowRange: js.Object, colRange: Double, force: Boolean): Unit = js.native
  def calculateRowsHeight(rowRange: Double): Unit = js.native
  def calculateRowsHeight(rowRange: Double, colRange: js.Object): Unit = js.native
  def calculateRowsHeight(rowRange: Double, colRange: js.Object, force: Boolean): Unit = js.native
  def calculateRowsHeight(rowRange: Double, colRange: Double): Unit = js.native
  def calculateRowsHeight(rowRange: Double, colRange: Double, force: Boolean): Unit = js.native
  def clearCache(): Unit = js.native
  def clearCacheByRange(range: js.Object): Unit = js.native
  def clearCacheByRange(range: Double): Unit = js.native
  def findColumnsWhereHeaderWasChanged(): js.Array[_] = js.native
  def getColumnHeaderHeight(): Double | Unit = js.native
  def getFirstVisibleRow(): Double = js.native
  def getLastVisibleRow(): Double = js.native
  def getRowHeight(col: Double): Double = js.native
  def getRowHeight(col: Double, defaultHeight: Double): Double = js.native
  def getSyncCalculationLimit(): Double = js.native
  def isNeedRecalculate(): Boolean = js.native
  def recalculateAllRowsHeight(): Unit = js.native
}

