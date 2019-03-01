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
    clearChanges: js.Function0[scala.Unit],
    collectChanges: js.Function3[scala.Double, scala.Double, js.Any, scala.Unit],
    destroy: js.Function0[scala.Unit],
    getDataAtCell: js.Function2[scala.Double, scala.Double, js.Any],
    getDataByRange: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, js.Array[_]],
    getRawDataAtCell: js.Function2[scala.Double, scala.Double, js.Any],
    getRawDataByRange: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, js.Array[_]],
    getSourceDataAtCell: js.Function2[scala.Double, scala.Double, js.Any],
    getSourceDataByRange: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, js.Array[_]],
    hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    isInDataRange: js.Function2[scala.Double, scala.Double, scala.Boolean],
    t: RecordTranslator,
    updateSourceData: js.Function3[scala.Double, scala.Double, js.Any, scala.Unit]
  ): DataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changes")(changes)
    __obj.updateDynamic("clearChanges")(clearChanges)
    __obj.updateDynamic("collectChanges")(collectChanges)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("getDataAtCell")(getDataAtCell)
    __obj.updateDynamic("getDataByRange")(getDataByRange)
    __obj.updateDynamic("getRawDataAtCell")(getRawDataAtCell)
    __obj.updateDynamic("getRawDataByRange")(getRawDataByRange)
    __obj.updateDynamic("getSourceDataAtCell")(getSourceDataAtCell)
    __obj.updateDynamic("getSourceDataByRange")(getSourceDataByRange)
    __obj.updateDynamic("hot")(hot)
    __obj.updateDynamic("isInDataRange")(isInDataRange)
    __obj.updateDynamic("t")(t)
    __obj.updateDynamic("updateSourceData")(updateSourceData)
    __obj.asInstanceOf[DataProvider]
  }
}

