package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An invitation for a new client user to get access to the Authorized Buyers
  * UI. All fields are required unless otherwise specified.
  */
@js.native
trait SchemaClientUserInvitation extends js.Object {
  /**
    * Numerical account ID of the client buyer that the invited user is
    * associated with. The value of this field is ignored in create operations.
    */
  var clientAccountId: js.UndefOr[String] = js.native
  /**
    * The email address to which the invitation is sent. Email addresses should
    * be unique among all client users under each sponsor buyer.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The unique numerical ID of the invitation that is sent to the user. The
    * value of this field is ignored in create operations.
    */
  var invitationId: js.UndefOr[String] = js.native
}

object SchemaClientUserInvitation {
  @scala.inline
  def apply(): SchemaClientUserInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientUserInvitation]
  }
  @scala.inline
  implicit class SchemaClientUserInvitationOps[Self <: SchemaClientUserInvitation] (val x: Self) extends AnyVal {
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
    def setClientAccountId(value: String): Self = this.set("clientAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientAccountId: Self = this.set("clientAccountId", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setInvitationId(value: String): Self = this.set("invitationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitationId: Self = this.set("invitationId", js.undefined)
  }
  
}

