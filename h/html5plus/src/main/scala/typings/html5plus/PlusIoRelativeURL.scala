package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 相对路径URL
  * 只能在扩展API中使用，相对于基座提供的特定目录，以“_”开头。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIoRelativeURL extends js.Object {
  
  /**
    * 应用私有文档目录
    * 用于保存应用运行期业务逻辑数据，与文件系统中根目录PRIVATE_DOCUMENTS，如“_doc/userdata.xml”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var _doc: js.UndefOr[String] = js.native
  
  /**
    * 程序公用文档目录
    * 用于保存程序中各应用间可共享文件的目录，与文件系统中根目录PUBLIC_DOCUMENTS，如“_document/share.doc”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var _documents: js.UndefOr[String] = js.native
  
  /**
    * 程序公用下载目录
    * 用于保存程序下载文件的目录，与文件系统中根目录PUBLIC_DOWNLOADS，如“_download/mydoc.doc”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var _downloads: js.UndefOr[String] = js.native
  
  /**
    * 应用资源目录
    * 保存应用的所有html、css、js等资源文件，与文件系统中根目录PRIVATE_WWW一致，后面加相对路径如“_www/res/icon.png”。
    *     注意：应用资源目录是只读目录，只能读取次目录下的文件，不能修改或新建。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var _www: js.UndefOr[String] = js.native
}
object PlusIoRelativeURL {
  
  @scala.inline
  def apply(): PlusIoRelativeURL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusIoRelativeURL]
  }
  
  @scala.inline
  implicit class PlusIoRelativeURLOps[Self <: PlusIoRelativeURL] (val x: Self) extends AnyVal {
    
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
    def set_doc(value: String): Self = this.set("_doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_doc: Self = this.set("_doc", js.undefined)
    
    @scala.inline
    def set_documents(value: String): Self = this.set("_documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_documents: Self = this.set("_documents", js.undefined)
    
    @scala.inline
    def set_downloads(value: String): Self = this.set("_downloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_downloads: Self = this.set("_downloads", js.undefined)
    
    @scala.inline
    def set_www(value: String): Self = this.set("_www", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_www: Self = this.set("_www", js.undefined)
  }
}
