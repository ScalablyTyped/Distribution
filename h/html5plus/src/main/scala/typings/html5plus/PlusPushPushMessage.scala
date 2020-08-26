package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，推送消息对象
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
  */
@js.native
trait PlusPushPushMessage extends js.Object {
  /**
    * Apple APNS推送协议数据
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var aps: js.UndefOr[js.Any] = js.native
  /**
    * 推送消息显示的内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var content: js.UndefOr[String] = js.native
  /**
    * 推送消息承载的数据
    * 如果推送消息中传输的数据不符合JSON格式，则作为String类型数据保存。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var payload: js.UndefOr[js.Any] = js.native
  /**
    * 推送消息显示的标题
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var title: js.UndefOr[String] = js.native
}

object PlusPushPushMessage {
  @scala.inline
  def apply(): PlusPushPushMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPushPushMessage]
  }
  @scala.inline
  implicit class PlusPushPushMessageOps[Self <: PlusPushPushMessage] (val x: Self) extends AnyVal {
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
    def setAps(value: js.Any): Self = this.set("aps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAps: Self = this.set("aps", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

