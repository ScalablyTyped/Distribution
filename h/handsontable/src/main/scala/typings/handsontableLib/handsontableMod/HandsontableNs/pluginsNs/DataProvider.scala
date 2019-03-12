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

object DataProvider {
  @scala.inline
  def apply(
    changes: js.Object,
    clearChanges: () => scala.Unit,
    collectChanges: (scala.Double, scala.Double, js.Any) => scala.Unit,
    destroy: () => scala.Unit,
    getDataAtCell: (scala.Double, scala.Double) => js.Any,
    getDataByRange: (scala.Double, scala.Double, scala.Double, scala.Double) => js.Array[_],
    getRawDataAtCell: (scala.Double, scala.Double) => js.Any,
    getRawDataByRange: (scala.Double, scala.Double, scala.Double, scala.Double) => js.Array[_],
    getSourceDataAtCell: (scala.Double, scala.Double) => js.Any,
    getSourceDataByRange: (scala.Double, scala.Double, scala.Double, scala.Double) => js.Array[_],
    hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    isInDataRange: (scala.Double, scala.Double) => scala.Boolean,
    t: RecordTranslator,
    updateSourceData: (scala.Double, scala.Double, js.Any) => scala.Unit
  ): DataProvider = {
    val __obj = js.Dynamic.literal(changes = changes, clearChanges = js.Any.fromFunction0(clearChanges), collectChanges = js.Any.fromFunction3(collectChanges), destroy = js.Any.fromFunction0(destroy), getDataAtCell = js.Any.fromFunction2(getDataAtCell), getDataByRange = js.Any.fromFunction4(getDataByRange), getRawDataAtCell = js.Any.fromFunction2(getRawDataAtCell), getRawDataByRange = js.Any.fromFunction4(getRawDataByRange), getSourceDataAtCell = js.Any.fromFunction2(getSourceDataAtCell), getSourceDataByRange = js.Any.fromFunction4(getSourceDataByRange), hot = hot, isInDataRange = js.Any.fromFunction2(isInDataRange), t = t, updateSourceData = js.Any.fromFunction3(updateSourceData))
  
    __obj.asInstanceOf[DataProvider]
  }
}

