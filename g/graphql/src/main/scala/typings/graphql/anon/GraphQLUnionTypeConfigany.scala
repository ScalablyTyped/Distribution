package typings.graphql.anon

import typings.graphql.astMod.UnionTypeDefinitionNode
import typings.graphql.astMod.UnionTypeExtensionNode
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.definitionMod.Thunk
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/definition.GraphQLUnionTypeConfig<any, any> & {  types :std.Array<graphql.graphql/type/definition.GraphQLObjectType<any, any>>,   extensions :graphql.graphql/jsutils/Maybe.Maybe<std.Readonly<graphql.graphql/type/definition.GraphQLUnionTypeExtensions>>,   extensionASTNodes :std.ReadonlyArray<graphql.graphql/language/ast.UnionTypeExtensionNode>} */
@js.native
trait GraphQLUnionTypeConfigany extends js.Object {
  var astNode: js.UndefOr[Maybe[UnionTypeDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[UnionTypeExtensionNode]]] with js.Array[UnionTypeExtensionNode] = js.native
  var extensions: js.UndefOr[Maybe[js.Object]] with Maybe[js.Object] = js.native
  var name: String = js.native
  /**
    * Optionally provide a custom type resolver function. If one is not provided,
    * the default implementation will call `isTypeOf` on each implementing
    * Object type.
    */
  var resolveType: js.UndefOr[Maybe[GraphQLTypeResolver[_, _]]] = js.native
  var types: (Thunk[js.Array[GraphQLObjectType[_, _]]]) with (js.Array[GraphQLObjectType[_, _]]) = js.native
}

object GraphQLUnionTypeConfigany {
  @scala.inline
  def apply(
    extensionASTNodes: js.UndefOr[Maybe[js.Array[UnionTypeExtensionNode]]] with js.Array[UnionTypeExtensionNode],
    name: String,
    types: (Thunk[js.Array[GraphQLObjectType[_, _]]]) with (js.Array[GraphQLObjectType[_, _]])
  ): GraphQLUnionTypeConfigany = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLUnionTypeConfigany]
  }
  @scala.inline
  implicit class GraphQLUnionTypeConfiganyOps[Self <: GraphQLUnionTypeConfigany] (val x: Self) extends AnyVal {
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
    def setExtensionASTNodes(value: js.UndefOr[Maybe[js.Array[UnionTypeExtensionNode]]] with js.Array[UnionTypeExtensionNode]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: (Thunk[js.Array[GraphQLObjectType[_, _]]]) with (js.Array[GraphQLObjectType[_, _]])): Self = this.set("types", value.asInstanceOf[js.Any])
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
    def setExtensions(value: js.UndefOr[Maybe[js.Object]] with Maybe[js.Object]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    @scala.inline
    def setResolveType(
      value: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _]) | String]]
    ): Self = this.set("resolveType", js.Any.fromFunction4(value))
    @scala.inline
    def deleteResolveType: Self = this.set("resolveType", js.undefined)
    @scala.inline
    def setResolveTypeNull: Self = this.set("resolveType", null)
  }
  
}

