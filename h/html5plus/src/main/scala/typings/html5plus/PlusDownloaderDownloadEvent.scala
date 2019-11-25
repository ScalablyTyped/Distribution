package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 下载任务事件类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
  */
trait PlusDownloaderDownloadEvent extends js.Object {
  /**
    * 下载任务状态变化事件
    * 当下载任务状态发生变化时触发此事件，事件原型参考DownloadStateChangedCallback。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var statechanged: js.UndefOr[String] = js.undefined
}

object PlusDownloaderDownloadEvent {
  @scala.inline
  def apply(statechanged: String = null): PlusDownloaderDownloadEvent = {
    val __obj = js.Dynamic.literal()
    if (statechanged != null) __obj.updateDynamic("statechanged")(statechanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusDownloaderDownloadEvent]
  }
}

