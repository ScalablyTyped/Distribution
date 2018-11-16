package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoRowSize extends Base {
  var firstCalculation: scala.Boolean = js.native
  var ghostTable: GhostTable = js.native
  var heights: js.Array[_] = js.native
  var inProgress: scala.Boolean = js.native
  var sampleGenerator: SamplesGenerator = js.native
  def calculateAllRowsHeight(): scala.Unit = js.native
  def calculateAllRowsHeight(colRange: js.Object): scala.Unit = js.native
  def calculateAllRowsHeight(colRange: scala.Double): scala.Unit = js.native
  def calculateRowsHeight(): scala.Unit = js.native
  def calculateRowsHeight(rowRange: js.Object): scala.Unit = js.native
  def calculateRowsHeight(rowRange: js.Object, colRange: js.Object): scala.Unit = js.native
  def calculateRowsHeight(rowRange: js.Object, colRange: js.Object, force: scala.Boolean): scala.Unit = js.native
  def calculateRowsHeight(rowRange: js.Object, colRange: scala.Double): scala.Unit = js.native
  def calculateRowsHeight(rowRange: js.Object, colRange: scala.Double, force: scala.Boolean): scala.Unit = js.native
  def calculateRowsHeight(rowRange: scala.Double): scala.Unit = js.native
  def calculateRowsHeight(rowRange: scala.Double, colRange: js.Object): scala.Unit = js.native
  def calculateRowsHeight(rowRange: scala.Double, colRange: js.Object, force: scala.Boolean): scala.Unit = js.native
  def calculateRowsHeight(rowRange: scala.Double, colRange: scala.Double): scala.Unit = js.native
  def calculateRowsHeight(rowRange: scala.Double, colRange: scala.Double, force: scala.Boolean): scala.Unit = js.native
  def clearCache(): scala.Unit = js.native
  def clearCacheByRange(range: js.Object): scala.Unit = js.native
  def clearCacheByRange(range: scala.Double): scala.Unit = js.native
  def findColumnsWhereHeaderWasChanged(): js.Array[_] = js.native
  def getColumnHeaderHeight(): scala.Double | scala.Unit = js.native
  def getFirstVisibleRow(): scala.Double = js.native
  def getLastVisibleRow(): scala.Double = js.native
  def getRowHeight(col: scala.Double): scala.Double = js.native
  def getRowHeight(col: scala.Double, defaultHeight: scala.Double): scala.Double = js.native
  def getSyncCalculationLimit(): scala.Double = js.native
  def isNeedRecalculate(): scala.Boolean = js.native
  def recalculateAllRowsHeight(): scala.Unit = js.native
}

