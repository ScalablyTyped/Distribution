package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，查找联系人参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
trait PlusContactsContactFindOption extends js.Object {
  /**
    * 数组，查找时的过滤器
    * 可设置为空，表示不过滤。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var filter: js.UndefOr[PlusContactsContactFindFilter] = js.undefined
  /**
    * 是否查找多个联系人，默认值为true
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
}

object PlusContactsContactFindOption {
  @scala.inline
  def apply(filter: PlusContactsContactFindFilter = null, multiple: js.UndefOr[Boolean] = js.undefined): PlusContactsContactFindOption = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusContactsContactFindOption]
  }
}

