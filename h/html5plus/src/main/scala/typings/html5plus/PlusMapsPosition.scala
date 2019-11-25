package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 检索结果的位置点
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
trait PlusMapsPosition extends js.Object {
  /**
    * 位置点的地址信息
    * 如果没有位置点的地址信息则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    * 位置点的所属城市信息
    * 如果没有位置点的所属城市信息则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * 位置点的名称
    * 如果没有位置点的名称则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * 位置点的电话信息
    * 如果没有位置点的电话信息则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var phone: js.UndefOr[String] = js.undefined
  /**
    * 位置点的经纬度坐标
    * 如果没有经纬度坐标信息（如果公交、地铁路线数据等），则其值为undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var point: js.UndefOr[PlusMapsPoint] = js.undefined
  /**
    * 位置点的邮编信息
    * 如果没有位置点的邮编信息则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var postcode: js.UndefOr[String] = js.undefined
}

object PlusMapsPosition {
  @scala.inline
  def apply(
    address: String = null,
    city: String = null,
    name: String = null,
    phone: String = null,
    point: PlusMapsPoint = null,
    postcode: String = null
  ): PlusMapsPosition = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (postcode != null) __obj.updateDynamic("postcode")(postcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusMapsPosition]
  }
}

