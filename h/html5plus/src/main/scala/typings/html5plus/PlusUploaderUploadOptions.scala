package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，创建上传任务的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
  */
trait PlusUploaderUploadOptions extends js.Object {
  /**
    * 上传任务每次上传的文件块大小（仅在支持断点续传的服务有效）
    * 数值类型，单位为Byte（字节），默认值为102400，若设置值小于等于0则表示不分块上传。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var blocksize: js.UndefOr[Double] = js.undefined
  /**
    * 网络请求类型
    * 仅支持http协议的“POST”请求。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * 上传任务的优先级
    * 数值类型，数值越大优先级越高，默认优先级值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var priority: js.UndefOr[Double] = js.undefined
  /**
    * 上传任务重试次数
    * 数值类型，默认为重试3次。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var retry: js.UndefOr[Double] = js.undefined
  /**
    * 上传任务重试间隔时间
    * 数值类型，单位为s(秒)，默认值为30s。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var retryInterval: js.UndefOr[Double] = js.undefined
  /**
    * 上传任务超时时间
    * 数值类型，单位为s(秒)，默认值为120s。
    * 	超时时间为服务器响应请求的时间（不是上传任务完成的总时间），如果设置为0则表示永远不超时。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object PlusUploaderUploadOptions {
  @scala.inline
  def apply(
    blocksize: Int | Double = null,
    method: String = null,
    priority: Int | Double = null,
    retry: Int | Double = null,
    retryInterval: Int | Double = null,
    timeout: Int | Double = null
  ): PlusUploaderUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (blocksize != null) __obj.updateDynamic("blocksize")(blocksize.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryInterval != null) __obj.updateDynamic("retryInterval")(retryInterval.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusUploaderUploadOptions]
  }
}

