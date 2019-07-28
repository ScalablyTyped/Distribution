package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import typings.handsontable.handsontableMod.underscoreHandsontableNs.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProvider extends js.Object {
  var changes: js.Object
  var hot: Core
  var t: RecordTranslator
  def clearChanges(): Unit
  def collectChanges(row: Double, column: Double, value: js.Any): Unit
  def destroy(): Unit
  def getDataAtCell(row: Double, column: Double): js.Any
  def getDataByRange(row1: Double, column1: Double, row2: Double, column2: Double): js.Array[_]
  def getRawDataAtCell(row: Double, column: Double): js.Any
  def getRawDataByRange(row1: Double, column1: Double, row2: Double, column2: Double): js.Array[_]
  def getSourceDataAtCell(row: Double, column: Double): js.Any
  def getSourceDataByRange(row1: Double, column1: Double, row2: Double, column2: Double): js.Array[_]
  def isInDataRange(row: Double, column: Double): Boolean
  def updateSourceData(row: Double, column: Double, value: js.Any): Unit
}

object DataProvider {
  @scala.inline
  def apply(
    changes: js.Object,
    clearChanges: () => Unit,
    collectChanges: (Double, Double, js.Any) => Unit,
    destroy: () => Unit,
    getDataAtCell: (Double, Double) => js.Any,
    getDataByRange: (Double, Double, Double, Double) => js.Array[_],
    getRawDataAtCell: (Double, Double) => js.Any,
    getRawDataByRange: (Double, Double, Double, Double) => js.Array[_],
    getSourceDataAtCell: (Double, Double) => js.Any,
    getSourceDataByRange: (Double, Double, Double, Double) => js.Array[_],
    hot: Core,
    isInDataRange: (Double, Double) => Boolean,
    t: RecordTranslator,
    updateSourceData: (Double, Double, js.Any) => Unit
  ): DataProvider = {
    val __obj = js.Dynamic.literal(changes = changes, clearChanges = js.Any.fromFunction0(clearChanges), collectChanges = js.Any.fromFunction3(collectChanges), destroy = js.Any.fromFunction0(destroy), getDataAtCell = js.Any.fromFunction2(getDataAtCell), getDataByRange = js.Any.fromFunction4(getDataByRange), getRawDataAtCell = js.Any.fromFunction2(getRawDataAtCell), getRawDataByRange = js.Any.fromFunction4(getRawDataByRange), getSourceDataAtCell = js.Any.fromFunction2(getSourceDataAtCell), getSourceDataByRange = js.Any.fromFunction4(getSourceDataByRange), hot = hot, isInDataRange = js.Any.fromFunction2(isInDataRange), t = t, updateSourceData = js.Any.fromFunction3(updateSourceData))
  
    __obj.asInstanceOf[DataProvider]
  }
}

