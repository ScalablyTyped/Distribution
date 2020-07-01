package typings.graphqlToolsUtils.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.ObjectTypeDefinitionNode
import typings.graphql.astMod.ObjectTypeExtensionNode
import typings.graphql.definitionMod.GraphQLIsTypeOfFn
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeResolver[TSource, TContext, TArgs] extends /* key */ StringDictionary[
      (IFieldResolver[TSource, TContext, TArgs, _]) | (IFieldResolverOptions[TSource, TContext, _])
    ] {
  var __astNode: js.UndefOr[ObjectTypeDefinitionNode] = js.undefined
  var __description: js.UndefOr[String] = js.undefined
  var __extensionASTNodes: js.UndefOr[ObjectTypeExtensionNode] = js.undefined
  var __extensions: js.UndefOr[Record[String, _]] = js.undefined
  var __isTypeOf: js.UndefOr[GraphQLIsTypeOfFn[TSource, TContext]] = js.undefined
  var __name: js.UndefOr[String] = js.undefined
}

object IObjectTypeResolver {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    StringDictionary: /* key */ StringDictionary[
      (IFieldResolver[TSource, TContext, TArgs, _]) | (IFieldResolverOptions[TSource, TContext, _])
    ] = null,
    __astNode: ObjectTypeDefinitionNode = null,
    __description: String = null,
    __extensionASTNodes: ObjectTypeExtensionNode = null,
    __extensions: Record[String, _] = null,
    __isTypeOf: (TSource, TContext, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean] = null,
    __name: String = null
  ): IObjectTypeResolver[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (__astNode != null) __obj.updateDynamic("__astNode")(__astNode.asInstanceOf[js.Any])
    if (__description != null) __obj.updateDynamic("__description")(__description.asInstanceOf[js.Any])
    if (__extensionASTNodes != null) __obj.updateDynamic("__extensionASTNodes")(__extensionASTNodes.asInstanceOf[js.Any])
    if (__extensions != null) __obj.updateDynamic("__extensions")(__extensions.asInstanceOf[js.Any])
    if (__isTypeOf != null) __obj.updateDynamic("__isTypeOf")(js.Any.fromFunction3(__isTypeOf))
    if (__name != null) __obj.updateDynamic("__name")(__name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectTypeResolver[TSource, TContext, TArgs]]
  }
}

