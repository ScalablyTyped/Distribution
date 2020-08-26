package typings.keystonejsKeystone.mod

import typings.keystonejsFields.mod.FieldType
import typings.keystonejsKeystone.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ @js.native
trait SelectOptions extends BaseFieldOptions {
  // TODO: use a named type
  var options: String | (js.Array[Label | String]) = js.native
}

object SelectOptions {
  @scala.inline
  def apply(options: String | (js.Array[Label | String]), `type`: FieldType): SelectOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOptions]
  }
  @scala.inline
  implicit class SelectOptionsOps[Self <: SelectOptions] (val x: Self) extends AnyVal {
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
    def setOptionsVarargs(value: (Label | String)*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: String | (js.Array[Label | String])): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

