package typings.jsforce.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInfo extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object RequestInfo {
  @scala.inline
  def apply(body: String = null, headers: js.Object = null, method: String = null, url: String = null): RequestInfo = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RequestInfo]
  }
}

