package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesItemMarkersBorder extends StObject {
  
  var color: js.UndefOr[String | js.Function] = js.undefined
  
  var width: js.UndefOr[Double | js.Function] = js.undefined
}
object SparklineSeriesItemMarkersBorder {
  
  @scala.inline
  def apply(): SparklineSeriesItemMarkersBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemMarkersBorder]
  }
  
  @scala.inline
  implicit class SparklineSeriesItemMarkersBorderMutableBuilder[Self <: SparklineSeriesItemMarkersBorder] (val x: Self) extends AnyVal {
    
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
