package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 文件或目录操作事件对象
  * 所有文件或目录操作事件回调函数中都创建该对象的实例。
  * 	该对象从DOMEvent继承而来，可通过该其target属性获取事件触发的文件或目录操作对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
trait PlusIoFileEvent extends js.Object {
  /**
    * 文件或目录操作对象
    * 在不同的回调中指向的对象不同，可指向的对象包括：FileEntry、DirectoryEntry、FileReader、FileWriter。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var target: js.UndefOr[PlusIoDirectoryEntry] = js.undefined
}

object PlusIoFileEvent {
  @scala.inline
  def apply(target: PlusIoDirectoryEntry = null): PlusIoFileEvent = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusIoFileEvent]
  }
}

