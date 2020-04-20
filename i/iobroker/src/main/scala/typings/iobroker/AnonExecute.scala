package typings.iobroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExecute extends js.Object {
  var execute: Boolean
  var http: Boolean
  var sendto: Boolean
}

object AnonExecute {
  @scala.inline
  def apply(execute: Boolean, http: Boolean, sendto: Boolean): AnonExecute = {
    val __obj = js.Dynamic.literal(execute = execute.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], sendto = sendto.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExecute]
  }
}

