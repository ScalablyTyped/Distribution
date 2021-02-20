package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 文件系统对象，用于管理特定本地文件目录
  * 文件系统对象表示一个应用可访问的根目录。name属性用于标识此根目录的名称，与LocalFileSystem中的文件系统类型一一对应。root属性为文件目录对象，用于实际操作文件系统，参考DirectoryEntry。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIoFileSystem extends StObject {
  
  /**
    * 文件系统的名称
    * 值为文件系统类型常量值字符串，如“PRIVATE_WWW”、“PRIVATE_DOCUMENTS”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * 文件系统的根目录
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var root: js.UndefOr[PlusIoDirectoryEntry] = js.native
}
object PlusIoFileSystem {
  
  @scala.inline
  def apply(): PlusIoFileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusIoFileSystem]
  }
  
  @scala.inline
  implicit class PlusIoFileSystemMutableBuilder[Self <: PlusIoFileSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRoot(value: PlusIoDirectoryEntry): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
