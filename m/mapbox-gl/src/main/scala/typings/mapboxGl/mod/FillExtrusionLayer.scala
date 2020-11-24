package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.`fill-extrusion`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillExtrusionLayer
  extends LayerBase
     with Layer {
  
  var layout: js.UndefOr[FillExtrusionLayout] = js.native
  
  var paint: js.UndefOr[FillExtrusionPaint] = js.native
  
  var `type`: `fill-extrusion` = js.native
}
object FillExtrusionLayer {
  
  @scala.inline
  def apply(id: String, `type`: `fill-extrusion`): FillExtrusionLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillExtrusionLayer]
  }
  
  @scala.inline
  implicit class FillExtrusionLayerOps[Self <: FillExtrusionLayer] (val x: Self) extends AnyVal {
    
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
    def setType(value: `fill-extrusion`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: FillExtrusionLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setPaint(value: FillExtrusionPaint): Self = this.set("paint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaint: Self = this.set("paint", js.undefined)
  }
}
