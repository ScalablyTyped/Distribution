package typings.handsontable.mod.Handsontable

import typings.handsontable.handsontableStrings.all
import typings.handsontable.handsontableStrings.last
import typings.handsontable.handsontableStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportColumnsCalculator extends StObject {
  
  def calculate(): Unit = js.native
  
  var count: Double = js.native
  
  var endColumn: Double | Null = js.native
  
  var endRow: js.UndefOr[Double] = js.native
  
  def getStretchedColumnWidth(column: Double, baseWidth: Double): Double | Null = js.native
  
  var needVerifyLastColumnWidth: Boolean = js.native
  
  def refreshStretching(totalWidth: Double): Unit = js.native
  
  var startColumn: Double | Null = js.native
  
  var startPosition: Double | Null = js.native
  
  var startRow: js.UndefOr[Double] = js.native
  
  var stretch: none | all | last = js.native
  
  var stretchAllColumnsWidth: js.Array[Double] = js.native
  
  var stretchAllRatio: Double = js.native
  
  var stretchLastWidth: Double = js.native
  
  var totalTargetWidth: Double = js.native
}
object ViewportColumnsCalculator {
  
  @scala.inline
  def apply(
    calculate: () => Unit,
    count: Double,
    getStretchedColumnWidth: (Double, Double) => Double | Null,
    needVerifyLastColumnWidth: Boolean,
    refreshStretching: Double => Unit,
    stretch: none | all | last,
    stretchAllColumnsWidth: js.Array[Double],
    stretchAllRatio: Double,
    stretchLastWidth: Double,
    totalTargetWidth: Double
  ): ViewportColumnsCalculator = {
    val __obj = js.Dynamic.literal(calculate = js.Any.fromFunction0(calculate), count = count.asInstanceOf[js.Any], getStretchedColumnWidth = js.Any.fromFunction2(getStretchedColumnWidth), needVerifyLastColumnWidth = needVerifyLastColumnWidth.asInstanceOf[js.Any], refreshStretching = js.Any.fromFunction1(refreshStretching), stretch = stretch.asInstanceOf[js.Any], stretchAllColumnsWidth = stretchAllColumnsWidth.asInstanceOf[js.Any], stretchAllRatio = stretchAllRatio.asInstanceOf[js.Any], stretchLastWidth = stretchLastWidth.asInstanceOf[js.Any], totalTargetWidth = totalTargetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportColumnsCalculator]
  }
  
  @scala.inline
  implicit class ViewportColumnsCalculatorMutableBuilder[Self <: ViewportColumnsCalculator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculate(value: () => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndColumnNull: Self = StObject.set(x, "endColumn", null)
    
    @scala.inline
    def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRowUndefined: Self = StObject.set(x, "endRow", js.undefined)
    
    @scala.inline
    def setGetStretchedColumnWidth(value: (Double, Double) => Double | Null): Self = StObject.set(x, "getStretchedColumnWidth", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNeedVerifyLastColumnWidth(value: Boolean): Self = StObject.set(x, "needVerifyLastColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshStretching(value: Double => Unit): Self = StObject.set(x, "refreshStretching", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumnNull: Self = StObject.set(x, "startColumn", null)
    
    @scala.inline
    def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPositionNull: Self = StObject.set(x, "startPosition", null)
    
    @scala.inline
    def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRowUndefined: Self = StObject.set(x, "startRow", js.undefined)
    
    @scala.inline
    def setStretch(value: none | all | last): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchAllColumnsWidth(value: js.Array[Double]): Self = StObject.set(x, "stretchAllColumnsWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchAllColumnsWidthVarargs(value: Double*): Self = StObject.set(x, "stretchAllColumnsWidth", js.Array(value :_*))
    
    @scala.inline
    def setStretchAllRatio(value: Double): Self = StObject.set(x, "stretchAllRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchLastWidth(value: Double): Self = StObject.set(x, "stretchLastWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTargetWidth(value: Double): Self = StObject.set(x, "totalTargetWidth", value.asInstanceOf[js.Any])
  }
}
