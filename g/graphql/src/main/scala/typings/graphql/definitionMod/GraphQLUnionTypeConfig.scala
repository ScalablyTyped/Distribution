package typings.graphql.definitionMod

import typings.graphql.astMod.UnionTypeDefinitionNode
import typings.graphql.astMod.UnionTypeExtensionNode
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLUnionTypeConfig[TSource, TContext] extends js.Object {
  var astNode: js.UndefOr[Maybe[UnionTypeDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[UnionTypeExtensionNode]]] = js.native
  var extensions: js.UndefOr[Maybe[js.Object]] = js.native
  var name: String = js.native
  /**
    * Optionally provide a custom type resolver function. If one is not provided,
    * the default implementation will call `isTypeOf` on each implementing
    * Object type.
    */
  var resolveType: js.UndefOr[Maybe[GraphQLTypeResolver[TSource, TContext]]] = js.native
  var types: Thunk[js.Array[GraphQLObjectType[_, _]]] = js.native
}

object GraphQLUnionTypeConfig {
  @scala.inline
  def apply[TSource, TContext](name: String, types: Thunk[js.Array[GraphQLObjectType[_, _]]]): GraphQLUnionTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLUnionTypeConfig[TSource, TContext]]
  }
  @scala.inline
  implicit class GraphQLUnionTypeConfigOps[Self <: GraphQLUnionTypeConfig[_, _], TSource, TContext] (val x: Self with (GraphQLUnionTypeConfig[TSource, TContext])) extends AnyVal {
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
    def setTypesVarargs(value: (GraphQLObjectType[js.Any, js.Any])*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypesFunction0(value: () => js.Array[GraphQLObjectType[_, _]]): Self = this.set("types", js.Any.fromFunction0(value))
    @scala.inline
    def setTypes(value: Thunk[js.Array[GraphQLObjectType[_, _]]]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setAstNode(value: Maybe[UnionTypeDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
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
    def setExtensionASTNodesVarargs(value: UnionTypeExtensionNode*): Self = this.set("extensionASTNodes", js.Array(value :_*))
    @scala.inline
    def setExtensionASTNodes(value: Maybe[js.Array[UnionTypeExtensionNode]]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
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
    def setResolveType(
      value: (TSource, TContext, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[TSource, TContext]) | String]]
    ): Self = this.set("resolveType", js.Any.fromFunction4(value))
    @scala.inline
    def deleteResolveType: Self = this.set("resolveType", js.undefined)
    @scala.inline
    def setResolveTypeNull: Self = this.set("resolveType", null)
  }
  
}

