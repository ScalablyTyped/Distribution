package typings.jpm.sdkRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResponse extends js.Object {
  var anonymous: Boolean
  var headers: js.Object
  var status: Double
  var statusText: String
  var text: String
  var url: String
}

object BaseResponse {
  @scala.inline
  def apply(
    anonymous: Boolean,
    headers: js.Object,
    status: Double,
    statusText: String,
    text: String,
    url: String
  ): BaseResponse = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseResponse]
  }
}

