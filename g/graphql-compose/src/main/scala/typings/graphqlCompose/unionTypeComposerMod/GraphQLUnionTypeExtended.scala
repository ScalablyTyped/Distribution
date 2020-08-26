package typings.graphqlCompose.unionTypeComposerMod

import typings.graphql.anon.GraphQLUnionTypeConfigany
import typings.graphql.anon.ReadonlyGraphQLUnionTypeC
import typings.graphql.astMod.UnionTypeDefinitionNode
import typings.graphql.astMod.UnionTypeExtensionNode
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.objectTypeComposerMod.ComposeObjectType
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLUnionType & {  _gqcTypeMap :std.Map<string, graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeObjectType>,   _gqcTypeResolvers :graphql-compose.graphql-compose/lib/UnionTypeComposer.UnionTypeResolversMap<TSource, TContext> | undefined,   _gqcExtensions :graphql-compose.graphql-compose/lib/utils/definitions.Extensions | undefined} */
@js.native
trait GraphQLUnionTypeExtended[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.native
  var _gqcTypeMap: Map[String, ComposeObjectType] = js.native
  var _gqcTypeResolvers: js.UndefOr[UnionTypeResolversMap[TSource, TContext]] = js.native
  var astNode: Maybe[UnionTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[UnionTypeExtensionNode]] = js.native
  var extensions: Maybe[js.Object] = js.native
  var name: String = js.native
  var resolveType: Maybe[GraphQLTypeResolver[_, _]] = js.native
  def getTypes(): js.Array[GraphQLObjectType[_, _]] = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLUnionTypeConfigany = js.native
  def toJSON(): String = js.native
}

object GraphQLUnionTypeExtended {
  @scala.inline
  def apply[TSource, TContext](
    _gqcTypeMap: Map[String, ComposeObjectType],
    getTypes: () => js.Array[GraphQLObjectType[_, _]],
    inspect: () => String,
    name: String,
    toConfig: () => GraphQLUnionTypeConfigany,
    toJSON: () => String
  ): GraphQLUnionTypeExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal(_gqcTypeMap = _gqcTypeMap.asInstanceOf[js.Any], getTypes = js.Any.fromFunction0(getTypes), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GraphQLUnionTypeExtended[TSource, TContext]]
  }
  @scala.inline
  implicit class GraphQLUnionTypeExtendedOps[Self <: GraphQLUnionTypeExtended[_, _], TSource, TContext] (val x: Self with (GraphQLUnionTypeExtended[TSource, TContext])) extends AnyVal {
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
    def set_gqcTypeMap(value: Map[String, ComposeObjectType]): Self = this.set("_gqcTypeMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTypes(value: () => js.Array[GraphQLObjectType[_, _]]): Self = this.set("getTypes", js.Any.fromFunction0(value))
    @scala.inline
    def setInspect(value: () => String): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setToConfig(value: () => GraphQLUnionTypeConfigany): Self = this.set("toConfig", js.Any.fromFunction0(value))
    @scala.inline
    def setToJSON(value: () => String): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def set_gqcExtensions(value: Extensions): Self = this.set("_gqcExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gqcExtensions: Self = this.set("_gqcExtensions", js.undefined)
    @scala.inline
    def set_gqcTypeResolvers(value: UnionTypeResolversMap[TSource, TContext]): Self = this.set("_gqcTypeResolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gqcTypeResolvers: Self = this.set("_gqcTypeResolvers", js.undefined)
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
      value: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _]) | String]]
    ): Self = this.set("resolveType", js.Any.fromFunction4(value))
    @scala.inline
    def deleteResolveType: Self = this.set("resolveType", js.undefined)
    @scala.inline
    def setResolveTypeNull: Self = this.set("resolveType", null)
  }
  
}

