package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*=============================设备信息================================*/
/*=============================地理位置================================*/
trait IopenLocation
  extends StObject
     with BaseParams {
  
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
  
  inline def apply(address: String, infoUrl: String, latitude: Double, longitude: Double, name: String, scale: Double): IopenLocation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], infoUrl = infoUrl.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IopenLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IopenLocation] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setInfoUrl(value: String): Self = StObject.set(x, "infoUrl", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
