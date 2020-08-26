package typings.graphqlToolsMerge.extensionsMod

import typings.graphqlToolsMerge.anon.Extensions
import typings.graphqlToolsMerge.graphqlToolsMergeStrings.input
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputTypeExtensions extends PossibleTypeExtensions {
  var fields: Record[String, Extensions] = js.native
  var `type`: input = js.native
}

object InputTypeExtensions {
  @scala.inline
  def apply(fields: Record[String, Extensions], `type`: input): InputTypeExtensions = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTypeExtensions]
  }
  @scala.inline
  implicit class InputTypeExtensionsOps[Self <: InputTypeExtensions] (val x: Self) extends AnyVal {
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
    def setFields(value: Record[String, Extensions]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: input): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

