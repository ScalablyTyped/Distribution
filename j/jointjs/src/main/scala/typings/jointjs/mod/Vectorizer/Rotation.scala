package typings.jointjs.mod.Vectorizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rotation extends js.Object {
  var angle: Double = js.native
  var cx: js.UndefOr[Double] = js.native
  var cy: js.UndefOr[Double] = js.native
}

object Rotation {
  @scala.inline
  def apply(angle: Double): Rotation = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotation]
  }
  @scala.inline
  implicit class RotationOps[Self <: Rotation] (val x: Self) extends AnyVal {
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
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
  }
  
}

