package typings.graphqlReact.mod

import typings.graphqlReact.anon.Locations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLCacheValue[T] extends js.Object {
  var data: T
  var fetchError: Null | String
  var graphQLErrors: Null | js.Array[Locations]
  var httpError: Null | HttpError
  var parseError: Null | String
}

object GraphQLCacheValue {
  @scala.inline
  def apply[T](
    data: T,
    fetchError: String = null,
    graphQLErrors: js.Array[Locations] = null,
    httpError: HttpError = null,
    parseError: String = null
  ): GraphQLCacheValue[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fetchError = fetchError.asInstanceOf[js.Any], graphQLErrors = graphQLErrors.asInstanceOf[js.Any], httpError = httpError.asInstanceOf[js.Any], parseError = parseError.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLCacheValue[T]]
  }
}

