package typings.materialSlider.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCSliderChangeEventDetail extends js.Object {
  
  var thumb: Thumb = js.native
  
  var value: Double = js.native
}
object MDCSliderChangeEventDetail {
  
  @scala.inline
  def apply(thumb: Thumb, value: Double): MDCSliderChangeEventDetail = {
    val __obj = js.Dynamic.literal(thumb = thumb.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCSliderChangeEventDetail]
  }
  
  @scala.inline
  implicit class MDCSliderChangeEventDetailOps[Self <: MDCSliderChangeEventDetail] (val x: Self) extends AnyVal {
    
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
    def setThumb(value: Thumb): Self = this.set("thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
