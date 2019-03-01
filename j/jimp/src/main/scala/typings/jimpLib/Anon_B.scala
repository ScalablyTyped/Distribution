package typings
package jimpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_B extends js.Object {
  var b: coreDashJsLib.Array[scala.Double]
  var g: coreDashJsLib.Array[scala.Double]
  var r: coreDashJsLib.Array[scala.Double]
}

object Anon_B {
  @scala.inline
  def apply(
    b: coreDashJsLib.Array[scala.Double],
    g: coreDashJsLib.Array[scala.Double],
    r: coreDashJsLib.Array[scala.Double]
  ): Anon_B = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("r")(r)
    __obj.asInstanceOf[Anon_B]
  }
}

