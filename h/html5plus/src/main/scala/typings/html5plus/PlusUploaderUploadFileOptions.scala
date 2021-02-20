package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，添加上传文件的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
  */
@js.native
trait PlusUploaderUploadFileOptions extends StObject {
  
  /**
    * 文件键名
    * 上传文件在上传任务中的键名，默认值为为文件名称。
    *     上传任务中如果已经存在相同key的上传文件或数据将导致添加文件失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * 文件类型
    * 上传文件的类型（如图片文件为“image/jpeg”），默认值自动根据文件后缀名称生成。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var mime: js.UndefOr[String] = js.native
  
  /**
    * 文件名称
    * 上传文件的名称，默认值为上传文件路径中的名称。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  var name: js.UndefOr[String] = js.native
}
object PlusUploaderUploadFileOptions {
  
  @scala.inline
  def apply(): PlusUploaderUploadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusUploaderUploadFileOptions]
  }
  
  @scala.inline
  implicit class PlusUploaderUploadFileOptionsMutableBuilder[Self <: PlusUploaderUploadFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
