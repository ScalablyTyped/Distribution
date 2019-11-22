package typings.instagramDashPrivateDashApi.distResponsesMusicDashMoodDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicMoodFeedResponseRootObject extends js.Object {
  var alacorn_session_id: String
  var items: js.Array[MusicMoodFeedResponseItemsItem]
  var page_info: MusicMoodFeedResponsePage_info
  var status: String
}

object MusicMoodFeedResponseRootObject {
  @scala.inline
  def apply(
    alacorn_session_id: String,
    items: js.Array[MusicMoodFeedResponseItemsItem],
    page_info: MusicMoodFeedResponsePage_info,
    status: String
  ): MusicMoodFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id, items = items, page_info = page_info, status = status)
  
    __obj.asInstanceOf[MusicMoodFeedResponseRootObject]
  }
}

