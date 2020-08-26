package typings.graphqlToolsMerge.extensionsMod

import typings.graphqlToolsMerge.graphqlToolsMergeStrings.enum
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumTypeExtensions extends PossibleTypeExtensions {
  var `type`: enum = js.native
  var values: Record[String, ExtensionsObject] = js.native
}

object EnumTypeExtensions {
  @scala.inline
  def apply(`type`: enum, values: Record[String, ExtensionsObject]): EnumTypeExtensions = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumTypeExtensions]
  }
  @scala.inline
  implicit class EnumTypeExtensionsOps[Self <: EnumTypeExtensions] (val x: Self) extends AnyVal {
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
    def setType(value: enum): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: Record[String, ExtensionsObject]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

