package typings.math3d

import typings.math3d.math3dMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Angle extends js.Object {
  var angle: Double
  var axis: Vector3
}

object Anon_Angle {
  @scala.inline
  def apply(angle: Double, axis: Vector3): Anon_Angle = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Angle]
  }
}

