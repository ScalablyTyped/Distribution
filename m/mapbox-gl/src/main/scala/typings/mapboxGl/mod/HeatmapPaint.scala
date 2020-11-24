package typings.mapboxGl.mod

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
  implicit class HeatmapPaintOps[Self <: HeatmapPaint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setHeatmap-color`(value: String | StyleFunction | Expression): Self = this.set("heatmap-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHeatmap-color`: Self = this.set("heatmap-color", js.undefined)
    
    @scala.inline
    def `setHeatmap-intensity`(value: Double | StyleFunction | Expression): Self = this.set("heatmap-intensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHeatmap-intensity`: Self = this.set("heatmap-intensity", js.undefined)
    
    @scala.inline
    def `setHeatmap-intensity-transition`(value: Transition): Self = this.set("heatmap-intensity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHeatmap-intensity-transition`: Self = this.set("heatmap-intensity-transition", js.undefined)
    
    @scala.inline
    def `setHeatmap-opacity`(value: Double | StyleFunction | Expression): Self = this.set("heatmap-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHeatmap-opacity`: Self = this.set("heatmap-opacity", js.undefined)
    
    @scala.inline
    def `setHeatmap-opacity-transition`(value: Transition): Self = this.set("heatmap-opacity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHeatmap-opacity-transition`: Self = this.set("heatmap-opacity-transition", js.undefined)
    
    @scala.inline
    def `setHeatmap-radius`(value: Double | StyleFunction | Expression): Self = this.set("heatmap-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHeatmap-radius`: Self = this.set("heatmap-radius", js.undefined)
    
    @scala.inline
    def `setHeatmap-radius-transition`(value: Transition): Self = this.set("heatmap-radius-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHeatmap-radius-transition`: Self = this.set("heatmap-radius-transition", js.undefined)
    
    @scala.inline
    def `setHeatmap-weight`(value: Double | StyleFunction | Expression): Self = this.set("heatmap-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHeatmap-weight`: Self = this.set("heatmap-weight", js.undefined)
  }
}
