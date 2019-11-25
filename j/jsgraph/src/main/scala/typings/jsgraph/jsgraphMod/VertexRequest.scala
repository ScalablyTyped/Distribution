package typings.jsgraph.jsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexRequest extends js.Object {
  var p: js.Any
  var u: String
}

object VertexRequest {
  @scala.inline
  def apply(p: js.Any, u: String): VertexRequest = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VertexRequest]
  }
}

