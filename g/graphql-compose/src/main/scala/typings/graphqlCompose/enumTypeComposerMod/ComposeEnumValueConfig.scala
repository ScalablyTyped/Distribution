package typings.graphqlCompose.enumTypeComposerMod

import typings.graphql.astMod.EnumValueDefinitionNode
import typings.graphqlCompose.definitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeEnumValueConfig extends js.Object {
  var astNode: js.UndefOr[EnumValueDefinitionNode | Null] = js.native
  var deprecationReason: js.UndefOr[String | Null] = js.native
  var description: js.UndefOr[String | Null] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object ComposeEnumValueConfig {
  @scala.inline
  def apply(): ComposeEnumValueConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposeEnumValueConfig]
  }
  @scala.inline
  implicit class ComposeEnumValueConfigOps[Self <: ComposeEnumValueConfig] (val x: Self) extends AnyVal {
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
    def setAstNode(value: EnumValueDefinitionNode): Self = this.set("astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    @scala.inline
    def setAstNodeNull: Self = this.set("astNode", null)
    @scala.inline
    def setDeprecationReason(value: String): Self = this.set("deprecationReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecationReason: Self = this.set("deprecationReason", js.undefined)
    @scala.inline
    def setDeprecationReasonNull: Self = this.set("deprecationReason", null)
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
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

