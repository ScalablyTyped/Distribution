package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，联系人查找过滤器
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
trait PlusContactsContactFindFilter extends js.Object {
  /**
    * 区配的联系人域，可取联系人的属性名称
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * 区配的逻辑
    * 可取“and”、“or”、“not”，默认值为“and”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var logic: js.UndefOr[String] = js.undefined
  /**
    * 区配的联系人值，可使用区配符号“?”和“*”
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var value: js.UndefOr[String] = js.undefined
}

object PlusContactsContactFindFilter {
  @scala.inline
  def apply(field: String = null, logic: String = null, value: String = null): PlusContactsContactFindFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (logic != null) __obj.updateDynamic("logic")(logic.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusContactsContactFindFilter]
  }
}

