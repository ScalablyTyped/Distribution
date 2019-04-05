package typings
package graphqlDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheKeyCacheValuePromise extends js.Object {
  var cacheKey: graphqlDashReactLib.graphqlDashReactMod.GraphQLCacheKey
  var cacheValuePromise: js.Promise[graphqlDashReactLib.graphqlDashReactMod.GraphQLCacheValue[_]]
}

object Anon_CacheKeyCacheValuePromise {
  @scala.inline
  def apply(
    cacheKey: graphqlDashReactLib.graphqlDashReactMod.GraphQLCacheKey,
    cacheValuePromise: js.Promise[graphqlDashReactLib.graphqlDashReactMod.GraphQLCacheValue[_]]
  ): Anon_CacheKeyCacheValuePromise = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey, cacheValuePromise = cacheValuePromise)
  
    __obj.asInstanceOf[Anon_CacheKeyCacheValuePromise]
  }
}

