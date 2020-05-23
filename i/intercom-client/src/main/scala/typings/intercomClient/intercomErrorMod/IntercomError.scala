package typings.intercomClient.intercomErrorMod

import typings.intercomClient.anon.Dictk
import typings.intercomClient.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntercomError extends js.Object {
  var body: Errors
  var headers: Dictk
  var statusCode: Double
}

object IntercomError {
  @scala.inline
  def apply(body: Errors, headers: Dictk, statusCode: Double): IntercomError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntercomError]
  }
}

