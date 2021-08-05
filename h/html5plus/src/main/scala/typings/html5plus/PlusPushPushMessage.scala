package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，推送消息对象
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
  */
trait PlusPushPushMessage extends StObject {
  
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
  
  inline def apply(): PlusPushPushMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPushPushMessage]
  }
  
  extension [Self <: PlusPushPushMessage](x: Self) {
    
    inline def setAps(value: js.Any): Self = StObject.set(x, "aps", value.asInstanceOf[js.Any])
    
    inline def setApsUndefined: Self = StObject.set(x, "aps", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
