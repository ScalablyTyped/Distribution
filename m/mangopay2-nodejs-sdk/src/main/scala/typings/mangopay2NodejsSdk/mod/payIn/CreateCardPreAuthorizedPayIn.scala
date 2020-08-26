package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED
import typings.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCardPreAuthorizedPayIn extends js.Object {
  /**
    * A user's ID
    */
  var AuthorId: String = js.native
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: js.UndefOr[String] = js.native
  /**
    * The ID of the wallet where money will be credited
    */
  var CreditedWalletId: String = js.native
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData = js.native
  var ExecutionType: DIRECT = js.native
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData = js.native
  var PaymentType: PREAUTHORIZED = js.native
  /**
    * The ID of the Preauthorization object
    */
  var PreauthorizationId: String = js.native
  /**
    * Custom data that you can add to this item
    */
  var Tag: js.UndefOr[String] = js.native
}

object CreateCardPreAuthorizedPayIn {
  @scala.inline
  def apply(
    AuthorId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    ExecutionType: DIRECT,
    Fees: MoneyData,
    PaymentType: PREAUTHORIZED,
    PreauthorizationId: String
  ): CreateCardPreAuthorizedPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], PreauthorizationId = PreauthorizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardPreAuthorizedPayIn]
  }
  @scala.inline
  implicit class CreateCardPreAuthorizedPayInOps[Self <: CreateCardPreAuthorizedPayIn] (val x: Self) extends AnyVal {
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
    def setCreditedWalletId(value: String): Self = this.set("CreditedWalletId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebitedFunds(value: MoneyData): Self = this.set("DebitedFunds", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionType(value: DIRECT): Self = this.set("ExecutionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFees(value: MoneyData): Self = this.set("Fees", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentType(value: PREAUTHORIZED): Self = this.set("PaymentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreauthorizationId(value: String): Self = this.set("PreauthorizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreditedUserId(value: String): Self = this.set("CreditedUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditedUserId: Self = this.set("CreditedUserId", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

