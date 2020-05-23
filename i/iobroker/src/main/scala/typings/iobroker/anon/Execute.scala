package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Execute extends js.Object {
  var execute: Boolean
  var http: Boolean
  var sendto: Boolean
}

object Execute {
  @scala.inline
  def apply(execute: Boolean, http: Boolean, sendto: Boolean): Execute = {
    val __obj = js.Dynamic.literal(execute = execute.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], sendto = sendto.asInstanceOf[js.Any])
    __obj.asInstanceOf[Execute]
  }
}

