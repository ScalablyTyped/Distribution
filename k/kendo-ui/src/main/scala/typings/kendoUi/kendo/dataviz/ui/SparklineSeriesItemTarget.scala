package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklineSeriesItemTarget extends StObject {
  
  var border: js.UndefOr[js.Function | SparklineSeriesItemTargetBorder] = js.native
  
  var color: js.UndefOr[String | js.Function] = js.native
  
  var line: js.UndefOr[SparklineSeriesItemTargetLine] = js.native
}
object SparklineSeriesItemTarget {
  
  @scala.inline
  def apply(): SparklineSeriesItemTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemTarget]
  }
  
  @scala.inline
  implicit class SparklineSeriesItemTargetMutableBuilder[Self <: SparklineSeriesItemTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: js.Function | SparklineSeriesItemTargetBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLine(value: SparklineSeriesItemTargetLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
