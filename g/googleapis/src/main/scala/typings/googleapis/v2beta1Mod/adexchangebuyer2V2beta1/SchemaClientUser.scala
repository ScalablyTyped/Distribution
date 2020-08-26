package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client user is created under a client buyer and has restricted access to
  * the Marketplace and certain other sections of the Authorized Buyers UI
  * based on the role granted to the associated client buyer.  The only way a
  * new client user can be created is via accepting an email invitation (see
  * the accounts.clients.invitations.create method).  All fields are required
  * unless otherwise specified.
  */
@js.native
trait SchemaClientUser extends js.Object {
  /**
    * Numerical account ID of the client buyer with which the user is
    * associated; the buyer must be a client of the current sponsor buyer. The
    * value of this field is ignored in an update operation.
    */
  var clientAccountId: js.UndefOr[String] = js.native
  /**
    * User&#39;s email address. The value of this field is ignored in an update
    * operation.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The status of the client user.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The unique numerical ID of the client user that has accepted an
    * invitation. The value of this field is ignored in an update operation.
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaClientUser {
  @scala.inline
  def apply(): SchemaClientUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientUser]
  }
  @scala.inline
  implicit class SchemaClientUserOps[Self <: SchemaClientUser] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

