package typings.graphqlReact.anon

import typings.graphqlReact.mod.GraphQLCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var cache: js.UndefOr[GraphQLCache] = js.undefined
}

object Cache {
  @scala.inline
  def apply(cache: GraphQLCache = null): Cache = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

