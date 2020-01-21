package typings.instagramPrivateApi.likedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LikedFeedResponseCandidatesItem extends js.Object {
  var height: Double
  var url: String
  var width: Double
}

object LikedFeedResponseCandidatesItem {
  @scala.inline
  def apply(height: Double, url: String, width: Double): LikedFeedResponseCandidatesItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LikedFeedResponseCandidatesItem]
  }
}

