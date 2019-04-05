package typings
package graphqlDashReactLib.graphqlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFetchOptions extends js.Object {
  var body: java.lang.String | stdLib.FormData
  var credentials: scala.Null | java.lang.String
  var headers: stdLib.Headers
  var url: java.lang.String
}

object GraphQLFetchOptions {
  @scala.inline
  def apply(
    body: java.lang.String | stdLib.FormData,
    headers: stdLib.Headers,
    url: java.lang.String,
    credentials: java.lang.String = null
  ): GraphQLFetchOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers, url = url)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    __obj.asInstanceOf[GraphQLFetchOptions]
  }
}

