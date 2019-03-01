package typings
package jweixinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accuracy extends js.Object {
   // 速度，以米/每秒计
  var accuracy: scala.Double
  var latitude: scala.Double
   // 纬度，浮点数，范围为90 ~ -90
  var longitude: scala.Double
   // 经度，浮点数，范围为180 ~ -180。
  var speed: scala.Double
}

object Anon_Accuracy {
  @scala.inline
  def apply(accuracy: scala.Double, latitude: scala.Double, longitude: scala.Double, speed: scala.Double): Anon_Accuracy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accuracy")(accuracy)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("speed")(speed)
    __obj.asInstanceOf[Anon_Accuracy]
  }
}

