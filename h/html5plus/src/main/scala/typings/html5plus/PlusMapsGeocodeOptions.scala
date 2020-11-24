package typings.html5plus

import typings.html5plus.html5plusStrings.bd09
import typings.html5plus.html5plusStrings.bd09ll
import typings.html5plus.html5plusStrings.gcj02
import typings.html5plus.html5plusStrings.wgs84
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地理编码转换的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsGeocodeOptions extends js.Object {
  
  /**
    * 源地址所属的城市
    * 仅在地理编码转换时生效，如果不指定则在全国范围内区配转换。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * 源数据的坐标系类型
    * 仅在反向地理编码转换时生效。
    *     “wgs84”：表示WGS-84坐标系； “gcj02”：表示国测局经纬度坐标系； “bd09”：表示百度墨卡托坐标系； “bd09ll”：表示百度经纬度坐标系；
    *     默认使用wgs84坐标系。
    * - wgs84: WGS-84坐标系，即GPS设备采集的原始GPS坐标
    * - gcj02: 国测局经纬度坐标系，soso地图、aliyun地图、mapabc地图和amap地图所用的坐标系
    * - bd09: 百度墨卡托坐标系
    * - bd09ll: 百度经纬度坐标系
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var coordType: js.UndefOr[wgs84 | gcj02 | bd09 | bd09ll] = js.native
}
object PlusMapsGeocodeOptions {
  
  @scala.inline
  def apply(): PlusMapsGeocodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusMapsGeocodeOptions]
  }
  
  @scala.inline
  implicit class PlusMapsGeocodeOptionsOps[Self <: PlusMapsGeocodeOptions] (val x: Self) extends AnyVal {
    
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCoordType(value: wgs84 | gcj02 | bd09 | bd09ll): Self = this.set("coordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordType: Self = this.set("coordType", js.undefined)
  }
}
