package typings.graphqlDashReact

import typings.graphqlDashReact.graphqlDashReactMod.GraphQLCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  var cache: js.UndefOr[GraphQLCache] = js.undefined
}

object Anon_Cache {
  @scala.inline
  def apply(cache: GraphQLCache = null): Anon_Cache = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cache]
  }
}

