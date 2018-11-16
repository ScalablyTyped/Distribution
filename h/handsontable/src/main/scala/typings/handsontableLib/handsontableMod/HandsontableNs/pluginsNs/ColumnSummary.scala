package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ColumnSummary extends Base {
  var endpoints: Endpoints | scala.Unit
  def calculate(endpoint: Endpoints): scala.Unit
  def calculateAverage(endpoint: Endpoints): scala.Double
  def calculateMinMax(endpoint: Endpoints, `type`: java.lang.String): scala.Double
  def calculateSum(endpoint: Endpoints): scala.Unit
  def countEmpty(rowRange: js.Array[_], col: scala.Double): scala.Double
  def countEntries(endpoint: Endpoints): scala.Double
  def getCellValue(row: scala.Double, col: scala.Double): java.lang.String
  def getPartialMinMax(rowRange: js.Array[_], col: scala.Double, `type`: java.lang.String): scala.Double
  def getPartialSum(rowRange: js.Array[_], col: scala.Double): scala.Double
}

