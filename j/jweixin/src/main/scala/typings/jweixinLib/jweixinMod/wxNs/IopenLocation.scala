package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================设备信息================================*/
/*=============================地理位置================================*/
trait IopenLocation extends BaseParams {
   // 位置名
  var address: java.lang.String
   // 地图缩放级别,整形值,范围从1~28。默认为最大
  var infoUrl: java.lang.String
  var latitude: scala.Double
   // 纬度，浮点数，范围为90 ~ -90
  var longitude: scala.Double
   // 经度，浮点数，范围为180 ~ -180。
  var name: java.lang.String
   // 地址详情说明
  var scale: scala.Double
}

object IopenLocation {
  @scala.inline
  def apply(
    address: java.lang.String,
    infoUrl: java.lang.String,
    latitude: scala.Double,
    longitude: scala.Double,
    name: java.lang.String,
    scale: scala.Double,
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fail: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    success: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): IopenLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("infoUrl")(infoUrl)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("scale")(scale)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[IopenLocation]
  }
}

