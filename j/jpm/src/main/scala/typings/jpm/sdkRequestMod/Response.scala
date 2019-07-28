package typings.jpm.sdkRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends BaseResponse {
  var json: js.Object
}

object Response {
  @scala.inline
  def apply(
    anonymous: Boolean,
    headers: js.Object,
    json: js.Object,
    status: Double,
    statusText: String,
    text: String,
    url: String
  ): Response = {
    val __obj = js.Dynamic.literal(anonymous = anonymous, headers = headers, json = json, status = status, statusText = statusText, text = text, url = url)
  
    __obj.asInstanceOf[Response]
  }
}

