package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Native.js for iOS封装一条通过JS语法直接调用Native Objective-C接口通道，通过plus.ios可调用几乎所有的系统API。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
  */
@js.native
trait PlusIos extends js.Object {
  /**
    * Objective-C类对象
    * Objective-C类对象，可通过其属性获取类的常量，可通过方法来操作类的静态方法，也通过new方法来创建类的实例对象。
    * 	对于类的静态方法，则直接通过.后面跟随方法名称调用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
    */
  var ClassObject: js.UndefOr[PlusIosClassObject] = js.native
  /**
    * Objective-C实例对象
    * Objective-C实例对象，可通过其方法来操作示例的变量和方法。
    * 	注意：必须通过plusGetAttribute()方法读取示例对象的属性值，通过plusSetAttribute()方法设置示例对象的属性值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
    */
  var InstanceObject: js.UndefOr[PlusIosInstanceObject] = js.native
  /**
    * 获取当前Webview窗口对象的native层UIWebview实例对象
    * UIWebview对象的API请参考Apple开发文档
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
    */
  def currentWebview(): PlusIosInstanceObject = js.native
  /**
    * 销毁实例对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
    */
  def deleteObject(): Unit = js.native
  def deleteObject(obj: js.Any): Unit = js.native
  /**
    * 实现代理的方法
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
    */
  def implements(): PlusIosInstanceObject = js.native
  def implements(name: String): PlusIosInstanceObject = js.native
  def implements(name: String, obj: js.Any): PlusIosInstanceObject = js.native
  /**
    * 导入Objective-C类对象
    * 导入类对象后，就可以通过.操作符直接调用对象（类对象/实例对象）的方法。
    * 	通过.操作符号调用方法时，不需要使用":"来分割参数。
    * 	注意：导入类对象将会消耗较多的系统资源，不应该导入过多的类对象，可以使用plus.ios.invoke()来调用未导入类实例对象的方法。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
    */
  def importClass(): PlusIosClassObject = js.native
  def importClass(classname: String): PlusIosClassObject = js.native
  /**
    * 调用对象（类对象/示例对象）的方法
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
    */
  def invoke(): js.Any = js.native
  def invoke(obj: PlusIosInstanceObject): js.Any = js.native
  def invoke(obj: PlusIosInstanceObject, name: String): js.Any = js.native
  def invoke(obj: PlusIosInstanceObject, name: String, args: js.Any): js.Any = js.native
  /**
    * 创建实例对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
    */
  def newObject(): PlusIosInstanceObject = js.native
  def newObject(classname: String): PlusIosInstanceObject = js.native
  def newObject(classname: String, args: js.Any): PlusIosInstanceObject = js.native
}

