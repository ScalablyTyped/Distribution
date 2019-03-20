package typings
package graphqlDashComposeLib.libResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverSortArgConfig[TSource, TContext] extends js.Object {
  var deprecationReason: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var name: java.lang.String
  var sortTypeNameFallback: js.UndefOr[java.lang.String] = js.undefined
  var value: ResolverSortArgFn | java.lang.String | scala.Double | scala.Boolean | js.Array[_] | graphqlDashComposeLib.libUtilsDefinitionsMod.GenericMap[_]
}

object ResolverSortArgConfig {
  @scala.inline
  def apply[TSource, TContext](
    name: java.lang.String,
    value: ResolverSortArgFn | java.lang.String | scala.Double | scala.Boolean | js.Array[_] | graphqlDashComposeLib.libUtilsDefinitionsMod.GenericMap[_],
    deprecationReason: java.lang.String = null,
    description: java.lang.String = null,
    sortTypeNameFallback: java.lang.String = null
  ): ResolverSortArgConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name, value = value.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason)
    if (description != null) __obj.updateDynamic("description")(description)
    if (sortTypeNameFallback != null) __obj.updateDynamic("sortTypeNameFallback")(sortTypeNameFallback)
    __obj.asInstanceOf[ResolverSortArgConfig[TSource, TContext]]
  }
}

