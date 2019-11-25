package typings.instagramDashPrivateDashApi.distResponsesMusicDashTrendingDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MusicTrendingFeedResponsePage_info extends js.Object {
  var auto_load_more_available: Boolean
  var more_available: Boolean
  var next_max_id: String
}

object MusicTrendingFeedResponsePage_info {
  @scala.inline
  def apply(auto_load_more_available: Boolean, more_available: Boolean, next_max_id: String): MusicTrendingFeedResponsePage_info = {
    val __obj = js.Dynamic.literal(auto_load_more_available = auto_load_more_available.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MusicTrendingFeedResponsePage_info]
  }
}

