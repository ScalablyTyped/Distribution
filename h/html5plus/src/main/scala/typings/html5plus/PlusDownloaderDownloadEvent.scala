package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 下载任务事件类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
  */
@js.native
trait PlusDownloaderDownloadEvent extends js.Object {
  
  /**
    * 下载任务状态变化事件
    * 当下载任务状态发生变化时触发此事件，事件原型参考DownloadStateChangedCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var statechanged: js.UndefOr[String] = js.native
}
object PlusDownloaderDownloadEvent {
  
  @scala.inline
  def apply(): PlusDownloaderDownloadEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusDownloaderDownloadEvent]
  }
  
  @scala.inline
  implicit class PlusDownloaderDownloadEventOps[Self <: PlusDownloaderDownloadEvent] (val x: Self) extends AnyVal {
    
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
    def setStatechanged(value: String): Self = this.set("statechanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatechanged: Self = this.set("statechanged", js.undefined)
  }
}
