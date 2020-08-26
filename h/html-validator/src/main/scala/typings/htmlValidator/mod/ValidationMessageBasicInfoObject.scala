package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.info
import typings.htmlValidator.htmlValidatorStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationMessageBasicInfoObject extends js.Object {
  var subType: js.UndefOr[warning] = js.native
  var `type`: info = js.native
}

object ValidationMessageBasicInfoObject {
  @scala.inline
  def apply(`type`: info): ValidationMessageBasicInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicInfoObject]
  }
  @scala.inline
  implicit class ValidationMessageBasicInfoObjectOps[Self <: ValidationMessageBasicInfoObject] (val x: Self) extends AnyVal {
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
    def setType(value: info): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubType(value: warning): Self = this.set("subType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubType: Self = this.set("subType", js.undefined)
  }
  
}

