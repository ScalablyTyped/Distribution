package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，联系人所属组织信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
trait PlusContactsContactOrganization extends js.Object {
  /**
    * 联系人所属组织部门
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var department: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 联系人所属组织名称
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 是否为首选项
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var preferred: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 联系人在组织中的职位
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 联系人所属组织类型，如"company"
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PlusContactsContactOrganization {
  @scala.inline
  def apply(
    department: java.lang.String = null,
    name: java.lang.String = null,
    preferred: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): PlusContactsContactOrganization = {
    val __obj = js.Dynamic.literal()
    if (department != null) __obj.updateDynamic("department")(department)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PlusContactsContactOrganization]
  }
}

