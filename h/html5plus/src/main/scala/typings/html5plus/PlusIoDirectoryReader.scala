package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 读取目录信息对象，用于获取目录中包含的文件及子目录
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIoDirectoryReader extends js.Object {
  /**
    * 获取当前目录中的所有文件和子目录
    * 获取当前目录下的所有文件和子目录。
    * 	获取操作成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def readEntries(): Unit = js.native
  def readEntries(succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit]): Unit = js.native
  def readEntries(
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
}

