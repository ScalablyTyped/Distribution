package typings.html5plus

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 联系人对象
  * 联系人对象，包括联系人的各种信息，如名称、电话号码、地址等。也包括新增、删除联系人的操作方法。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
  */
@js.native
trait PlusContactsContact extends StObject {
  
  /**
    * 数组，联系人的地址
    * 如果联系人中未保存地址信息，则返回空数组。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var addresses: js.UndefOr[PlusContactsContactAddress] = js.native
  
  /**
    * 联系人的生日
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var birthday: js.UndefOr[Date] = js.native
  
  /**
    * 数组，联系人的组名
    * 如果联系人中未保存组名信息，则返回空数组。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var categories: js.UndefOr[PlusContactsContactField] = js.native
  
  /**
    * 联系人显示的名字
    * 联系人显示的名字通常由其姓和名组合而成。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * 数组，联系人的邮箱
    * 如果联系人中未保存邮箱信息，则返回空数组。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var emails: js.UndefOr[PlusContactsContactField] = js.native
  
  /**
    * 联系人的id
    * 联系人id由系统分配维护，从系统获取联系人时自动赋值，再次查询时可使用此id值进行检索。
    *     注意：此值为只读属性，改写此值可能会导致无法预期的错误。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 数组，联系人的即时通讯地址
    * 如果联系人中未保存即时通讯地址信息，则返回空数组。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var ims: js.UndefOr[PlusContactsContactField] = js.native
  
  /**
    * 联系人的名称
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var name: js.UndefOr[PlusContactsContactName] = js.native
  
  /**
    * 联系人的昵称
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var nickname: js.UndefOr[String] = js.native
  
  /**
    * 联系人的备注
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * 数组，联系人所属组织信息
    * 如果联系人中未保存所属组织信息，则返回空数组。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var organizations: js.UndefOr[PlusContactsContactOrganization] = js.native
  
  /**
    * 数组，联系人的电话
    * 如果联系人中未保存电话信息，则返回空数组。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var phoneNumbers: js.UndefOr[PlusContactsContactField] = js.native
  
  /**
    * 数组，联系人的头像
    * 其值为头像图片url地址或图片数据：
    *     url地址：仅支持本地图片地址，可以是绝对路径或相对路径，如“_doc/a.png”；
    *     图片数据：必须符合Data URI scheme（RFC2397）格式的数据，如“image/png;base64,XXXX”，其中XXXX为base64编码的图片数据。在获取联系人时默认返回此类型的数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var photos: js.UndefOr[PlusContactsContactField] = js.native
  
  /**
    * 删除联系人
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  def remove(): Unit = js.native
  def remove(successCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def remove(successCB: js.Function0[Unit]): Unit = js.native
  def remove(successCB: js.Function0[Unit], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  
  /**
    * 保存联系人
    * 将联系人数据保存到通讯录中，操作成功将通过successCB回调函数返回保存结果，操作失败将通过通过errorCB回调函数返回错误信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  def save(): Unit = js.native
  def save(successCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def save(successCB: js.Function0[Unit]): Unit = js.native
  def save(successCB: js.Function0[Unit], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  
  /**
    * 数组，联系人的网址
    * 如果联系人中未保存网址信息，则返回空数组。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/contacts.html](http://www.html5plus.org/doc/zh_cn/contacts.html)
    */
  var urls: js.UndefOr[PlusContactsContactField] = js.native
}
