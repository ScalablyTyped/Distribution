package typings.instagramPrivateApi.userRepositoryInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRepositoryInfoResponseRootObject extends js.Object {
  var status: String
  var user: UserRepositoryInfoResponseUser
}

object UserRepositoryInfoResponseRootObject {
  @scala.inline
  def apply(status: String, user: UserRepositoryInfoResponseUser): UserRepositoryInfoResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRepositoryInfoResponseRootObject]
  }
}

