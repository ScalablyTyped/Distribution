package typings
package graphqlDashComposeLib.esmObjectTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeFieldConfigAsObject[TSource, TContext, TArgs]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("$call")
  var $call: js.UndefOr[scala.Unit] = js.undefined
  var args: js.UndefOr[ComposeFieldConfigArgumentMap[TArgs]] = js.undefined
  var astNode: js.UndefOr[graphqlLib.languageAstMod.FieldDefinitionNode | scala.Null] = js.undefined
  var deprecationReason: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var extensions: js.UndefOr[graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions] = js.undefined
  var resolve: js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var subscribe: js.UndefOr[
    graphqlLib.typeDefinitionMod.GraphQLFieldResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var `type`: (graphqlDashComposeLib.esmUtilsDefinitionsMod.Thunk[ComposeOutputType[_, TContext]]) | graphqlLib.typeDefinitionMod.GraphQLOutputType
}

object ComposeFieldConfigAsObject {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    `type`: (graphqlDashComposeLib.esmUtilsDefinitionsMod.Thunk[ComposeOutputType[_, TContext]]) | graphqlLib.typeDefinitionMod.GraphQLOutputType,
    $call: js.UndefOr[scala.Unit] = js.undefined,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    args: ComposeFieldConfigArgumentMap[TArgs] = null,
    astNode: graphqlLib.languageAstMod.FieldDefinitionNode = null,
    deprecationReason: java.lang.String = null,
    description: java.lang.String = null,
    extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = null,
    resolve: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[TSource, TContext, TArgs] = null,
    subscribe: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = null
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

