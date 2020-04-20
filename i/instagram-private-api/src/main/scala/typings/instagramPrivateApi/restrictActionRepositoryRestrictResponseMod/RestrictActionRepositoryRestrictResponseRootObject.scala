package typings.instagramPrivateApi.restrictActionRepositoryRestrictResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestrictActionRepositoryRestrictResponseRootObject extends js.Object {
  var status: String
  var users: js.Array[RestrictActionRepositoryRestrictResponseUsersItem]
}

object RestrictActionRepositoryRestrictResponseRootObject {
  @scala.inline
  def apply(status: String, users: js.Array[RestrictActionRepositoryRestrictResponseUsersItem]): RestrictActionRepositoryRestrictResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictActionRepositoryRestrictResponseRootObject]
  }
}

