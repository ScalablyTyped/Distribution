package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MotorPins extends js.Object {
  var brake: js.UndefOr[Double] = js.native
  var cdir: js.UndefOr[Double] = js.native
  var dir: Double = js.native
  var pwm: Double = js.native
}

object MotorPins {
  @scala.inline
  def apply(dir: Double, pwm: Double): MotorPins = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotorPins]
  }
  @scala.inline
  implicit class MotorPinsOps[Self <: MotorPins] (val x: Self) extends AnyVal {
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
    def setDir(value: Double): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def setPwm(value: Double): Self = this.set("pwm", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrake(value: Double): Self = this.set("brake", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrake: Self = this.set("brake", js.undefined)
    @scala.inline
    def setCdir(value: Double): Self = this.set("cdir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdir: Self = this.set("cdir", js.undefined)
  }
  
}

