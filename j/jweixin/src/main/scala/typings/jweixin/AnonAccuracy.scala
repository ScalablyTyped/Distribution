package typings.jweixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccuracy extends js.Object {
   // 速度，以米/每秒计
  var accuracy: Double
  var latitude: Double
   // 纬度，浮点数，范围为90 ~ -90
  var longitude: Double
   // 经度，浮点数，范围为180 ~ -180。
  var speed: Double
}

object AnonAccuracy {
  @scala.inline
  def apply(accuracy: Double, latitude: Double, longitude: Double, speed: Double): AnonAccuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccuracy]
  }
}

