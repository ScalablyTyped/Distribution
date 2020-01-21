package typings.instagramPrivateApi.liveLikeResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveLikeResponseRootObject extends js.Object {
  var burst_likes: Double
  var likes: Double
  var status: String
}

object LiveLikeResponseRootObject {
  @scala.inline
  def apply(burst_likes: Double, likes: Double, status: String): LiveLikeResponseRootObject = {
    val __obj = js.Dynamic.literal(burst_likes = burst_likes.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LiveLikeResponseRootObject]
  }
}

