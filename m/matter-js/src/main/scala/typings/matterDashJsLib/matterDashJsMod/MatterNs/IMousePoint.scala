package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMousePoint extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object IMousePoint {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): IMousePoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[IMousePoint]
  }
}

