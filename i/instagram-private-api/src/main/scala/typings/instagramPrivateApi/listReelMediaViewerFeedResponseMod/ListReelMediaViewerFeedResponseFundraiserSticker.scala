package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReelMediaViewerFeedResponseFundraiserSticker extends StObject {
  
  var button_text_color: String
  
  var consumption_sheet_config: ListReelMediaViewerFeedResponseConsumptionSheetConfig
  
  var end_background_color: String
  
  var original_subtitle_height: Double
  
  var pk: String
  
  var source_name: String
  
  var start_background_color: String
  
  var subtitle_color: String
  
  var title: String
  
  var title_color: String
  
  var user: ListReelMediaViewerFeedResponseUser
}
object ListReelMediaViewerFeedResponseFundraiserSticker {
  
  inline def apply(
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
  
  extension [Self <: ListReelMediaViewerFeedResponseFundraiserSticker](x: Self) {
    
    inline def setButton_text_color(value: String): Self = StObject.set(x, "button_text_color", value.asInstanceOf[js.Any])
    
    inline def setConsumption_sheet_config(value: ListReelMediaViewerFeedResponseConsumptionSheetConfig): Self = StObject.set(x, "consumption_sheet_config", value.asInstanceOf[js.Any])
    
    inline def setEnd_background_color(value: String): Self = StObject.set(x, "end_background_color", value.asInstanceOf[js.Any])
    
    inline def setOriginal_subtitle_height(value: Double): Self = StObject.set(x, "original_subtitle_height", value.asInstanceOf[js.Any])
    
    inline def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setSource_name(value: String): Self = StObject.set(x, "source_name", value.asInstanceOf[js.Any])
    
    inline def setStart_background_color(value: String): Self = StObject.set(x, "start_background_color", value.asInstanceOf[js.Any])
    
    inline def setSubtitle_color(value: String): Self = StObject.set(x, "subtitle_color", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitle_color(value: String): Self = StObject.set(x, "title_color", value.asInstanceOf[js.Any])
    
    inline def setUser(value: ListReelMediaViewerFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
