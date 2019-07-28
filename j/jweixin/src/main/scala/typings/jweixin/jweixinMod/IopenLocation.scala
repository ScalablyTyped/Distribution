package typings.jweixin.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================设备信息================================*/
/*=============================地理位置================================*/
trait IopenLocation extends BaseParams {
   // 位置名
  var address: String
   // 地图缩放级别,整形值,范围从1~28。默认为最大
  var infoUrl: String
  var latitude: Double
   // 纬度，浮点数，范围为90 ~ -90
  var longitude: Double
   // 经度，浮点数，范围为180 ~ -180。
  var name: String
   // 地址详情说明
  var scale: Double
}

object IopenLocation {
  @scala.inline
  def apply(
    address: String,
    infoUrl: String,
    latitude: Double,
    longitude: Double,
    name: String,
    scale: Double,
    complete: /* repeated */ js.Any => Unit = null,
    fail: /* repeated */ js.Any => Unit = null,
    success: /* repeated */ js.Any => Unit = null
  ): IopenLocation = {
    val __obj = js.Dynamic.literal(address = address, infoUrl = infoUrl, latitude = latitude, longitude = longitude, name = name, scale = scale)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IopenLocation]
  }
}

