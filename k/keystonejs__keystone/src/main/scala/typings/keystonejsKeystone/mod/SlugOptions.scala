package typings.keystonejsKeystone.mod

import typings.keystonejsFields.mod.FieldType
import typings.keystonejsKeystone.anon.ResolvedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ @js.native
trait SlugOptions[FieldNames /* <: String */] extends BaseFieldOptions {
  var from: String = js.native
  // TODO: resolved data is of the same type as the current object list. Investigate if we can at least provide the available keys via a generic.
  def generate(opts: ResolvedData[FieldNames]): String = js.native
}

object SlugOptions {
  @scala.inline
  def apply[/* <: java.lang.String */ FieldNames](from: String, generate: ResolvedData[FieldNames] => String, `type`: FieldType): SlugOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], generate = js.Any.fromFunction1(generate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlugOptions[FieldNames]]
  }
  @scala.inline
  implicit class SlugOptionsOps[Self <: SlugOptions[_], /* <: java.lang.String */ FieldNames] (val x: Self with SlugOptions[FieldNames]) extends AnyVal {
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerate(value: ResolvedData[FieldNames] => String): Self = this.set("generate", js.Any.fromFunction1(value))
  }
  
}

