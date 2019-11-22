package typings.instagramDashPrivateDashApi.distResponsesMusicDashGenreDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicGenreFeedResponseRootObject extends js.Object {
  var alacorn_session_id: String
  var items: js.Array[MusicGenreFeedResponseItemsItem]
  var page_info: MusicGenreFeedResponsePage_info
  var status: String
}

object MusicGenreFeedResponseRootObject {
  @scala.inline
  def apply(
    alacorn_session_id: String,
    items: js.Array[MusicGenreFeedResponseItemsItem],
    page_info: MusicGenreFeedResponsePage_info,
    status: String
  ): MusicGenreFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id, items = items, page_info = page_info, status = status)
  
    __obj.asInstanceOf[MusicGenreFeedResponseRootObject]
  }
}

