package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapPaint extends AnyPaint {
  
  var `heatmap-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `heatmap-intensity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `heatmap-intensity-transition`: js.UndefOr[Transition] = js.native
  
  var `heatmap-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `heatmap-opacity-transition`: js.UndefOr[Transition] = js.native
  
  var `heatmap-radius`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `heatmap-radius-transition`: js.UndefOr[Transition] = js.native
  
  var `heatmap-weight`: js.UndefOr[Double | StyleFunction | Expression] = js.native
}
object HeatmapPaint {
  
  @scala.inline
  def apply(): HeatmapPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapPaint]
  }
  
  @scala.inline
  implicit class HeatmapPaintMutableBuilder[Self <: HeatmapPaint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setHeatmap-color`(value: String | StyleFunction | Expression): Self = StObject.set(x, "heatmap-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHeatmap-colorUndefined`: Self = StObject.set(x, "heatmap-color", js.undefined)
    
    @scala.inline
    def `setHeatmap-intensity`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "heatmap-intensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHeatmap-intensity-transition`(value: Transition): Self = StObject.set(x, "heatmap-intensity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHeatmap-intensity-transitionUndefined`: Self = StObject.set(x, "heatmap-intensity-transition", js.undefined)
    
    @scala.inline
    def `setHeatmap-intensityUndefined`: Self = StObject.set(x, "heatmap-intensity", js.undefined)
    
    @scala.inline
    def `setHeatmap-opacity`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "heatmap-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHeatmap-opacity-transition`(value: Transition): Self = StObject.set(x, "heatmap-opacity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHeatmap-opacity-transitionUndefined`: Self = StObject.set(x, "heatmap-opacity-transition", js.undefined)
    
    @scala.inline
    def `setHeatmap-opacityUndefined`: Self = StObject.set(x, "heatmap-opacity", js.undefined)
    
    @scala.inline
    def `setHeatmap-radius`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "heatmap-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHeatmap-radius-transition`(value: Transition): Self = StObject.set(x, "heatmap-radius-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHeatmap-radius-transitionUndefined`: Self = StObject.set(x, "heatmap-radius-transition", js.undefined)
    
    @scala.inline
    def `setHeatmap-radiusUndefined`: Self = StObject.set(x, "heatmap-radius", js.undefined)
    
    @scala.inline
    def `setHeatmap-weight`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "heatmap-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHeatmap-weightUndefined`: Self = StObject.set(x, "heatmap-weight", js.undefined)
  }
}
