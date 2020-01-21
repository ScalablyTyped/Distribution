package typings.instagramPrivateApi.musicMoodFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicMoodFeedResponseRootObject extends js.Object {
  var alacorn_session_id: String
  var items: js.Array[MusicMoodFeedResponseItemsItem]
  var page_info: MusicMoodFeedResponsePageInfo
  var status: String
}

object MusicMoodFeedResponseRootObject {
  @scala.inline
  def apply(
    alacorn_session_id: String,
    items: js.Array[MusicMoodFeedResponseItemsItem],
    page_info: MusicMoodFeedResponsePageInfo,
    status: String
  ): MusicMoodFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MusicMoodFeedResponseRootObject]
  }
}

