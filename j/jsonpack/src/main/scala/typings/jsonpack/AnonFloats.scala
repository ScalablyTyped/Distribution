package typings.jsonpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFloats extends js.Object {
  var floats: js.Array[Double]
  var integers: js.Array[Double]
  var strings: js.Array[String]
}

object AnonFloats {
  @scala.inline
  def apply(floats: js.Array[Double], integers: js.Array[Double], strings: js.Array[String]): AnonFloats = {
    val __obj = js.Dynamic.literal(floats = floats.asInstanceOf[js.Any], integers = integers.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFloats]
  }
}

