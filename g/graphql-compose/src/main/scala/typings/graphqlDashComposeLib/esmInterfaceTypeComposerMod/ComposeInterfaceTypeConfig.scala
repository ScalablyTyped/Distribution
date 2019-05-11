package typings
package graphqlDashComposeLib.esmInterfaceTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeInterfaceTypeConfig[TSource, TContext] extends js.Object {
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var extensions: js.UndefOr[graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions] = js.undefined
  var fields: js.UndefOr[
    graphqlDashComposeLib.esmUtilsDefinitionsMod.Thunk[
      graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext]
    ]
  ] = js.undefined
  var name: java.lang.String
  var resolveType: js.UndefOr[
    (graphqlLib.typeDefinitionMod.GraphQLTypeResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]) | scala.Null
  ] = js.undefined
}

object ComposeInterfaceTypeConfig {
  @scala.inline
  def apply[TSource, TContext](
    name: java.lang.String,
    description: java.lang.String = null,
    extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = null,
    fields: graphqlDashComposeLib.esmUtilsDefinitionsMod.Thunk[
      graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext]
    ] = null,
    resolveType: graphqlLib.typeDefinitionMod.GraphQLTypeResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ComposeInterfaceTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(resolveType)
    __obj.asInstanceOf[ComposeInterfaceTypeConfig[TSource, TContext]]
  }
}

