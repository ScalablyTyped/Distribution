package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mod.mandate.MandateCultureCode
import typings.mangopay2NodejsSdk.mod.mandate.MandateExecutionType
import typings.mangopay2NodejsSdk.mod.mandate.MandateScheme
import typings.mangopay2NodejsSdk.mod.mandate.MandateStatus
import typings.mangopay2NodejsSdk.mod.mandate.MandateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.mandate.MandateData> */
trait PartialMandateData extends js.Object {
  var BankAccountId: js.UndefOr[String] = js.undefined
  var BankReference: js.UndefOr[String] = js.undefined
  var CreationDate: js.UndefOr[Double] = js.undefined
  var Culture: js.UndefOr[MandateCultureCode] = js.undefined
  var DocumentURL: js.UndefOr[String] = js.undefined
  var ExecutionType: js.UndefOr[MandateExecutionType] = js.undefined
  var Id: js.UndefOr[String] = js.undefined
  var MandateType: js.UndefOr[typings.mangopay2NodejsSdk.mod.mandate.MandateType] = js.undefined
  var RedirectURL: js.UndefOr[String] = js.undefined
  var ResultCode: js.UndefOr[String] = js.undefined
  var ResultMessage: js.UndefOr[String] = js.undefined
  var ReturnURL: js.UndefOr[String] = js.undefined
  var Scheme: js.UndefOr[MandateScheme] = js.undefined
  var Status: js.UndefOr[MandateStatus] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
  var UserId: js.UndefOr[String] = js.undefined
}

object PartialMandateData {
  @scala.inline
  def apply(
    BankAccountId: String = null,
    BankReference: String = null,
    CreationDate: Int | Double = null,
    Culture: MandateCultureCode = null,
    DocumentURL: String = null,
    ExecutionType: MandateExecutionType = null,
    Id: String = null,
    MandateType: MandateType = null,
    RedirectURL: String = null,
    ResultCode: String = null,
    ResultMessage: String = null,
    ReturnURL: String = null,
    Scheme: MandateScheme = null,
    Status: MandateStatus = null,
    Tag: String = null,
    UserId: String = null
  ): PartialMandateData = {
    val __obj = js.Dynamic.literal()
    if (BankAccountId != null) __obj.updateDynamic("BankAccountId")(BankAccountId.asInstanceOf[js.Any])
    if (BankReference != null) __obj.updateDynamic("BankReference")(BankReference.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Culture != null) __obj.updateDynamic("Culture")(Culture.asInstanceOf[js.Any])
    if (DocumentURL != null) __obj.updateDynamic("DocumentURL")(DocumentURL.asInstanceOf[js.Any])
    if (ExecutionType != null) __obj.updateDynamic("ExecutionType")(ExecutionType.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (MandateType != null) __obj.updateDynamic("MandateType")(MandateType.asInstanceOf[js.Any])
    if (RedirectURL != null) __obj.updateDynamic("RedirectURL")(RedirectURL.asInstanceOf[js.Any])
    if (ResultCode != null) __obj.updateDynamic("ResultCode")(ResultCode.asInstanceOf[js.Any])
    if (ResultMessage != null) __obj.updateDynamic("ResultMessage")(ResultMessage.asInstanceOf[js.Any])
    if (ReturnURL != null) __obj.updateDynamic("ReturnURL")(ReturnURL.asInstanceOf[js.Any])
    if (Scheme != null) __obj.updateDynamic("Scheme")(Scheme.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMandateData]
  }
}

