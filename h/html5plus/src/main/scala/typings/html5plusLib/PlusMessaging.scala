package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Messaging模块管理设备通讯功能，可用于短信、彩信、邮件发送等。通过plus.messaging可获取设备通讯管理对象。另外也可以直接通过html中的href直接快速发送短信、拨打电话、发送邮件等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
  */
@js.native
trait PlusMessaging extends js.Object {
  /**
    * 消息体内容类型
    * 用于设定消息的消息体内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var BodyType: js.UndefOr[PlusMessagingBodyType] = js.native
  /**
    * 消息对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var Message: js.UndefOr[PlusMessagingMessage] = js.native
  /**
    * 邮件类型常量
    * 消息类型常量，Number类型，固定值为3，用于创建并发送邮件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var TYPE_EMAIL: js.UndefOr[scala.Double] = js.native
  /**
    * 彩信类型常量
    * 消息类型常量，Number类型，固定值为2，用于创建并发送多媒体短信（彩信）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var TYPE_MMS: js.UndefOr[scala.Double] = js.native
  /**
    * 简单短信类型常量
    * 消息类型常量，Number类型，固定值为1，用于创建并发送短信。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var TYPE_SMS: js.UndefOr[scala.Double] = js.native
  /**
    * 创建消息对象
    * 创建指定类型的消息，消息类型可取plus.messaging.TYPE_SMS、plus.messaging.TYPE_MMS、plus.messaging.TYPE_EMAIL。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  def createMessage(): PlusMessagingMessage = js.native
  def createMessage(`type`: scala.Double): PlusMessagingMessage = js.native
  /**
    * 发送消息
    * 发送消息，发送成功回调successCB函数，发送失败回调errorCB函数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  def sendMessage(): scala.Unit = js.native
  def sendMessage(msg: PlusMessagingMessage): scala.Unit = js.native
  def sendMessage(msg: PlusMessagingMessage, successCB: js.Function0[scala.Unit]): scala.Unit = js.native
  def sendMessage(
    msg: PlusMessagingMessage,
    successCB: js.Function0[scala.Unit],
    errorCB: js.Function1[/* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

