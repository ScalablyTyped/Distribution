package typings
package html5plusLib

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
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 区配的逻辑
    * 可取“and”、“or”、“not”，默认值为“and”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var logic: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 区配的联系人值，可使用区配符号“?”和“*”
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object PlusContactsContactFindFilter {
  @scala.inline
  def apply(field: java.lang.String = null, logic: java.lang.String = null, value: java.lang.String = null): PlusContactsContactFindFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (logic != null) __obj.updateDynamic("logic")(logic)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PlusContactsContactFindFilter]
  }
}

