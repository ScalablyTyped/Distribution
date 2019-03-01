package typings
package jsforceLib.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInfo extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object RequestInfo {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    headers: js.Object = null,
    method: java.lang.String = null,
    url: java.lang.String = null
  ): RequestInfo = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RequestInfo]
  }
}

