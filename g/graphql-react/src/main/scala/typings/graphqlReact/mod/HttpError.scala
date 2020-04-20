package typings.graphqlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpError extends js.Object {
  var status: Double
  var statusText: String
}

object HttpError {
  @scala.inline
  def apply(status: Double, statusText: String): HttpError = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpError]
  }
}

