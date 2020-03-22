package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.uboDeclaration.UboDeclarationData> */
trait PartialUboDeclarationData extends js.Object {
  var CreationDate: js.UndefOr[Double] = js.undefined
  var DeclaredUBOs: js.UndefOr[js.Array[String]] = js.undefined
  var Id: js.UndefOr[String] = js.undefined
  var RefusedReasonMessage: js.UndefOr[String] = js.undefined
  var RefusedReasonTypes: js.UndefOr[js.Array[String]] = js.undefined
  var Status: js.UndefOr[DocumentStatus] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
  var UserId: js.UndefOr[String] = js.undefined
}

object PartialUboDeclarationData {
  @scala.inline
  def apply(
    CreationDate: Int | Double = null,
    DeclaredUBOs: js.Array[String] = null,
    Id: String = null,
    RefusedReasonMessage: String = null,
    RefusedReasonTypes: js.Array[String] = null,
    Status: DocumentStatus = null,
    Tag: String = null,
    UserId: String = null
  ): PartialUboDeclarationData = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (DeclaredUBOs != null) __obj.updateDynamic("DeclaredUBOs")(DeclaredUBOs.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (RefusedReasonMessage != null) __obj.updateDynamic("RefusedReasonMessage")(RefusedReasonMessage.asInstanceOf[js.Any])
    if (RefusedReasonTypes != null) __obj.updateDynamic("RefusedReasonTypes")(RefusedReasonTypes.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialUboDeclarationData]
  }
}

