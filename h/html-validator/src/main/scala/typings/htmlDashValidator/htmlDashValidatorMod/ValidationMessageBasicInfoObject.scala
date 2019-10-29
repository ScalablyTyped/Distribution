package typings.htmlDashValidator.htmlDashValidatorMod

import typings.htmlDashValidator.htmlDashValidatorStrings.info
import typings.htmlDashValidator.htmlDashValidatorStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationMessageBasicInfoObject extends js.Object {
  var subType: js.UndefOr[warning] = js.undefined
  var `type`: info
}

object ValidationMessageBasicInfoObject {
  @scala.inline
  def apply(`type`: info, subType: warning = null): ValidationMessageBasicInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (subType != null) __obj.updateDynamic("subType")(subType)
    __obj.asInstanceOf[ValidationMessageBasicInfoObject]
  }
}

