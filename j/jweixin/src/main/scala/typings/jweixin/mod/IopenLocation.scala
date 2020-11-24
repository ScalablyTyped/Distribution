package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*=============================设备信息================================*/
/*=============================地理位置================================*/
@js.native
trait IopenLocation extends BaseParams {
  
   // 位置名
  var address: String = js.native
  
   // 地图缩放级别,整形值,范围从1~28。默认为最大
  var infoUrl: String = js.native
  
  var latitude: Double = js.native
  
   // 纬度，浮点数，范围为90 ~ -90
  var longitude: Double = js.native
  
   // 经度，浮点数，范围为180 ~ -180。
  var name: String = js.native
  
   // 地址详情说明
  var scale: Double = js.native
}
object IopenLocation {
  
  @scala.inline
  def apply(address: String, infoUrl: String, latitude: Double, longitude: Double, name: String, scale: Double): IopenLocation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], infoUrl = infoUrl.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IopenLocation]
  }
  
  @scala.inline
  implicit class IopenLocationOps[Self <: IopenLocation] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUrl(value: String): Self = this.set("infoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
  }
}
