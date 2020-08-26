package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，查找联系人参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
@js.native
trait PlusContactsContactFindOption extends js.Object {
  /**
    * 数组，查找时的过滤器
    * 可设置为空，表示不过滤。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var filter: js.UndefOr[PlusContactsContactFindFilter] = js.native
  /**
    * 是否查找多个联系人，默认值为true
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var multiple: js.UndefOr[Boolean] = js.native
}

object PlusContactsContactFindOption {
  @scala.inline
  def apply(): PlusContactsContactFindOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusContactsContactFindOption]
  }
  @scala.inline
  implicit class PlusContactsContactFindOptionOps[Self <: PlusContactsContactFindOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilter(value: PlusContactsContactFindFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
  }
  
}

