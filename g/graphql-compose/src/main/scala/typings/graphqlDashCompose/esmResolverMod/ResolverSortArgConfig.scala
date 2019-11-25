package typings.graphqlDashCompose.esmResolverMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverSortArgConfig[TSource, TContext, TArgs] extends js.Object {
  var deprecationReason: js.UndefOr[String | Null] = js.undefined
  var description: js.UndefOr[String | Null] = js.undefined
  var name: String
  var sortTypeNameFallback: js.UndefOr[String] = js.undefined
  var value: StringDictionary[js.Any] | (ResolverSortArgFn[TSource, TContext, TArgs]) | String | Double | Boolean | js.Array[_]
}

object ResolverSortArgConfig {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    name: String,
    value: StringDictionary[js.Any] | (ResolverSortArgFn[TSource, TContext, TArgs]) | String | Double | Boolean | js.Array[_],
    deprecationReason: String = null,
    description: String = null,
    sortTypeNameFallback: String = null
  ): ResolverSortArgConfig[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (sortTypeNameFallback != null) __obj.updateDynamic("sortTypeNameFallback")(sortTypeNameFallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverSortArgConfig[TSource, TContext, TArgs]]
  }
}

