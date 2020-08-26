package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardPreAuthorizedPayInData
  extends BasePayInData
     with PayInData {
  @JSName("ExecutionType")
  var ExecutionType_CardPreAuthorizedPayInData: DIRECT = js.native
  @JSName("PaymentType")
  var PaymentType_CardPreAuthorizedPayInData: PREAUTHORIZED = js.native
  var PreauthorizationId: String = js.native
}

object CardPreAuthorizedPayInData {
  @scala.inline
  def apply(
    AuthorId: String,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    ExecutionDate: Timestamp,
    ExecutionType: DIRECT,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    PaymentType: PREAUTHORIZED,
    PreauthorizationId: String,
    ResultCode: String,
    ResultMessage: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType
  ): CardPreAuthorizedPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], PreauthorizationId = PreauthorizationId.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardPreAuthorizedPayInData]
  }
  @scala.inline
  implicit class CardPreAuthorizedPayInDataOps[Self <: CardPreAuthorizedPayInData] (val x: Self) extends AnyVal {
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
    def setExecutionType(value: DIRECT): Self = this.set("ExecutionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentType(value: PREAUTHORIZED): Self = this.set("PaymentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreauthorizationId(value: String): Self = this.set("PreauthorizationId", value.asInstanceOf[js.Any])
  }
  
}

