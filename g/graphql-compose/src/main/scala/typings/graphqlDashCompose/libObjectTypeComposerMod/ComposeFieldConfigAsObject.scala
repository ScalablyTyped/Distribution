package typings.graphqlDashCompose.libObjectTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.FieldDefinitionNode
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Extensions
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeFieldConfigAsObject[TSource, TContext, TArgs]
  extends /* key */ StringDictionary[js.Any] {
  @JSName("$call")
  var $call: js.UndefOr[Unit] = js.undefined
  var args: js.UndefOr[ComposeFieldConfigArgumentMap[TArgs]] = js.undefined
  var astNode: js.UndefOr[FieldDefinitionNode | Null] = js.undefined
  var deprecationReason: js.UndefOr[String | Null] = js.undefined
  var description: js.UndefOr[String | Null] = js.undefined
  var extensions: js.UndefOr[Extensions] = js.undefined
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, StringDictionary[_]]] = js.undefined
  var `type`: (Thunk[ComposeOutputType[_, TContext]]) | GraphQLOutputType
}

object ComposeFieldConfigAsObject {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    `type`: (Thunk[ComposeOutputType[_, TContext]]) | GraphQLOutputType,
    $call: js.UndefOr[Unit] = js.undefined,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    args: ComposeFieldConfigArgumentMap[TArgs] = null,
    astNode: FieldDefinitionNode = null,
    deprecationReason: String = null,
    description: String = null,
    extensions: Extensions = null,
    resolve: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => js.Any = null,
    subscribe: (TSource, StringDictionary[_], TContext, /* info */ GraphQLResolveInfo) => js.Any = null
  ): ComposeFieldConfigAsObject[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined($call)) __obj.updateDynamic("$call")($call.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction4(resolve))
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction4(subscribe))
    __obj.asInstanceOf[ComposeFieldConfigAsObject[TSource, TContext, TArgs]]
  }
}

