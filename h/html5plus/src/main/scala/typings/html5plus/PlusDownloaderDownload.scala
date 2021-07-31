package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Download对象管理一个下载任务
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
  */
@js.native
trait PlusDownloaderDownload extends StObject {
  
  /**
    * 取消下载任务
    * 如果任务未完成，则终止下载，并从任务列表中删除。
    *     如下载未完成，将删除已下载的临时文件，如果下载已完成，将不删除已下载的文件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  def abort(): Unit = js.native
  
  /**
    * 添加下载任务事件监听器
    * 下载任务添加事件监听器后，当监听的事件发生时触发listener回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  def addEventListener(): Unit = js.native
  def addEventListener(`type`: String): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function2[/* result0 */ this.type, /* result1 */ Double, Unit]): Unit = js.native
  def addEventListener(
    `type`: String,
    listener: js.Function2[/* result0 */ this.type, /* result1 */ Double, Unit],
    capture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: String, listener: Unit, capture: Boolean): Unit = js.native
  def addEventListener(`type`: Unit, listener: js.Function2[/* result0 */ this.type, /* result1 */ Double, Unit]): Unit = js.native
  def addEventListener(
    `type`: Unit,
    listener: js.Function2[/* result0 */ this.type, /* result1 */ Double, Unit],
    capture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: Unit, listener: Unit, capture: Boolean): Unit = js.native
  
  /**
    * 已完成下载文件的大小
    * 整数类型，单位为字节（byte），下载任务开始传输数据时，每次触发statechanged事件或下载任务完成时更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var downloadedSize: js.UndefOr[Double] = js.native
  
  /**
    * 下载的文件名称
    * 下载任务在本地保存的文件路径，下载任务完成时更新，可通过此值访问下载的文件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * 获取下载请求HTTP响应头部信息
    * HTTP响应头部全部内容作为未解析的字符串返回，如果没有接收到这个HTTP响应头数据或者下载请求未完成则为空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  def getAllResponseHeaders(): String = js.native
  
  /**
    * 获取下载请求指定的HTTP响应头部的值
    * 其参数是要返回的HTTP响应头部的名称，可以使用任何大小写来制定这个头部名字，和响应头部的比较是不区分大小写的。
    *     如果没有接收到这个头部或者下载请求未完成则为空字符串；如果接收到多个有指定名称的头部，这个头部的值被连接起来并返回，使用逗号和空格分隔开各个头部的值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  def getResponseHeader(): String = js.native
  def getResponseHeader(headerName: String): String = js.native
  
  /**
    * 下载任务的标识
    * 在创建任务时系统自动分配，用于标识下载任务的唯一性。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 下载任务的参数
    * 调用plus.donwloader.createDownload()方法创建下载任务时设置的参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var options: js.UndefOr[PlusDownloaderDownloadOptions] = js.native
  
  /**
    * 暂停下载任务
    * 暂停下载任务，如果任务已经处于初始状态或暂停状态则无任何响应。
    *     通常在任务已开始后暂停任务。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  def pause(): Unit = js.native
  
  /**
    * 恢复暂停的下载任务
    * 继续暂停的下载任务，如果任务处于非暂停状态则无任何响应。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  def resume(): Unit = js.native
  
  /**
    * 设置下载请求的HTTP头数据
    * Http的Header应该包含在通过后续start()调用而发起的请求中，此方法必需在调用start()之前设置才能生效。
    *     如果带有指定名称的头部已经被指定了，这个头部的新值就是：之前指定的值，加上逗号、以及这个调用指定的值（形成一个数组）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  def setRequestHeader(): Unit = js.native
  def setRequestHeader(headerName: String): Unit = js.native
  def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
  def setRequestHeader(headerName: Unit, headerValue: String): Unit = js.native
  
  /**
    * 开始下载任务
    * 开始下载任务，如果任务已经处于开始状态则无任何响应。
    *     在创建任务或任务下载失败后调用可重新开始下载。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  def start(): Unit = js.native
  
  /**
    * 任务的状态
    * 表示当前下载任务的状态，可通过addEventListener()方法监听statechanged事件监听任务状态的变化。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var state: js.UndefOr[PlusDownloaderDownloadState] = js.native
  
  /**
    * 下载任务文件的总大小
    * 整数类型，单位为字节（byte），下载任务开始传输数据时更新，在此之前其值为0。
    *     此值是从HTTP请求头中获取，如果服务器未返回则此值始终为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var totalSize: js.UndefOr[Double] = js.native
  
  /**
    * 下载文件的地址
    * 调用plus.donwloader.createDownload()方法创建下载任务时设置的值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var url: js.UndefOr[String] = js.native
}
