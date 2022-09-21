package typings.html5plus

import typings.html5plus.html5plusStrings.textSlashhtml
import typings.html5plus.html5plusStrings.textSlashplain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 消息对象
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
  */
@js.native
trait PlusMessagingMessage extends StObject {
  
  /**
    * 添加附件
    * 向消息中添加附件，仅邮件类型消息支持，其它类型消息不支持。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  def addAttachment(): Unit = js.native
  def addAttachment(url: String): Unit = js.native
  
  /**
    * 暗送人信息
    * 字符串数组类型，仅发送邮件时有效，输入的地址收件人信息必须符合消息类型格式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var bcc: js.UndefOr[js.Array[Any]] = js.native
  
  /**
    * 发送消息内容
    * 字符串类型，要发送的消息体内容，其格式必须与bodyType指定的一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * 发送消息内容类型
    * 要发送消息体内容的类型，可取值"text"表示文本内容，"html"表示为html页面，默认值为"text"。
    * - text/plain: 纯文本类型消息体内容
    * - text/html: 网页数据类型消息体内容(用于发送邮件)
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var bodyType: js.UndefOr[textSlashplain | textSlashhtml] = js.native
  
  /**
    * 抄送人信息
    * 字符串数组类型，仅发送邮件时有效，输入的地址收件人信息必须符合消息类型格式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var cc: js.UndefOr[js.Array[Any]] = js.native
  
  /**
    * 发件人信息
    * 仅在监听接收到的信息时有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var from: js.UndefOr[String] = js.native
  
  /**
    * 是否采用静默方式发送消息
    * 布尔类型，可取值为true或false，true表示静默方式发送，不弹出界面；false表示非静默方式发送。默认采用非静默方式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * 发送消息主题
    * 字符串类型，仅发送邮件时有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var subject: js.UndefOr[String] = js.native
  
  /**
    * 收件人信息
    * 字符串数组类型，输入的地址收件人信息必须符合消息类型格式。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var to: js.UndefOr[js.Array[Any]] = js.native
}
