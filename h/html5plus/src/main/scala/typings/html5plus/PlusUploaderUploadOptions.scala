package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，创建上传任务的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
  */
@js.native
trait PlusUploaderUploadOptions extends StObject {
  
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
  implicit class PlusUploaderUploadOptionsMutableBuilder[Self <: PlusUploaderUploadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocksize(value: Double): Self = StObject.set(x, "blocksize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksizeUndefined: Self = StObject.set(x, "blocksize", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryInterval(value: Double): Self = StObject.set(x, "retryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryIntervalUndefined: Self = StObject.set(x, "retryInterval", js.undefined)
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
