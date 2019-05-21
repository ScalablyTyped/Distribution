package typings
package graphqlDashReactLib.graphqlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLOperationLoading[T] extends js.Object {
  var cacheKey: GraphQLCacheKey
  var cacheValue: js.UndefOr[GraphQLCacheValue[T]] = js.undefined
  var cacheValuePromise: js.Promise[GraphQLCacheValue[T]]
}

object GraphQLOperationLoading {
  @scala.inline
  def apply[T](
    cacheKey: GraphQLCacheKey,
    cacheValuePromise: js.Promise[GraphQLCacheValue[T]],
    cacheValue: GraphQLCacheValue[T] = null
  ): GraphQLOperationLoading[T] = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey, cacheValuePromise = cacheValuePromise)
    if (cacheValue != null) __obj.updateDynamic("cacheValue")(cacheValue)
    __obj.asInstanceOf[GraphQLOperationLoading[T]]
  }
}

