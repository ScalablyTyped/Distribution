package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，地址信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
@js.native
trait PlusGeolocationAddress extends js.Object {
  /**
    * 城市名称
    * 如“北京市”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var city: js.UndefOr[String] = js.native
  /**
    * 城市代码
    * 如“010”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var cityCode: js.UndefOr[String] = js.native
  /**
    * 国家
    * 如“中国”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var country: js.UndefOr[String] = js.native
  /**
    * 区（县）名称
    * 如“朝阳区”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var district: js.UndefOr[String] = js.native
  /**
    * POI信息
    * 如“电子城．国际电子总部”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var poiName: js.UndefOr[String] = js.native
  /**
    * 邮政编码
    * 如“100016”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * 省份名称
    * 如“北京市”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var province: js.UndefOr[String] = js.native
  /**
    * 街道信息
    * 如“酒仙桥路”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var street: js.UndefOr[String] = js.native
  /**
    * 获取街道门牌号信息
    * 如“3号”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var streetNum: js.UndefOr[String] = js.native
}

object PlusGeolocationAddress {
  @scala.inline
  def apply(): PlusGeolocationAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusGeolocationAddress]
  }
  @scala.inline
  implicit class PlusGeolocationAddressOps[Self <: PlusGeolocationAddress] (val x: Self) extends AnyVal {
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
    def setCityCode(value: String): Self = this.set("cityCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCityCode: Self = this.set("cityCode", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setDistrict(value: String): Self = this.set("district", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistrict: Self = this.set("district", js.undefined)
    @scala.inline
    def setPoiName(value: String): Self = this.set("poiName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoiName: Self = this.set("poiName", js.undefined)
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvince: Self = this.set("province", js.undefined)
    @scala.inline
    def setStreet(value: String): Self = this.set("street", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreet: Self = this.set("street", js.undefined)
    @scala.inline
    def setStreetNum(value: String): Self = this.set("streetNum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetNum: Self = this.set("streetNum", js.undefined)
  }
  
}

