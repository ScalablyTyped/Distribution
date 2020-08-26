package typings.mangopay2NodejsSdk.mod.cardPreAuthorization

import typings.mangopay2NodejsSdk.mod.BillingData
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.SecureMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardPreAuthorization.CardPreAuthorizationData, 'Tag' | 'Billing' | 'SecureMode', 'AuthorId' | 'DebitedFunds' | 'CardId' | 'SecureModeReturnURL'> */
@js.native
trait CreateCardPreAuthorization extends js.Object {
  var AuthorId: String = js.native
  var Billing: js.UndefOr[BillingData] = js.native
  var CardId: String = js.native
  var DebitedFunds: MoneyData = js.native
  var SecureMode: js.UndefOr[typings.mangopay2NodejsSdk.mod.SecureMode] = js.native
  var SecureModeReturnURL: String = js.native
  var Tag: js.UndefOr[String] = js.native
}

object CreateCardPreAuthorization {
  @scala.inline
  def apply(AuthorId: String, CardId: String, DebitedFunds: MoneyData, SecureModeReturnURL: String): CreateCardPreAuthorization = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardPreAuthorization]
  }
  @scala.inline
  implicit class CreateCardPreAuthorizationOps[Self <: CreateCardPreAuthorization] (val x: Self) extends AnyVal {
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
    def setAuthorId(value: String): Self = this.set("AuthorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardId(value: String): Self = this.set("CardId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebitedFunds(value: MoneyData): Self = this.set("DebitedFunds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecureModeReturnURL(value: String): Self = this.set("SecureModeReturnURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setBilling(value: BillingData): Self = this.set("Billing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling: Self = this.set("Billing", js.undefined)
    @scala.inline
    def setSecureMode(value: SecureMode): Self = this.set("SecureMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureMode: Self = this.set("SecureMode", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

