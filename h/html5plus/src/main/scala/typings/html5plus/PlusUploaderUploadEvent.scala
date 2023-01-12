package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 上传任务事件类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
  */
trait PlusUploaderUploadEvent extends StObject {
  
  /**
    * 上传任务状态变化事件
    * 当上传任务状态发生变化时触发此事件，事件原型参考UploadStateChangedCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var statechanged: js.UndefOr[String] = js.undefined
}
object PlusUploaderUploadEvent {
  
  inline def apply(): PlusUploaderUploadEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusUploaderUploadEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusUploaderUploadEvent] (val x: Self) extends AnyVal {
    
    inline def setStatechanged(value: String): Self = StObject.set(x, "statechanged", value.asInstanceOf[js.Any])
    
    inline def setStatechangedUndefined: Self = StObject.set(x, "statechanged", js.undefined)
  }
}
