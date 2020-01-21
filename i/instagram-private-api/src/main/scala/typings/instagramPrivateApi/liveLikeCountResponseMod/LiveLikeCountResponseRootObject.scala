package typings.instagramPrivateApi.liveLikeCountResponseMod

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
    val __obj = js.Dynamic.literal(burst_likes = burst_likes.asInstanceOf[js.Any], like_ts = like_ts.asInstanceOf[js.Any], likers = likers.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LiveLikeCountResponseRootObject]
  }
}

