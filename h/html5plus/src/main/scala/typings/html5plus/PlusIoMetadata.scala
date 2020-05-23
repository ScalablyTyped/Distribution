package typings.html5plus

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，保存文件或目录的状态信息对象
  * 可通过DirectoryEntry或FileEntry对象的getMetaData方法获取
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
trait PlusIoMetadata extends js.Object {
  /**
    * 包含的子目录数
    * 若自身是文件则其值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var directoryCount: js.UndefOr[Double] = js.undefined
  /**
    * 目录的文件数
    * 若自身是文件则其值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var fileCount: js.UndefOr[Double] = js.undefined
  /**
    * 文件或目录的最后修改时间
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var modificationTime: js.UndefOr[Date] = js.undefined
  /**
    * 文件的大小
    * 若获取的是目录对象的属性则值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var size: js.UndefOr[Double] = js.undefined
}

object PlusIoMetadata {
  @scala.inline
  def apply(
    directoryCount: js.UndefOr[Double] = js.undefined,
    fileCount: js.UndefOr[Double] = js.undefined,
    modificationTime: Date = null,
    size: js.UndefOr[Double] = js.undefined
  ): PlusIoMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directoryCount)) __obj.updateDynamic("directoryCount")(directoryCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fileCount)) __obj.updateDynamic("fileCount")(fileCount.get.asInstanceOf[js.Any])
    if (modificationTime != null) __obj.updateDynamic("modificationTime")(modificationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusIoMetadata]
  }
}

