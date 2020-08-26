package typings.keystonejsKeystone.mod

import typings.keystonejsFields.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ @js.native
trait ContentOptions extends BaseFieldOptions {
  var blocks: js.Array[_] = js.native
}

object ContentOptions {
  @scala.inline
  def apply(blocks: js.Array[_], `type`: FieldType): ContentOptions = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOptions]
  }
  @scala.inline
  implicit class ContentOptionsOps[Self <: ContentOptions] (val x: Self) extends AnyVal {
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
    def setBlocksVarargs(value: js.Any*): Self = this.set("blocks", js.Array(value :_*))
    @scala.inline
    def setBlocks(value: js.Array[_]): Self = this.set("blocks", value.asInstanceOf[js.Any])
  }
  
}

