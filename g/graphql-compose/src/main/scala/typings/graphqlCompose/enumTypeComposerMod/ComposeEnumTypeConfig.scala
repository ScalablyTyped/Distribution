package typings.graphqlCompose.enumTypeComposerMod

import typings.graphqlCompose.definitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeEnumTypeConfig extends _EnumTypeComposeDefinition {
  var description: js.UndefOr[String | Null] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var name: String = js.native
  var values: js.UndefOr[ComposeEnumValueConfigMap] = js.native
}

object ComposeEnumTypeConfig {
  @scala.inline
  def apply(name: String): ComposeEnumTypeConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeEnumTypeConfig]
  }
  @scala.inline
  implicit class ComposeEnumTypeConfigOps[Self <: ComposeEnumTypeConfig] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setExtensions(value: Extensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setValues(value: ComposeEnumValueConfigMap): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

