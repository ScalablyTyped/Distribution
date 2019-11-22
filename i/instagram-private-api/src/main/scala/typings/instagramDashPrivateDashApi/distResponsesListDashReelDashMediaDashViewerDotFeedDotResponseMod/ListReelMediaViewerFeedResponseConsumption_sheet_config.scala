package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseConsumption_sheet_config extends js.Object {
  var can_viewer_donate: Boolean
  var currency: String
  var donation_amount_config: ListReelMediaViewerFeedResponseDonation_amount_config
  var donation_disabled_message: Null
  var donation_url: String
  var has_viewer_donated: Boolean
  var privacy_disclaimer: String
  var you_donated_message: Null
}

object ListReelMediaViewerFeedResponseConsumption_sheet_config {
  @scala.inline
  def apply(
    can_viewer_donate: Boolean,
    currency: String,
    donation_amount_config: ListReelMediaViewerFeedResponseDonation_amount_config,
    donation_disabled_message: Null,
    donation_url: String,
    has_viewer_donated: Boolean,
    privacy_disclaimer: String,
    you_donated_message: Null
  ): ListReelMediaViewerFeedResponseConsumption_sheet_config = {
    val __obj = js.Dynamic.literal(can_viewer_donate = can_viewer_donate, currency = currency, donation_amount_config = donation_amount_config, donation_disabled_message = donation_disabled_message, donation_url = donation_url, has_viewer_donated = has_viewer_donated, privacy_disclaimer = privacy_disclaimer, you_donated_message = you_donated_message)
  
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseConsumption_sheet_config]
  }
}

