package typings.graphqlToolsUtils.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.UnionTypeDefinitionNode
import typings.graphql.astMod.UnionTypeExtensionNode
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

trait IUnionTypeResolver extends js.Object {
  var __astNode: js.UndefOr[UnionTypeDefinitionNode] = js.undefined
  var __description: js.UndefOr[String] = js.undefined
  var __extensionASTNodes: js.UndefOr[js.Array[UnionTypeExtensionNode]] = js.undefined
  var __extensions: js.UndefOr[Record[String, _]] = js.undefined
  var __name: js.UndefOr[String] = js.undefined
  var __resolveType: js.UndefOr[GraphQLTypeResolver[_, _, StringDictionary[_]]] = js.undefined
}

object IUnionTypeResolver {
  @scala.inline
  def apply(
    __astNode: UnionTypeDefinitionNode = null,
    __description: String = null,
    __extensionASTNodes: js.Array[UnionTypeExtensionNode] = null,
    __extensions: Record[String, _] = null,
    __name: String = null,
    __resolveType: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _, StringDictionary[_]]) | String]] = null
  ): IUnionTypeResolver = {
    val __obj = js.Dynamic.literal()
    if (__astNode != null) __obj.updateDynamic("__astNode")(__astNode.asInstanceOf[js.Any])
    if (__description != null) __obj.updateDynamic("__description")(__description.asInstanceOf[js.Any])
    if (__extensionASTNodes != null) __obj.updateDynamic("__extensionASTNodes")(__extensionASTNodes.asInstanceOf[js.Any])
    if (__extensions != null) __obj.updateDynamic("__extensions")(__extensions.asInstanceOf[js.Any])
    if (__name != null) __obj.updateDynamic("__name")(__name.asInstanceOf[js.Any])
    if (__resolveType != null) __obj.updateDynamic("__resolveType")(js.Any.fromFunction4(__resolveType))
    __obj.asInstanceOf[IUnionTypeResolver]
  }
}

