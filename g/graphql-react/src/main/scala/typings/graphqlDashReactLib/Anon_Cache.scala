package typings
package graphqlDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  var cache: js.UndefOr[graphqlDashReactLib.graphqlDashReactMod.GraphQLCache] = js.undefined
}

object Anon_Cache {
  @scala.inline
  def apply(cache: graphqlDashReactLib.graphqlDashReactMod.GraphQLCache = null): Anon_Cache = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    __obj.asInstanceOf[Anon_Cache]
  }
}

