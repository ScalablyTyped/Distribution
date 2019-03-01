package typings
package math3dLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Angle extends js.Object {
  var angle: scala.Double
  var axis: math3dLib.math3dMod.Vector3
}

object Anon_Angle {
  @scala.inline
  def apply(angle: scala.Double, axis: math3dLib.math3dMod.Vector3): Anon_Angle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("angle")(angle)
    __obj.updateDynamic("axis")(axis)
    __obj.asInstanceOf[Anon_Angle]
  }
}

