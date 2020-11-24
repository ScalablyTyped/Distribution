package typings.mangopay2NodejsSdk.mod.PayOut

import typings.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePayOut extends js.Object {
  
  /**
    * A user's ID
    */
  var AuthorId: String = js.native
  
  /**
    * An ID of a Bank Account
    */
  var BankAccountId: String = js.native
  
  /**
    * A custom reference you wish to appear on the user’s bank statement (your Client Name is already shown). This reference can contain max 12 characters
    */
  var BankWireRef: js.UndefOr[String] = js.native
  
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData = js.native
  
  /**
    * The ID of the wallet that was debited
    */
  var DebitedWalletId: String = js.native
  
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData = js.native
  
  var Tag: js.UndefOr[String] = js.native
}
object CreatePayOut {
  
  @scala.inline
  def apply(
    AuthorId: String,
    BankAccountId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    Fees: MoneyData
  ): CreatePayOut = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccountId = BankAccountId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayOut]
  }
  
  @scala.inline
  implicit class CreatePayOutOps[Self <: CreatePayOut] (val x: Self) extends AnyVal {
    
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
    def setBankAccountId(value: String): Self = this.set("BankAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebitedFunds(value: MoneyData): Self = this.set("DebitedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebitedWalletId(value: String): Self = this.set("DebitedWalletId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFees(value: MoneyData): Self = this.set("Fees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBankWireRef(value: String): Self = this.set("BankWireRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBankWireRef: Self = this.set("BankWireRef", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
}
