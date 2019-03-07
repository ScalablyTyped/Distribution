package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，地址信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
trait PlusGeolocationAddress extends js.Object {
  /**
    * 城市名称
    * 如“北京市”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 城市代码
    * 如“010”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var cityCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 国家
    * 如“中国”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 区（县）名称
    * 如“朝阳区”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var district: js.UndefOr[java.lang.String] = js.undefined
  /**
    * POI信息
    * 如“电子城．国际电子总部”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var poiName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 邮政编码
    * 如“100016”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 省份名称
    * 如“北京市”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var province: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 街道信息
    * 如“酒仙桥路”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var street: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 获取街道门牌号信息
    * 如“3号”，如果无法获取此信息则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var streetNum: js.UndefOr[java.lang.String] = js.undefined
}

object PlusGeolocationAddress {
  @scala.inline
  def apply(
    city: java.lang.String = null,
    cityCode: java.lang.String = null,
    country: java.lang.String = null,
    district: java.lang.String = null,
    poiName: java.lang.String = null,
    postalCode: java.lang.String = null,
    province: java.lang.String = null,
    street: java.lang.String = null,
    streetNum: java.lang.String = null
  ): PlusGeolocationAddress = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (cityCode != null) __obj.updateDynamic("cityCode")(cityCode)
    if (country != null) __obj.updateDynamic("country")(country)
    if (district != null) __obj.updateDynamic("district")(district)
    if (poiName != null) __obj.updateDynamic("poiName")(poiName)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (province != null) __obj.updateDynamic("province")(province)
    if (street != null) __obj.updateDynamic("street")(street)
    if (streetNum != null) __obj.updateDynamic("streetNum")(streetNum)
    __obj.asInstanceOf[PlusGeolocationAddress]
  }
}

