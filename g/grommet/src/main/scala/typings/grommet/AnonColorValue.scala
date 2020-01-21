package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorValue extends js.Object {
  var color: String
  var value: Double | js.Array[Double]
}

object AnonColorValue {
  @scala.inline
  def apply(color: String, value: Double | js.Array[Double]): AnonColorValue = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColorValue]
  }
}

