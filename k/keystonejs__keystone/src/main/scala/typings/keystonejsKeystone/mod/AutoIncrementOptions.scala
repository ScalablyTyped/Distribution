package typings.keystonejsKeystone.mod

import typings.keystonejsFields.mod.FieldType
import typings.keystonejsKeystone.keystonejsKeystoneStrings.ID
import typings.keystonejsKeystone.keystonejsKeystoneStrings.Int
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ @js.native
trait AutoIncrementOptions extends BaseFieldOptions {
  var gqlType: js.UndefOr[Int | ID] = js.native
}

object AutoIncrementOptions {
  @scala.inline
  def apply(`type`: FieldType): AutoIncrementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoIncrementOptions]
  }
  @scala.inline
  implicit class AutoIncrementOptionsOps[Self <: AutoIncrementOptions] (val x: Self) extends AnyVal {
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
    def setGqlType(value: Int | ID): Self = this.set("gqlType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGqlType: Self = this.set("gqlType", js.undefined)
  }
  
}

