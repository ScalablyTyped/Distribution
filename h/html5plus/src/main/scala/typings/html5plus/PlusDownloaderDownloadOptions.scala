package typings.html5plus

import typings.html5plus.html5plusStrings.GET
import typings.html5plus.html5plusStrings.POST
import typings.html5plus.html5plusStrings._docSlash
import typings.html5plus.html5plusStrings._documentsSlash
import typings.html5plus.html5plusStrings._downloadsSlash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 下载任务参数
  * 在创建下载任务时设置的参数，如设置下载任务使用的HTTP协议类型、优先级等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
  */
trait PlusDownloaderDownloadOptions extends StObject {
  
  /**
    * POST请求时提交的数据
    * 仅在网络请求类型method设置为"POST"时有效，"GET"请求时忽略此数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * 下载文件保存的路径
    * 保存文件路径仅支持以"_downloads/"、"_doc/"、"_documents/"开头的字符串。
    *     文件路径以文件后缀名结尾（如"_doc/download/a.doc"）表明指定保存文件目录及名称，以“/”结尾则认为指定保存文件的目录（此时程序自动生成文件名）。
    *     如果指定的文件已经存在，则自动在文件名后面加"(i)"，其中i为数字，如果文件名称后面已经是此格式，则数字i递增，如"download(1).doc"。
    *     默认保存目录为（"_downloads"），并自动生成文件名称。
    * - _doc/: 应用私有文档目录
    * - _documents/: 共享文档目录
    * - _downloads/: 共享下载目录
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var filename: js.UndefOr[_docSlash | _documentsSlash | _downloadsSlash] = js.undefined
  
  /**
    * 网络请求类型
    * 支持http协议的“GET”、“POST”，默认为“GET”请求。
    * - GET: GET请求
    * - POST: POST请求
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var method: js.UndefOr[GET | POST] = js.undefined
  
  /**
    * 下载任务的优先级
    * 数值类型，数值越大优先级越高，默认优先级值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * 下载任务重试次数
    * 数值类型，默认为重试3次。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var retry: js.UndefOr[Double] = js.undefined
  
  /**
    * 下载任务重试间隔时间
    * 数值类型，单位为s(秒)，默认值为30s。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var retryInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * 下载任务超时时间
    * 数值类型，单位为s(秒)，默认值为120s。
    *     超时时间为服务器响应请求的时间（不是下载任务完成的总时间），如果设置为0则表示永远不超时。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object PlusDownloaderDownloadOptions {
  
  inline def apply(): PlusDownloaderDownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusDownloaderDownloadOptions]
  }
  
  extension [Self <: PlusDownloaderDownloadOptions](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFilename(value: _docSlash | _documentsSlash | _downloadsSlash): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryInterval(value: Double): Self = StObject.set(x, "retryInterval", value.asInstanceOf[js.Any])
    
    inline def setRetryIntervalUndefined: Self = StObject.set(x, "retryInterval", js.undefined)
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
