package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerDefaultsMarker extends StObject {
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var shape: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[MapLayerDefaultsMarkerTooltip] = js.undefined
}
object MapLayerDefaultsMarker {
  
  @scala.inline
  def apply(): MapLayerDefaultsMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsMarker]
  }
  
  @scala.inline
  implicit class MapLayerDefaultsMarkerMutableBuilder[Self <: MapLayerDefaultsMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setTooltip(value: MapLayerDefaultsMarkerTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
