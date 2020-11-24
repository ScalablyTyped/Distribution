package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 消息体内容类型
  * 用于设定消息的消息体内容。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
  */
@js.native
trait PlusMessagingBodyType extends js.Object {
  
  /**
    * Html类型
    * 网页数据类型消息体内容，可用于发送邮件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  @JSName("text/html")
  var textSlashhtml: js.UndefOr[String] = js.native
  
  /**
    * 文本类型
    * 纯文本类型消息体内容，默认消息体内容类型。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
    */
  @JSName("text/plain")
  var textSlashplain: js.UndefOr[String] = js.native
}
object PlusMessagingBodyType {
  
  @scala.inline
  def apply(): PlusMessagingBodyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusMessagingBodyType]
  }
  
  @scala.inline
  implicit class PlusMessagingBodyTypeOps[Self <: PlusMessagingBodyType] (val x: Self) extends AnyVal {
    
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
    def setTextSlashhtml(value: String): Self = this.set("text/html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSlashhtml: Self = this.set("text/html", js.undefined)
    
    @scala.inline
    def setTextSlashplain(value: String): Self = this.set("text/plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSlashplain: Self = this.set("text/plain", js.undefined)
  }
}
