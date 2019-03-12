package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportColumnsCalculator extends js.Object {
  var count: scala.Double
  var endColumn: scala.Double | scala.Null
  var endRow: js.UndefOr[scala.Double] = js.undefined
  var needVerifyLastColumnWidth: scala.Boolean
  var startColumn: scala.Double | scala.Null
  var startPosition: scala.Double
  var startRow: js.UndefOr[scala.Double] = js.undefined
  var stretch: handsontableLib.handsontableLibStrings.none | handsontableLib.handsontableLibStrings.all | handsontableLib.handsontableLibStrings.last
  var stretchAllColumnsWidth: js.Array[scala.Double]
  var stretchAllRatio: scala.Double
  var stretchLastWidth: scala.Double
  var totalTargetWidth: scala.Double
  def calculate(): scala.Unit
  def getStretchedColumnWidth(column: scala.Double, baseWidth: scala.Double): scala.Double | scala.Null
  def refreshStretching(totalWidth: scala.Double): scala.Unit
}

object ViewportColumnsCalculator {
  @scala.inline
  def apply(
    calculate: () => scala.Unit,
    count: scala.Double,
    getStretchedColumnWidth: (scala.Double, scala.Double) => scala.Double | scala.Null,
    needVerifyLastColumnWidth: scala.Boolean,
    refreshStretching: scala.Double => scala.Unit,
    startPosition: scala.Double,
    stretch: handsontableLib.handsontableLibStrings.none | handsontableLib.handsontableLibStrings.all | handsontableLib.handsontableLibStrings.last,
    stretchAllColumnsWidth: js.Array[scala.Double],
    stretchAllRatio: scala.Double,
    stretchLastWidth: scala.Double,
    totalTargetWidth: scala.Double,
    endColumn: scala.Int | scala.Double = null,
    endRow: scala.Int | scala.Double = null,
    startColumn: scala.Int | scala.Double = null,
    startRow: scala.Int | scala.Double = null
  ): ViewportColumnsCalculator = {
    val __obj = js.Dynamic.literal(calculate = js.Any.fromFunction0(calculate), count = count, getStretchedColumnWidth = js.Any.fromFunction2(getStretchedColumnWidth), needVerifyLastColumnWidth = needVerifyLastColumnWidth, refreshStretching = js.Any.fromFunction1(refreshStretching), startPosition = startPosition, stretch = stretch.asInstanceOf[js.Any], stretchAllColumnsWidth = stretchAllColumnsWidth, stretchAllRatio = stretchAllRatio, stretchLastWidth = stretchLastWidth, totalTargetWidth = totalTargetWidth)
    if (endColumn != null) __obj.updateDynamic("endColumn")(endColumn.asInstanceOf[js.Any])
    if (endRow != null) __obj.updateDynamic("endRow")(endRow.asInstanceOf[js.Any])
    if (startColumn != null) __obj.updateDynamic("startColumn")(startColumn.asInstanceOf[js.Any])
    if (startRow != null) __obj.updateDynamic("startRow")(startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportColumnsCalculator]
  }
}

