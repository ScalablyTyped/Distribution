package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 文件系统中的写文件对象，用于写入文件内容
  * FileWriter对象是从设备文件系统写入文件FileWriter对象是从设备文件系统写入文件的一种方式，用户注册自己的事件监听器来接收writestart、progress、write、writeend、error和abort事件。
  * 	一个FileWriter对象是为单个文件的操作而创建。你可以使用该对象多次对相应文件进行写入操作。FileWriter维护该文件的指针位置及长度属性，这样你就可以寻找和写入文件的任何地方。
  * 	默认情况下，FileWriter从文件的开头开始写入（将覆盖现有数据）。FileWriter对象的seek方法可设置文件操作指定位置，如fw.seek(fw.length-1)写入操作就会从文件的末尾开始。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIoFileWriter extends js.Object {
  /**
    * 值为2，写文件操作完成状态
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var DONE: js.UndefOr[Double] = js.native
  /**
    * 值为0，写文件初始化状态
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var INIT: js.UndefOr[Double] = js.native
  /**
    * 值为1，正在写入文件状态
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var WRITING: js.UndefOr[Double] = js.native
  /**
    * 文件写入操作错误代码
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var error: js.UndefOr[Double] = js.native
  /**
    * 文件当前的长度，单位为字节
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * 取消写入文件时的回调函数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var onabort: js.UndefOr[js.Function1[/* result */ PlusIoFileEvent, Unit]] = js.native
  /**
    * 文件写入操作失败时调用的回调函数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var onerror: js.UndefOr[js.Function1[/* result */ PlusIoFileEvent, Unit]] = js.native
  /**
    * 写入文件过程中的回调函数
    * 用于获取文件读取进度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var onprogress: js.UndefOr[js.Function1[/* result */ PlusIoFileEvent, Unit]] = js.native
  /**
    * 写入文件成功完成的回调函数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var onwrite: js.UndefOr[js.Function1[/* result */ PlusIoFileEvent, Unit]] = js.native
  /**
    * 文件写入操作完成时的回调函数
    * 不管成功或失败都会触发。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var onwriteend: js.UndefOr[js.Function1[/* result */ PlusIoFileEvent, Unit]] = js.native
  /**
    * 写入文件开始时的回调函数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var onwritestart: js.UndefOr[js.Function1[/* result */ PlusIoFileEvent, Unit]] = js.native
  /**
    * 文件当前操作的指针位置
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var position: js.UndefOr[Double] = js.native
  /**
    * 当前写入文件所处的状态
    * 可取上面定义的常量值，INIT(0)、WRITING（1）、DONE（2）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var readyState: js.UndefOr[Double] = js.native
  /**
    * 终止文件写入操作
    * 写入文件数据操作开始后，可通过此方法取消写入文件数据操作。
    * 	调用此方法后将触发文件写入对象的onabort事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def abort(): Unit = js.native
  /**
    * 定位文件操作位置
    * 定位文件的操作位置，有效值为0到文件的总长度减1。
    * 	0表示文件的起始位置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def seek(): Unit = js.native
  def seek(position: Double): Unit = js.native
  /**
    * 按照指定长度截断文件
    * 从文件当前定位的位置开始，按照指定长度截断文件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def truncate(): Unit = js.native
  def truncate(length: Double): Unit = js.native
  /**
    * 向文件中写入数据
    * 从文件当前定位的位置开始，写入数据到文件中。
    * 	如果文件中已经存在数据，新写入的数据将覆盖已有数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def write(): Unit = js.native
  def write(data: String): Unit = js.native
}

