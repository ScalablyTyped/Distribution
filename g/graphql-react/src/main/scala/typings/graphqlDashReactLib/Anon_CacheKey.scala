package typings
package graphqlDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheKey extends js.Object {
  var cacheKey: graphqlDashReactLib.graphqlDashReactMod.GraphQLCacheKey
  var cacheValue: graphqlDashReactLib.graphqlDashReactMod.GraphQLCacheValue[_]
}

object Anon_CacheKey {
  @scala.inline
  def apply(
    cacheKey: graphqlDashReactLib.graphqlDashReactMod.GraphQLCacheKey,
    cacheValue: graphqlDashReactLib.graphqlDashReactMod.GraphQLCacheValue[_]
  ): Anon_CacheKey = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey, cacheValue = cacheValue)
  
    __obj.asInstanceOf[Anon_CacheKey]
  }
}

