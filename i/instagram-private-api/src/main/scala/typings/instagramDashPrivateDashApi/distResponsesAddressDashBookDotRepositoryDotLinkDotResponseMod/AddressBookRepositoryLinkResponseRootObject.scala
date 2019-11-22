package typings.instagramDashPrivateDashApi.distResponsesAddressDashBookDotRepositoryDotLinkDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressBookRepositoryLinkResponseRootObject extends js.Object {
  var status: String
  var users: js.Array[AddressBookRepositoryLinkResponseUsersItem]
  var warning: String
}

object AddressBookRepositoryLinkResponseRootObject {
  @scala.inline
  def apply(status: String, users: js.Array[AddressBookRepositoryLinkResponseUsersItem], warning: String): AddressBookRepositoryLinkResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status, users = users, warning = warning)
  
    __obj.asInstanceOf[AddressBookRepositoryLinkResponseRootObject]
  }
}

