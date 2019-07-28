package typings.graphqlDashReact.graphqlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLOperationStatus[T] extends js.Object {
  var cacheKey: GraphQLCacheKey
  var cacheValue: js.UndefOr[GraphQLCacheValue[T]] = js.undefined
  var loading: Boolean
  def load(): Unit
}

object GraphQLOperationStatus {
  @scala.inline
  def apply[T](
    cacheKey: GraphQLCacheKey,
    load: () => Unit,
    loading: Boolean,
    cacheValue: GraphQLCacheValue[T] = null
  ): GraphQLOperationStatus[T] = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey, load = js.Any.fromFunction0(load), loading = loading)
    if (cacheValue != null) __obj.updateDynamic("cacheValue")(cacheValue)
    __obj.asInstanceOf[GraphQLOperationStatus[T]]
  }
}

