package typings.jweixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accuracy extends js.Object {
   // 速度，以米/每秒计
  var accuracy: Double
  var latitude: Double
   // 纬度，浮点数，范围为90 ~ -90
  var longitude: Double
   // 经度，浮点数，范围为180 ~ -180。
  var speed: Double
}

object Anon_Accuracy {
  @scala.inline
  def apply(accuracy: Double, latitude: Double, longitude: Double, speed: Double): Anon_Accuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, latitude = latitude, longitude = longitude, speed = speed)
  
    __obj.asInstanceOf[Anon_Accuracy]
  }
}

