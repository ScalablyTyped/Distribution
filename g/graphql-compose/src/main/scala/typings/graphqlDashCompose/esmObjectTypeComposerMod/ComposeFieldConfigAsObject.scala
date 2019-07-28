package typings.graphqlDashCompose.esmObjectTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.FieldDefinitionNode
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Extensions
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Thunk
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
    resolve: GraphQLFieldResolver[TSource, TContext, TArgs] = null,
    subscribe: GraphQLFieldResolver[TSource, TContext, StringDictionary[_]] = null
  ): ComposeFieldConfigAsObject[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined($call)) __obj.updateDynamic("$call")($call)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (args != null) __obj.updateDynamic("args")(args)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode)
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (subscribe != null) __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[ComposeFieldConfigAsObject[TSource, TContext, TArgs]]
  }
}

