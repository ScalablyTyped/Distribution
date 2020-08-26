package typings.graphqlCompose.interfaceTypeComposerMod

import typings.graphql.anon.GraphQLInterfaceTypeConfi
import typings.graphql.anon.ReadonlyGraphQLInterfaceT
import typings.graphql.astMod.InterfaceTypeDefinitionNode
import typings.graphql.astMod.InterfaceTypeExtensionNode
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLFieldMap
import typings.graphql.definitionMod.GraphQLInterfaceType
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typings.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLInterfaceType & {  _gqcFields :graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeFieldConfigMap<TSource, TContext> | undefined,   _gqcInputTypeComposer :graphql-compose.graphql-compose/lib/InputTypeComposer.InputTypeComposer<TContext> | undefined,   _gqcTypeResolvers :graphql-compose.graphql-compose/lib/InterfaceTypeComposer.InterfaceTypeResolversMap<TContext> | undefined,   _gqcExtensions :graphql-compose.graphql-compose/lib/utils/definitions.Extensions | undefined} */
@js.native
trait GraphQLInterfaceTypeExtended[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.native
  var _gqcFields: js.UndefOr[ComposeFieldConfigMap[TSource, TContext]] = js.native
  var _gqcInputTypeComposer: js.UndefOr[InputTypeComposer[TContext]] = js.native
  var _gqcTypeResolvers: js.UndefOr[InterfaceTypeResolversMap[TContext]] = js.native
  var astNode: js.UndefOr[Maybe[InterfaceTypeDefinitionNode]] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[InterfaceTypeExtensionNode]] = js.native
  var extensions: Maybe[js.Object] = js.native
  var name: String = js.native
  var resolveType: Maybe[GraphQLTypeResolver[_, _]] = js.native
  def getFields(): GraphQLFieldMap[_, _] = js.native
  def getInterfaces(): js.Array[GraphQLInterfaceType] = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLInterfaceTypeConfi = js.native
  def toJSON(): String = js.native
}

object GraphQLInterfaceTypeExtended {
  @scala.inline
  def apply[TSource, TContext](
    getFields: () => GraphQLFieldMap[_, _],
    getInterfaces: () => js.Array[GraphQLInterfaceType],
    inspect: () => String,
    name: String,
    toConfig: () => GraphQLInterfaceTypeConfi,
    toJSON: () => String
  ): GraphQLInterfaceTypeExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal(getFields = js.Any.fromFunction0(getFields), getInterfaces = js.Any.fromFunction0(getInterfaces), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GraphQLInterfaceTypeExtended[TSource, TContext]]
  }
  @scala.inline
  implicit class GraphQLInterfaceTypeExtendedOps[Self <: GraphQLInterfaceTypeExtended[_, _], TSource, TContext] (val x: Self with (GraphQLInterfaceTypeExtended[TSource, TContext])) extends AnyVal {
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
    def setGetFields(value: () => GraphQLFieldMap[_, _]): Self = this.set("getFields", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInterfaces(value: () => js.Array[GraphQLInterfaceType]): Self = this.set("getInterfaces", js.Any.fromFunction0(value))
    @scala.inline
    def setInspect(value: () => String): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setToConfig(value: () => GraphQLInterfaceTypeConfi): Self = this.set("toConfig", js.Any.fromFunction0(value))
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
    def set_gqcInputTypeComposer(value: InputTypeComposer[TContext]): Self = this.set("_gqcInputTypeComposer", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gqcInputTypeComposer: Self = this.set("_gqcInputTypeComposer", js.undefined)
    @scala.inline
    def set_gqcTypeResolvers(value: InterfaceTypeResolversMap[TContext]): Self = this.set("_gqcTypeResolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gqcTypeResolvers: Self = this.set("_gqcTypeResolvers", js.undefined)
    @scala.inline
    def setAstNode(value: Maybe[InterfaceTypeDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
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
    def setExtensionASTNodesVarargs(value: InterfaceTypeExtensionNode*): Self = this.set("extensionASTNodes", js.Array(value :_*))
    @scala.inline
    def setExtensionASTNodes(value: Maybe[js.Array[InterfaceTypeExtensionNode]]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
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

