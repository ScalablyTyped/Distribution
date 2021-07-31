package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesItemHighlight extends StObject {
  
  var border: js.UndefOr[SparklineSeriesItemHighlightBorder] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object SparklineSeriesItemHighlight {
  
  @scala.inline
  def apply(): SparklineSeriesItemHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemHighlight]
  }
  
  @scala.inline
  implicit class SparklineSeriesItemHighlightMutableBuilder[Self <: SparklineSeriesItemHighlight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: SparklineSeriesItemHighlightBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
