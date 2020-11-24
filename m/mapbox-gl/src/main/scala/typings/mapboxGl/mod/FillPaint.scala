package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillPaint extends AnyPaint {
  
  var `fill-antialias`: js.UndefOr[Boolean | Expression] = js.native
  
  var `fill-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `fill-color-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `fill-opacity-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-outline-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `fill-outline-color-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-pattern`: js.UndefOr[String | Expression] = js.native
  
  var `fill-pattern-transition`: js.UndefOr[Transition] = js.native
  
  var `fill-translate`: js.UndefOr[js.Array[Double]] = js.native
  
  var `fill-translate-anchor`: js.UndefOr[map | viewport] = js.native
  
  var `fill-translate-transition`: js.UndefOr[Transition] = js.native
}
object FillPaint {
  
  @scala.inline
  def apply(): FillPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillPaint]
  }
  
  @scala.inline
  implicit class FillPaintOps[Self <: FillPaint] (val x: Self) extends AnyVal {
    
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
    def `setFill-antialias`(value: Boolean | Expression): Self = this.set("fill-antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-antialias`: Self = this.set("fill-antialias", js.undefined)
    
    @scala.inline
    def `setFill-color`(value: String | StyleFunction | Expression): Self = this.set("fill-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-color`: Self = this.set("fill-color", js.undefined)
    
    @scala.inline
    def `setFill-color-transition`(value: Transition): Self = this.set("fill-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-color-transition`: Self = this.set("fill-color-transition", js.undefined)
    
    @scala.inline
    def `setFill-opacity`(value: Double | StyleFunction | Expression): Self = this.set("fill-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-opacity`: Self = this.set("fill-opacity", js.undefined)
    
    @scala.inline
    def `setFill-opacity-transition`(value: Transition): Self = this.set("fill-opacity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-opacity-transition`: Self = this.set("fill-opacity-transition", js.undefined)
    
    @scala.inline
    def `setFill-outline-color`(value: String | StyleFunction | Expression): Self = this.set("fill-outline-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-outline-color`: Self = this.set("fill-outline-color", js.undefined)
    
    @scala.inline
    def `setFill-outline-color-transition`(value: Transition): Self = this.set("fill-outline-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-outline-color-transition`: Self = this.set("fill-outline-color-transition", js.undefined)
    
    @scala.inline
    def `setFill-pattern`(value: String | Expression): Self = this.set("fill-pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-pattern`: Self = this.set("fill-pattern", js.undefined)
    
    @scala.inline
    def `setFill-pattern-transition`(value: Transition): Self = this.set("fill-pattern-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-pattern-transition`: Self = this.set("fill-pattern-transition", js.undefined)
    
    @scala.inline
    def `setFill-translateVarargs`(value: Double*): Self = this.set("fill-translate", js.Array(value :_*))
    
    @scala.inline
    def `setFill-translate`(value: js.Array[Double]): Self = this.set("fill-translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-translate`: Self = this.set("fill-translate", js.undefined)
    
    @scala.inline
    def `setFill-translate-anchor`(value: map | viewport): Self = this.set("fill-translate-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-translate-anchor`: Self = this.set("fill-translate-anchor", js.undefined)
    
    @scala.inline
    def `setFill-translate-transition`(value: Transition): Self = this.set("fill-translate-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-translate-transition`: Self = this.set("fill-translate-transition", js.undefined)
  }
}
