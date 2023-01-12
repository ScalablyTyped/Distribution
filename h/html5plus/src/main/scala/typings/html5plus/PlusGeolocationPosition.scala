package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，设备位置信息数据
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
trait PlusGeolocationPosition extends StObject {
  
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
  
  inline def apply(): PlusGeolocationPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusGeolocationPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusGeolocationPosition] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: PlusGeolocationAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddresses(value: String): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setCoords(value: PlusGeolocationCoordinates): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setCoordsType(value: String): Self = StObject.set(x, "coordsType", value.asInstanceOf[js.Any])
    
    inline def setCoordsTypeUndefined: Self = StObject.set(x, "coordsType", js.undefined)
    
    inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
