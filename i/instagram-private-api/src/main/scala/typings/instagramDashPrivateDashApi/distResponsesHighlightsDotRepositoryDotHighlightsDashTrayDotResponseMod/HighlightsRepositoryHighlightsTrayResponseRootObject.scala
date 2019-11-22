package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotHighlightsDashTrayDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryHighlightsTrayResponseRootObject extends js.Object {
  var show_empty_state: Boolean
  var status: String
  var tray: js.Array[HighlightsRepositoryHighlightsTrayResponseTrayItem]
  var tv_channel: HighlightsRepositoryHighlightsTrayResponseTv_channel
}

object HighlightsRepositoryHighlightsTrayResponseRootObject {
  @scala.inline
  def apply(
    show_empty_state: Boolean,
    status: String,
    tray: js.Array[HighlightsRepositoryHighlightsTrayResponseTrayItem],
    tv_channel: HighlightsRepositoryHighlightsTrayResponseTv_channel
  ): HighlightsRepositoryHighlightsTrayResponseRootObject = {
    val __obj = js.Dynamic.literal(show_empty_state = show_empty_state, status = status, tray = tray, tv_channel = tv_channel)
  
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseRootObject]
  }
}

