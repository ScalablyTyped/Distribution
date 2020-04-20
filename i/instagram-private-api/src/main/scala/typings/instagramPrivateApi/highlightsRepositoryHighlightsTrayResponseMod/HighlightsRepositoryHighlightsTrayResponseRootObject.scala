package typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryHighlightsTrayResponseRootObject extends js.Object {
  var show_empty_state: Boolean
  var status: String
  var tray: js.Array[HighlightsRepositoryHighlightsTrayResponseTrayItem]
  var tv_channel: HighlightsRepositoryHighlightsTrayResponseTvChannel
}

object HighlightsRepositoryHighlightsTrayResponseRootObject {
  @scala.inline
  def apply(
    show_empty_state: Boolean,
    status: String,
    tray: js.Array[HighlightsRepositoryHighlightsTrayResponseTrayItem],
    tv_channel: HighlightsRepositoryHighlightsTrayResponseTvChannel
  ): HighlightsRepositoryHighlightsTrayResponseRootObject = {
    val __obj = js.Dynamic.literal(show_empty_state = show_empty_state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tray = tray.asInstanceOf[js.Any], tv_channel = tv_channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseRootObject]
  }
}

