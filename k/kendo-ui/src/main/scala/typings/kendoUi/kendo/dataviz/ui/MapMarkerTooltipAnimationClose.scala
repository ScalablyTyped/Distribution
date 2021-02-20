package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapMarkerTooltipAnimationClose extends StObject {
  
  var duration: js.UndefOr[Double] = js.native
  
  var effects: js.UndefOr[String] = js.native
}
object MapMarkerTooltipAnimationClose {
  
  @scala.inline
  def apply(): MapMarkerTooltipAnimationClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarkerTooltipAnimationClose]
  }
  
  @scala.inline
  implicit class MapMarkerTooltipAnimationCloseMutableBuilder[Self <: MapMarkerTooltipAnimationClose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEffects(value: String): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
  }
}
