package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.payIn.BankWireDirectPayInData, 'Tag', 'AuthorId' | 'CreditedUserId' | 'CreditedWalletId' | 'DeclaredDebitedFunds' | 'DeclaredFees'> */
@js.native
trait CreateBankWireDirectPayIn extends js.Object {
  var AuthorId: String = js.native
  var CreditedUserId: String = js.native
  var CreditedWalletId: String = js.native
  var DeclaredDebitedFunds: MoneyData = js.native
  var DeclaredFees: MoneyData = js.native
  var ExecutionType: DIRECT = js.native
  var PaymentType: BANK_WIRE = js.native
  var Tag: js.UndefOr[String] = js.native
}

object CreateBankWireDirectPayIn {
  @scala.inline
  def apply(
    AuthorId: String,
    CreditedUserId: String,
    CreditedWalletId: String,
    DeclaredDebitedFunds: MoneyData,
    DeclaredFees: MoneyData,
    ExecutionType: DIRECT,
    PaymentType: BANK_WIRE
  ): CreateBankWireDirectPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DeclaredDebitedFunds = DeclaredDebitedFunds.asInstanceOf[js.Any], DeclaredFees = DeclaredFees.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBankWireDirectPayIn]
  }
  @scala.inline
  implicit class CreateBankWireDirectPayInOps[Self <: CreateBankWireDirectPayIn] (val x: Self) extends AnyVal {
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
    def setCreditedUserId(value: String): Self = this.set("CreditedUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreditedWalletId(value: String): Self = this.set("CreditedWalletId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclaredDebitedFunds(value: MoneyData): Self = this.set("DeclaredDebitedFunds", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclaredFees(value: MoneyData): Self = this.set("DeclaredFees", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionType(value: DIRECT): Self = this.set("ExecutionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentType(value: BANK_WIRE): Self = this.set("PaymentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

