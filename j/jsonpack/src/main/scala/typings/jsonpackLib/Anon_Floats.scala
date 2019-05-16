package typings
package jsonpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Floats extends js.Object {
  var floats: js.Array[scala.Double]
  var integers: js.Array[scala.Double]
  var strings: js.Array[java.lang.String]
}

object Anon_Floats {
  @scala.inline
  def apply(
    floats: js.Array[scala.Double],
    integers: js.Array[scala.Double],
    strings: js.Array[java.lang.String]
  ): Anon_Floats = {
    val __obj = js.Dynamic.literal(floats = floats, integers = integers, strings = strings)
  
    __obj.asInstanceOf[Anon_Floats]
  }
}

