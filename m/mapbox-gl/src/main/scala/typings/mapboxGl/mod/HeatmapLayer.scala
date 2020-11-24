package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.heatmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapLayer
  extends LayerBase
     with Layer {
  
  var layout: js.UndefOr[HeatmapLayout] = js.native
  
  var paint: js.UndefOr[HeatmapPaint] = js.native
  
  var `type`: heatmap = js.native
}
object HeatmapLayer {
  
  @scala.inline
  def apply(id: String, `type`: heatmap): HeatmapLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapLayer]
  }
  
  @scala.inline
  implicit class HeatmapLayerOps[Self <: HeatmapLayer] (val x: Self) extends AnyVal {
    
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
    def setType(value: heatmap): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: HeatmapLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setPaint(value: HeatmapPaint): Self = this.set("paint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaint: Self = this.set("paint", js.undefined)
  }
}
