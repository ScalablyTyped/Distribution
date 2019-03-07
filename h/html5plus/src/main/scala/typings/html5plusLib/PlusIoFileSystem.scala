package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 文件系统对象，用于管理特定本地文件目录
  * 文件系统对象表示一个应用可访问的根目录。name属性用于标识此根目录的名称，与LocalFileSystem中的文件系统类型一一对应。root属性为文件目录对象，用于实际操作文件系统，参考DirectoryEntry。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
trait PlusIoFileSystem extends js.Object {
  /**
    * 文件系统的名称
    * 值为文件系统类型常量值字符串，如“PRIVATE_WWW”、“PRIVATE_DOCUMENTS”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 文件系统的根目录
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var root: js.UndefOr[PlusIoDirectoryEntry] = js.undefined
}

object PlusIoFileSystem {
  @scala.inline
  def apply(name: java.lang.String = null, root: PlusIoDirectoryEntry = null): PlusIoFileSystem = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PlusIoFileSystem]
  }
}

