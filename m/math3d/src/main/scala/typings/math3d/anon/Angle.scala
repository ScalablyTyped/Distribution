package typings.math3d.anon

import typings.math3d.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Angle extends js.Object {
  var angle: Double = js.native
  var axis: Vector3 = js.native
}

object Angle {
  @scala.inline
  def apply(angle: Double, axis: Vector3): Angle = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angle]
  }
  @scala.inline
  implicit class AngleOps[Self <: Angle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxis(value: Vector3): Self = this.set("axis", value.asInstanceOf[js.Any])
  }
  
}

