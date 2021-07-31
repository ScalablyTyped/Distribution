package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesItemTargetLine extends StObject {
  
  var width: js.UndefOr[Double | js.Function] = js.undefined
}
object ChartSeriesItemTargetLine {
  
  @scala.inline
  def apply(): ChartSeriesItemTargetLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemTargetLine]
  }
  
  @scala.inline
  implicit class ChartSeriesItemTargetLineMutableBuilder[Self <: ChartSeriesItemTargetLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWidth(value: Double | js.Function): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
