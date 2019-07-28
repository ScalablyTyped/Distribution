package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Downloader模块管理网络文件下载任务，用于从服务器下载各种文件，并支持跨域访问操作。通过plus.downloader获取下载管理对象。Downloader下载使用HTTP的GET/POST方式请求下载文件，符合标准HTTP/HTTPS传输协议。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
  */
@js.native
trait PlusDownloader extends js.Object {
  /**
    * Download对象管理一个下载任务
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var Download: js.UndefOr[PlusDownloaderDownload] = js.native
  /**
    * 下载任务事件类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var DownloadEvent: js.UndefOr[PlusDownloaderDownloadEvent] = js.native
  /**
    * 下载任务参数
    * 在创建下载任务时设置的参数，如设置下载任务使用的HTTP协议类型、优先级等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var DownloadOptions: js.UndefOr[PlusDownloaderDownloadOptions] = js.native
  /**
    * 下载任务状态
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var DownloadState: js.UndefOr[PlusDownloaderDownloadState] = js.native
  /**
    * 清除下载任务
    * 清除指定状态的下载任务。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  def clear(): Unit = js.native
  def clear(state: PlusDownloaderDownloadState): Unit = js.native
  /**
    * 新建下载任务
    * 请求下载管理创建新的下载任务，创建成功则返回Download对象，用于管理下载任务。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  def createDownload(): PlusDownloaderDownload = js.native
  def createDownload(url: String): PlusDownloaderDownload = js.native
  def createDownload(url: String, options: PlusDownloaderDownloadOptions): PlusDownloaderDownload = js.native
  def createDownload(
    url: String,
    options: PlusDownloaderDownloadOptions,
    completedCB: js.Function2[/* result0 */ PlusDownloaderDownload, /* result1 */ Double, Unit]
  ): PlusDownloaderDownload = js.native
  /**
    * 枚举下载任务
    * 枚举指定状态的下载任务列表，通过enumCB回调函数返回结果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  def enumerate(): Unit = js.native
  def enumerate(enumCB: js.Function1[/* result */ js.Array[_], Unit]): Unit = js.native
  def enumerate(enumCB: js.Function1[/* result */ js.Array[_], Unit], state: PlusDownloaderDownloadState): Unit = js.native
  /**
    * 开始所有下载任务
    * 开始所有处于为开始调度或暂停状态的下载任务。
    * 	若下载任务数超过可并发处理的总数，超出的任务处于调度状态（等待下载），当有任务完成时根据调度状态任务的优先级选择任务开始下载。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  def startAll(): Unit = js.native
}

