package typings.graphqlToolsMerge.extensionsMod

import typings.graphqlToolsMerge.anon.Arguments
import typings.graphqlToolsMerge.graphqlToolsMergeStrings.interface
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceTypeExtensions extends PossibleTypeExtensions {
  var fields: Record[String, Arguments] = js.native
  var `type`: interface = js.native
}

object InterfaceTypeExtensions {
  @scala.inline
  def apply(fields: Record[String, Arguments], `type`: interface): InterfaceTypeExtensions = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceTypeExtensions]
  }
  @scala.inline
  implicit class InterfaceTypeExtensionsOps[Self <: InterfaceTypeExtensions] (val x: Self) extends AnyVal {
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
    def setType(value: interface): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

