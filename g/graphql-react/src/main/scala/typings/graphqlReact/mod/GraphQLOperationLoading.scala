package typings.graphqlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLOperationLoading[T] extends js.Object {
  var cacheKey: GraphQLCacheKey = js.native
  var cacheValue: js.UndefOr[GraphQLCacheValue[T]] = js.native
  var cacheValuePromise: js.Promise[GraphQLCacheValue[T]] = js.native
}

object GraphQLOperationLoading {
  @scala.inline
  def apply[T](cacheKey: GraphQLCacheKey, cacheValuePromise: js.Promise[GraphQLCacheValue[T]]): GraphQLOperationLoading[T] = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValuePromise = cacheValuePromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLOperationLoading[T]]
  }
  @scala.inline
  implicit class GraphQLOperationLoadingOps[Self <: GraphQLOperationLoading[_], T] (val x: Self with GraphQLOperationLoading[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCacheKey(value: GraphQLCacheKey): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheValuePromise(value: js.Promise[GraphQLCacheValue[T]]): Self = this.set("cacheValuePromise", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheValue(value: GraphQLCacheValue[T]): Self = this.set("cacheValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheValue: Self = this.set("cacheValue", js.undefined)
  }
  
}

