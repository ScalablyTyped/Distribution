package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 文件或目录操作事件对象
  * 所有文件或目录操作事件回调函数中都创建该对象的实例。
  *     该对象从DOMEvent继承而来，可通过该其target属性获取事件触发的文件或目录操作对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIoFileEvent extends js.Object {
  
  /**
    * 文件或目录操作对象
    * 在不同的回调中指向的对象不同，可指向的对象包括：FileEntry、DirectoryEntry、FileReader、FileWriter。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var target: js.UndefOr[PlusIoDirectoryEntry] = js.native
}
object PlusIoFileEvent {
  
  @scala.inline
  def apply(): PlusIoFileEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusIoFileEvent]
  }
  
  @scala.inline
  implicit class PlusIoFileEventOps[Self <: PlusIoFileEvent] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: PlusIoDirectoryEntry): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
