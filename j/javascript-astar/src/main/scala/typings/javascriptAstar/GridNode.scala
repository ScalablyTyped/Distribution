package typings.javascriptAstar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridNode extends js.Object {
  var x: Double
  var y: Double
}

object GridNode {
  @scala.inline
  def apply(x: Double, y: Double): GridNode = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridNode]
  }
}

