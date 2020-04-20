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

trait CardPreAuthorizationData extends EntityBaseData {
  /**
    * A user's ID
    */
  var AuthorId: String
  /**
    * Contains useful information related to the user billing
    */
  var Billing: BillingData
  /**
    * The ID of a card
    */
  var CardId: String
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData
  /**
    * How the PreAuthorization has been executed
    */
  var ExecutionType: PreAuthorizationExecutionType
  /**
    * The date when the payment is to be processed by
    */
  var ExpirationDate: Timestamp
  /**
    * The Id of the associated PayIn
    */
  var PayInId: String
  /**
    * The status of the payment after the PreAuthorization. You can pass the PaymentStatus from "WAITING" to "CANCELED" should you need/want to
    */
  var PaymentStatus: typings.mangopay2NodejsSdk.mod.PaymentStatus
  /**
    * The result code
    */
  var ResultCode: String
  /**
    * A verbal explanation of the ResultCode
    */
  var ResultMessage: String
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually.
    * The field lets you activate it automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ),
    * "FORCE" (if you wish to specifically force the secured mode).
    */
  var SecureMode: typings.mangopay2NodejsSdk.mod.SecureMode
  /**
    * The value is 'true' if the SecureMode was used
    */
  var SecureModeNeeded: Boolean
  /**
    * This is the URL where to redirect users to proceed to 3D secure validation
    */
  var SecureModeRedirectURL: String
  /**
    * This is the URL where users are automatically redirected after 3D secure validation (if activated)
    */
  var SecureModeReturnURL: String
  /**
    * Contains useful information related to security and fraud
    */
  var SecurityInfo: SecurityInfoData
  /**
    * Status of the PreAuthorization
    */
  var Status: PreAuthorizationStatus
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
}

