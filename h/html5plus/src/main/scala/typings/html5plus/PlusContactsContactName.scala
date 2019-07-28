package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，联系人名称对象
  * 联系人名称对象，保存联系人名称信息，如姓、名等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
trait PlusContactsContactName extends js.Object {
  /**
    * 联系人的姓
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var familyName: js.UndefOr[String] = js.undefined
  /**
    * 联系人的完整名称，由其它字段组合生成
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var formatted: js.UndefOr[String] = js.undefined
  /**
    * 联系人的名
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var givenName: js.UndefOr[String] = js.undefined
  /**
    * 联系人的前缀（如Mr.或Dr.）
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var honorificPrefix: js.UndefOr[String] = js.undefined
  /**
    * 联系人的后缀
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var honorificSuffix: js.UndefOr[String] = js.undefined
  /**
    * 联系人的中间名
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var middleName: js.UndefOr[String] = js.undefined
}

object PlusContactsContactName {
  @scala.inline
  def apply(
    familyName: String = null,
    formatted: String = null,
    givenName: String = null,
    honorificPrefix: String = null,
    honorificSuffix: String = null,
    middleName: String = null
  ): PlusContactsContactName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    if (honorificPrefix != null) __obj.updateDynamic("honorificPrefix")(honorificPrefix)
    if (honorificSuffix != null) __obj.updateDynamic("honorificSuffix")(honorificSuffix)
    if (middleName != null) __obj.updateDynamic("middleName")(middleName)
    __obj.asInstanceOf[PlusContactsContactName]
  }
}

