package typings.keystonejsKeystone.mod

import typings.keystonejsFields.mod.FieldType
import typings.keystonejsKeystone.keystonejsKeystoneStrings.lower
import typings.keystonejsKeystone.keystonejsKeystoneStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ @js.native
trait UuidOptions extends BaseFieldOptions {
  // do we have other possible values here ?
  var caseTo: upper | lower = js.native
}

object UuidOptions {
  @scala.inline
  def apply(caseTo: upper | lower, `type`: FieldType): UuidOptions = {
    val __obj = js.Dynamic.literal(caseTo = caseTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UuidOptions]
  }
  @scala.inline
  implicit class UuidOptionsOps[Self <: UuidOptions] (val x: Self) extends AnyVal {
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
    def setCaseTo(value: upper | lower): Self = this.set("caseTo", value.asInstanceOf[js.Any])
  }
  
}

