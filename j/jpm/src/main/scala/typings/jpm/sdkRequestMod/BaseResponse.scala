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
    val __obj = js.Dynamic.literal(anonymous = anonymous, headers = headers, status = status, statusText = statusText, text = text, url = url)
  
    __obj.asInstanceOf[BaseResponse]
  }
}

