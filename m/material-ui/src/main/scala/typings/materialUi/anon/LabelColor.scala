package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelColor extends js.Object {
  
  var labelColor: js.UndefOr[String] = js.native
  
  var labelDisabledColor: js.UndefOr[String] = js.native
  
  var thumbDisabledColor: js.UndefOr[String] = js.native
  
  var thumbOffColor: js.UndefOr[String] = js.native
  
  var thumbOnColor: js.UndefOr[String] = js.native
  
  var thumbRequiredColor: js.UndefOr[String] = js.native
  
  var trackDisabledColor: js.UndefOr[String] = js.native
  
  var trackOffColor: js.UndefOr[String] = js.native
  
  var trackOnColor: js.UndefOr[String] = js.native
  
  var trackRequiredColor: js.UndefOr[String] = js.native
}
object LabelColor {
  
  @scala.inline
  def apply(): LabelColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelColor]
  }
  
  @scala.inline
  implicit class LabelColorOps[Self <: LabelColor] (val x: Self) extends AnyVal {
    
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
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    
    @scala.inline
    def setLabelDisabledColor(value: String): Self = this.set("labelDisabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelDisabledColor: Self = this.set("labelDisabledColor", js.undefined)
    
    @scala.inline
    def setThumbDisabledColor(value: String): Self = this.set("thumbDisabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbDisabledColor: Self = this.set("thumbDisabledColor", js.undefined)
    
    @scala.inline
    def setThumbOffColor(value: String): Self = this.set("thumbOffColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbOffColor: Self = this.set("thumbOffColor", js.undefined)
    
    @scala.inline
    def setThumbOnColor(value: String): Self = this.set("thumbOnColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbOnColor: Self = this.set("thumbOnColor", js.undefined)
    
    @scala.inline
    def setThumbRequiredColor(value: String): Self = this.set("thumbRequiredColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbRequiredColor: Self = this.set("thumbRequiredColor", js.undefined)
    
    @scala.inline
    def setTrackDisabledColor(value: String): Self = this.set("trackDisabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackDisabledColor: Self = this.set("trackDisabledColor", js.undefined)
    
    @scala.inline
    def setTrackOffColor(value: String): Self = this.set("trackOffColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackOffColor: Self = this.set("trackOffColor", js.undefined)
    
    @scala.inline
    def setTrackOnColor(value: String): Self = this.set("trackOnColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackOnColor: Self = this.set("trackOnColor", js.undefined)
    
    @scala.inline
    def setTrackRequiredColor(value: String): Self = this.set("trackRequiredColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackRequiredColor: Self = this.set("trackRequiredColor", js.undefined)
  }
}
