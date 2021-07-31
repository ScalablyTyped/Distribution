package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，应用角标显示需要的通知栏消息的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
  */
trait PlusRuntimeBadgeOptions extends StObject {
  
  /**
    * 消息的内容
    * 默认值为“您有x条未读消息"”，其中x未设置的角标数字值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * 消息的标题
    * 默认值为应用的名称。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var title: js.UndefOr[String] = js.undefined
}
object PlusRuntimeBadgeOptions {
  
  @scala.inline
  def apply(): PlusRuntimeBadgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusRuntimeBadgeOptions]
  }
  
  @scala.inline
  implicit class PlusRuntimeBadgeOptionsMutableBuilder[Self <: PlusRuntimeBadgeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
