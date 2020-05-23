package typings.graphqlReact.anon

import typings.graphqlReact.mod.GraphQLCacheKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptCacheKey extends js.Object {
  var exceptCacheKey: GraphQLCacheKey
}

object ExceptCacheKey {
  @scala.inline
  def apply(exceptCacheKey: GraphQLCacheKey): ExceptCacheKey = {
    val __obj = js.Dynamic.literal(exceptCacheKey = exceptCacheKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptCacheKey]
  }
}

