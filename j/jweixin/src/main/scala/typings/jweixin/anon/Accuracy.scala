package typings.jweixin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accuracy extends js.Object {
   // 速度，以米/每秒计
  var accuracy: Double = js.native
  var latitude: Double = js.native
   // 纬度，浮点数，范围为90 ~ -90
  var longitude: Double = js.native
   // 经度，浮点数，范围为180 ~ -180。
  var speed: Double = js.native
}

object Accuracy {
  @scala.inline
  def apply(accuracy: Double, latitude: Double, longitude: Double, speed: Double): Accuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accuracy]
  }
  @scala.inline
  implicit class AccuracyOps[Self <: Accuracy] (val x: Self) extends AnyVal {
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
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
  }
  
}

