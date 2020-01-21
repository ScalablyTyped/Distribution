package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.error
import typings.htmlValidator.htmlValidatorStrings.fatal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationMessageBasicErrorObject extends js.Object {
  var subType: js.UndefOr[fatal] = js.undefined
  var `type`: error
}

object ValidationMessageBasicErrorObject {
  @scala.inline
  def apply(`type`: error, subType: fatal = null): ValidationMessageBasicErrorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (subType != null) __obj.updateDynamic("subType")(subType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicErrorObject]
  }
}

