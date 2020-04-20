package typings.intercomClient.intercomErrorMod

import typings.intercomClient.AnonDictk
import typings.intercomClient.AnonErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntercomError extends js.Object {
  var body: AnonErrors
  var headers: AnonDictk
  var statusCode: Double
}

object IntercomError {
  @scala.inline
  def apply(body: AnonErrors, headers: AnonDictk, statusCode: Double): IntercomError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntercomError]
  }
}

