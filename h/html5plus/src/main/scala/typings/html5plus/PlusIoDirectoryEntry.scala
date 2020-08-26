package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 文件系统中的目录对象，用于管理特定的本地目录
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIoDirectoryEntry extends js.Object {
  /**
    * 文件操作对象所属的文件系统对象，参考FileSystem
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var fileSystem: js.UndefOr[PlusIoFileSystem] = js.native
  /**
    * 目录操作对象的完整路径，文件系统的绝对路径
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var fullPath: js.UndefOr[String] = js.native
  /**
    * 操作对象是否为目录，DirectoryEntry对象固定其值为true
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var isDirectory: js.UndefOr[Boolean] = js.native
  /**
    * 操作对象的是否为文件，DirectoryEntry对象固定其值为false
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var isFile: js.UndefOr[Boolean] = js.native
  /**
    * 目录操作对象的名称，不包括路径
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * 拷贝目录
    * 以下情况拷贝目录将会导致失败：
    *     将父目录拷贝到子目录中；
    *     要拷贝到的目标目录无效；
    *     要拷贝到的目标路径被文件占用；
    *     要拷贝到的目标目录已经存在并且不为空。
    *     拷贝目录成功通过succesCB回调返回，失败则通过errorCB返回。
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
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def copyTo(
    parent: js.UndefOr[scala.Nothing],
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ this.type, Unit],
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
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def copyTo(
    parent: js.UndefOr[scala.Nothing],
    newName: String,
    succesCB: js.Function1[/* result */ this.type, Unit],
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
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def copyTo(
    parent: PlusIoDirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ this.type, Unit],
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
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def copyTo(
    parent: PlusIoDirectoryEntry,
    newName: String,
    succesCB: js.Function1[/* result */ this.type, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 创建目录读取对象
    * 创建一个目录读取对象，用户读取目下的文件及子目录。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def createReader(): PlusIoDirectoryReader = js.native
  /**
    * 创建或打开子目录
    * 创建或打开当前目录指定的目录。
    *     创建或打开目录操作成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def getDirectory(): Unit = js.native
  def getDirectory(
    path: js.UndefOr[scala.Nothing],
    flag: js.UndefOr[scala.Nothing],
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getDirectory(
    path: js.UndefOr[scala.Nothing],
    flag: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def getDirectory(
    path: js.UndefOr[scala.Nothing],
    flag: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ this.type, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getDirectory(path: js.UndefOr[scala.Nothing], flag: PlusIoFlags): Unit = js.native
  def getDirectory(
    path: js.UndefOr[scala.Nothing],
    flag: PlusIoFlags,
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getDirectory(
    path: js.UndefOr[scala.Nothing],
    flag: PlusIoFlags,
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def getDirectory(
    path: js.UndefOr[scala.Nothing],
    flag: PlusIoFlags,
    succesCB: js.Function1[/* result */ this.type, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getDirectory(path: String): Unit = js.native
  def getDirectory(
    path: String,
    flag: js.UndefOr[scala.Nothing],
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getDirectory(
    path: String,
    flag: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def getDirectory(
    path: String,
    flag: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ this.type, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getDirectory(path: String, flag: PlusIoFlags): Unit = js.native
  def getDirectory(
    path: String,
    flag: PlusIoFlags,
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getDirectory(path: String, flag: PlusIoFlags, succesCB: js.Function1[/* result */ this.type, Unit]): Unit = js.native
  def getDirectory(
    path: String,
    flag: PlusIoFlags,
    succesCB: js.Function1[/* result */ this.type, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 创建或打开文件
    * 创建或打开当前目录下指定的文件。
    *     创建或打开文件操作对象成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def getFile(): Unit = js.native
  def getFile(
    path: js.UndefOr[scala.Nothing],
    flag: js.UndefOr[scala.Nothing],
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getFile(
    path: js.UndefOr[scala.Nothing],
    flag: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def getFile(
    path: js.UndefOr[scala.Nothing],
    flag: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ this.type, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getFile(path: js.UndefOr[scala.Nothing], flag: PlusIoFlags): Unit = js.native
  def getFile(
    path: js.UndefOr[scala.Nothing],
    flag: PlusIoFlags,
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getFile(
    path: js.UndefOr[scala.Nothing],
    flag: PlusIoFlags,
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def getFile(
    path: js.UndefOr[scala.Nothing],
    flag: PlusIoFlags,
    succesCB: js.Function1[/* result */ this.type, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getFile(path: String): Unit = js.native
  def getFile(
    path: String,
    flag: js.UndefOr[scala.Nothing],
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getFile(
    path: String,
    flag: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def getFile(
    path: String,
    flag: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ this.type, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getFile(path: String, flag: PlusIoFlags): Unit = js.native
  def getFile(
    path: String,
    flag: PlusIoFlags,
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getFile(path: String, flag: PlusIoFlags, succesCB: js.Function1[/* result */ this.type, Unit]): Unit = js.native
  def getFile(
    path: String,
    flag: PlusIoFlags,
    succesCB: js.Function1[/* result */ this.type, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 获取目录的属性
    * 用于获取文件或目录的属性信息。
    *     获取属性信息成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def getMetadata(): Unit = js.native
  def getMetadata(succesCB: js.UndefOr[scala.Nothing], errorCB: js.UndefOr[scala.Nothing], recursive: Boolean): Unit = js.native
  def getMetadata(succesCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getMetadata(
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    recursive: Boolean
  ): Unit = js.native
  def getMetadata(succesCB: js.Function1[/* result */ PlusIoMetadata, Unit]): Unit = js.native
  def getMetadata(
    succesCB: js.Function1[/* result */ PlusIoMetadata, Unit],
    errorCB: js.UndefOr[scala.Nothing],
    recursive: Boolean
  ): Unit = js.native
  def getMetadata(
    succesCB: js.Function1[/* result */ PlusIoMetadata, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getMetadata(
    succesCB: js.Function1[/* result */ PlusIoMetadata, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    recursive: Boolean
  ): Unit = js.native
  /**
    * 获取目录所属的父目录
    * 获取父目录成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def getParent(): Unit = js.native
  def getParent(succesCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getParent(succesCB: js.Function1[/* result */ this.type, Unit]): Unit = js.native
  def getParent(
    succesCB: js.Function1[/* result */ this.type, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 移动目录
    * 以下情况移动目录将会导致失败：
    *     将父目录移动到子目录中；
    *     要移动到的目标目录无效；
    *     要移动到的目标路径被文件占用；
    *     要移动到的目标目录已经存在并且不为空。
    *     移动目录成功通过succesCB回调返回，失败则通过errorCB返回。
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
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def moveTo(
    parent: js.UndefOr[scala.Nothing],
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ this.type, Unit],
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
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def moveTo(
    parent: js.UndefOr[scala.Nothing],
    newName: String,
    succesCB: js.Function1[/* result */ this.type, Unit],
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
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def moveTo(
    parent: PlusIoDirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ this.type, Unit],
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
    succesCB: js.Function1[/* result */ this.type, Unit]
  ): Unit = js.native
  def moveTo(
    parent: PlusIoDirectoryEntry,
    newName: String,
    succesCB: js.Function1[/* result */ this.type, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 删除目录
    * 以下情况删除目录将会导致失败：
    *     目录中存在文件；
    *     删除根目录；
    *     删除目录成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def remove(): Unit = js.native
  def remove(succesCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def remove(succesCB: js.Function1[/* result */ this.type, Unit]): Unit = js.native
  def remove(
    succesCB: js.Function1[/* result */ this.type, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 递归删除目录
    * 删除目录将会删除其下的所有文件及子目录
    *     不能删除根目录，如果操作删除根目录将会删除目录下的文件及子目录，不会删除根目录自身。
    *     删除目录成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def removeRecursively(): Unit = js.native
  def removeRecursively(succesCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def removeRecursively(succesCB: js.Function1[/* result */ this.type, Unit]): Unit = js.native
  def removeRecursively(
    succesCB: js.Function1[/* result */ this.type, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 获取目录路径转换为本地路径URL地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def toLocalURL(): String = js.native
  /**
    * 获取目录路径转换为网络路径URL地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def toRemoteURL(): String = js.native
  /**
    * 获取目录路径转换为URL地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def toURL(): String = js.native
}

