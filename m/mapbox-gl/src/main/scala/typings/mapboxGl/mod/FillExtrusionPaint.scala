package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillExtrusionPaint extends AnyPaint {
  
  var `fill-extrusion-base`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `fill-extrusion-base-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-extrusion-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `fill-extrusion-color-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-extrusion-height`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `fill-extrusion-height-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-extrusion-opacity`: js.UndefOr[Double | Expression] = js.native
  
  var `fill-extrusion-opacity-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-extrusion-pattern`: js.UndefOr[String | Expression] = js.native
  
  var `fill-extrusion-pattern-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-extrusion-translate`: js.UndefOr[js.Array[Double] | Expression] = js.native
  
  var `fill-extrusion-translate-anchor`: js.UndefOr[map | viewport] = js.native
  
  var `fill-extrusion-translate-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-extrusion-vertical-gradient`: js.UndefOr[Boolean] = js.native
}
object FillExtrusionPaint {
  
  @scala.inline
  def apply(): FillExtrusionPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillExtrusionPaint]
  }
  
  @scala.inline
  implicit class FillExtrusionPaintOps[Self <: FillExtrusionPaint] (val x: Self) extends AnyVal {
    
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
    def `setFill-extrusion-base`(value: Double | StyleFunction | Expression): Self = this.set("fill-extrusion-base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-base`: Self = this.set("fill-extrusion-base", js.undefined)
    
    @scala.inline
    def `setFill-extrusion-base-transition`(value: Transition): Self = this.set("fill-extrusion-base-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-base-transition`: Self = this.set("fill-extrusion-base-transition", js.undefined)
    
    @scala.inline
    def `setFill-extrusion-color`(value: String | StyleFunction | Expression): Self = this.set("fill-extrusion-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-color`: Self = this.set("fill-extrusion-color", js.undefined)
    
    @scala.inline
    def `setFill-extrusion-color-transition`(value: Transition): Self = this.set("fill-extrusion-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-color-transition`: Self = this.set("fill-extrusion-color-transition", js.undefined)
    
    @scala.inline
    def `setFill-extrusion-height`(value: Double | StyleFunction | Expression): Self = this.set("fill-extrusion-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-height`: Self = this.set("fill-extrusion-height", js.undefined)
    
    @scala.inline
    def `setFill-extrusion-height-transition`(value: Transition): Self = this.set("fill-extrusion-height-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-height-transition`: Self = this.set("fill-extrusion-height-transition", js.undefined)
    
    @scala.inline
    def `setFill-extrusion-opacity`(value: Double | Expression): Self = this.set("fill-extrusion-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-opacity`: Self = this.set("fill-extrusion-opacity", js.undefined)
    
    @scala.inline
    def `setFill-extrusion-opacity-transition`(value: Transition): Self = this.set("fill-extrusion-opacity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-opacity-transition`: Self = this.set("fill-extrusion-opacity-transition", js.undefined)
    
    @scala.inline
    def `setFill-extrusion-pattern`(value: String | Expression): Self = this.set("fill-extrusion-pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-pattern`: Self = this.set("fill-extrusion-pattern", js.undefined)
    
    @scala.inline
    def `setFill-extrusion-pattern-transition`(value: Transition): Self = this.set("fill-extrusion-pattern-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-pattern-transition`: Self = this.set("fill-extrusion-pattern-transition", js.undefined)
    
    @scala.inline
    def `setFill-extrusion-translateVarargs`(value: Double*): Self = this.set("fill-extrusion-translate", js.Array(value :_*))
    
    @scala.inline
    def `setFill-extrusion-translate`(value: js.Array[Double] | Expression): Self = this.set("fill-extrusion-translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-translate`: Self = this.set("fill-extrusion-translate", js.undefined)
    
    @scala.inline
    def `setFill-extrusion-translate-anchor`(value: map | viewport): Self = this.set("fill-extrusion-translate-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-translate-anchor`: Self = this.set("fill-extrusion-translate-anchor", js.undefined)
    
    @scala.inline
    def `setFill-extrusion-translate-transition`(value: Transition): Self = this.set("fill-extrusion-translate-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-translate-transition`: Self = this.set("fill-extrusion-translate-transition", js.undefined)
    
    @scala.inline
    def `setFill-extrusion-vertical-gradient`(value: Boolean): Self = this.set("fill-extrusion-vertical-gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-extrusion-vertical-gradient`: Self = this.set("fill-extrusion-vertical-gradient", js.undefined)
  }
}
