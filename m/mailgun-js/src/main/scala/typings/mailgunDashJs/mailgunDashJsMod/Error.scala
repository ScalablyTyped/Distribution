package typings.mailgunDashJs.mailgunDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var message: String
  var statusCode: Double
}

object Error {
  @scala.inline
  def apply(message: String, statusCode: Double): Error = {
    val __obj = js.Dynamic.literal(message = message, statusCode = statusCode)
  
    __obj.asInstanceOf[Error]
  }
}

