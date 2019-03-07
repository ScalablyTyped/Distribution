package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Uploader模块管理网络上传任务，用于从本地上传各种文件到服务器，并支持跨域访问操作。通过plus.uploader可获取上传管理对象。Uploader上传使用HTTP的POST方式提交数据，数据格式符合Multipart/form-data规范，即rfc1867（Form-based File Upload in HTML）协议。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
  */
@js.native
trait PlusUploader extends js.Object {
  /**
    * Upload对象管理一个上传任务
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var Upload: js.UndefOr[PlusUploaderUpload] = js.native
  /**
    * 上传任务事件类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var UploadEvent: js.UndefOr[PlusUploaderUploadEvent] = js.native
  /**
    * JSON对象，添加上传文件的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var UploadFileOptions: js.UndefOr[PlusUploaderUploadFileOptions] = js.native
  /**
    * JSON对象，创建上传任务的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var UploadOptions: js.UndefOr[PlusUploaderUploadOptions] = js.native
  /**
    * 上传任务的状态，Number类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var UploadState: js.UndefOr[PlusUploaderUploadState] = js.native
  /**
    * 清除上传任务
    * 清除指定状态的上传任务。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def clear(): scala.Unit = js.native
  def clear(state: PlusUploaderUploadState): scala.Unit = js.native
  /**
    * 新建上传任务
    * 请求上传管理创建新的上传任务，创建成功则返回Upload对象，用于管理上传任务。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def createUpload(): PlusUploaderUpload = js.native
  def createUpload(url: java.lang.String): PlusUploaderUpload = js.native
  def createUpload(url: java.lang.String, options: PlusUploaderUploadOptions): PlusUploaderUpload = js.native
  def createUpload(
    url: java.lang.String,
    options: PlusUploaderUploadOptions,
    completedCB: js.Function2[/* result0 */ PlusUploaderUpload, /* result1 */ scala.Double, scala.Unit]
  ): PlusUploaderUpload = js.native
  /**
    * 枚举上传任务
    * 枚举指定状态的上传任务列表，通过enumCB回调函数返回结果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def enumerate(): scala.Unit = js.native
  def enumerate(enumCB: js.Function1[/* result */ js.Array[this.type], scala.Unit]): scala.Unit = js.native
  def enumerate(enumCB: js.Function1[/* result */ js.Array[this.type], scala.Unit], state: PlusUploaderUploadState): scala.Unit = js.native
  /**
    * 开始所有上传任务
    * 开始所有处于未开始调度或暂停状态的上传任务。
    * 	若上传任务数超过可并发处理的总数，超出的任务处于调度状态（等待上传），当有任务完成时根据调度状态任务的优先级选择任务开始上传。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  def startAll(): scala.Unit = js.native
}

