package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 文件路径类型
  * 在文件系统中的文件路径需转换成URL格式，已方便runtime快速加载。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
trait PlusIoURLType extends js.Object {
  /**
    * 本地路径URL
    * 可在html页面中直接访问本地资源，以“file:///”开头，后面跟随系统的绝对路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var LocalURL: js.UndefOr[PlusIoLocalURL] = js.undefined
  /**
    * 相对路径URL
    * 只能在扩展API中使用，相对于基座提供的特定目录，以“_”开头。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var RelativeURL: js.UndefOr[PlusIoRelativeURL] = js.undefined
  /**
    * 网络路径URL
    * 可在html页面中以网络资源模式访问本地资源，以“http://”开头，后面跟随相对路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var RomoteURL: js.UndefOr[java.lang.String] = js.undefined
}

object PlusIoURLType {
  @scala.inline
  def apply(
    LocalURL: PlusIoLocalURL = null,
    RelativeURL: PlusIoRelativeURL = null,
    RomoteURL: java.lang.String = null
  ): PlusIoURLType = {
    val __obj = js.Dynamic.literal()
    if (LocalURL != null) __obj.updateDynamic("LocalURL")(LocalURL)
    if (RelativeURL != null) __obj.updateDynamic("RelativeURL")(RelativeURL)
    if (RomoteURL != null) __obj.updateDynamic("RomoteURL")(RomoteURL)
    __obj.asInstanceOf[PlusIoURLType]
  }
}

