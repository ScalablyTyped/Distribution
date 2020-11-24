package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundPaint extends AnyPaint {
  
  var `background-color`: js.UndefOr[String | Expression] = js.native
  
  var `background-color-transition`: js.UndefOr[Transition] = js.native
  
  var `background-opacity`: js.UndefOr[Double | Expression] = js.native
  
  var `background-opacity-transition`: js.UndefOr[Transition] = js.native
  
  var `background-pattern`: js.UndefOr[String] = js.native
  
  var `background-pattern-transition`: js.UndefOr[Transition] = js.native
}
object BackgroundPaint {
  
  @scala.inline
  def apply(): BackgroundPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundPaint]
  }
  
  @scala.inline
  implicit class BackgroundPaintOps[Self <: BackgroundPaint] (val x: Self) extends AnyVal {
    
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
    def `setBackground-color`(value: String | Expression): Self = this.set("background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-color`: Self = this.set("background-color", js.undefined)
    
    @scala.inline
    def `setBackground-color-transition`(value: Transition): Self = this.set("background-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-color-transition`: Self = this.set("background-color-transition", js.undefined)
    
    @scala.inline
    def `setBackground-opacity`(value: Double | Expression): Self = this.set("background-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-opacity`: Self = this.set("background-opacity", js.undefined)
    
    @scala.inline
    def `setBackground-opacity-transition`(value: Transition): Self = this.set("background-opacity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-opacity-transition`: Self = this.set("background-opacity-transition", js.undefined)
    
    @scala.inline
    def `setBackground-pattern`(value: String): Self = this.set("background-pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-pattern`: Self = this.set("background-pattern", js.undefined)
    
    @scala.inline
    def `setBackground-pattern-transition`(value: Transition): Self = this.set("background-pattern-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-pattern-transition`: Self = this.set("background-pattern-transition", js.undefined)
  }
}
