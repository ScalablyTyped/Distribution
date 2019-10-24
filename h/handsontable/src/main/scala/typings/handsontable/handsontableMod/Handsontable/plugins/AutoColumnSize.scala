package typings.handsontable.handsontableMod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoColumnSize extends Base {
  var firstCalculation: Boolean = js.native
  var ghostTable: GhostTable = js.native
  var inProgress: Boolean = js.native
  var samplesGenerator: SamplesGenerator = js.native
  var widths: js.Array[_] = js.native
  def calculateAllColumnsWidth(): Unit = js.native
  def calculateAllColumnsWidth(rowRange: js.Object): Unit = js.native
  def calculateAllColumnsWidth(rowRange: Double): Unit = js.native
  def calculateColumnsWidth(): Unit = js.native
  def calculateColumnsWidth(colRange: js.Object): Unit = js.native
  def calculateColumnsWidth(colRange: js.Object, rowRange: js.Object): Unit = js.native
  def calculateColumnsWidth(colRange: js.Object, rowRange: js.Object, force: Boolean): Unit = js.native
  def calculateColumnsWidth(colRange: js.Object, rowRange: Double): Unit = js.native
  def calculateColumnsWidth(colRange: js.Object, rowRange: Double, force: Boolean): Unit = js.native
  def calculateColumnsWidth(colRange: Double): Unit = js.native
  def calculateColumnsWidth(colRange: Double, rowRange: js.Object): Unit = js.native
  def calculateColumnsWidth(colRange: Double, rowRange: js.Object, force: Boolean): Unit = js.native
  def calculateColumnsWidth(colRange: Double, rowRange: Double): Unit = js.native
  def calculateColumnsWidth(colRange: Double, rowRange: Double, force: Boolean): Unit = js.native
  def clearCache(): Unit = js.native
  def clearCache(columns: js.Array[_]): Unit = js.native
  def findColumnsWhereHeaderWasChanged(): js.Array[_] = js.native
  def getColumnWidth(col: Double): Double = js.native
  def getColumnWidth(col: Double, defaultWidth: Double): Double = js.native
  def getColumnWidth(col: Double, defaultWidth: Double, keepMinimum: Boolean): Double = js.native
  def getFirstVisibleColumn(): Double = js.native
  def getLastVisibleColumn(): Double = js.native
  def getSyncCalculationLimit(): Double = js.native
  def isNeedRecalculate(): Boolean = js.native
  def recalculateAllColumnsWidth(): Unit = js.native
}

