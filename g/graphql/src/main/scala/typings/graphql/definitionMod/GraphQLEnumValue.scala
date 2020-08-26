package typings.graphql.definitionMod

import typings.graphql.astMod.EnumValueDefinitionNode
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLEnumValue extends js.Object {
  var astNode: js.UndefOr[Maybe[EnumValueDefinitionNode]] = js.native
  var deprecationReason: Maybe[String] = js.native
  var description: Maybe[String] = js.native
  var extensions: Maybe[js.Object] = js.native
  var isDeprecated: Boolean = js.native
  var name: String = js.native
  var value: js.Any = js.native
}

object GraphQLEnumValue {
  @scala.inline
  def apply(isDeprecated: Boolean, name: String, value: js.Any): GraphQLEnumValue = {
    val __obj = js.Dynamic.literal(isDeprecated = isDeprecated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLEnumValue]
  }
  @scala.inline
  implicit class GraphQLEnumValueOps[Self <: GraphQLEnumValue] (val x: Self) extends AnyVal {
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
    def setIsDeprecated(value: Boolean): Self = this.set("isDeprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setAstNode(value: Maybe[EnumValueDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    @scala.inline
    def setAstNodeNull: Self = this.set("astNode", null)
    @scala.inline
    def setDeprecationReason(value: Maybe[String]): Self = this.set("deprecationReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecationReason: Self = this.set("deprecationReason", js.undefined)
    @scala.inline
    def setDeprecationReasonNull: Self = this.set("deprecationReason", null)
    @scala.inline
    def setDescription(value: Maybe[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setExtensions(value: Maybe[js.Object]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
  }
  
}

