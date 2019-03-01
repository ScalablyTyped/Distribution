package typings
package math3dLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends js.Object {
  var x: scala.Double
  var y: scala.Double
  var z: scala.Double
}

object Anon_X {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double, z: scala.Double): Anon_X = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("z")(z)
    __obj.asInstanceOf[Anon_X]
  }
}

