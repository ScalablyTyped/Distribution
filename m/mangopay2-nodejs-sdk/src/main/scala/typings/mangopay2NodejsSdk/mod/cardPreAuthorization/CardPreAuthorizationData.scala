package typings.mangopay2NodejsSdk.mod.cardPreAuthorization

import typings.mangopay2NodejsSdk.mod.BillingData
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.PaymentStatus
import typings.mangopay2NodejsSdk.mod.PreAuthorizationExecutionType
import typings.mangopay2NodejsSdk.mod.PreAuthorizationStatus
import typings.mangopay2NodejsSdk.mod.SecureMode
import typings.mangopay2NodejsSdk.mod.SecurityInfoData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardPreAuthorizationData extends EntityBaseData {
  /**
    * A user's ID
    */
  var AuthorId: String = js.native
  /**
    * Contains useful information related to the user billing
    */
  var Billing: BillingData = js.native
  /**
    * The ID of a card
    */
  var CardId: String = js.native
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData = js.native
  /**
    * How the PreAuthorization has been executed
    */
  var ExecutionType: PreAuthorizationExecutionType = js.native
  /**
    * The date when the payment is to be processed by
    */
  var ExpirationDate: Timestamp = js.native
  /**
    * The Id of the associated PayIn
    */
  var PayInId: String = js.native
  /**
    * The status of the payment after the PreAuthorization. You can pass the PaymentStatus from "WAITING" to "CANCELED" should you need/want to
    */
  var PaymentStatus: typings.mangopay2NodejsSdk.mod.PaymentStatus = js.native
  /**
    * The result code
    */
  var ResultCode: String = js.native
  /**
    * A verbal explanation of the ResultCode
    */
  var ResultMessage: String = js.native
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually.
    * The field lets you activate it automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ),
    * "FORCE" (if you wish to specifically force the secured mode).
    */
  var SecureMode: typings.mangopay2NodejsSdk.mod.SecureMode = js.native
  /**
    * The value is 'true' if the SecureMode was used
    */
  var SecureModeNeeded: Boolean = js.native
  /**
    * This is the URL where to redirect users to proceed to 3D secure validation
    */
  var SecureModeRedirectURL: String = js.native
  /**
    * This is the URL where users are automatically redirected after 3D secure validation (if activated)
    */
  var SecureModeReturnURL: String = js.native
  /**
    * Contains useful information related to security and fraud
    */
  var SecurityInfo: SecurityInfoData = js.native
  /**
    * Status of the PreAuthorization
    */
  var Status: PreAuthorizationStatus = js.native
}

object CardPreAuthorizationData {
  @scala.inline
  def apply(
    AuthorId: String,
    Billing: BillingData,
    CardId: String,
    CreationDate: Double,
    DebitedFunds: MoneyData,
    ExecutionType: PreAuthorizationExecutionType,
    ExpirationDate: Timestamp,
    Id: String,
    PayInId: String,
    PaymentStatus: PaymentStatus,
    ResultCode: String,
    ResultMessage: String,
    SecureMode: SecureMode,
    SecureModeNeeded: Boolean,
    SecureModeRedirectURL: String,
    SecureModeReturnURL: String,
    SecurityInfo: SecurityInfoData,
    Status: PreAuthorizationStatus,
    Tag: String
  ): CardPreAuthorizationData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], Billing = Billing.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], PayInId = PayInId.asInstanceOf[js.Any], PaymentStatus = PaymentStatus.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], SecureModeNeeded = SecureModeNeeded.asInstanceOf[js.Any], SecureModeRedirectURL = SecureModeRedirectURL.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any], SecurityInfo = SecurityInfo.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardPreAuthorizationData]
  }
  @scala.inline
  implicit class CardPreAuthorizationDataOps[Self <: CardPreAuthorizationData] (val x: Self) extends AnyVal {
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
    def setBilling(value: BillingData): Self = this.set("Billing", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardId(value: String): Self = this.set("CardId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebitedFunds(value: MoneyData): Self = this.set("DebitedFunds", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionType(value: PreAuthorizationExecutionType): Self = this.set("ExecutionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationDate(value: Timestamp): Self = this.set("ExpirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayInId(value: String): Self = this.set("PayInId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentStatus(value: PaymentStatus): Self = this.set("PaymentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultCode(value: String): Self = this.set("ResultCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultMessage(value: String): Self = this.set("ResultMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecureMode(value: SecureMode): Self = this.set("SecureMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecureModeNeeded(value: Boolean): Self = this.set("SecureModeNeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecureModeRedirectURL(value: String): Self = this.set("SecureModeRedirectURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecureModeReturnURL(value: String): Self = this.set("SecureModeReturnURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityInfo(value: SecurityInfoData): Self = this.set("SecurityInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PreAuthorizationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

