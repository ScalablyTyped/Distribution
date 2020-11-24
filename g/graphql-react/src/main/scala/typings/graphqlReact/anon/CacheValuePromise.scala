package typings.graphqlReact.anon

import typings.graphqlReact.mod.GraphQLCacheKey
import typings.graphqlReact.mod.GraphQLCacheValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheValuePromise extends js.Object {
  
  var cacheKey: GraphQLCacheKey = js.native
  
  var cacheValuePromise: js.Promise[GraphQLCacheValue[_]] = js.native
}
object CacheValuePromise {
  
  @scala.inline
  def apply(cacheKey: GraphQLCacheKey, cacheValuePromise: js.Promise[GraphQLCacheValue[_]]): CacheValuePromise = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValuePromise = cacheValuePromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheValuePromise]
  }
  
  @scala.inline
  implicit class CacheValuePromiseOps[Self <: CacheValuePromise] (val x: Self) extends AnyVal {
    
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
    def setCacheValuePromise(value: js.Promise[GraphQLCacheValue[_]]): Self = this.set("cacheValuePromise", value.asInstanceOf[js.Any])
  }
}
