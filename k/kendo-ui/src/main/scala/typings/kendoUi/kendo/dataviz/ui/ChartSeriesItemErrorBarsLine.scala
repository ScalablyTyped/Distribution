package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesItemErrorBarsLine extends StObject {
  
  var dashType: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ChartSeriesItemErrorBarsLine {
  
  @scala.inline
  def apply(): ChartSeriesItemErrorBarsLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemErrorBarsLine]
  }
  
  @scala.inline
  implicit class ChartSeriesItemErrorBarsLineMutableBuilder[Self <: ChartSeriesItemErrorBarsLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashType(value: String): Self = StObject.set(x, "dashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashTypeUndefined: Self = StObject.set(x, "dashType", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
