package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Left extends js.Object {
  var left: Double = js.native
  var width: Double = js.native
}

object Left {
  @scala.inline
  def apply(left: Double, width: Double): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

