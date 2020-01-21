package typings.intercomClient.intercomErrorMod

import typings.intercomClient.AnonErrorlist
import typings.intercomClient.AnonK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntercomError extends js.Object {
  var body: AnonErrorlist
  var headers: AnonK
  var statusCode: Double
}

object IntercomError {
  @scala.inline
  def apply(body: AnonErrorlist, headers: AnonK, statusCode: Double): IntercomError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IntercomError]
  }
}

