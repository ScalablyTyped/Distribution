package typings.handsontable.handsontableMod.HandsontableNs

import typings.handsontable.handsontableStrings.all
import typings.handsontable.handsontableStrings.last
import typings.handsontable.handsontableStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportColumnsCalculator extends js.Object {
  var count: Double
  var endColumn: Double | Null
  var endRow: js.UndefOr[Double] = js.undefined
  var needVerifyLastColumnWidth: Boolean
  var startColumn: Double | Null
  var startPosition: Double
  var startRow: js.UndefOr[Double] = js.undefined
  var stretch: none | all | last
  var stretchAllColumnsWidth: js.Array[Double]
  var stretchAllRatio: Double
  var stretchLastWidth: Double
  var totalTargetWidth: Double
  def calculate(): Unit
  def getStretchedColumnWidth(column: Double, baseWidth: Double): Double | Null
  def refreshStretching(totalWidth: Double): Unit
}

object ViewportColumnsCalculator {
  @scala.inline
  def apply(
    calculate: () => Unit,
    count: Double,
    getStretchedColumnWidth: (Double, Double) => Double | Null,
    needVerifyLastColumnWidth: Boolean,
    refreshStretching: Double => Unit,
    startPosition: Double,
    stretch: none | all | last,
    stretchAllColumnsWidth: js.Array[Double],
    stretchAllRatio: Double,
    stretchLastWidth: Double,
    totalTargetWidth: Double,
    endColumn: Int | Double = null,
    endRow: Int | Double = null,
    startColumn: Int | Double = null,
    startRow: Int | Double = null
  ): ViewportColumnsCalculator = {
    val __obj = js.Dynamic.literal(calculate = js.Any.fromFunction0(calculate), count = count, getStretchedColumnWidth = js.Any.fromFunction2(getStretchedColumnWidth), needVerifyLastColumnWidth = needVerifyLastColumnWidth, refreshStretching = js.Any.fromFunction1(refreshStretching), startPosition = startPosition, stretch = stretch.asInstanceOf[js.Any], stretchAllColumnsWidth = stretchAllColumnsWidth, stretchAllRatio = stretchAllRatio, stretchLastWidth = stretchLastWidth, totalTargetWidth = totalTargetWidth)
    if (endColumn != null) __obj.updateDynamic("endColumn")(endColumn.asInstanceOf[js.Any])
    if (endRow != null) __obj.updateDynamic("endRow")(endRow.asInstanceOf[js.Any])
    if (startColumn != null) __obj.updateDynamic("startColumn")(startColumn.asInstanceOf[js.Any])
    if (startRow != null) __obj.updateDynamic("startRow")(startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportColumnsCalculator]
  }
}

