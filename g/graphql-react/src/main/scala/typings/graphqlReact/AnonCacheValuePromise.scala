package typings.graphqlReact

import typings.graphqlReact.mod.GraphQLCacheKey
import typings.graphqlReact.mod.GraphQLCacheValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheValuePromise extends js.Object {
  var cacheKey: GraphQLCacheKey
  var cacheValuePromise: js.Promise[GraphQLCacheValue[_]]
}

object AnonCacheValuePromise {
  @scala.inline
  def apply(cacheKey: GraphQLCacheKey, cacheValuePromise: js.Promise[GraphQLCacheValue[_]]): AnonCacheValuePromise = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValuePromise = cacheValuePromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCacheValuePromise]
  }
}

