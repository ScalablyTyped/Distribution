package typings.html5plus

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
  var country: js.UndefOr[String] = js.undefined
  /**
    * 完整地址，由其它字段组合而成
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var formatted: js.UndefOr[String] = js.undefined
  /**
    * 城市或地区
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var locality: js.UndefOr[String] = js.undefined
  /**
    * 邮政编码
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var postalCode: js.UndefOr[String] = js.undefined
  /**
    * 是否为首选项
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var preferred: js.UndefOr[Boolean] = js.undefined
  /**
    * 省或地区
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var region: js.UndefOr[String] = js.undefined
  /**
    * 完整的街道地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var streetAddress: js.UndefOr[String] = js.undefined
  /**
    * 联系人地址类型，如“home”表示家庭地址、“company”表示单位地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object PlusContactsContactAddress {
  @scala.inline
  def apply(
    country: String = null,
    formatted: String = null,
    locality: String = null,
    postalCode: String = null,
    preferred: js.UndefOr[Boolean] = js.undefined,
    region: String = null,
    streetAddress: String = null,
    `type`: String = null
  ): PlusContactsContactAddress = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusContactsContactAddress]
  }
}

