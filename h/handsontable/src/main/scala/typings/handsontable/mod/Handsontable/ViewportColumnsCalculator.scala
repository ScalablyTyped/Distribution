package typings.handsontable.mod.Handsontable

import typings.handsontable.handsontableStrings.all
import typings.handsontable.handsontableStrings.last
import typings.handsontable.handsontableStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportColumnsCalculator extends js.Object {
  var count: Double = js.native
  var endColumn: Double | Null = js.native
  var endRow: js.UndefOr[Double] = js.native
  var needVerifyLastColumnWidth: Boolean = js.native
  var startColumn: Double | Null = js.native
  var startPosition: Double = js.native
  var startRow: js.UndefOr[Double] = js.native
  var stretch: none | all | last = js.native
  var stretchAllColumnsWidth: js.Array[Double] = js.native
  var stretchAllRatio: Double = js.native
  var stretchLastWidth: Double = js.native
  var totalTargetWidth: Double = js.native
  def calculate(): Unit = js.native
  def getStretchedColumnWidth(column: Double, baseWidth: Double): Double | Null = js.native
  def refreshStretching(totalWidth: Double): Unit = js.native
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
    totalTargetWidth: Double
  ): ViewportColumnsCalculator = {
    val __obj = js.Dynamic.literal(calculate = js.Any.fromFunction0(calculate), count = count.asInstanceOf[js.Any], getStretchedColumnWidth = js.Any.fromFunction2(getStretchedColumnWidth), needVerifyLastColumnWidth = needVerifyLastColumnWidth.asInstanceOf[js.Any], refreshStretching = js.Any.fromFunction1(refreshStretching), startPosition = startPosition.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], stretchAllColumnsWidth = stretchAllColumnsWidth.asInstanceOf[js.Any], stretchAllRatio = stretchAllRatio.asInstanceOf[js.Any], stretchLastWidth = stretchLastWidth.asInstanceOf[js.Any], totalTargetWidth = totalTargetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportColumnsCalculator]
  }
  @scala.inline
  implicit class ViewportColumnsCalculatorOps[Self <: ViewportColumnsCalculator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCalculate(value: () => Unit): Self = this.set("calculate", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetStretchedColumnWidth(value: (Double, Double) => Double | Null): Self = this.set("getStretchedColumnWidth", js.Any.fromFunction2(value))
    @scala.inline
    def setNeedVerifyLastColumnWidth(value: Boolean): Self = this.set("needVerifyLastColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshStretching(value: Double => Unit): Self = this.set("refreshStretching", js.Any.fromFunction1(value))
    @scala.inline
    def setStartPosition(value: Double): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setStretch(value: none | all | last): Self = this.set("stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def setStretchAllColumnsWidthVarargs(value: Double*): Self = this.set("stretchAllColumnsWidth", js.Array(value :_*))
    @scala.inline
    def setStretchAllColumnsWidth(value: js.Array[Double]): Self = this.set("stretchAllColumnsWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setStretchAllRatio(value: Double): Self = this.set("stretchAllRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setStretchLastWidth(value: Double): Self = this.set("stretchLastWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalTargetWidth(value: Double): Self = this.set("totalTargetWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndColumnNull: Self = this.set("endColumn", null)
    @scala.inline
    def setEndRow(value: Double): Self = this.set("endRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndRow: Self = this.set("endRow", js.undefined)
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartColumnNull: Self = this.set("startColumn", null)
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartRow: Self = this.set("startRow", js.undefined)
  }
  
}

