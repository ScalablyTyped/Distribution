package typings
package jeeDashJsfLib.jsfNs.ajaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestData extends js.Object {
  var description: java.lang.String
  var status: java.lang.String
}

object RequestData {
  @scala.inline
  def apply(description: java.lang.String, status: java.lang.String): RequestData = {
    val __obj = js.Dynamic.literal(description = description, status = status)
  
    __obj.asInstanceOf[RequestData]
  }
}

