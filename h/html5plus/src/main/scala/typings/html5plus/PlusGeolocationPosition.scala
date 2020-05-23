package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，设备位置信息数据
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
trait PlusGeolocationPosition extends js.Object {
  /**
    * 获取到地理位置对应的地址信息
    * 获取地址信息需要连接到服务器进行解析，所以会消耗更多的资源，如果不需要获取地址信息可通过设置PositionOptions参数的geocode属性值为false避免获取地址信息。
    *     如果没有获取到地址信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var address: js.UndefOr[PlusGeolocationAddress] = js.undefined
  /**
    * 获取完整地址描述信息
    * 如果没有获取到地址信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var addresses: js.UndefOr[String] = js.undefined
  /**
    * 地理坐标信息，包括经纬度、海拔、速度等信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var coords: js.UndefOr[PlusGeolocationCoordinates] = js.undefined
  /**
    * 获取到地理坐标信息的坐标系类型
    * 可取以下坐标系类型：
    *     "gps"：表示WGS-84坐标系；
    *     "gcj02"：表示国测局经纬度坐标系；
    *     "bd09"：表示百度墨卡托坐标系；
    *     "bd09ll"：表示百度经纬度坐标系。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var coordsType: js.UndefOr[String] = js.undefined
  /**
    * 获取到地理坐标的时间戳信息
    * 时间戳值为从1970年1月1日至今的毫秒数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var timestamp: js.UndefOr[Double] = js.undefined
}

object PlusGeolocationPosition {
  @scala.inline
  def apply(
    address: PlusGeolocationAddress = null,
    addresses: String = null,
    coords: PlusGeolocationCoordinates = null,
    coordsType: String = null,
    timestamp: js.UndefOr[Double] = js.undefined
  ): PlusGeolocationPosition = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (coordsType != null) __obj.updateDynamic("coordsType")(coordsType.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusGeolocationPosition]
  }
}

