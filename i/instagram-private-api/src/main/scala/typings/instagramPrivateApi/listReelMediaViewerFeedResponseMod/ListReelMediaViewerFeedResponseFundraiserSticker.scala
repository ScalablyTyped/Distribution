package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReelMediaViewerFeedResponseFundraiserSticker extends js.Object {
  
  var button_text_color: String = js.native
  
  var consumption_sheet_config: ListReelMediaViewerFeedResponseConsumptionSheetConfig = js.native
  
  var end_background_color: String = js.native
  
  var original_subtitle_height: Double = js.native
  
  var pk: String = js.native
  
  var source_name: String = js.native
  
  var start_background_color: String = js.native
  
  var subtitle_color: String = js.native
  
  var title: String = js.native
  
  var title_color: String = js.native
  
  var user: ListReelMediaViewerFeedResponseUser = js.native
}
object ListReelMediaViewerFeedResponseFundraiserSticker {
  
  @scala.inline
  def apply(
    button_text_color: String,
    consumption_sheet_config: ListReelMediaViewerFeedResponseConsumptionSheetConfig,
    end_background_color: String,
    original_subtitle_height: Double,
    pk: String,
    source_name: String,
    start_background_color: String,
    subtitle_color: String,
    title: String,
    title_color: String,
    user: ListReelMediaViewerFeedResponseUser
  ): ListReelMediaViewerFeedResponseFundraiserSticker = {
    val __obj = js.Dynamic.literal(button_text_color = button_text_color.asInstanceOf[js.Any], consumption_sheet_config = consumption_sheet_config.asInstanceOf[js.Any], end_background_color = end_background_color.asInstanceOf[js.Any], original_subtitle_height = original_subtitle_height.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], source_name = source_name.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], subtitle_color = subtitle_color.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], title_color = title_color.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseFundraiserSticker]
  }
  
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseFundraiserStickerOps[Self <: ListReelMediaViewerFeedResponseFundraiserSticker] (val x: Self) extends AnyVal {
    
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
    def setButton_text_color(value: String): Self = this.set("button_text_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumption_sheet_config(value: ListReelMediaViewerFeedResponseConsumptionSheetConfig): Self = this.set("consumption_sheet_config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_background_color(value: String): Self = this.set("end_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_subtitle_height(value: Double): Self = this.set("original_subtitle_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_name(value: String): Self = this.set("source_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_background_color(value: String): Self = this.set("start_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle_color(value: String): Self = this.set("subtitle_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle_color(value: String): Self = this.set("title_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: ListReelMediaViewerFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
