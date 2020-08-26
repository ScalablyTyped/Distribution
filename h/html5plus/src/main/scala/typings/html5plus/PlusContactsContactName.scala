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
@js.native
trait PlusContactsContactName extends js.Object {
  /**
    * 联系人的姓
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var familyName: js.UndefOr[String] = js.native
  /**
    * 联系人的完整名称，由其它字段组合生成
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var formatted: js.UndefOr[String] = js.native
  /**
    * 联系人的名
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var givenName: js.UndefOr[String] = js.native
  /**
    * 联系人的前缀（如Mr.或Dr.）
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var honorificPrefix: js.UndefOr[String] = js.native
  /**
    * 联系人的后缀
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var honorificSuffix: js.UndefOr[String] = js.native
  /**
    * 联系人的中间名
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var middleName: js.UndefOr[String] = js.native
}

object PlusContactsContactName {
  @scala.inline
  def apply(): PlusContactsContactName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusContactsContactName]
  }
  @scala.inline
  implicit class PlusContactsContactNameOps[Self <: PlusContactsContactName] (val x: Self) extends AnyVal {
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
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    @scala.inline
    def setFormatted(value: String): Self = this.set("formatted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatted: Self = this.set("formatted", js.undefined)
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    @scala.inline
    def setHonorificPrefix(value: String): Self = this.set("honorificPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHonorificPrefix: Self = this.set("honorificPrefix", js.undefined)
    @scala.inline
    def setHonorificSuffix(value: String): Self = this.set("honorificSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHonorificSuffix: Self = this.set("honorificSuffix", js.undefined)
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddleName: Self = this.set("middleName", js.undefined)
  }
  
}

