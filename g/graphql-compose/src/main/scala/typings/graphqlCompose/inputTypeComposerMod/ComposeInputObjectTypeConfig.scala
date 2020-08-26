package typings.graphqlCompose.inputTypeComposerMod

import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeInputObjectTypeConfig extends _InputTypeComposeDefinition {
  var description: js.UndefOr[String | Null] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var fields: Thunk[ComposeInputFieldConfigMap] = js.native
  var name: String = js.native
}

object ComposeInputObjectTypeConfig {
  @scala.inline
  def apply(fields: Thunk[ComposeInputFieldConfigMap], name: String): ComposeInputObjectTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeInputObjectTypeConfig]
  }
  @scala.inline
  implicit class ComposeInputObjectTypeConfigOps[Self <: ComposeInputObjectTypeConfig] (val x: Self) extends AnyVal {
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
    def setFieldsFunction0(value: () => ComposeInputFieldConfigMap): Self = this.set("fields", js.Any.fromFunction0(value))
    @scala.inline
    def setFields(value: Thunk[ComposeInputFieldConfigMap]): Self = this.set("fields", value.asInstanceOf[js.Any])
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
  }
  
}

