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
    val __obj = js.Dynamic.literal(alacorn_session_id = alacorn_session_id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MusicGenreFeedResponseRootObject]
  }
}

