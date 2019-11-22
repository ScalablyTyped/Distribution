package typings.instagramDashPrivateDashApi.distResponsesMusicDashTrendingDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicTrendingFeedResponseRootObject extends js.Object {
  var alacorn_session_id: String
  var items: js.Array[MusicTrendingFeedResponseItemsItem]
  var page_info: MusicTrendingFeedResponsePage_info
  var status: String
}

object MusicTrendingFeedResponseRootObject {
  @scala.inline
  def apply(
    alacorn_session_id: String,
    items: js.Array[MusicTrendingFeedResponseItemsItem],
    page_info: MusicTrendingFeedResponsePage_info,
    status: String
  ): MusicTrendingFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id, items = items, page_info = page_info, status = status)
  
    __obj.asInstanceOf[MusicTrendingFeedResponseRootObject]
  }
}

