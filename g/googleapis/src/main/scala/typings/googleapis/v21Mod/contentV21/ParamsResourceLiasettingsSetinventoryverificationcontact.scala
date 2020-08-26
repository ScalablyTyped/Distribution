package typings.googleapis.v21Mod.contentV21

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceLiasettingsSetinventoryverificationcontact extends StandardParameters {
  /**
    * The ID of the account that manages the order. This cannot be a
    * multi-client account.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The email of the inventory verification contact.
    */
  var contactEmail: js.UndefOr[String] = js.native
  /**
    * The name of the inventory verification contact.
    */
  var contactName: js.UndefOr[String] = js.native
  /**
    * The country for which inventory verification is requested.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The language for which inventory verification is requested.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The ID of the managing account. If this parameter is not the same as
    * accountId, then this account must be a multi-client account and accountId
    * must be the ID of a sub-account of this account.
    */
  var merchantId: js.UndefOr[String] = js.native
}

object ParamsResourceLiasettingsSetinventoryverificationcontact {
  @scala.inline
  def apply(): ParamsResourceLiasettingsSetinventoryverificationcontact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLiasettingsSetinventoryverificationcontact]
  }
  @scala.inline
  implicit class ParamsResourceLiasettingsSetinventoryverificationcontactOps[Self <: ParamsResourceLiasettingsSetinventoryverificationcontact] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setContactEmail(value: String): Self = this.set("contactEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactEmail: Self = this.set("contactEmail", js.undefined)
    @scala.inline
    def setContactName(value: String): Self = this.set("contactName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactName: Self = this.set("contactName", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
  }
  
}

