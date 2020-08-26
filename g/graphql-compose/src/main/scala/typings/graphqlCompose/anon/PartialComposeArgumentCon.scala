package typings.graphqlCompose.anon

import typings.graphql.astMod.InputValueDefinitionNode
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.Thunk
import typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer
import typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typings.graphqlCompose.objectTypeComposerMod.ComposeArgumentType
import typings.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer
import typings.graphqlCompose.typeMapperMod.TypeAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeArgumentConfigAsObject> */
@js.native
trait PartialComposeArgumentCon extends js.Object {
  @JSName("$call")
  var $call: js.UndefOr[Unit] = js.native
  var astNode: js.UndefOr[InputValueDefinitionNode | Null] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var description: js.UndefOr[String | Null] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var `type`: js.UndefOr[Thunk[ComposeArgumentType] | GraphQLInputType] = js.native
}

object PartialComposeArgumentCon {
  @scala.inline
  def apply(): PartialComposeArgumentCon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialComposeArgumentCon]
  }
  @scala.inline
  implicit class PartialComposeArgumentConOps[Self <: PartialComposeArgumentCon] (val x: Self) extends AnyVal {
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
    def set$call(value: Unit): Self = this.set("$call", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$call: Self = this.set("$call", js.undefined)
    @scala.inline
    def setAstNode(value: InputValueDefinitionNode): Self = this.set("astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    @scala.inline
    def setAstNodeNull: Self = this.set("astNode", null)
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
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
    def setTypeVarargs(
      value: (GraphQLInputType | TypeAsString | InputTypeComposer[js.Any] | EnumTypeComposer[js.Any] | ScalarTypeComposer[js.Any])*
    ): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setTypeFunction0(value: () => ComposeArgumentType): Self = this.set("type", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: Thunk[ComposeArgumentType] | GraphQLInputType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

