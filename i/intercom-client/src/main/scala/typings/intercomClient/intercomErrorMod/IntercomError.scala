package typings.intercomClient.intercomErrorMod

import typings.intercomClient.anon.Dictk
import typings.intercomClient.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntercomError extends js.Object {
  var body: Errors = js.native
  var headers: Dictk = js.native
  var statusCode: Double = js.native
}

object IntercomError {
  @scala.inline
  def apply(body: Errors, headers: Dictk, statusCode: Double): IntercomError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntercomError]
  }
  @scala.inline
  implicit class IntercomErrorOps[Self <: IntercomError] (val x: Self) extends AnyVal {
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
    def setBody(value: Errors): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Dictk): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

