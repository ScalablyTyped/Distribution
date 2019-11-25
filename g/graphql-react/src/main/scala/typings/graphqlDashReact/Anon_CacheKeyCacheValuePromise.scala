package typings.graphqlDashReact

import typings.graphqlDashReact.graphqlDashReactMod.GraphQLCacheKey
import typings.graphqlDashReact.graphqlDashReactMod.GraphQLCacheValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheKeyCacheValuePromise extends js.Object {
  var cacheKey: GraphQLCacheKey
  var cacheValuePromise: js.Promise[GraphQLCacheValue[_]]
}

object Anon_CacheKeyCacheValuePromise {
  @scala.inline
  def apply(cacheKey: GraphQLCacheKey, cacheValuePromise: js.Promise[GraphQLCacheValue[_]]): Anon_CacheKeyCacheValuePromise = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValuePromise = cacheValuePromise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CacheKeyCacheValuePromise]
  }
}

