package typings.instagramDashPrivateDashApi.distResponsesAccountDotRepositoryDotCurrentDashUserDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRepositoryCurrentUserResponseRootObject extends js.Object {
  var status: String
  var user: AccountRepositoryCurrentUserResponseUser
}

object AccountRepositoryCurrentUserResponseRootObject {
  @scala.inline
  def apply(status: String, user: AccountRepositoryCurrentUserResponseUser): AccountRepositoryCurrentUserResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountRepositoryCurrentUserResponseRootObject]
  }
}

