package typings.jsonpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Floats extends js.Object {
  var floats: js.Array[Double]
  var integers: js.Array[Double]
  var strings: js.Array[String]
}

object Floats {
  @scala.inline
  def apply(floats: js.Array[Double], integers: js.Array[Double], strings: js.Array[String]): Floats = {
    val __obj = js.Dynamic.literal(floats = floats.asInstanceOf[js.Any], integers = integers.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Floats]
  }
}

