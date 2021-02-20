package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 文件系统中的文件对象，用于管理特定的本地文件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIoFileEntry extends StObject {
  
  /**
    * 拷贝文件
    * 以下情况拷贝文件将会导致失败：
    *     要拷贝到的目标目录无效；
    *     要拷贝到的目标路径被其它文件占用；
    *     拷贝文件成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def copyTo(): Unit = js.native
  def copyTo(
    parent: js.UndefOr[scala.Nothing],
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def copyTo(
    parent: js.UndefOr[scala.Nothing],
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit]
  ): Unit = js.native
  def copyTo(
    parent: js.UndefOr[scala.Nothing],
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def copyTo(parent: js.UndefOr[scala.Nothing], newName: String): Unit = js.native
  def copyTo(
    parent: js.UndefOr[scala.Nothing],
    newName: String,
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def copyTo(
    parent: js.UndefOr[scala.Nothing],
    newName: String,
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit]
  ): Unit = js.native
  def copyTo(
    parent: js.UndefOr[scala.Nothing],
    newName: String,
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def copyTo(parent: PlusIoDirectoryEntry): Unit = js.native
  def copyTo(
    parent: PlusIoDirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def copyTo(
    parent: PlusIoDirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit]
  ): Unit = js.native
  def copyTo(
    parent: PlusIoDirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def copyTo(parent: PlusIoDirectoryEntry, newName: String): Unit = js.native
  def copyTo(
    parent: PlusIoDirectoryEntry,
    newName: String,
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def copyTo(
    parent: PlusIoDirectoryEntry,
    newName: String,
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit]
  ): Unit = js.native
  def copyTo(
    parent: PlusIoDirectoryEntry,
    newName: String,
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 获取文件关联的写文件操作对象FileWriter
    * 获取写文件操作对象成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def createWriter(): Unit = js.native
  def createWriter(succesCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def createWriter(succesCB: js.Function1[/* result */ PlusIoFileWriter, Unit]): Unit = js.native
  def createWriter(
    succesCB: js.Function1[/* result */ PlusIoFileWriter, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 获取文件数据对象
    * 获取文件数据对象成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def file(): Unit = js.native
  def file(succesCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def file(succesCB: js.Function1[/* result */ PlusIoFile, Unit]): Unit = js.native
  def file(
    succesCB: js.Function1[/* result */ PlusIoFile, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 文件操作对象所属的文件系统对象，参考FileSystem
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var fileSystem: js.UndefOr[PlusIoFileSystem] = js.native
  
  /**
    * 文件操作对象的完整路径，文件系统的绝对路径
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var fullPath: js.UndefOr[String] = js.native
  
  /**
    * 获取文件的属性信息
    * 用于获取文件的属性信息。
    *     获取属性信息成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def getMetadata(): Unit = js.native
  def getMetadata(succesCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getMetadata(succesCB: js.Function1[/* result */ PlusIoMetadata, Unit]): Unit = js.native
  def getMetadata(
    succesCB: js.Function1[/* result */ PlusIoMetadata, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 获取文件所属的父目录
    * 获取父目录成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def getParent(): Unit = js.native
  def getParent(succesCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getParent(succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit]): Unit = js.native
  def getParent(
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 文件操作对象是否为目录，FileEntry对象固定其值为false
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var isDirectory: js.UndefOr[Boolean] = js.native
  
  /**
    * 文件操作对象的是否为文件，FileEntry对象固定其值为true
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var isFile: js.UndefOr[Boolean] = js.native
  
  /**
    * 移动文件
    * 以下情况移动目录将会导致失败：
    *     要移动到的目标目录无效；
    *     要移动到的目标路径被其它文件占用；
    *     移动文件成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def moveTo(): Unit = js.native
  def moveTo(
    parent: js.UndefOr[scala.Nothing],
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def moveTo(
    parent: js.UndefOr[scala.Nothing],
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit]
  ): Unit = js.native
  def moveTo(
    parent: js.UndefOr[scala.Nothing],
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def moveTo(parent: js.UndefOr[scala.Nothing], newName: String): Unit = js.native
  def moveTo(
    parent: js.UndefOr[scala.Nothing],
    newName: String,
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def moveTo(
    parent: js.UndefOr[scala.Nothing],
    newName: String,
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit]
  ): Unit = js.native
  def moveTo(
    parent: js.UndefOr[scala.Nothing],
    newName: String,
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def moveTo(parent: PlusIoDirectoryEntry): Unit = js.native
  def moveTo(
    parent: PlusIoDirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def moveTo(
    parent: PlusIoDirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit]
  ): Unit = js.native
  def moveTo(
    parent: PlusIoDirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def moveTo(parent: PlusIoDirectoryEntry, newName: String): Unit = js.native
  def moveTo(
    parent: PlusIoDirectoryEntry,
    newName: String,
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def moveTo(
    parent: PlusIoDirectoryEntry,
    newName: String,
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit]
  ): Unit = js.native
  def moveTo(
    parent: PlusIoDirectoryEntry,
    newName: String,
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 文件操作对象的名称，不包括路径
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * 删除文件
    * 删除文件成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def remove(): Unit = js.native
  def remove(succesCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def remove(succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit]): Unit = js.native
  def remove(
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 获取文件路径转换为本地路径URL地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def toLocalURL(): String = js.native
  
  /**
    * 获取文件路径转换为网络路径URL地址
    * URL地址格式为以“http://localhost:13131/”开头的网络路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def toRemoteURL(): String = js.native
  
  /**
    * 获取文件路径转换为URL地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def toURL(): String = js.native
}
