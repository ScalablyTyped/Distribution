package typings
package jointjsLib.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sample extends js.Object {
  var distance: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Sample {
  @scala.inline
  def apply(distance: scala.Double, x: scala.Double, y: scala.Double): Sample = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Sample]
  }
}

