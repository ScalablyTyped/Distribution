package typings.graphqlDashReact.graphqlDashReactMod

import typings.graphqlDashReact.Anon_Locations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLCacheValue[T] extends js.Object {
  var data: T
  var fetchError: Null | String
  var graphQLErrors: Null | js.Array[Anon_Locations]
  var httpError: Null | HttpError
  var parseError: Null | String
}

object GraphQLCacheValue {
  @scala.inline
  def apply[T](
    data: T,
    fetchError: String = null,
    graphQLErrors: js.Array[Anon_Locations] = null,
    httpError: HttpError = null,
    parseError: String = null
  ): GraphQLCacheValue[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (fetchError != null) __obj.updateDynamic("fetchError")(fetchError.asInstanceOf[js.Any])
    if (graphQLErrors != null) __obj.updateDynamic("graphQLErrors")(graphQLErrors.asInstanceOf[js.Any])
    if (httpError != null) __obj.updateDynamic("httpError")(httpError.asInstanceOf[js.Any])
    if (parseError != null) __obj.updateDynamic("parseError")(parseError.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLCacheValue[T]]
  }
}

