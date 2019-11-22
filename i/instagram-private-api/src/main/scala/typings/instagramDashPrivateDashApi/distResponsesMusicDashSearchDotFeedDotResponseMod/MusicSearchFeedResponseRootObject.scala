package typings.instagramDashPrivateDashApi.distResponsesMusicDashSearchDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicSearchFeedResponseRootObject extends js.Object {
  var alacorn_session_id: String
  var items: js.Array[MusicSearchFeedResponseItemsItem]
  var page_info: MusicSearchFeedResponsePage_info
  var status: String
}

object MusicSearchFeedResponseRootObject {
  @scala.inline
  def apply(
    alacorn_session_id: String,
    items: js.Array[MusicSearchFeedResponseItemsItem],
    page_info: MusicSearchFeedResponsePage_info,
    status: String
  ): MusicSearchFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id, items = items, page_info = page_info, status = status)
  
    __obj.asInstanceOf[MusicSearchFeedResponseRootObject]
  }
}

