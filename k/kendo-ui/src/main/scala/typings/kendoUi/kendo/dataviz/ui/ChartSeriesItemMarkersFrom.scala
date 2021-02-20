package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesItemMarkersFrom extends StObject {
  
  var background: js.UndefOr[String | js.Function] = js.native
  
  var border: js.UndefOr[js.Function | ChartSeriesItemMarkersFromBorder] = js.native
  
  var rotation: js.UndefOr[Double | js.Function] = js.native
  
  var size: js.UndefOr[Double | js.Function] = js.native
  
  var `type`: js.UndefOr[String | js.Function] = js.native
  
  var visible: js.UndefOr[Boolean | js.Function] = js.native
  
  var visual: js.UndefOr[js.Function] = js.native
}
object ChartSeriesItemMarkersFrom {
  
  @scala.inline
  def apply(): ChartSeriesItemMarkersFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemMarkersFrom]
  }
  
  @scala.inline
  implicit class ChartSeriesItemMarkersFromMutableBuilder[Self <: ChartSeriesItemMarkersFrom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String | js.Function): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: js.Function | ChartSeriesItemMarkersFromBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setRotation(value: Double | js.Function): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSize(value: Double | js.Function): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: String | js.Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean | js.Function): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
