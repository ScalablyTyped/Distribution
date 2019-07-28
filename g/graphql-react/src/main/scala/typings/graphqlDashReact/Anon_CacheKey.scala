package typings.graphqlDashReact

import typings.graphqlDashReact.graphqlDashReactMod.GraphQLCacheKey
import typings.graphqlDashReact.graphqlDashReactMod.GraphQLCacheValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheKey extends js.Object {
  var cacheKey: GraphQLCacheKey
  var cacheValue: GraphQLCacheValue[_]
}

object Anon_CacheKey {
  @scala.inline
  def apply(cacheKey: GraphQLCacheKey, cacheValue: GraphQLCacheValue[_]): Anon_CacheKey = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey, cacheValue = cacheValue)
  
    __obj.asInstanceOf[Anon_CacheKey]
  }
}

