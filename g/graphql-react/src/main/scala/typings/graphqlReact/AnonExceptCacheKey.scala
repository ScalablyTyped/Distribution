package typings.graphqlReact

import typings.graphqlReact.mod.GraphQLCacheKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExceptCacheKey extends js.Object {
  var exceptCacheKey: GraphQLCacheKey
}

object AnonExceptCacheKey {
  @scala.inline
  def apply(exceptCacheKey: GraphQLCacheKey): AnonExceptCacheKey = {
    val __obj = js.Dynamic.literal(exceptCacheKey = exceptCacheKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExceptCacheKey]
  }
}

