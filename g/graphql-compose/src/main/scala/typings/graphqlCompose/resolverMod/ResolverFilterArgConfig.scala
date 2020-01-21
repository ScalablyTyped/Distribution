package typings.graphqlCompose.resolverMod

import typings.graphqlCompose.objectTypeComposerMod.ComposeArgumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverFilterArgConfig[TSource, TContext, TArgs] extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var filterTypeNameFallback: js.UndefOr[String] = js.undefined
  var name: String
  var query: js.UndefOr[ResolverFilterArgFn[TSource, TContext, TArgs]] = js.undefined
  var `type`: ComposeArgumentType
}

object ResolverFilterArgConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    name: String,
    `type`: ComposeArgumentType,
    defaultValue: js.Any = null,
    description: String = null,
    filterTypeNameFallback: String = null,
    query: (/* query */ js.Any, /* value */ js.Any, /* resolveParams */ ResolveParams[TSource, TContext, TArgs]) => js.Any = null
  ): ResolverFilterArgConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (filterTypeNameFallback != null) __obj.updateDynamic("filterTypeNameFallback")(filterTypeNameFallback.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction3(query))
    __obj.asInstanceOf[ResolverFilterArgConfig[TSource, TContext, TArgs]]
  }
}

