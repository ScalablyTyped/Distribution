package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestObj extends js.Object {
  var body: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[RequestParams] = js.undefined
  var url: java.lang.String
}

object RequestObj {
  @scala.inline
  def apply(
    url: java.lang.String,
    body: java.lang.String | js.Object = null,
    method: java.lang.String = null,
    params: RequestParams = null
  ): RequestObj = {
    val __obj = js.Dynamic.literal(url = url)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[RequestObj]
  }
}

