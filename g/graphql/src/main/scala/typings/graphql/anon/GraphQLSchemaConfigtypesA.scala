package typings.graphql.anon

import typings.graphql.astMod.SchemaDefinitionNode
import typings.graphql.astMod.SchemaExtensionNode
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.directivesMod.GraphQLDirective
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/schema.GraphQLSchemaConfig & {  types :std.Array<graphql.graphql/type/definition.GraphQLNamedType>,   directives :std.Array<graphql.graphql/type/directives.GraphQLDirective>,   extensions :graphql.graphql/jsutils/Maybe.Maybe<std.Readonly<graphql.graphql/type/schema.GraphQLSchemaExtensions>>,   extensionASTNodes :std.ReadonlyArray<graphql.graphql/language/ast.SchemaExtensionNode>,   assumeValid :boolean} */
@js.native
trait GraphQLSchemaConfigtypesA extends js.Object {
  /**
    * When building a schema from a GraphQL service's introspection result, it
    * might be safe to assume the schema is valid. Set to true to assume the
    * produced schema is valid.
    *
    * Default: false
    */
  var assumeValid: js.UndefOr[Boolean] with Boolean = js.native
  var astNode: js.UndefOr[Maybe[SchemaDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var directives: js.UndefOr[Maybe[js.Array[GraphQLDirective]]] with js.Array[GraphQLDirective] = js.native
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[SchemaExtensionNode]]] with js.Array[SchemaExtensionNode] = js.native
  var extensions: js.UndefOr[Maybe[js.Object]] with Maybe[js.Object] = js.native
  var mutation: js.UndefOr[Maybe[GraphQLObjectType[_, _]]] = js.native
  var query: js.UndefOr[Maybe[GraphQLObjectType[_, _]]] = js.native
  var subscription: js.UndefOr[Maybe[GraphQLObjectType[_, _]]] = js.native
  var types: js.UndefOr[Maybe[js.Array[GraphQLNamedType]]] with js.Array[GraphQLNamedType] = js.native
}

object GraphQLSchemaConfigtypesA {
  @scala.inline
  def apply(
    assumeValid: js.UndefOr[Boolean] with Boolean,
    directives: js.UndefOr[Maybe[js.Array[GraphQLDirective]]] with js.Array[GraphQLDirective],
    extensionASTNodes: js.UndefOr[Maybe[js.Array[SchemaExtensionNode]]] with js.Array[SchemaExtensionNode],
    types: js.UndefOr[Maybe[js.Array[GraphQLNamedType]]] with js.Array[GraphQLNamedType]
  ): GraphQLSchemaConfigtypesA = {
    val __obj = js.Dynamic.literal(assumeValid = assumeValid.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], extensionASTNodes = extensionASTNodes.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchemaConfigtypesA]
  }
  @scala.inline
  implicit class GraphQLSchemaConfigtypesAOps[Self <: GraphQLSchemaConfigtypesA] (val x: Self) extends AnyVal {
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
    def setAssumeValid(value: js.UndefOr[Boolean] with Boolean): Self = this.set("assumeValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectives(value: js.UndefOr[Maybe[js.Array[GraphQLDirective]]] with js.Array[GraphQLDirective]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionASTNodes(value: js.UndefOr[Maybe[js.Array[SchemaExtensionNode]]] with js.Array[SchemaExtensionNode]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: js.UndefOr[Maybe[js.Array[GraphQLNamedType]]] with js.Array[GraphQLNamedType]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setAstNode(value: Maybe[SchemaDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    @scala.inline
    def setAstNodeNull: Self = this.set("astNode", null)
    @scala.inline
    def setDescription(value: Maybe[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setExtensions(value: js.UndefOr[Maybe[js.Object]] with Maybe[js.Object]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    @scala.inline
    def setMutation(value: Maybe[GraphQLObjectType[_, _]]): Self = this.set("mutation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutation: Self = this.set("mutation", js.undefined)
    @scala.inline
    def setMutationNull: Self = this.set("mutation", null)
    @scala.inline
    def setQuery(value: Maybe[GraphQLObjectType[_, _]]): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryNull: Self = this.set("query", null)
    @scala.inline
    def setSubscription(value: Maybe[GraphQLObjectType[_, _]]): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
    @scala.inline
    def setSubscriptionNull: Self = this.set("subscription", null)
  }
  
}

