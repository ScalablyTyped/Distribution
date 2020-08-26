package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objective-C实例对象
  * Objective-C实例对象，可通过其方法来操作示例的变量和方法。
  *     注意：必须通过plusGetAttribute()方法读取示例对象的属性值，通过plusSetAttribute()方法设置示例对象的属性值。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
  */
@js.native
trait PlusIosInstanceObject extends js.Object {
  /**
    * 获取Objective-C实例对象的属性
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
    */
  def plusGetAttribute(): js.Any = js.native
  def plusGetAttribute(name: String): js.Any = js.native
  /**
    * 设置Objective-C示例对象的属性
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
    */
  def plusSetAttribute(): Unit = js.native
  def plusSetAttribute(name: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
  def plusSetAttribute(name: String): Unit = js.native
  def plusSetAttribute(name: String, value: js.Any): Unit = js.native
}

