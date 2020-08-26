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
  def apply(): SchemaListClientUserInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClientUserInvitationsResponse]
  }
  @scala.inline
  implicit class SchemaListClientUserInvitationsResponseOps[Self <: SchemaListClientUserInvitationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInvitationsVarargs(value: SchemaClientUserInvitation*): Self = this.set("invitations", js.Array(value :_*))
    @scala.inline
    def setInvitations(value: js.Array[SchemaClientUserInvitation]): Self = this.set("invitations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitations: Self = this.set("invitations", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

