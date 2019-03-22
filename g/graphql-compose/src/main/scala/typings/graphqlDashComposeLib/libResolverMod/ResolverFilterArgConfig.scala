package typings
package graphqlDashComposeLib.libResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverFilterArgConfig[TSource, TContext, TArgs] extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var filterTypeNameFallback: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var query: js.UndefOr[ResolverFilterArgFn[TSource, TContext, TArgs]] = js.undefined
  var `type`: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeArgumentType
}

object ResolverFilterArgConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    name: java.lang.String,
    `type`: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeArgumentType,
    defaultValue: js.Any = null,
    description: java.lang.String = null,
    filterTypeNameFallback: java.lang.String = null,
    query: ResolverFilterArgFn[TSource, TContext, TArgs] = null
  ): ResolverFilterArgConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (filterTypeNameFallback != null) __obj.updateDynamic("filterTypeNameFallback")(filterTypeNameFallback)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[ResolverFilterArgConfig[TSource, TContext, TArgs]]
  }
}

