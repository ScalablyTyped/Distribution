package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 相对路径URL
  * 只能在扩展API中使用，相对于基座提供的特定目录，以“_”开头。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
trait PlusIoRelativeURL extends js.Object {
  /**
    * 应用私有文档目录
    * 用于保存应用运行期业务逻辑数据，与文件系统中根目录PRIVATE_DOCUMENTS，如“_doc/userdata.xml”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var _doc: js.UndefOr[String] = js.undefined
  /**
    * 程序公用文档目录
    * 用于保存程序中各应用间可共享文件的目录，与文件系统中根目录PUBLIC_DOCUMENTS，如“_document/share.doc”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var _documents: js.UndefOr[String] = js.undefined
  /**
    * 程序公用下载目录
    * 用于保存程序下载文件的目录，与文件系统中根目录PUBLIC_DOWNLOADS，如“_download/mydoc.doc”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var _downloads: js.UndefOr[String] = js.undefined
  /**
    * 应用资源目录
    * 保存应用的所有html、css、js等资源文件，与文件系统中根目录PRIVATE_WWW一致，后面加相对路径如“_www/res/icon.png”。
    * 	注意：应用资源目录是只读目录，只能读取次目录下的文件，不能修改或新建。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var _www: js.UndefOr[String] = js.undefined
}

object PlusIoRelativeURL {
  @scala.inline
  def apply(_doc: String = null, _documents: String = null, _downloads: String = null, _www: String = null): PlusIoRelativeURL = {
    val __obj = js.Dynamic.literal()
    if (_doc != null) __obj.updateDynamic("_doc")(_doc.asInstanceOf[js.Any])
    if (_documents != null) __obj.updateDynamic("_documents")(_documents.asInstanceOf[js.Any])
    if (_downloads != null) __obj.updateDynamic("_downloads")(_downloads.asInstanceOf[js.Any])
    if (_www != null) __obj.updateDynamic("_www")(_www.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusIoRelativeURL]
  }
}

