package typings.graphqlCompose.interfaceTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.GraphQLInterfaceTypeConfi
import typings.graphql.astMod.InterfaceTypeDefinitionNode
import typings.graphql.astMod.InterfaceTypeExtensionNode
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLFieldMap
import typings.graphql.definitionMod.GraphQLInterfaceTypeConfig
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typings.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLInterfaceType & {  _gqcFields ? :graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeFieldConfigMap<TSource, TContext>,   _gqcInputTypeComposer ? :graphql-compose.graphql-compose/lib/InputTypeComposer.InputTypeComposer<TContext>,   _gqcTypeResolvers ? :graphql-compose.graphql-compose/lib/InterfaceTypeComposer.InterfaceTypeResolversMap<TContext>,   _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
trait GraphQLInterfaceTypeExtended[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcFields: js.UndefOr[ComposeFieldConfigMap[TSource, TContext]] = js.undefined
  var _gqcInputTypeComposer: js.UndefOr[InputTypeComposer[TContext]] = js.undefined
  var _gqcTypeResolvers: js.UndefOr[InterfaceTypeResolversMap[TContext]] = js.undefined
  var astNode: js.UndefOr[Maybe[InterfaceTypeDefinitionNode]] = js.undefined
  var description: Maybe[String]
  var extensionASTNodes: Maybe[js.Array[InterfaceTypeExtensionNode]]
  var extensions: Maybe[Record[String, _]]
  var name: String
  var resolveType: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]
  def getFields(): GraphQLFieldMap[_, _, StringDictionary[_]]
  def inspect(): String
  def toConfig(): GraphQLInterfaceTypeConfi
  def toJSON(): String
}

object GraphQLInterfaceTypeExtended {
  @scala.inline
  def apply[TSource, TContext](
    getFields: () => GraphQLFieldMap[_, _, StringDictionary[_]],
    inspect: () => String,
    name: String,
    toConfig: () => GraphQLInterfaceTypeConfi,
    toJSON: () => String,
    _gqcExtensions: Extensions = null,
    _gqcFields: ComposeFieldConfigMap[TSource, TContext] = null,
    _gqcInputTypeComposer: InputTypeComposer[TContext] = null,
    _gqcTypeResolvers: InterfaceTypeResolversMap[TContext] = null,
    astNode: Maybe[InterfaceTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[InterfaceTypeExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null,
    resolveType: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _, StringDictionary[_]]) | String]] = null
  ): GraphQLInterfaceTypeExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal(getFields = js.Any.fromFunction0(getFields), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields.asInstanceOf[js.Any])
    if (_gqcInputTypeComposer != null) __obj.updateDynamic("_gqcInputTypeComposer")(_gqcInputTypeComposer.asInstanceOf[js.Any])
    if (_gqcTypeResolvers != null) __obj.updateDynamic("_gqcTypeResolvers")(_gqcTypeResolvers.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(js.Any.fromFunction4(resolveType))
    __obj.asInstanceOf[GraphQLInterfaceTypeExtended[TSource, TContext]]
  }
}

