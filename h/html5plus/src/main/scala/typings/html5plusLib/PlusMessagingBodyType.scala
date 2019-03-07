package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 消息体内容类型
  * 用于设定消息的消息体内容。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
  */
trait PlusMessagingBodyType extends js.Object {
  /**
    * Html类型
    * 网页数据类型消息体内容，可用于发送邮件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var `text/html`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 文本类型
    * 纯文本类型消息体内容，默认消息体内容类型。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  var `text/plain`: js.UndefOr[java.lang.String] = js.undefined
}

object PlusMessagingBodyType {
  @scala.inline
  def apply(`text/html`: java.lang.String = null, `text/plain`: java.lang.String = null): PlusMessagingBodyType = {
    val __obj = js.Dynamic.literal()
    if (`text/html` != null) __obj.updateDynamic("text/html")(`text/html`)
    if (`text/plain` != null) __obj.updateDynamic("text/plain")(`text/plain`)
    __obj.asInstanceOf[PlusMessagingBodyType]
  }
}

