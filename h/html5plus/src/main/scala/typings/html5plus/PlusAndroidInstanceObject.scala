package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Java实例对象
  * Java实例对象，可通过其方法来操作实例的变量和方法。
  * 	注意：必须通过plusGetAttribute()方法读取实例对象的属性值，通过plusSetAttribute()方法设置实例对象的属性值。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
  */
@js.native
trait PlusAndroidInstanceObject extends js.Object {
  /**
    * 获取Java实例对象的属性
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  def plusGetAttribute(): js.Any = js.native
  def plusGetAttribute(name: String): js.Any = js.native
  /**
    * 设置Java实例对象的属性
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  def plusSetAttribute(): Unit = js.native
  def plusSetAttribute(name: String): Unit = js.native
  def plusSetAttribute(name: String, value: js.Any): Unit = js.native
}

