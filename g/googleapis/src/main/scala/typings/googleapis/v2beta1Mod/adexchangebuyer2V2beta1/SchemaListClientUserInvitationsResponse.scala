package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListClientUserInvitationsResponse extends js.Object {
  /**
    * The returned list of client users.
    */
  var invitations: js.UndefOr[js.Array[SchemaClientUserInvitation]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListClientUserInvitationsRequest.pageToken field in the subsequent call
    * to the clients.invitations.list method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListClientUserInvitationsResponse {
  @scala.inline
  def apply(invitations: js.Array[SchemaClientUserInvitation] = null, nextPageToken: String = null): SchemaListClientUserInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (invitations != null) __obj.updateDynamic("invitations")(invitations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListClientUserInvitationsResponse]
  }
}

