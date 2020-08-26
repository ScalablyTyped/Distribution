package typings.graphql.schemaMod

import typings.graphql.astMod.SchemaExtensionNode
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.directivesMod.GraphQLDirective
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLSchemaNormalizedConfig extends GraphQLSchemaConfig {
  @JSName("assumeValid")
  var assumeValid_GraphQLSchemaNormalizedConfig: Boolean = js.native
  @JSName("description")
  var description_GraphQLSchemaNormalizedConfig: Maybe[String] = js.native
  @JSName("directives")
  var directives_GraphQLSchemaNormalizedConfig: js.Array[GraphQLDirective] = js.native
  @JSName("extensionASTNodes")
  var extensionASTNodes_GraphQLSchemaNormalizedConfig: Maybe[js.Array[SchemaExtensionNode]] = js.native
  @JSName("extensions")
  var extensions_GraphQLSchemaNormalizedConfig: Maybe[js.Object] = js.native
  @JSName("types")
  var types_GraphQLSchemaNormalizedConfig: js.Array[GraphQLNamedType] = js.native
}

object GraphQLSchemaNormalizedConfig {
  @scala.inline
  def apply(assumeValid: Boolean, directives: js.Array[GraphQLDirective], types: js.Array[GraphQLNamedType]): GraphQLSchemaNormalizedConfig = {
    val __obj = js.Dynamic.literal(assumeValid = assumeValid.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchemaNormalizedConfig]
  }
  @scala.inline
  implicit class GraphQLSchemaNormalizedConfigOps[Self <: GraphQLSchemaNormalizedConfig] (val x: Self) extends AnyVal {
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
    def setAssumeValid(value: Boolean): Self = this.set("assumeValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectivesVarargs(value: GraphQLDirective*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[GraphQLDirective]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: GraphQLNamedType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[GraphQLNamedType]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Maybe[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setExtensionASTNodesVarargs(value: SchemaExtensionNode*): Self = this.set("extensionASTNodes", js.Array(value :_*))
    @scala.inline
    def setExtensionASTNodes(value: Maybe[js.Array[SchemaExtensionNode]]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionASTNodes: Self = this.set("extensionASTNodes", js.undefined)
    @scala.inline
    def setExtensionASTNodesNull: Self = this.set("extensionASTNodes", null)
    @scala.inline
    def setExtensions(value: Maybe[js.Object]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
  }
  
}

