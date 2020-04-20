package typings.graphqlReact

import typings.graphqlReact.mod.GraphQLCacheKey
import typings.graphqlReact.mod.GraphQLCacheValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheKey extends js.Object {
  var cacheKey: GraphQLCacheKey
  var cacheValue: GraphQLCacheValue[_]
}

object AnonCacheKey {
  @scala.inline
  def apply(cacheKey: GraphQLCacheKey, cacheValue: GraphQLCacheValue[_]): AnonCacheKey = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValue = cacheValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCacheKey]
  }
}

