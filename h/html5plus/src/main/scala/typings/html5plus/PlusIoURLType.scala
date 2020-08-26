package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 文件路径类型
  * 在文件系统中的文件路径需转换成URL格式，已方便runtime快速加载。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIoURLType extends js.Object {
  /**
    * 本地路径URL
    * 可在html页面中直接访问本地资源，以“file:///”开头，后面跟随系统的绝对路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var LocalURL: js.UndefOr[PlusIoLocalURL] = js.native
  /**
    * 相对路径URL
    * 只能在扩展API中使用，相对于基座提供的特定目录，以“_”开头。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var RelativeURL: js.UndefOr[PlusIoRelativeURL] = js.native
  /**
    * 网络路径URL
    * 可在html页面中以网络资源模式访问本地资源，以“http://”开头，后面跟随相对路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var RomoteURL: js.UndefOr[String] = js.native
}

object PlusIoURLType {
  @scala.inline
  def apply(): PlusIoURLType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusIoURLType]
  }
  @scala.inline
  implicit class PlusIoURLTypeOps[Self <: PlusIoURLType] (val x: Self) extends AnyVal {
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
    def setLocalURL(value: PlusIoLocalURL): Self = this.set("LocalURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalURL: Self = this.set("LocalURL", js.undefined)
    @scala.inline
    def setRelativeURL(value: PlusIoRelativeURL): Self = this.set("RelativeURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeURL: Self = this.set("RelativeURL", js.undefined)
    @scala.inline
    def setRomoteURL(value: String): Self = this.set("RomoteURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRomoteURL: Self = this.set("RomoteURL", js.undefined)
  }
  
}

