package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，联系人地址对象
  * 联系人地址对象，保存联系人地址信息，如国家、省份、城市等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
trait PlusContactsContactAddress extends js.Object {
  /**
    * 国家
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 完整地址，由其它字段组合而成
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var formatted: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 城市或地区
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var locality: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 邮政编码
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 是否为首选项
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var preferred: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 省或地区
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 完整的街道地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var streetAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 联系人地址类型，如“home”表示家庭地址、“company”表示单位地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PlusContactsContactAddress {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    formatted: java.lang.String = null,
    locality: java.lang.String = null,
    postalCode: java.lang.String = null,
    preferred: js.UndefOr[scala.Boolean] = js.undefined,
    region: java.lang.String = null,
    streetAddress: java.lang.String = null,
    `type`: java.lang.String = null
  ): PlusContactsContactAddress = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred)
    if (region != null) __obj.updateDynamic("region")(region)
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PlusContactsContactAddress]
  }
}

