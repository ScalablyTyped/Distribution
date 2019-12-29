package typings.html5plus

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
  @JSName("text/html")
  var textSlashhtml: js.UndefOr[String] = js.undefined
  /**
    * 文本类型
    * 纯文本类型消息体内容，默认消息体内容类型。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  @JSName("text/plain")
  var textSlashplain: js.UndefOr[String] = js.undefined
}

object PlusMessagingBodyType {
  @scala.inline
  def apply(textSlashhtml: String = null, textSlashplain: String = null): PlusMessagingBodyType = {
    val __obj = js.Dynamic.literal()
    if (textSlashhtml != null) __obj.updateDynamic("text/html")(textSlashhtml.asInstanceOf[js.Any])
    if (textSlashplain != null) __obj.updateDynamic("text/plain")(textSlashplain.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusMessagingBodyType]
  }
}

