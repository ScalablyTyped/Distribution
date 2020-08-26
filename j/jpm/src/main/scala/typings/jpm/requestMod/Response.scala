package typings.jpm.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends BaseResponse {
  var json: js.Object = js.native
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
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJson(value: js.Object): Self = this.set("json", value.asInstanceOf[js.Any])
  }
  
}

