package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProvider extends js.Object {
  var changes: js.Object
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core
  var t: RecordTranslator
  def clearChanges(): scala.Unit
  def collectChanges(row: scala.Double, column: scala.Double, value: js.Any): scala.Unit
  def destroy(): scala.Unit
  def getDataAtCell(row: scala.Double, column: scala.Double): js.Any
  def getDataByRange(row1: scala.Double, column1: scala.Double, row2: scala.Double, column2: scala.Double): js.Array[_]
  def getRawDataAtCell(row: scala.Double, column: scala.Double): js.Any
  def getRawDataByRange(row1: scala.Double, column1: scala.Double, row2: scala.Double, column2: scala.Double): js.Array[_]
  def getSourceDataAtCell(row: scala.Double, column: scala.Double): js.Any
  def getSourceDataByRange(row1: scala.Double, column1: scala.Double, row2: scala.Double, column2: scala.Double): js.Array[_]
  def isInDataRange(row: scala.Double, column: scala.Double): scala.Boolean
  def updateSourceData(row: scala.Double, column: scala.Double, value: js.Any): scala.Unit
}

