package typings.jpm.requestMod

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
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

