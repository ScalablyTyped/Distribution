package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contacts模块管理系统通讯录，用于可对系统通讯录进行增、删、改、查等操作。通过plus.contacts获取系统通讯录管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
@js.native
trait PlusContacts extends js.Object {
  /**
    * 手机通讯录
    * 通讯录类型常量，数值类型，固定值为0，用于获取系统的联系人信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var ADDRESSBOOK_PHONE: js.UndefOr[Double] = js.native
  /**
    * SIM卡通讯录
    * 通讯录类型常量，数值类型，固定值为1，用于获取SIM卡上的联系人信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var ADDRESSBOOK_SIM: js.UndefOr[Double] = js.native
  /**
    * 通讯录对象
    * 通讯录管理对象，可对系统通讯录进行联系人的增、删、改、查操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var AddressBook: js.UndefOr[PlusContactsAddressBook] = js.native
  /**
    * 联系人对象
    * 联系人对象，包括联系人的各种信息，如名称、电话号码、地址等。也包括新增、删除联系人的操作方法。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var Contact: js.UndefOr[PlusContactsContact] = js.native
  /**
    * JSON对象，联系人地址对象
    * 联系人地址对象，保存联系人地址信息，如国家、省份、城市等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var ContactAddress: js.UndefOr[PlusContactsContactAddress] = js.native
  /**
    * JSON对象，联系人域数据对象
    * 联系人域数据对象，保存联系人特定域信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var ContactField: js.UndefOr[PlusContactsContactField] = js.native
  /**
    * JSON对象，联系人查找过滤器
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var ContactFindFilter: js.UndefOr[PlusContactsContactFindFilter] = js.native
  /**
    * JSON对象，查找联系人参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var ContactFindOption: js.UndefOr[PlusContactsContactFindOption] = js.native
  /**
    * JSON对象，联系人名称对象
    * 联系人名称对象，保存联系人名称信息，如姓、名等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var ContactName: js.UndefOr[PlusContactsContactName] = js.native
  /**
    * JSON对象，联系人所属组织信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var ContactOrganization: js.UndefOr[PlusContactsContactOrganization] = js.native
  /**
    * 获取通讯录对象
    * 根据指定通讯录类型获取通讯录对象，获取通讯录对象后可对其进行增、删、改操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  def getAddressBook(): Unit = js.native
  def getAddressBook(`type`: Double): Unit = js.native
  def getAddressBook(`type`: Double, successCB: js.Function1[/* result */ PlusContactsAddressBook, Unit]): Unit = js.native
  def getAddressBook(
    `type`: Double,
    successCB: js.Function1[/* result */ PlusContactsAddressBook, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
}

