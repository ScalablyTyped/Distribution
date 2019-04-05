package typings
package graphqlDashReactLib.graphqlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLCacheValue[T] extends js.Object {
  var data: T
  var fetchError: scala.Null | java.lang.String
  var graphQLErrors: scala.Null | js.Array[graphqlDashReactLib.Anon_Locations]
  var httpError: scala.Null | HttpError
  var parseError: scala.Null | java.lang.String
}

object GraphQLCacheValue {
  @scala.inline
  def apply[T](
    data: T,
    fetchError: java.lang.String = null,
    graphQLErrors: js.Array[graphqlDashReactLib.Anon_Locations] = null,
    httpError: HttpError = null,
    parseError: java.lang.String = null
  ): GraphQLCacheValue[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (fetchError != null) __obj.updateDynamic("fetchError")(fetchError)
    if (graphQLErrors != null) __obj.updateDynamic("graphQLErrors")(graphQLErrors)
    if (httpError != null) __obj.updateDynamic("httpError")(httpError)
    if (parseError != null) __obj.updateDynamic("parseError")(parseError)
    __obj.asInstanceOf[GraphQLCacheValue[T]]
  }
}

