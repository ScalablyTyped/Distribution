package typings.math3d.anon

import typings.math3d.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Angle extends js.Object {
  var angle: Double
  var axis: Vector3
}

object Angle {
  @scala.inline
  def apply(angle: Double, axis: Vector3): Angle = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angle]
  }
}

