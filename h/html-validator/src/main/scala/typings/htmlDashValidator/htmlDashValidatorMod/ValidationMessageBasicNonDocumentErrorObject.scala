package typings.htmlDashValidator.htmlDashValidatorMod

import typings.htmlDashValidator.htmlDashValidatorStrings.`non-document-error`
import typings.htmlDashValidator.htmlDashValidatorStrings.internal
import typings.htmlDashValidator.htmlDashValidatorStrings.io
import typings.htmlDashValidator.htmlDashValidatorStrings.schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationMessageBasicNonDocumentErrorObject extends js.Object {
  var subType: js.UndefOr[internal | io | schema] = js.undefined
  var `type`: `non-document-error`
}

object ValidationMessageBasicNonDocumentErrorObject {
  @scala.inline
  def apply(`type`: `non-document-error`, subType: internal | io | schema = null): ValidationMessageBasicNonDocumentErrorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (subType != null) __obj.updateDynamic("subType")(subType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicNonDocumentErrorObject]
  }
}

