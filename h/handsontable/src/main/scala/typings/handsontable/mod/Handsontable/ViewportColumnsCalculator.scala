package typings.handsontable.mod.Handsontable

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
    endColumn: Double = null.asInstanceOf[Double],
    endRow: js.UndefOr[Double] = js.undefined,
    startColumn: Double = null.asInstanceOf[Double],
    startRow: js.UndefOr[Double] = js.undefined
  ): ViewportColumnsCalculator = {
    val __obj = js.Dynamic.literal(calculate = js.Any.fromFunction0(calculate), count = count.asInstanceOf[js.Any], getStretchedColumnWidth = js.Any.fromFunction2(getStretchedColumnWidth), needVerifyLastColumnWidth = needVerifyLastColumnWidth.asInstanceOf[js.Any], refreshStretching = js.Any.fromFunction1(refreshStretching), startPosition = startPosition.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], stretchAllColumnsWidth = stretchAllColumnsWidth.asInstanceOf[js.Any], stretchAllRatio = stretchAllRatio.asInstanceOf[js.Any], stretchLastWidth = stretchLastWidth.asInstanceOf[js.Any], totalTargetWidth = totalTargetWidth.asInstanceOf[js.Any], endColumn = endColumn.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(endRow)) __obj.updateDynamic("endRow")(endRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startRow)) __obj.updateDynamic("startRow")(startRow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportColumnsCalculator]
  }
}

