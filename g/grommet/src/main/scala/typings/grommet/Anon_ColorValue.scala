package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorValue extends js.Object {
  var color: String
  var value: Double | js.Array[Double]
}

object Anon_ColorValue {
  @scala.inline
  def apply(color: String, value: Double | js.Array[Double]): Anon_ColorValue = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColorValue]
  }
}

