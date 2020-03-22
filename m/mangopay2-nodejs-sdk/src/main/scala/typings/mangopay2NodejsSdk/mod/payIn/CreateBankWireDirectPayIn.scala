package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.payIn.BankWireDirectPayInData, 'Tag', 'AuthorId' | 'CreditedUserId' | 'CreditedWalletId' | 'DeclaredDebitedFunds' | 'DeclaredFees'> */
trait CreateBankWireDirectPayIn extends js.Object {
  var AuthorId: String
  var CreditedUserId: String
  var CreditedWalletId: String
  var DeclaredDebitedFunds: MoneyData
  var DeclaredFees: MoneyData
  var ExecutionType: DIRECT
  var PaymentType: BANK_WIRE
  var Tag: js.UndefOr[String] = js.undefined
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
    PaymentType: BANK_WIRE,
    Tag: String = null
  ): CreateBankWireDirectPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DeclaredDebitedFunds = DeclaredDebitedFunds.asInstanceOf[js.Any], DeclaredFees = DeclaredFees.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBankWireDirectPayIn]
  }
}

