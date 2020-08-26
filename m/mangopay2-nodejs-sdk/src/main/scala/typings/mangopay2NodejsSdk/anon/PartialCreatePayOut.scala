package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.PayOut.CreatePayOut> */
@js.native
trait PartialCreatePayOut extends js.Object {
  var AuthorId: js.UndefOr[String] = js.native
  var BankAccountId: js.UndefOr[String] = js.native
  var BankWireRef: js.UndefOr[String] = js.native
  var DebitedFunds: js.UndefOr[MoneyData] = js.native
  var DebitedWalletId: js.UndefOr[String] = js.native
  var Fees: js.UndefOr[MoneyData] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object PartialCreatePayOut {
  @scala.inline
  def apply(): PartialCreatePayOut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreatePayOut]
  }
  @scala.inline
  implicit class PartialCreatePayOutOps[Self <: PartialCreatePayOut] (val x: Self) extends AnyVal {
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
    def deleteAuthorId: Self = this.set("AuthorId", js.undefined)
    @scala.inline
    def setBankAccountId(value: String): Self = this.set("BankAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBankAccountId: Self = this.set("BankAccountId", js.undefined)
    @scala.inline
    def setBankWireRef(value: String): Self = this.set("BankWireRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBankWireRef: Self = this.set("BankWireRef", js.undefined)
    @scala.inline
    def setDebitedFunds(value: MoneyData): Self = this.set("DebitedFunds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebitedFunds: Self = this.set("DebitedFunds", js.undefined)
    @scala.inline
    def setDebitedWalletId(value: String): Self = this.set("DebitedWalletId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebitedWalletId: Self = this.set("DebitedWalletId", js.undefined)
    @scala.inline
    def setFees(value: MoneyData): Self = this.set("Fees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFees: Self = this.set("Fees", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

