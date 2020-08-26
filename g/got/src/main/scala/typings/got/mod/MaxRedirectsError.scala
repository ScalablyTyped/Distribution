package typings.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxRedirectsError
  extends StdError
     with GotError {
  @JSName("name")
  var name_MaxRedirectsError: typings.got.gotStrings.MaxRedirectsError = js.native
  var redirectUrls: js.Array[String] = js.native
  var statusCode: Double = js.native
  var statusMessage: String = js.native
}

object MaxRedirectsError {
  @scala.inline
  def apply(
    message: String,
    name: typings.got.gotStrings.MaxRedirectsError,
    redirectUrls: js.Array[String],
    statusCode: Double,
    statusMessage: String
  ): MaxRedirectsError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], redirectUrls = redirectUrls.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxRedirectsError]
  }
  @scala.inline
  implicit class MaxRedirectsErrorOps[Self <: MaxRedirectsError] (val x: Self) extends AnyVal {
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
    def setName(value: typings.got.gotStrings.MaxRedirectsError): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectUrlsVarargs(value: String*): Self = this.set("redirectUrls", js.Array(value :_*))
    @scala.inline
    def setRedirectUrls(value: js.Array[String]): Self = this.set("redirectUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
  }
  
}

