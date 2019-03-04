package typings
package hyperDashAws4Lib.hyperDashAws4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var credential: js.UndefOr[Credentials] = js.undefined
  var headers: js.UndefOr[Header] = js.undefined
  var method: js.UndefOr[HttpMethods] = js.undefined
  var url: java.lang.String
}

object Request {
  @scala.inline
  def apply(
    url: java.lang.String,
    body: java.lang.String = null,
    credential: Credentials = null,
    headers: Header = null,
    method: HttpMethods = null
  ): Request = {
    val __obj = js.Dynamic.literal(url = url)
    if (body != null) __obj.updateDynamic("body")(body)
    if (credential != null) __obj.updateDynamic("credential")(credential)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[Request]
  }
}

