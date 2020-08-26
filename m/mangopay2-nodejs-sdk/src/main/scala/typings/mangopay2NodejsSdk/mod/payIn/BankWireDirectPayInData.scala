package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BankWireDirectPayInData
  extends BasePayInData
     with PayInData {
  /**
    * Bank account details
    */
  var BankAccount: BankAccountData = js.native
  /**
    * The declared debited funds
    */
  var DeclaredDebitedFunds: MoneyData = js.native
  /**
    * The declared fees
    */
  var DeclaredFees: MoneyData = js.native
  @JSName("ExecutionType")
  var ExecutionType_BankWireDirectPayInData: DIRECT = js.native
  @JSName("PaymentType")
  var PaymentType_BankWireDirectPayInData: BANK_WIRE = js.native
  /**
    * Wire reference
    */
  var WireReference: String = js.native
}

object BankWireDirectPayInData {
  @scala.inline
  def apply(
    AuthorId: String,
    BankAccount: BankAccountData,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    DeclaredDebitedFunds: MoneyData,
    DeclaredFees: MoneyData,
    ExecutionDate: Timestamp,
    ExecutionType: DIRECT,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    PaymentType: BANK_WIRE,
    ResultCode: String,
    ResultMessage: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType,
    WireReference: String
  ): BankWireDirectPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccount = BankAccount.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], DeclaredDebitedFunds = DeclaredDebitedFunds.asInstanceOf[js.Any], DeclaredFees = DeclaredFees.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WireReference = WireReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankWireDirectPayInData]
  }
  @scala.inline
  implicit class BankWireDirectPayInDataOps[Self <: BankWireDirectPayInData] (val x: Self) extends AnyVal {
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
    def setBankAccount(value: BankAccountData): Self = this.set("BankAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclaredDebitedFunds(value: MoneyData): Self = this.set("DeclaredDebitedFunds", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclaredFees(value: MoneyData): Self = this.set("DeclaredFees", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionType(value: DIRECT): Self = this.set("ExecutionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentType(value: BANK_WIRE): Self = this.set("PaymentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setWireReference(value: String): Self = this.set("WireReference", value.asInstanceOf[js.Any])
  }
  
}

