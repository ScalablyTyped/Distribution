package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，推送消息对象
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
  */
trait PlusPushPushMessage extends js.Object {
  /**
    * Apple APNS推送协议数据
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var aps: js.UndefOr[js.Any] = js.undefined
  /**
    * 推送消息显示的内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * 推送消息承载的数据
    * 如果推送消息中传输的数据不符合JSON格式，则作为String类型数据保存。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var payload: js.UndefOr[js.Any] = js.undefined
  /**
    * 推送消息显示的标题
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var title: js.UndefOr[String] = js.undefined
}

object PlusPushPushMessage {
  @scala.inline
  def apply(aps: js.Any = null, content: String = null, payload: js.Any = null, title: String = null): PlusPushPushMessage = {
    val __obj = js.Dynamic.literal()
    if (aps != null) __obj.updateDynamic("aps")(aps)
    if (content != null) __obj.updateDynamic("content")(content)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlusPushPushMessage]
  }
}

