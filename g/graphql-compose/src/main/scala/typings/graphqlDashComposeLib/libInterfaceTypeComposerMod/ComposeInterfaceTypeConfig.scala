package typings
package graphqlDashComposeLib.libInterfaceTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeInterfaceTypeConfig[TSource, TContext] extends js.Object {
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var fields: js.UndefOr[
    graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[
      graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigMap[TSource, TContext, _]
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
    fields: graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[
      graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigMap[TSource, TContext, _]
    ] = null,
    resolveType: graphqlLib.typeDefinitionMod.GraphQLTypeResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ComposeInterfaceTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(resolveType)
    __obj.asInstanceOf[ComposeInterfaceTypeConfig[TSource, TContext]]
  }
}

