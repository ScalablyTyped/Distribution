package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerDefaultsMarkerTooltipAnimation extends StObject {
  
  var close: js.UndefOr[MapLayerDefaultsMarkerTooltipAnimationClose] = js.native
  
  var open: js.UndefOr[MapLayerDefaultsMarkerTooltipAnimationOpen] = js.native
}
object MapLayerDefaultsMarkerTooltipAnimation {
  
  @scala.inline
  def apply(): MapLayerDefaultsMarkerTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsMarkerTooltipAnimation]
  }
  
  @scala.inline
  implicit class MapLayerDefaultsMarkerTooltipAnimationMutableBuilder[Self <: MapLayerDefaultsMarkerTooltipAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: MapLayerDefaultsMarkerTooltipAnimationClose): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: MapLayerDefaultsMarkerTooltipAnimationOpen): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
