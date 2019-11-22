package typings.instagramDashPrivateDashApi.distResponsesLiveDotLikeDashCountDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveLikeCountResponseRootObject extends js.Object {
  var burst_likes: Double
  var like_ts: Double
  var likers: js.Array[_]
  var likes: Double
  var status: String
}

object LiveLikeCountResponseRootObject {
  @scala.inline
  def apply(burst_likes: Double, like_ts: Double, likers: js.Array[_], likes: Double, status: String): LiveLikeCountResponseRootObject = {
    val __obj = js.Dynamic.literal(burst_likes = burst_likes, like_ts = like_ts, likers = likers, likes = likes, status = status)
  
    __obj.asInstanceOf[LiveLikeCountResponseRootObject]
  }
}

