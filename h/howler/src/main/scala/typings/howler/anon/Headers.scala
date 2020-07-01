package typings.howler.anon

import typings.howler.howlerBooleans.`true`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var withCredentials: js.UndefOr[`true`] = js.undefined
}

object Headers {
  @scala.inline
  def apply(headers: Record[String, String] = null, method: String = null, withCredentials: `true` = null): Headers = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (withCredentials != null) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

