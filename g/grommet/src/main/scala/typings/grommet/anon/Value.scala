package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var color: String
  var value: Double | js.Array[Double]
}

object Value {
  @scala.inline
  def apply(color: String, value: Double | js.Array[Double]): Value = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

