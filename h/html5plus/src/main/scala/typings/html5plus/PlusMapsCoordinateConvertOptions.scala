package typings.html5plus

import typings.html5plus.html5plusStrings.bd09
import typings.html5plus.html5plusStrings.bd09ll
import typings.html5plus.html5plusStrings.gcj02
import typings.html5plus.html5plusStrings.wgs84
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地图坐标转换的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsCoordinateConvertOptions extends StObject {
  
  /**
    * 源数据的坐标系类型
    * “wgs84”：表示WGS-84坐标系； “gcj02”：表示国测局经纬度坐标系； “bd09”：表示百度墨卡托坐标系； “bd09ll”：表示百度经纬度坐标系；
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
object PlusMapsCoordinateConvertOptions {
  
  @scala.inline
  def apply(): PlusMapsCoordinateConvertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusMapsCoordinateConvertOptions]
  }
  
  @scala.inline
  implicit class PlusMapsCoordinateConvertOptionsMutableBuilder[Self <: PlusMapsCoordinateConvertOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordType(value: wgs84 | gcj02 | bd09 | bd09ll): Self = StObject.set(x, "coordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordTypeUndefined: Self = StObject.set(x, "coordType", js.undefined)
  }
}
