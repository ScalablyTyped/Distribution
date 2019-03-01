package typings
package jpmLib.sdkRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends BaseResponse {
  var json: js.Object
}

object Response {
  @scala.inline
  def apply(
    anonymous: scala.Boolean,
    headers: js.Object,
    json: js.Object,
    status: scala.Double,
    statusText: java.lang.String,
    text: java.lang.String,
    url: java.lang.String
  ): Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("anonymous")(anonymous)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("json")(json)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Response]
  }
}

