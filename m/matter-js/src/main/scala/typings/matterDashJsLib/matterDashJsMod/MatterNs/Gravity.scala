package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gravity extends Vector {
  var scale: scala.Double
}

object Gravity {
  @scala.inline
  def apply(scale: scala.Double, x: scala.Double, y: scala.Double): Gravity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Gravity]
  }
}

