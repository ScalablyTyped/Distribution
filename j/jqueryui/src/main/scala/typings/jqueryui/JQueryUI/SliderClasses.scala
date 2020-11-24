package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderClasses extends js.Object {
  
  var `ui-slider`: js.UndefOr[String] = js.native
  
  var `ui-slider-handle`: js.UndefOr[String] = js.native
  
  var `ui-slider-horizontal`: js.UndefOr[String] = js.native
  
  var `ui-slider-range`: js.UndefOr[String] = js.native
  
  var `ui-slider-range-max`: js.UndefOr[String] = js.native
  
  var `ui-slider-range-min`: js.UndefOr[String] = js.native
  
  var `ui-slider-vertical`: js.UndefOr[String] = js.native
}
object SliderClasses {
  
  @scala.inline
  def apply(): SliderClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderClasses]
  }
  
  @scala.inline
  implicit class SliderClassesOps[Self <: SliderClasses] (val x: Self) extends AnyVal {
    
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
    def `setUi-slider`(value: String): Self = this.set("ui-slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-slider`: Self = this.set("ui-slider", js.undefined)
    
    @scala.inline
    def `setUi-slider-handle`(value: String): Self = this.set("ui-slider-handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-slider-handle`: Self = this.set("ui-slider-handle", js.undefined)
    
    @scala.inline
    def `setUi-slider-horizontal`(value: String): Self = this.set("ui-slider-horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-slider-horizontal`: Self = this.set("ui-slider-horizontal", js.undefined)
    
    @scala.inline
    def `setUi-slider-range`(value: String): Self = this.set("ui-slider-range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-slider-range`: Self = this.set("ui-slider-range", js.undefined)
    
    @scala.inline
    def `setUi-slider-range-max`(value: String): Self = this.set("ui-slider-range-max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-slider-range-max`: Self = this.set("ui-slider-range-max", js.undefined)
    
    @scala.inline
    def `setUi-slider-range-min`(value: String): Self = this.set("ui-slider-range-min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-slider-range-min`: Self = this.set("ui-slider-range-min", js.undefined)
    
    @scala.inline
    def `setUi-slider-vertical`(value: String): Self = this.set("ui-slider-vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUi-slider-vertical`: Self = this.set("ui-slider-vertical", js.undefined)
  }
}
