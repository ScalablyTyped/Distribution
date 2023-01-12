package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 消息体内容类型
  * 用于设定消息的消息体内容。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/messaging.html](http://www.html5plus.org/doc/zh_cn/messaging.html)
  */
trait PlusMessagingBodyType extends StObject {
  
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
  
  inline def apply(): PlusMessagingBodyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusMessagingBodyType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusMessagingBodyType] (val x: Self) extends AnyVal {
    
    inline def setTextSlashhtml(value: String): Self = StObject.set(x, "text/html", value.asInstanceOf[js.Any])
    
    inline def setTextSlashhtmlUndefined: Self = StObject.set(x, "text/html", js.undefined)
    
    inline def setTextSlashplain(value: String): Self = StObject.set(x, "text/plain", value.asInstanceOf[js.Any])
    
    inline def setTextSlashplainUndefined: Self = StObject.set(x, "text/plain", js.undefined)
  }
}
