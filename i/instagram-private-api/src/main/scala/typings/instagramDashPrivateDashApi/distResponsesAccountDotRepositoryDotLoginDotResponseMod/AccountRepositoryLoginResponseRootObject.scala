package typings.instagramDashPrivateDashApi.distResponsesAccountDotRepositoryDotLoginDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRepositoryLoginResponseRootObject extends js.Object {
  var logged_in_user: AccountRepositoryLoginResponseLogged_in_user
  var status: String
}

object AccountRepositoryLoginResponseRootObject {
  @scala.inline
  def apply(logged_in_user: AccountRepositoryLoginResponseLogged_in_user, status: String): AccountRepositoryLoginResponseRootObject = {
    val __obj = js.Dynamic.literal(logged_in_user = logged_in_user, status = status)
  
    __obj.asInstanceOf[AccountRepositoryLoginResponseRootObject]
  }
}

