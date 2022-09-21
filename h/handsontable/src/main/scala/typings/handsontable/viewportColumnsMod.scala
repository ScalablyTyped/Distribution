package typings.handsontable

import typings.handsontable.handsontableStrings.all
import typings.handsontable.handsontableStrings.last
import typings.handsontable.handsontableStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewportColumnsMod {
  
  @JSImport("handsontable/3rdparty/walkontable/src/calculator/viewportColumns", "ViewportColumnsCalculator")
  @js.native
  open class ViewportColumnsCalculator () extends StObject {
    
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
}
