package typings.graphqlCompose.objectTypeComposerMod

import typings.graphql.anon.ExtensionASTNodes
import typings.graphql.astMod.ObjectTypeDefinitionNode
import typings.graphql.astMod.ObjectTypeExtensionNode
import typings.graphql.definitionMod.GraphQLFieldMap
import typings.graphql.definitionMod.GraphQLInterfaceType
import typings.graphql.definitionMod.GraphQLIsTypeOfFn
import typings.graphql.definitionMod.GraphQLObjectTypeConfig
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphqlCompose.anon.ReadonlyGraphQLObjectType
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typings.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceType
import typings.graphqlCompose.resolverMod.Resolver
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLObjectType<any, any> & {  _gqcInputTypeComposer :graphql-compose.graphql-compose/lib/InputTypeComposer.InputTypeComposer<TContext> | undefined,   _gqcResolvers :std.Map<string, graphql-compose.graphql-compose/lib/Resolver.Resolver<TSource, TContext, graphql-compose.graphql-compose/lib/ObjectTypeComposer.ArgsMap, any>> | undefined,   _gqcGetRecordIdFn :graphql-compose.graphql-compose/lib/ObjectTypeComposer.GetRecordIdFn<TSource, TContext> | undefined,   _gqcRelations :graphql-compose.graphql-compose/lib/ObjectTypeComposer.RelationThunkMap<TSource, TContext> | undefined,   _gqcFields :graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeFieldConfigMap<TSource, TContext> | undefined,   _gqcInterfaces :std.Array<graphql-compose.graphql-compose/lib/InterfaceTypeComposer.ComposeInterfaceType> | undefined,   _gqcExtensions :graphql-compose.graphql-compose/lib/utils/definitions.Extensions | undefined,   description :string | null} */
@js.native
trait GraphQLObjectTypeExtended[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.native
  var _gqcFields: js.UndefOr[ComposeFieldConfigMap[TSource, TContext]] = js.native
  var _gqcGetRecordIdFn: js.UndefOr[GetRecordIdFn[TSource, TContext]] = js.native
  var _gqcInputTypeComposer: js.UndefOr[InputTypeComposer[TContext]] = js.native
  var _gqcInterfaces: js.UndefOr[js.Array[ComposeInterfaceType]] = js.native
  var _gqcRelations: js.UndefOr[RelationThunkMap[TSource, TContext]] = js.native
  var _gqcResolvers: js.UndefOr[Map[String, Resolver[TSource, TContext, ArgsMap, _]]] = js.native
  var astNode: Maybe[ObjectTypeDefinitionNode] = js.native
  var description: Maybe[String] with (String | Null) = js.native
  var extensionASTNodes: Maybe[js.Array[ObjectTypeExtensionNode]] = js.native
  var extensions: Maybe[js.Object] = js.native
  var isTypeOf: Maybe[GraphQLIsTypeOfFn[_, _]] = js.native
  var name: String = js.native
  def getFields(): GraphQLFieldMap[_, _] = js.native
  def getInterfaces(): js.Array[GraphQLInterfaceType] = js.native
  def inspect(): String = js.native
  def toConfig(): (GraphQLObjectTypeConfig[_, _]) with (ExtensionASTNodes[_, _]) = js.native
  def toJSON(): String = js.native
}

object GraphQLObjectTypeExtended {
  @scala.inline
  def apply[TSource, TContext](
    description: Maybe[String] with (String | Null),
    getFields: () => GraphQLFieldMap[_, _],
    getInterfaces: () => js.Array[GraphQLInterfaceType],
    inspect: () => String,
    name: String,
    toConfig: () => (GraphQLObjectTypeConfig[_, _]) with (ExtensionASTNodes[_, _]),
    toJSON: () => String
  ): GraphQLObjectTypeExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], getFields = js.Any.fromFunction0(getFields), getInterfaces = js.Any.fromFunction0(getInterfaces), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GraphQLObjectTypeExtended[TSource, TContext]]
  }
  @scala.inline
  implicit class GraphQLObjectTypeExtendedOps[Self <: GraphQLObjectTypeExtended[_, _], TSource, TContext] (val x: Self with (GraphQLObjectTypeExtended[TSource, TContext])) extends AnyVal {
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
    def setDescription(value: Maybe[String] with (String | Null)): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFields(value: () => GraphQLFieldMap[_, _]): Self = this.set("getFields", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInterfaces(value: () => js.Array[GraphQLInterfaceType]): Self = this.set("getInterfaces", js.Any.fromFunction0(value))
    @scala.inline
    def setInspect(value: () => String): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setToConfig(value: () => (GraphQLObjectTypeConfig[_, _]) with (ExtensionASTNodes[_, _])): Self = this.set("toConfig", js.Any.fromFunction0(value))
    @scala.inline
    def setToJSON(value: () => String): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def set_gqcExtensions(value: Extensions): Self = this.set("_gqcExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gqcExtensions: Self = this.set("_gqcExtensions", js.undefined)
    @scala.inline
    def set_gqcFields(value: ComposeFieldConfigMap[TSource, TContext]): Self = this.set("_gqcFields", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gqcFields: Self = this.set("_gqcFields", js.undefined)
    @scala.inline
    def set_gqcGetRecordIdFn(value: (TSource, /* args */ js.Any, TContext) => String): Self = this.set("_gqcGetRecordIdFn", js.Any.fromFunction3(value))
    @scala.inline
    def delete_gqcGetRecordIdFn: Self = this.set("_gqcGetRecordIdFn", js.undefined)
    @scala.inline
    def set_gqcInputTypeComposer(value: InputTypeComposer[TContext]): Self = this.set("_gqcInputTypeComposer", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gqcInputTypeComposer: Self = this.set("_gqcInputTypeComposer", js.undefined)
    @scala.inline
    def set_gqcInterfacesVarargs(value: ComposeInterfaceType*): Self = this.set("_gqcInterfaces", js.Array(value :_*))
    @scala.inline
    def set_gqcInterfaces(value: js.Array[ComposeInterfaceType]): Self = this.set("_gqcInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gqcInterfaces: Self = this.set("_gqcInterfaces", js.undefined)
    @scala.inline
    def set_gqcRelations(value: RelationThunkMap[TSource, TContext]): Self = this.set("_gqcRelations", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gqcRelations: Self = this.set("_gqcRelations", js.undefined)
    @scala.inline
    def set_gqcResolvers(value: Map[String, Resolver[TSource, TContext, ArgsMap, _]]): Self = this.set("_gqcResolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gqcResolvers: Self = this.set("_gqcResolvers", js.undefined)
    @scala.inline
    def setAstNode(value: Maybe[ObjectTypeDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    @scala.inline
    def setAstNodeNull: Self = this.set("astNode", null)
    @scala.inline
    def setExtensionASTNodesVarargs(value: ObjectTypeExtensionNode*): Self = this.set("extensionASTNodes", js.Array(value :_*))
    @scala.inline
    def setExtensionASTNodes(value: Maybe[js.Array[ObjectTypeExtensionNode]]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
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
    def setIsTypeOf(value: (_, _, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean]): Self = this.set("isTypeOf", js.Any.fromFunction3(value))
    @scala.inline
    def deleteIsTypeOf: Self = this.set("isTypeOf", js.undefined)
    @scala.inline
    def setIsTypeOfNull: Self = this.set("isTypeOf", null)
  }
  
}

