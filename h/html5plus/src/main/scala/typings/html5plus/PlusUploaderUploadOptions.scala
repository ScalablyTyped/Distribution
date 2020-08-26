package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，创建上传任务的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
  */
@js.native
trait PlusUploaderUploadOptions extends js.Object {
  /**
    * 上传任务每次上传的文件块大小（仅在支持断点续传的服务有效）
    * 数值类型，单位为Byte（字节），默认值为102400，若设置值小于等于0则表示不分块上传。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var blocksize: js.UndefOr[Double] = js.native
  /**
    * 网络请求类型
    * 仅支持http协议的“POST”请求。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var method: js.UndefOr[String] = js.native
  /**
    * 上传任务的优先级
    * 数值类型，数值越大优先级越高，默认优先级值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * 上传任务重试次数
    * 数值类型，默认为重试3次。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var retry: js.UndefOr[Double] = js.native
  /**
    * 上传任务重试间隔时间
    * 数值类型，单位为s(秒)，默认值为30s。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var retryInterval: js.UndefOr[Double] = js.native
  /**
    * 上传任务超时时间
    * 数值类型，单位为s(秒)，默认值为120s。
    *     超时时间为服务器响应请求的时间（不是上传任务完成的总时间），如果设置为0则表示永远不超时。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var timeout: js.UndefOr[Double] = js.native
}

object PlusUploaderUploadOptions {
  @scala.inline
  def apply(): PlusUploaderUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusUploaderUploadOptions]
  }
  @scala.inline
  implicit class PlusUploaderUploadOptionsOps[Self <: PlusUploaderUploadOptions] (val x: Self) extends AnyVal {
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
    def setBlocksize(value: Double): Self = this.set("blocksize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlocksize: Self = this.set("blocksize", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setRetry(value: Double): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setRetryInterval(value: Double): Self = this.set("retryInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryInterval: Self = this.set("retryInterval", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

