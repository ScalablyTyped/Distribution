package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Upload对象管理一个上传任务
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
  */
@js.native
trait PlusUploaderUpload extends js.Object {
  /**
    * 上传任务的标识
    * 在创建任务时系统自动分配，用于标识上传任务的唯一性。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * 上传任务的参数
    * 上传任务配置的参数，参考UploadOptions。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var options: js.UndefOr[PlusUploaderUploadOptions] = js.native
  /**
    * 上传任务完成后服务器返回的数据
    * 表示当前上传任务的状态，可通过addEventListener()方法监听statechanged事件监听任务状态的变化。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var responseText: js.UndefOr[String] = js.native
  /**
    * 任务的状态
    * 上传任务的状态，参考UploadState，在UploadCompleteCallback事件和UploadStateChangedCallback事件触发时更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var state: js.UndefOr[Double] = js.native
  /**
    * 上传数据的总大小
    * 整数类型，单位为字节（byte），上传任务开始传输数据时更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var totalSize: js.UndefOr[Double] = js.native
  /**
    * 已完成上传数据的大小）
    * 整数类型，单位为字节（byte），上传任务开始传输数据时，每次触发statechanged事件或上传任务完成更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var uploadedSize: js.UndefOr[Double] = js.native
  /**
    * 上传文件的服务器地址
    * 调用plus.uploader.createUpload()方法创建上传任务时设置的值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var url: js.UndefOr[String] = js.native
  /**
    * 取消上传任务
    * 如果任务未完成，则终止上传，并从任务列表中删除。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def abort(): Unit = js.native
  /**
    * 添加上传数据
    * 向上传任务中添加数据，必须在任务开始上传前调用。
    *     以下情况会导致添加上传文件失败：
    *     1. key参数中指定的键名在任务中已经存在，则添加失败返回false；
    *     2. 上传任务已经开始调度，调用此方法则添加失败返回false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def addData(): Boolean = js.native
  def addData(key: String): Boolean = js.native
  def addData(key: String, value: String): Boolean = js.native
  /**
    * 添加上传任务事件监听器
    * 上传任务添加事件监听器后，当监听的事件发生时触发listener回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def addEventListener(): Unit = js.native
  def addEventListener(`type`: String): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function2[/* result0 */ this.type, /* result1 */ Double, Unit]): Unit = js.native
  def addEventListener(
    `type`: String,
    listener: js.Function2[/* result0 */ this.type, /* result1 */ Double, Unit],
    capture: Boolean
  ): Unit = js.native
  /**
    * 添加上传文件
    * 向上传任务中添加文件，必须在任务开始上传前调用。
    *     以下情况会导致添加上传文件失败：
    *     1. options参数中指定的key在任务中已经存在，则添加失败返回false；
    *     2. path参数指定的文件路径不合法或文件不存在，则添加失败返回false；
    *     3. 上传任务已经开始调度，调用此方法则添加失败返回false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def addFile(): Boolean = js.native
  def addFile(path: String): Boolean = js.native
  def addFile(path: String, options: PlusUploaderUploadFileOptions): Boolean = js.native
  /**
    * 获取上传请求HTTP响应头部信息
    * HTTP响应头部全部内容作为未解析的字符串返回，如果没有接收到这个HTTP响应头数据或者上传请求未完成则为空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def getAllResponseHeaders(): String = js.native
  /**
    * 获取上传请求指定的HTTP响应头部的值
    * 其参数是要返回的HTTP响应头部的名称，可以使用任何大小写来制定这个头部名字，和响应头部的比较是不区分大小写的。
    *     如果没有接收到这个头部或者伤处请求未完成则为空字符串；如果接收到多个有指定名称的头部，这个头部的值被连接起来并返回，使用逗号和空格分隔开各个头部的值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def getResponseHeader(): String = js.native
  def getResponseHeader(headerName: String): String = js.native
  /**
    * 暂停上传任务
    * 暂停上传任务，如果任务已经处于初始状态或暂停状态则无任何响应。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def pause(): Unit = js.native
  /**
    * 恢复暂停的上传任务
    * 继续暂停的上传任务，如果任务处于非暂停状态则无任何响应。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def resume(): Unit = js.native
  /**
    * 设置上传请求的HTTP头数据
    * Http的Header应该包含在通过后续start()调用而发起的请求中，此方法必需在调用start()之前设置才能生效。
    *     如果带有指定名称的头部已经被指定了，这个头部的新值就是：之前指定的值，加上逗号、以及这个调用指定的值（形成一个数组）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def setRequestHeader(): Unit = js.native
  def setRequestHeader(headerName: String): Unit = js.native
  def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
  /**
    * 开始上传任务
    * 开始调度上传任务，如果任务已经处于开始状态则无任何响应。
    *     在创建任务或任务上传失败后调用可重新开始上传。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def start(): Unit = js.native
}

