package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，联系人域数据对象
  * 联系人域数据对象，保存联系人特定域信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
trait PlusContactsContactField extends js.Object {
  /**
    * 是否为首选项
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var preferred: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 联系人域类型，如电话号码中的“mobile”、“home”、“company”
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 联系人域值
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object PlusContactsContactField {
  @scala.inline
  def apply(
    preferred: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): PlusContactsContactField = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PlusContactsContactField]
  }
}

