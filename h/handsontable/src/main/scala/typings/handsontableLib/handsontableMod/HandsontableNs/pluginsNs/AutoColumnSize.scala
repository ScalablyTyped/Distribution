package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoColumnSize extends Base {
  var firstCalculation: scala.Boolean = js.native
  var ghostTable: GhostTable = js.native
  var inProgress: scala.Boolean = js.native
  var samplesGenerator: SamplesGenerator = js.native
  var widths: js.Array[_] = js.native
  def calculateAllColumnsWidth(): scala.Unit = js.native
  def calculateAllColumnsWidth(rowRange: js.Object): scala.Unit = js.native
  def calculateAllColumnsWidth(rowRange: scala.Double): scala.Unit = js.native
  def calculateColumnsWidth(): scala.Unit = js.native
  def calculateColumnsWidth(colRange: js.Object): scala.Unit = js.native
  def calculateColumnsWidth(colRange: js.Object, rowRange: js.Object): scala.Unit = js.native
  def calculateColumnsWidth(colRange: js.Object, rowRange: js.Object, force: scala.Boolean): scala.Unit = js.native
  def calculateColumnsWidth(colRange: js.Object, rowRange: scala.Double): scala.Unit = js.native
  def calculateColumnsWidth(colRange: js.Object, rowRange: scala.Double, force: scala.Boolean): scala.Unit = js.native
  def calculateColumnsWidth(colRange: scala.Double): scala.Unit = js.native
  def calculateColumnsWidth(colRange: scala.Double, rowRange: js.Object): scala.Unit = js.native
  def calculateColumnsWidth(colRange: scala.Double, rowRange: js.Object, force: scala.Boolean): scala.Unit = js.native
  def calculateColumnsWidth(colRange: scala.Double, rowRange: scala.Double): scala.Unit = js.native
  def calculateColumnsWidth(colRange: scala.Double, rowRange: scala.Double, force: scala.Boolean): scala.Unit = js.native
  def clearCache(): scala.Unit = js.native
  def clearCache(columns: js.Array[_]): scala.Unit = js.native
  def findColumnsWhereHeaderWasChanged(): js.Array[_] = js.native
  def getColumnWidth(col: scala.Double): scala.Double = js.native
  def getColumnWidth(col: scala.Double, defaultWidth: scala.Double): scala.Double = js.native
  def getColumnWidth(col: scala.Double, defaultWidth: scala.Double, keepMinimum: scala.Boolean): scala.Double = js.native
  def getFirstVisibleColumn(): scala.Double = js.native
  def getLastVisibleColumn(): scala.Double = js.native
  def getSyncCalculationLimit(): scala.Double = js.native
  def isNeedRecalculate(): scala.Boolean = js.native
  def recalculateAllColumnsWidth(): scala.Unit = js.native
}

