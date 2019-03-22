package typings
package graphqlDashComposeLib.libUnionTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeUnionTypeConfig[TSource, TContext] extends js.Object {
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var extensions: js.UndefOr[graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions] = js.undefined
  var name: java.lang.String
  var resolveType: js.UndefOr[
    (graphqlLib.typeDefinitionMod.GraphQLTypeResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]) | scala.Null
  ] = js.undefined
  var types: js.UndefOr[
    graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[js.Array[graphqlDashComposeLib.libTypeMapperMod.ComposeObjectType]]
  ] = js.undefined
}

object ComposeUnionTypeConfig {
  @scala.inline
  def apply[TSource, TContext](
    name: java.lang.String,
    description: java.lang.String = null,
    extensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions = null,
    resolveType: graphqlLib.typeDefinitionMod.GraphQLTypeResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = null,
    types: graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[js.Array[graphqlDashComposeLib.libTypeMapperMod.ComposeObjectType]] = null
  ): ComposeUnionTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (resolveType != null) __obj.updateDynamic("resolveType")(resolveType)
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeUnionTypeConfig[TSource, TContext]]
  }
}

