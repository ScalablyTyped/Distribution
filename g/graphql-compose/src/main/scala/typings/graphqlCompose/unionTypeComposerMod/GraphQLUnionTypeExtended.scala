package typings.graphqlCompose.unionTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.GraphQLUnionTypeConfigany
import typings.graphql.astMod.UnionTypeDefinitionNode
import typings.graphql.astMod.UnionTypeExtensionNode
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.definitionMod.GraphQLUnionTypeConfig
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.objectTypeComposerMod.ComposeObjectType
import typings.std.Map
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLUnionType & {  _gqcTypeMap  :std.Map<string, graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeObjectType>,   _gqcTypeResolvers ? :graphql-compose.graphql-compose/lib/UnionTypeComposer.UnionTypeResolversMap<TSource, TContext>,   _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
trait GraphQLUnionTypeExtended[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcTypeMap: Map[String, ComposeObjectType]
  var _gqcTypeResolvers: js.UndefOr[UnionTypeResolversMap[TSource, TContext]] = js.undefined
  var astNode: Maybe[UnionTypeDefinitionNode]
  var description: Maybe[String]
  var extensionASTNodes: Maybe[js.Array[UnionTypeExtensionNode]]
  var extensions: Maybe[Record[String, _]]
  var name: String
  var resolveType: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]
  def getTypes(): js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]
  def inspect(): String
  def toConfig(): GraphQLUnionTypeConfigany
  def toJSON(): String
}

object GraphQLUnionTypeExtended {
  @scala.inline
  def apply[TSource, TContext](
    _gqcTypeMap: Map[String, ComposeObjectType],
    getTypes: () => js.Array[GraphQLObjectType[_, _, StringDictionary[_]]],
    inspect: () => String,
    name: String,
    toConfig: () => GraphQLUnionTypeConfigany,
    toJSON: () => String,
    _gqcExtensions: Extensions = null,
    _gqcTypeResolvers: UnionTypeResolversMap[TSource, TContext] = null,
    astNode: Maybe[UnionTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[UnionTypeExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null,
    resolveType: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _, StringDictionary[_]]) | String]] = null
  ): GraphQLUnionTypeExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal(_gqcTypeMap = _gqcTypeMap.asInstanceOf[js.Any], getTypes = js.Any.fromFunction0(getTypes), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (_gqcTypeResolvers != null) __obj.updateDynamic("_gqcTypeResolvers")(_gqcTypeResolvers.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(js.Any.fromFunction4(resolveType))
    __obj.asInstanceOf[GraphQLUnionTypeExtended[TSource, TContext]]
  }
}

