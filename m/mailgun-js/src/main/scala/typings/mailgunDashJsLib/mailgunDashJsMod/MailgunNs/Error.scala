package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var message: java.lang.String
  var statusCode: scala.Double
}

object Error {
  @scala.inline
  def apply(message: java.lang.String, statusCode: scala.Double): Error = {
    val __obj = js.Dynamic.literal(message = message, statusCode = statusCode)
  
    __obj.asInstanceOf[Error]
  }
}

