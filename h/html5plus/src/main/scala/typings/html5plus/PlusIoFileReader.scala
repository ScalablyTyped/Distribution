package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 文件系统中的读取文件对象，用于获取文件的内容
  * FileReader对象是从设备文件系统读取文件FileReader对象是从设备文件系统读取文件的一种方式，文件以文本或者Base64编码的字符串形式读出来。
  *     用户注册自己的事件监听器来接收loadstart、progress、load、loadend、error和abort事件。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIoFileReader extends StObject {
  
  /**
    * 值为2，读文件操作完成状态
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var DONE: js.UndefOr[Double] = js.native
  
  /**
    * 值为0，开始读取文件状态
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var EMPTY: js.UndefOr[Double] = js.native
  
  /**
    * 值为1，正在读取文件状态
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var LOADING: js.UndefOr[Double] = js.native
  
  /**
    * 终止文件读取操作
    * 读取文件操作开始后，可通过此方法取消读取文件。
    *     调用此方法后将触发文件读取对象的onabort事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def abort(): Unit = js.native
  
  /**
    * 文件操作错误代码
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var error: js.UndefOr[Double] = js.native
  
  /**
    * 取消读取文件时的回调函数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var onabort: js.UndefOr[js.Function1[/* result */ PlusIoFileEvent, Unit]] = js.native
  
  /**
    * 文件读取操作失败时调用的回调函数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var onerror: js.UndefOr[js.Function1[/* result */ PlusIoFileEvent, Unit]] = js.native
  
  /**
    * 读取文件成功完成的回调函数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var onload: js.UndefOr[js.Function1[/* result */ PlusIoFileEvent, Unit]] = js.native
  
  /**
    * 文件读取操作完成时的回调函数
    * 不管成功或失败都会触发。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var onloadend: js.UndefOr[js.Function1[/* result */ PlusIoFileEvent, Unit]] = js.native
  
  /**
    * 读取文件开始时的回调函数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var onloadstart: js.UndefOr[js.Function1[/* result */ PlusIoFileEvent, Unit]] = js.native
  
  /**
    * 读取文件过程中的回调函数
    * 用于获取文件读取进度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var onprogress: js.UndefOr[js.Function1[/* result */ PlusIoFileEvent, Unit]] = js.native
  
  /**
    * 以URL编码格式读取文件数据内容
    * 读取文件的数据内容，并将数据内容进行URL编码。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def readAsDataURL(): Unit = js.native
  def readAsDataURL(file: Unit, encoding: String): Unit = js.native
  def readAsDataURL(file: PlusIoFile): Unit = js.native
  def readAsDataURL(file: PlusIoFile, encoding: String): Unit = js.native
  
  /**
    * 以文本格式读取文件数据内容
    * 读取文件的数据内容。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def readAsText(): Unit = js.native
  def readAsText(file: Unit, encoding: String): Unit = js.native
  def readAsText(file: PlusIoFile): Unit = js.native
  def readAsText(file: PlusIoFile, encoding: String): Unit = js.native
  
  /**
    * 当前读取文件所处的状态
    * 可取上面定义的常量值，EMPTY（0）、LOADING（1）、DONE（2）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var readyState: js.UndefOr[Double] = js.native
  
  /**
    * 已读取文件的内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var result: js.UndefOr[String] = js.native
}
