package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesItemMarkersFromBorder extends StObject {
  
  var color: js.UndefOr[String | js.Function] = js.native
  
  var width: js.UndefOr[Double | js.Function] = js.native
}
object ChartSeriesItemMarkersFromBorder {
  
  @scala.inline
  def apply(): ChartSeriesItemMarkersFromBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemMarkersFromBorder]
  }
  
  @scala.inline
  implicit class ChartSeriesItemMarkersFromBorderMutableBuilder[Self <: ChartSeriesItemMarkersFromBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | js.Function): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
