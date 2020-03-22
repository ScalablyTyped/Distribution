package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.BillingData
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.PreAuthorizationExecutionType
import typings.mangopay2NodejsSdk.mod.PreAuthorizationStatus
import typings.mangopay2NodejsSdk.mod.SecurityInfoData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.cardPreAuthorization.CardPreAuthorizationData
import typings.mangopay2NodejsSdk.mod.cardPreAuthorization.UpdateCardPreAuthorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.CardPreAuthorization")
@js.native
class CardPreAuthorization protected () extends CardPreAuthorizationData {
  def this(data: CardPreAuthorizationData) = this()
  def this(data: UpdateCardPreAuthorization) = this()
  /**
    * A user's ID
    */
  /* CompleteClass */
  override var AuthorId: String = js.native
  /**
    * Contains useful information related to the user billing
    */
  /* CompleteClass */
  override var Billing: BillingData = js.native
  /**
    * The ID of a card
    */
  /* CompleteClass */
  override var CardId: String = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * Information about the funds that are being debited
    */
  /* CompleteClass */
  override var DebitedFunds: MoneyData = js.native
  /**
    * How the PreAuthorization has been executed
    */
  /* CompleteClass */
  override var ExecutionType: PreAuthorizationExecutionType = js.native
  /**
    * The date when the payment is to be processed by
    */
  /* CompleteClass */
  override var ExpirationDate: Timestamp = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * The Id of the associated PayIn
    */
  /* CompleteClass */
  override var PayInId: String = js.native
  /**
    * The status of the payment after the PreAuthorization. You can pass the PaymentStatus from "WAITING" to "CANCELED" should you need/want to
    */
  /* CompleteClass */
  override var PaymentStatus: typings.mangopay2NodejsSdk.mod.PaymentStatus = js.native
  /**
    * The result code
    */
  /* CompleteClass */
  override var ResultCode: String = js.native
  /**
    * A verbal explanation of the ResultCode
    */
  /* CompleteClass */
  override var ResultMessage: String = js.native
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually.
    * The field lets you activate it automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ),
    * "FORCE" (if you wish to specifically force the secured mode).
    */
  /* CompleteClass */
  override var SecureMode: typings.mangopay2NodejsSdk.mod.SecureMode = js.native
  /**
    * The value is 'true' if the SecureMode was used
    */
  /* CompleteClass */
  override var SecureModeNeeded: Boolean = js.native
  /**
    * This is the URL where to redirect users to proceed to 3D secure validation
    */
  /* CompleteClass */
  override var SecureModeRedirectURL: String = js.native
  /**
    * This is the URL where users are automatically redirected after 3D secure validation (if activated)
    */
  /* CompleteClass */
  override var SecureModeReturnURL: String = js.native
  /**
    * Contains useful information related to security and fraud
    */
  /* CompleteClass */
  override var SecurityInfo: SecurityInfoData = js.native
  /**
    * Status of the PreAuthorization
    */
  /* CompleteClass */
  override var Status: PreAuthorizationStatus = js.native
  /* CompleteClass */
  override var Tag: String = js.native
}

