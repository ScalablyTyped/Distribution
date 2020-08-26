package typings.graphqlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLOperationStatus[T] extends js.Object {
  var cacheKey: GraphQLCacheKey = js.native
  var cacheValue: js.UndefOr[GraphQLCacheValue[T]] = js.native
  var loading: Boolean = js.native
  def load(): Unit = js.native
}

object GraphQLOperationStatus {
  @scala.inline
  def apply[T](cacheKey: GraphQLCacheKey, load: () => Unit, loading: Boolean): GraphQLOperationStatus[T] = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLOperationStatus[T]]
  }
  @scala.inline
  implicit class GraphQLOperationStatusOps[Self <: GraphQLOperationStatus[_], T] (val x: Self with GraphQLOperationStatus[T]) extends AnyVal {
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
    def setLoad(value: () => Unit): Self = this.set("load", js.Any.fromFunction0(value))
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheValue(value: GraphQLCacheValue[T]): Self = this.set("cacheValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheValue: Self = this.set("cacheValue", js.undefined)
  }
  
}

