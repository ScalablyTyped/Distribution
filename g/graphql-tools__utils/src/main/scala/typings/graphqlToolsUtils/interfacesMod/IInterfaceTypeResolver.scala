package typings.graphqlToolsUtils.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.InterfaceTypeDefinitionNode
import typings.graphql.astMod.InterfaceTypeExtensionNode
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInterfaceTypeResolver[TSource, TContext, TArgs] extends /* key */ StringDictionary[
      (IFieldResolver[TSource, TContext, TArgs, _]) | (IFieldResolverOptions[TSource, TContext, _])
    ] {
  var __astNode: js.UndefOr[InterfaceTypeDefinitionNode] = js.undefined
  var __description: js.UndefOr[String] = js.undefined
  var __extensionASTNodes: js.UndefOr[js.Array[InterfaceTypeExtensionNode]] = js.undefined
  var __extensions: js.UndefOr[Record[String, _]] = js.undefined
  var __name: js.UndefOr[String] = js.undefined
  var __resolveType: js.UndefOr[GraphQLTypeResolver[_, _, StringDictionary[_]]] = js.undefined
}

object IInterfaceTypeResolver {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    StringDictionary: /* key */ StringDictionary[
      (IFieldResolver[TSource, TContext, TArgs, _]) | (IFieldResolverOptions[TSource, TContext, _])
    ] = null,
    __astNode: InterfaceTypeDefinitionNode = null,
    __description: String = null,
    __extensionASTNodes: js.Array[InterfaceTypeExtensionNode] = null,
    __extensions: Record[String, _] = null,
    __name: String = null,
    __resolveType: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _, StringDictionary[_]]) | String]] = null
  ): IInterfaceTypeResolver[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (__astNode != null) __obj.updateDynamic("__astNode")(__astNode.asInstanceOf[js.Any])
    if (__description != null) __obj.updateDynamic("__description")(__description.asInstanceOf[js.Any])
    if (__extensionASTNodes != null) __obj.updateDynamic("__extensionASTNodes")(__extensionASTNodes.asInstanceOf[js.Any])
    if (__extensions != null) __obj.updateDynamic("__extensions")(__extensions.asInstanceOf[js.Any])
    if (__name != null) __obj.updateDynamic("__name")(__name.asInstanceOf[js.Any])
    if (__resolveType != null) __obj.updateDynamic("__resolveType")(js.Any.fromFunction4(__resolveType))
    __obj.asInstanceOf[IInterfaceTypeResolver[TSource, TContext, TArgs]]
  }
}

