package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GyroMPU6050Option extends GyroGeneralOption {
  var sensitivity: Double = js.native
}

object GyroMPU6050Option {
  @scala.inline
  def apply(sensitivity: Double): GyroMPU6050Option = {
    val __obj = js.Dynamic.literal(sensitivity = sensitivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyroMPU6050Option]
  }
  @scala.inline
  implicit class GyroMPU6050OptionOps[Self <: GyroMPU6050Option] (val x: Self) extends AnyVal {
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
    def setSensitivity(value: Double): Self = this.set("sensitivity", value.asInstanceOf[js.Any])
  }
  
}

