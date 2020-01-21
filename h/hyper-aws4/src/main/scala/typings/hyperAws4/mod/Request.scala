package typings.hyperAws4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var credential: js.UndefOr[Credentials] = js.undefined
  var headers: js.UndefOr[Header] = js.undefined
  var method: js.UndefOr[HttpMethods] = js.undefined
  var url: String
}

object Request {
  @scala.inline
  def apply(
    url: String,
    body: String = null,
    credential: Credentials = null,
    headers: Header = null,
    method: HttpMethods = null
  ): Request = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (credential != null) __obj.updateDynamic("credential")(credential.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

