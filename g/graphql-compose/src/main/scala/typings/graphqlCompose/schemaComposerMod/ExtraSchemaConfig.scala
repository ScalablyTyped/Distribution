package typings.graphqlCompose.schemaComposerMod

import typings.graphql.astMod.SchemaDefinitionNode
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraSchemaConfig extends js.Object {
  var astNode: js.UndefOr[SchemaDefinitionNode | Null] = js.native
  var directives: js.UndefOr[js.Array[GraphQLDirective] | Null] = js.native
  var types: js.UndefOr[js.Array[GraphQLNamedType] | Null] = js.native
}

object ExtraSchemaConfig {
  @scala.inline
  def apply(): ExtraSchemaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraSchemaConfig]
  }
  @scala.inline
  implicit class ExtraSchemaConfigOps[Self <: ExtraSchemaConfig] (val x: Self) extends AnyVal {
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
    def setAstNode(value: SchemaDefinitionNode): Self = this.set("astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    @scala.inline
    def setAstNodeNull: Self = this.set("astNode", null)
    @scala.inline
    def setDirectivesVarargs(value: GraphQLDirective*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[GraphQLDirective]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    @scala.inline
    def setDirectivesNull: Self = this.set("directives", null)
    @scala.inline
    def setTypesVarargs(value: GraphQLNamedType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[GraphQLNamedType]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def setTypesNull: Self = this.set("types", null)
  }
  
}

