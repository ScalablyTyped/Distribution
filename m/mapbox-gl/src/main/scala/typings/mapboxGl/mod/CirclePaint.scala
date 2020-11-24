package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CirclePaint extends AnyPaint {
  
  var `circle-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `circle-blur-transition`: js.UndefOr[Transition] = js.native
  
  var `circle-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `circle-color-transition`: js.UndefOr[Transition] = js.native
  
  var `circle-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `circle-opacity-transition`: js.UndefOr[Transition] = js.native
  
  var `circle-pitch-alignment`: js.UndefOr[map | viewport] = js.native
  
  var `circle-pitch-scale`: js.UndefOr[map | viewport] = js.native
  
  var `circle-radius`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `circle-radius-transition`: js.UndefOr[Transition] = js.native
  
  var `circle-stroke-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `circle-stroke-color-transition`: js.UndefOr[Transition] = js.native
  
  var `circle-stroke-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `circle-stroke-opacity-transition`: js.UndefOr[Transition] = js.native
  
  var `circle-stroke-width`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `circle-stroke-width-transition`: js.UndefOr[Transition] = js.native
  
  var `circle-translate`: js.UndefOr[js.Array[Double] | Expression] = js.native
  
  var `circle-translate-anchor`: js.UndefOr[map | viewport] = js.native
  
  var `circle-translate-transition`: js.UndefOr[Transition] = js.native
}
object CirclePaint {
  
  @scala.inline
  def apply(): CirclePaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CirclePaint]
  }
  
  @scala.inline
  implicit class CirclePaintOps[Self <: CirclePaint] (val x: Self) extends AnyVal {
    
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
    def `setCircle-blur`(value: Double | StyleFunction | Expression): Self = this.set("circle-blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-blur`: Self = this.set("circle-blur", js.undefined)
    
    @scala.inline
    def `setCircle-blur-transition`(value: Transition): Self = this.set("circle-blur-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-blur-transition`: Self = this.set("circle-blur-transition", js.undefined)
    
    @scala.inline
    def `setCircle-color`(value: String | StyleFunction | Expression): Self = this.set("circle-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-color`: Self = this.set("circle-color", js.undefined)
    
    @scala.inline
    def `setCircle-color-transition`(value: Transition): Self = this.set("circle-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-color-transition`: Self = this.set("circle-color-transition", js.undefined)
    
    @scala.inline
    def `setCircle-opacity`(value: Double | StyleFunction | Expression): Self = this.set("circle-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-opacity`: Self = this.set("circle-opacity", js.undefined)
    
    @scala.inline
    def `setCircle-opacity-transition`(value: Transition): Self = this.set("circle-opacity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-opacity-transition`: Self = this.set("circle-opacity-transition", js.undefined)
    
    @scala.inline
    def `setCircle-pitch-alignment`(value: map | viewport): Self = this.set("circle-pitch-alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-pitch-alignment`: Self = this.set("circle-pitch-alignment", js.undefined)
    
    @scala.inline
    def `setCircle-pitch-scale`(value: map | viewport): Self = this.set("circle-pitch-scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-pitch-scale`: Self = this.set("circle-pitch-scale", js.undefined)
    
    @scala.inline
    def `setCircle-radius`(value: Double | StyleFunction | Expression): Self = this.set("circle-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-radius`: Self = this.set("circle-radius", js.undefined)
    
    @scala.inline
    def `setCircle-radius-transition`(value: Transition): Self = this.set("circle-radius-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-radius-transition`: Self = this.set("circle-radius-transition", js.undefined)
    
    @scala.inline
    def `setCircle-stroke-color`(value: String | StyleFunction | Expression): Self = this.set("circle-stroke-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-stroke-color`: Self = this.set("circle-stroke-color", js.undefined)
    
    @scala.inline
    def `setCircle-stroke-color-transition`(value: Transition): Self = this.set("circle-stroke-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-stroke-color-transition`: Self = this.set("circle-stroke-color-transition", js.undefined)
    
    @scala.inline
    def `setCircle-stroke-opacity`(value: Double | StyleFunction | Expression): Self = this.set("circle-stroke-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-stroke-opacity`: Self = this.set("circle-stroke-opacity", js.undefined)
    
    @scala.inline
    def `setCircle-stroke-opacity-transition`(value: Transition): Self = this.set("circle-stroke-opacity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-stroke-opacity-transition`: Self = this.set("circle-stroke-opacity-transition", js.undefined)
    
    @scala.inline
    def `setCircle-stroke-width`(value: Double | StyleFunction | Expression): Self = this.set("circle-stroke-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-stroke-width`: Self = this.set("circle-stroke-width", js.undefined)
    
    @scala.inline
    def `setCircle-stroke-width-transition`(value: Transition): Self = this.set("circle-stroke-width-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-stroke-width-transition`: Self = this.set("circle-stroke-width-transition", js.undefined)
    
    @scala.inline
    def `setCircle-translateVarargs`(value: Double*): Self = this.set("circle-translate", js.Array(value :_*))
    
    @scala.inline
    def `setCircle-translate`(value: js.Array[Double] | Expression): Self = this.set("circle-translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-translate`: Self = this.set("circle-translate", js.undefined)
    
    @scala.inline
    def `setCircle-translate-anchor`(value: map | viewport): Self = this.set("circle-translate-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-translate-anchor`: Self = this.set("circle-translate-anchor", js.undefined)
    
    @scala.inline
    def `setCircle-translate-transition`(value: Transition): Self = this.set("circle-translate-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCircle-translate-transition`: Self = this.set("circle-translate-transition", js.undefined)
  }
}
