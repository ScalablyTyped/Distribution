package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IO模块管理本地文件系统，用于对文件系统的目录浏览、文件的读取、文件的写入等操作。通过plus.io可获取文件系统管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIo extends js.Object {
  
  /**
    * 文件系统中的目录对象，用于管理特定的本地目录
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var DirectoryEntry: js.UndefOr[PlusIoDirectoryEntry] = js.native
  
  /**
    * 读取目录信息对象，用于获取目录中包含的文件及子目录
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var DirectoryReader: js.UndefOr[PlusIoDirectoryReader] = js.native
  
  /**
    * 文件系统中的文件数据对象，用于获取文件的数据
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var File: js.UndefOr[PlusIoFile] = js.native
  
  /**
    * 文件系统中的文件对象，用于管理特定的本地文件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var FileEntry: js.UndefOr[PlusIoFileEntry] = js.native
  
  /**
    * 文件或目录操作事件对象
    * 所有文件或目录操作事件回调函数中都创建该对象的实例。
    *     该对象从DOMEvent继承而来，可通过该其target属性获取事件触发的文件或目录操作对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var FileEvent: js.UndefOr[PlusIoFileEvent] = js.native
  
  /**
    * 文件系统中的读取文件对象，用于获取文件的内容
    * FileReader对象是从设备文件系统读取文件FileReader对象是从设备文件系统读取文件的一种方式，文件以文本或者Base64编码的字符串形式读出来。
    *     用户注册自己的事件监听器来接收loadstart、progress、load、loadend、error和abort事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var FileReader: js.UndefOr[PlusIoFileReader] = js.native
  
  /**
    * 文件系统对象，用于管理特定本地文件目录
    * 文件系统对象表示一个应用可访问的根目录。name属性用于标识此根目录的名称，与LocalFileSystem中的文件系统类型一一对应。root属性为文件目录对象，用于实际操作文件系统，参考DirectoryEntry。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var FileSystem: js.UndefOr[PlusIoFileSystem] = js.native
  
  /**
    * 文件系统中的写文件对象，用于写入文件内容
    * FileWriter对象是从设备文件系统写入文件FileWriter对象是从设备文件系统写入文件的一种方式，用户注册自己的事件监听器来接收writestart、progress、write、writeend、error和abort事件。
    *     一个FileWriter对象是为单个文件的操作而创建。你可以使用该对象多次对相应文件进行写入操作。FileWriter维护该文件的指针位置及长度属性，这样你就可以寻找和写入文件的任何地方。
    *     默认情况下，FileWriter从文件的开头开始写入（将覆盖现有数据）。FileWriter对象的seek方法可设置文件操作指定位置，如fw.seek(fw.length-1)写入操作就会从文件的末尾开始。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var FileWriter: js.UndefOr[PlusIoFileWriter] = js.native
  
  /**
    * JSON对象，获取文件操作的参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var Flags: js.UndefOr[PlusIoFlags] = js.native
  
  /**
    * 本地路径URL
    * 可在html页面中直接访问本地资源，以“file:///”开头，后面跟随系统的绝对路径。
    *     如示例：“file:///D:/res/hello.html”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var LocalURL: js.UndefOr[PlusIoLocalURL] = js.native
  
  /**
    * JSON对象，保存文件或目录的状态信息对象
    * 可通过DirectoryEntry或FileEntry对象的getMetaData方法获取
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var Metadata: js.UndefOr[PlusIoMetadata] = js.native
  
  /**
    * 应用私有文档目录常量
    * 本地文件系统常量，Number类型，固定值2。应用私有文档目录，仅本应用可读写。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var PRIVATE_DOC: js.UndefOr[Double] = js.native
  
  /**
    * 应用运行资源目录常量
    * 本地文件系统常量，Number类型，固定值1。应用运行资源目录，仅本应用可访问。
    *     为了确保应用资源的安全性，此目录只可读。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var PRIVATE_WWW: js.UndefOr[Double] = js.native
  
  /**
    * 程序公用文档目录常量
    * 本地文件系统常量，Number类型，固定值3。程序公用文档目录，所有应用可读写。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var PUBLIC_DOCUMENTS: js.UndefOr[Double] = js.native
  
  /**
    * 程序公用下载目录常量
    * 本地文件系统常量，Number类型，固定值4。程序公用下载目录，所有应用可读写。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var PUBLIC_DOWNLOADS: js.UndefOr[Double] = js.native
  
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
    *     如示例：“http://localhost:13131/_www/res/icon.png”，其中“_www”字段可支持类型与相对路径URL一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var RemoteURL: js.UndefOr[PlusIoRemoteURL] = js.native
  
  /**
    * 文件路径类型
    * 在文件系统中的文件路径需转换成URL格式，已方便runtime快速加载。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var URLType: js.UndefOr[PlusIoURLType] = js.native
  
  /**
    * 将平台绝对路径转换成本地URL路径
    * 绝对路径符合各平台文件路径格式，转换后变成RelativeURL类型格式。
    *     功能与convertLocalFileSystemURL方法相反，将绝对路径转换成相对路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def convertAbsoluteFileSystem(): String = js.native
  def convertAbsoluteFileSystem(path: String): String = js.native
  
  /**
    * 将本地URL路径转换成平台绝对路径
    * 绝对路径符合各平台文件路径格式，通常用于Native.JS调用系统原生文件操作API，也可以在前面添加“file://”后在html页面中直接使用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def convertLocalFileSystemURL(): String = js.native
  def convertLocalFileSystemURL(url: String): String = js.native
  
  /**
    * 请求本地文件系统对象
    * 获取指定的文件系统，可通过type指定获取文件系统的类型。
    *     获取指定的文件系统对象成功通过succesCB回调返回，失败则通过errorCB返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def requestFileSystem(): Unit = js.native
  def requestFileSystem(
    `type`: js.UndefOr[scala.Nothing],
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def requestFileSystem(`type`: js.UndefOr[scala.Nothing], succesCB: js.Function1[/* result */ PlusIoFileSystem, Unit]): Unit = js.native
  def requestFileSystem(
    `type`: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ PlusIoFileSystem, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def requestFileSystem(`type`: Double): Unit = js.native
  def requestFileSystem(
    `type`: Double,
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def requestFileSystem(`type`: Double, succesCB: js.Function1[/* result */ PlusIoFileSystem, Unit]): Unit = js.native
  def requestFileSystem(
    `type`: Double,
    succesCB: js.Function1[/* result */ PlusIoFileSystem, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 通过URL参数获取目录对象或文件对象
    * 快速获取指定的目录或文件操作对象，如通过URL值“_www/test.html”可直接获取文件操作对象。
    *     url值可支持相对路径URL、本地路径URL。
    *     获取指定的文件或目录操作对象成功通过succesCB回调返回，如果指定URL路径或文件不存在则失败通过errorCB回调返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def resolveLocalFileSystemURL(): Unit = js.native
  def resolveLocalFileSystemURL(
    url: js.UndefOr[scala.Nothing],
    succesCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def resolveLocalFileSystemURL(url: js.UndefOr[scala.Nothing], succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit]): Unit = js.native
  def resolveLocalFileSystemURL(
    url: js.UndefOr[scala.Nothing],
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def resolveLocalFileSystemURL(url: String): Unit = js.native
  def resolveLocalFileSystemURL(url: String, succesCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def resolveLocalFileSystemURL(url: String, succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit]): Unit = js.native
  def resolveLocalFileSystemURL(
    url: String,
    succesCB: js.Function1[/* result */ PlusIoDirectoryEntry, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
}
