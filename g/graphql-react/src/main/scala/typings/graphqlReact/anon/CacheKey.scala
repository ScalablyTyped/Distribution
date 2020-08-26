package typings.graphqlReact.anon

import typings.graphqlReact.mod.GraphQLCacheKey
import typings.graphqlReact.mod.GraphQLCacheValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheKey extends js.Object {
  var cacheKey: GraphQLCacheKey = js.native
  var cacheValue: GraphQLCacheValue[_] = js.native
}

object CacheKey {
  @scala.inline
  def apply(cacheKey: GraphQLCacheKey, cacheValue: GraphQLCacheValue[_]): CacheKey = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValue = cacheValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheKey]
  }
  @scala.inline
  implicit class CacheKeyOps[Self <: CacheKey] (val x: Self) extends AnyVal {
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
    def setCacheValue(value: GraphQLCacheValue[_]): Self = this.set("cacheValue", value.asInstanceOf[js.Any])
  }
  
}

