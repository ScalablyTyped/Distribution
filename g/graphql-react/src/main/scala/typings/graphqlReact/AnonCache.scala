package typings.graphqlReact

import typings.graphqlReact.mod.GraphQLCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCache extends js.Object {
  var cache: js.UndefOr[GraphQLCache] = js.undefined
}

object AnonCache {
  @scala.inline
  def apply(cache: GraphQLCache = null): AnonCache = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCache]
  }
}

