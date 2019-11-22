package typings.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotLikersDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryLikersResponseRootObject extends js.Object {
  var status: String
  var user_count: Double
  var users: js.Array[MediaRepositoryLikersResponseUsersItem]
}

object MediaRepositoryLikersResponseRootObject {
  @scala.inline
  def apply(status: String, user_count: Double, users: js.Array[MediaRepositoryLikersResponseUsersItem]): MediaRepositoryLikersResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status, user_count = user_count, users = users)
  
    __obj.asInstanceOf[MediaRepositoryLikersResponseRootObject]
  }
}

