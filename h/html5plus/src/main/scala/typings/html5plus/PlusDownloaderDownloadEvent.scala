package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 下载任务事件类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
  */
trait PlusDownloaderDownloadEvent extends StObject {
  
  /**
    * 下载任务状态变化事件
    * 当下载任务状态发生变化时触发此事件，事件原型参考DownloadStateChangedCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var statechanged: js.UndefOr[String] = js.undefined
}
object PlusDownloaderDownloadEvent {
  
  inline def apply(): PlusDownloaderDownloadEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusDownloaderDownloadEvent]
  }
  
  extension [Self <: PlusDownloaderDownloadEvent](x: Self) {
    
    inline def setStatechanged(value: String): Self = StObject.set(x, "statechanged", value.asInstanceOf[js.Any])
    
    inline def setStatechangedUndefined: Self = StObject.set(x, "statechanged", js.undefined)
  }
}
