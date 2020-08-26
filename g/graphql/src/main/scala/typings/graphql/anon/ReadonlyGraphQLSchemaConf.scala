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

/* Inlined std.Readonly<graphql.graphql/type/schema.GraphQLSchemaConfig> */
@js.native
trait ReadonlyGraphQLSchemaConf extends js.Object {
  val assumeValid: js.UndefOr[Boolean] = js.native
  val astNode: js.UndefOr[Maybe[SchemaDefinitionNode]] = js.native
  val description: js.UndefOr[Maybe[String]] = js.native
  val directives: js.UndefOr[Maybe[js.Array[GraphQLDirective]]] = js.native
  val extensionASTNodes: js.UndefOr[Maybe[js.Array[SchemaExtensionNode]]] = js.native
  val extensions: js.UndefOr[Maybe[js.Object]] = js.native
  val mutation: js.UndefOr[Maybe[GraphQLObjectType[_, _]]] = js.native
  val query: js.UndefOr[Maybe[GraphQLObjectType[_, _]]] = js.native
  val subscription: js.UndefOr[Maybe[GraphQLObjectType[_, _]]] = js.native
  val types: js.UndefOr[Maybe[js.Array[GraphQLNamedType]]] = js.native
}

object ReadonlyGraphQLSchemaConf {
  @scala.inline
  def apply(): ReadonlyGraphQLSchemaConf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyGraphQLSchemaConf]
  }
  @scala.inline
  implicit class ReadonlyGraphQLSchemaConfOps[Self <: ReadonlyGraphQLSchemaConf] (val x: Self) extends AnyVal {
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
    def deleteAssumeValid: Self = this.set("assumeValid", js.undefined)
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
    def setDirectivesVarargs(value: GraphQLDirective*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: Maybe[js.Array[GraphQLDirective]]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    @scala.inline
    def setDirectivesNull: Self = this.set("directives", null)
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
    @scala.inline
    def setTypesVarargs(value: GraphQLNamedType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: Maybe[js.Array[GraphQLNamedType]]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def setTypesNull: Self = this.set("types", null)
  }
  
}

