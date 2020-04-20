package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseFundraiserSticker extends js.Object {
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
}

