package typings.keystonejsKeystone.mod

import typings.keystonejsFields.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ @js.native
trait PasswordOptions extends BaseFieldOptions {
  var minLength: Double = js.native
  var rejectCommon: Boolean = js.native
  var workFactor: Double = js.native
}

object PasswordOptions {
  @scala.inline
  def apply(minLength: Double, rejectCommon: Boolean, `type`: FieldType, workFactor: Double): PasswordOptions = {
    val __obj = js.Dynamic.literal(minLength = minLength.asInstanceOf[js.Any], rejectCommon = rejectCommon.asInstanceOf[js.Any], workFactor = workFactor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordOptions]
  }
  @scala.inline
  implicit class PasswordOptionsOps[Self <: PasswordOptions] (val x: Self) extends AnyVal {
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
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setRejectCommon(value: Boolean): Self = this.set("rejectCommon", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkFactor(value: Double): Self = this.set("workFactor", value.asInstanceOf[js.Any])
  }
  
}

