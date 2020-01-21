package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListClientUsersResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListClientUsersRequest.pageToken field in the subsequent call to the
    * clients.invitations.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The returned list of client users.
    */
  var users: js.UndefOr[js.Array[SchemaClientUser]] = js.native
}

object SchemaListClientUsersResponse {
  @scala.inline
  def apply(nextPageToken: String = null, users: js.Array[SchemaClientUser] = null): SchemaListClientUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListClientUsersResponse]
  }
}

