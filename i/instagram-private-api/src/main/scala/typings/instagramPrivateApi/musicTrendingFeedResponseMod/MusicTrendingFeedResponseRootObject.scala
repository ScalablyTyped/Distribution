package typings.instagramPrivateApi.musicTrendingFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicTrendingFeedResponseRootObject extends js.Object {
  var alacorn_session_id: String
  var items: js.Array[MusicTrendingFeedResponseItemsItem]
  var page_info: MusicTrendingFeedResponsePageInfo
  var status: String
}

object MusicTrendingFeedResponseRootObject {
  @scala.inline
  def apply(
    alacorn_session_id: String,
    items: js.Array[MusicTrendingFeedResponseItemsItem],
    page_info: MusicTrendingFeedResponsePageInfo,
    status: String
  ): MusicTrendingFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MusicTrendingFeedResponseRootObject]
  }
}

