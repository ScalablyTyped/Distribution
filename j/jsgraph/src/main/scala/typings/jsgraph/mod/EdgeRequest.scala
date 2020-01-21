package typings.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeRequest extends js.Object {
  var e: Edge
  var p: js.Any
}

object EdgeRequest {
  @scala.inline
  def apply(e: Edge, p: js.Any): EdgeRequest = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EdgeRequest]
  }
}

