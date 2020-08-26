package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Add a list of accounts to a hold.
  */
@js.native
trait SchemaAddHeldAccountsRequest extends js.Object {
  /**
    * Account ids to identify which accounts to add. Only account_ids or only
    * emails should be specified, but not both.
    */
  var accountIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Emails to identify which accounts to add. Only emails or only account_ids
    * should be specified, but not both.
    */
  var emails: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAddHeldAccountsRequest {
  @scala.inline
  def apply(): SchemaAddHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddHeldAccountsRequest]
  }
  @scala.inline
  implicit class SchemaAddHeldAccountsRequestOps[Self <: SchemaAddHeldAccountsRequest] (val x: Self) extends AnyVal {
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
    def setAccountIdsVarargs(value: String*): Self = this.set("accountIds", js.Array(value :_*))
    @scala.inline
    def setAccountIds(value: js.Array[String]): Self = this.set("accountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountIds: Self = this.set("accountIds", js.undefined)
    @scala.inline
    def setEmailsVarargs(value: String*): Self = this.set("emails", js.Array(value :_*))
    @scala.inline
    def setEmails(value: js.Array[String]): Self = this.set("emails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmails: Self = this.set("emails", js.undefined)
  }
  
}

