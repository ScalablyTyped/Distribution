package typings.jeeDashJsf.jsfNs.ajaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestData extends js.Object {
  var description: String
  var status: String
}

object RequestData {
  @scala.inline
  def apply(description: String, status: String): RequestData = {
    val __obj = js.Dynamic.literal(description = description, status = status)
  
    __obj.asInstanceOf[RequestData]
  }
}

