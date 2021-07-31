package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesItemBorder extends StObject {
  
  var color: js.UndefOr[String | js.Function] = js.undefined
  
  var dashType: js.UndefOr[String | js.Function] = js.undefined
  
  var opacity: js.UndefOr[Double | js.Function] = js.undefined
  
  var width: js.UndefOr[Double | js.Function] = js.undefined
}
object SparklineSeriesItemBorder {
  
  @scala.inline
  def apply(): SparklineSeriesItemBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemBorder]
  }
  
  @scala.inline
  implicit class SparklineSeriesItemBorderMutableBuilder[Self <: SparklineSeriesItemBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashType(value: String | js.Function): Self = StObject.set(x, "dashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashTypeUndefined: Self = StObject.set(x, "dashType", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double | js.Function): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | js.Function): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
