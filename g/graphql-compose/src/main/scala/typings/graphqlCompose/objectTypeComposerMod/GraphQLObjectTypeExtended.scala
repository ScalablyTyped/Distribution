package typings.graphqlCompose.objectTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.GraphQLObjectTypeConfigan
import typings.graphql.astMod.ObjectTypeDefinitionNode
import typings.graphql.astMod.ObjectTypeExtensionNode
import typings.graphql.definitionMod.GraphQLFieldMap
import typings.graphql.definitionMod.GraphQLInterfaceType
import typings.graphql.definitionMod.GraphQLIsTypeOfFn
import typings.graphql.definitionMod.GraphQLObjectTypeConfig
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typings.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceType
import typings.graphqlCompose.resolverMod.Resolver
import typings.std.Map
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLObjectType<any, any, {[key: string] : any}> & {  _gqcInputTypeComposer ? :graphql-compose.graphql-compose/lib/InputTypeComposer.InputTypeComposer<TContext>,   _gqcResolvers ? :std.Map<string, graphql-compose.graphql-compose/lib/Resolver.Resolver<TSource, TContext, graphql-compose.graphql-compose/lib/ObjectTypeComposer.ArgsMap, any>>,   _gqcGetRecordIdFn ? :graphql-compose.graphql-compose/lib/ObjectTypeComposer.GetRecordIdFn<TSource, TContext>,   _gqcRelations ? :graphql-compose.graphql-compose/lib/ObjectTypeComposer.RelationThunkMap<TSource, TContext>,   _gqcFields ? :graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeFieldConfigMap<TSource, TContext>,   _gqcInterfaces ? :std.Array<graphql-compose.graphql-compose/lib/InterfaceTypeComposer.ComposeInterfaceType>,   _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions,   description  :string | null} */
trait GraphQLObjectTypeExtended[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcFields: js.UndefOr[ComposeFieldConfigMap[TSource, TContext]] = js.undefined
  var _gqcGetRecordIdFn: js.UndefOr[GetRecordIdFn[TSource, TContext]] = js.undefined
  var _gqcInputTypeComposer: js.UndefOr[InputTypeComposer[TContext]] = js.undefined
  var _gqcInterfaces: js.UndefOr[js.Array[ComposeInterfaceType]] = js.undefined
  var _gqcRelations: js.UndefOr[RelationThunkMap[TSource, TContext]] = js.undefined
  var _gqcResolvers: js.UndefOr[Map[String, Resolver[TSource, TContext, ArgsMap, _]]] = js.undefined
  var astNode: Maybe[ObjectTypeDefinitionNode]
  var description: Maybe[String] with (String | Null)
  var extensionASTNodes: Maybe[js.Array[ObjectTypeExtensionNode]]
  var extensions: Maybe[Record[String, _]]
  var isTypeOf: Maybe[GraphQLIsTypeOfFn[_, _]]
  var name: String
  def getFields(): GraphQLFieldMap[_, _, StringDictionary[_]]
  def getInterfaces(): js.Array[GraphQLInterfaceType]
  def inspect(): String
  def toConfig(): GraphQLObjectTypeConfigan
  def toJSON(): String
}

object GraphQLObjectTypeExtended {
  @scala.inline
  def apply[TSource, TContext](
    description: Maybe[String] with (String | Null),
    getFields: () => GraphQLFieldMap[_, _, StringDictionary[_]],
    getInterfaces: () => js.Array[GraphQLInterfaceType],
    inspect: () => String,
    name: String,
    toConfig: () => GraphQLObjectTypeConfigan,
    toJSON: () => String,
    _gqcExtensions: Extensions = null,
    _gqcFields: ComposeFieldConfigMap[TSource, TContext] = null,
    _gqcGetRecordIdFn: (TSource, /* args */ js.Any, TContext) => String = null,
    _gqcInputTypeComposer: InputTypeComposer[TContext] = null,
    _gqcInterfaces: js.Array[ComposeInterfaceType] = null,
    _gqcRelations: RelationThunkMap[TSource, TContext] = null,
    _gqcResolvers: Map[String, Resolver[TSource, TContext, ArgsMap, _]] = null,
    astNode: Maybe[ObjectTypeDefinitionNode] = null,
    extensionASTNodes: Maybe[js.Array[ObjectTypeExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null,
    isTypeOf: (_, _, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean] = null
  ): GraphQLObjectTypeExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], getFields = js.Any.fromFunction0(getFields), getInterfaces = js.Any.fromFunction0(getInterfaces), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields.asInstanceOf[js.Any])
    if (_gqcGetRecordIdFn != null) __obj.updateDynamic("_gqcGetRecordIdFn")(js.Any.fromFunction3(_gqcGetRecordIdFn))
    if (_gqcInputTypeComposer != null) __obj.updateDynamic("_gqcInputTypeComposer")(_gqcInputTypeComposer.asInstanceOf[js.Any])
    if (_gqcInterfaces != null) __obj.updateDynamic("_gqcInterfaces")(_gqcInterfaces.asInstanceOf[js.Any])
    if (_gqcRelations != null) __obj.updateDynamic("_gqcRelations")(_gqcRelations.asInstanceOf[js.Any])
    if (_gqcResolvers != null) __obj.updateDynamic("_gqcResolvers")(_gqcResolvers.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (isTypeOf != null) __obj.updateDynamic("isTypeOf")(js.Any.fromFunction3(isTypeOf))
    __obj.asInstanceOf[GraphQLObjectTypeExtended[TSource, TContext]]
  }
}

