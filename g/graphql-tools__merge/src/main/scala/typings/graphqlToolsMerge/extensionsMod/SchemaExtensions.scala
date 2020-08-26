package typings.graphqlToolsMerge.extensionsMod

import typings.graphqlToolsMerge.anon.Extensions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExtensions extends js.Object {
  var schemaExtensions: ExtensionsObject = js.native
  var types: Record[String, Extensions with PossibleTypeExtensions] = js.native
}

object SchemaExtensions {
  @scala.inline
  def apply(schemaExtensions: ExtensionsObject, types: Record[String, Extensions with PossibleTypeExtensions]): SchemaExtensions = {
    val __obj = js.Dynamic.literal(schemaExtensions = schemaExtensions.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExtensions]
  }
  @scala.inline
  implicit class SchemaExtensionsOps[Self <: SchemaExtensions] (val x: Self) extends AnyVal {
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
    def setSchemaExtensions(value: ExtensionsObject): Self = this.set("schemaExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: Record[String, Extensions with PossibleTypeExtensions]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

