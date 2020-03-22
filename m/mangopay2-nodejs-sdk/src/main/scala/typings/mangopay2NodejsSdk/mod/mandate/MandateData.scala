package typings.mangopay2NodejsSdk.mod.mandate

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MandateData extends EntityBaseData {
  /**
    * An ID of a Bank Account
    */
  var BankAccountId: String
  /**
    * The banking reference for this mandate
    */
  var BankReference: String
  /**
    * The language to use for the mandate confirmation page - needs to be the ISO code of the language
    */
  var Culture: MandateCultureCode
  /**
    * The URL to download the mandate
    */
  var DocumentURL: String
  /**
    * The execution type for creating the mandate
    */
  var ExecutionType: MandateExecutionType
  /**
    * The type of Mandate
    */
  var MandateType: typings.mangopay2NodejsSdk.mod.mandate.MandateType
  /**
    * The URL to redirect to user to for them to proceed with the payment
    */
  var RedirectURL: String
  /**
    * The result code
    */
  var ResultCode: String
  /**
    * A verbal explanation of the ResultCode
    */
  var ResultMessage: String
  /**
    * The URL to redirect to after payment (whether successful or not)
    */
  var ReturnURL: String
  /**
    * The type of mandate, but will only be completed once the mandate has been submitted
    */
  var Scheme: MandateScheme
  /**
    * The status of the mandate:
    */
  var Status: MandateStatus
  /**
    * The object owner's UserId
    */
  var UserId: String
}

object MandateData {
  @scala.inline
  def apply(
    BankAccountId: String,
    BankReference: String,
    CreationDate: Double,
    Culture: MandateCultureCode,
    DocumentURL: String,
    ExecutionType: MandateExecutionType,
    Id: String,
    MandateType: MandateType,
    RedirectURL: String,
    ResultCode: String,
    ResultMessage: String,
    ReturnURL: String,
    Scheme: MandateScheme,
    Status: MandateStatus,
    Tag: String,
    UserId: String
  ): MandateData = {
    val __obj = js.Dynamic.literal(BankAccountId = BankAccountId.asInstanceOf[js.Any], BankReference = BankReference.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DocumentURL = DocumentURL.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MandateType = MandateType.asInstanceOf[js.Any], RedirectURL = RedirectURL.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any], Scheme = Scheme.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MandateData]
  }
}

