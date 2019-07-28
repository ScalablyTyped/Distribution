package typings.graphqlDashReact.graphqlDashReactMod

import typings.std.FormData
import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFetchOptions extends js.Object {
  var body: String | FormData
  var credentials: Null | String
  var headers: Headers
  var url: String
}

object GraphQLFetchOptions {
  @scala.inline
  def apply(body: String | FormData, headers: Headers, url: String, credentials: String = null): GraphQLFetchOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers, url = url)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    __obj.asInstanceOf[GraphQLFetchOptions]
  }
}

