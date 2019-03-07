package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地理编码转换的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
trait PlusMapsGeocodeOptions extends js.Object {
  /**
    * 源地址所属的城市
    * 仅在地理编码转换时生效，如果不指定则在全国范围内区配转换。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 源数据的坐标系类型
    * 仅在反向地理编码转换时生效。
    * 	“wgs84”：表示WGS-84坐标系； “gcj02”：表示国测局经纬度坐标系； “bd09”：表示百度墨卡托坐标系； “bd09ll”：表示百度经纬度坐标系；
    * 	默认使用wgs84坐标系。
    * - wgs84: WGS-84坐标系，即GPS设备采集的原始GPS坐标
    * - gcj02: 国测局经纬度坐标系，soso地图、aliyun地图、mapabc地图和amap地图所用的坐标系
    * - bd09: 百度墨卡托坐标系
    * - bd09ll: 百度经纬度坐标系
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var coordType: js.UndefOr[
    html5plusLib.html5plusLibStrings.wgs84 | html5plusLib.html5plusLibStrings.gcj02 | html5plusLib.html5plusLibStrings.bd09 | html5plusLib.html5plusLibStrings.bd09ll
  ] = js.undefined
}

object PlusMapsGeocodeOptions {
  @scala.inline
  def apply(
    city: java.lang.String = null,
    coordType: html5plusLib.html5plusLibStrings.wgs84 | html5plusLib.html5plusLibStrings.gcj02 | html5plusLib.html5plusLibStrings.bd09 | html5plusLib.html5plusLibStrings.bd09ll = null
  ): PlusMapsGeocodeOptions = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (coordType != null) __obj.updateDynamic("coordType")(coordType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusMapsGeocodeOptions]
  }
}

