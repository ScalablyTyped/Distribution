package typings.graphqlToolsMerge.extensionsMod

import typings.graphqlToolsMerge.anon.Arguments
import typings.graphqlToolsMerge.graphqlToolsMergeStrings.`object`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeExtensions extends PossibleTypeExtensions {
  var fields: Record[String, Arguments] = js.native
  var `type`: `object` = js.native
}

object ObjectTypeExtensions {
  @scala.inline
  def apply(fields: Record[String, Arguments], `type`: `object`): ObjectTypeExtensions = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeExtensions]
  }
  @scala.inline
  implicit class ObjectTypeExtensionsOps[Self <: ObjectTypeExtensions] (val x: Self) extends AnyVal {
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
    def setFields(value: Record[String, Arguments]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `object`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

