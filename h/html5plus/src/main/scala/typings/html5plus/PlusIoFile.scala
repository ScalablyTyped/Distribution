package typings.html5plus

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 文件系统中的文件数据对象，用于获取文件的数据
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
@js.native
trait PlusIoFile extends js.Object {
  /**
    * 文件对象的最后修改时间
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var lastModifiedDate: js.UndefOr[Date] = js.native
  /**
    * 文件数据对象的名称，不包括路径
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * 文件数据对象的数据大小，单位为字节
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * 文件数据对象MIME类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * 关闭文件数据对象
    * 当文件数据对象不再使用时，可通过此方法关闭，释放系统资源。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def close(): Unit = js.native
  /**
    * 获取文件指定的数据内容
    * 获取文件指定的数据内容，其中end必须大于start。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  def slice(): PlusIoFile = js.native
  def slice(start: Double): PlusIoFile = js.native
  def slice(start: Double, end: Double): PlusIoFile = js.native
}

