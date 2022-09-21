package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Native.js for Android封装一条通过JS语法直接调用Native Java接口通道，通过plus.android可调用几乎所有的系统API。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
  */
@js.native
trait PlusAndroid extends StObject {
  
  /**
    * Java类对象
    * Java类对象，可通过其属性获取类的常量，可通过方法来操作类的静态变量和方法，也通过new方法来创建类的实例对象。
    *     对于类的常量，则直接通过.后面跟随常量名称调用即可。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  var ClassObject: js.UndefOr[PlusAndroidClassObject] = js.native
  
  /**
    * Java实例对象
    * Java实例对象，可通过其方法来操作实例的变量和方法。
    *     注意：必须通过plusGetAttribute()方法读取实例对象的属性值，通过plusSetAttribute()方法设置实例对象的属性值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  var InstanceObject: js.UndefOr[PlusAndroidInstanceObject] = js.native
  
  /**
    * 获取当前Webview窗口对象的native层实例对象
    * Android平台完整Java类名为android.webkit.Webview，完整API请参考Android开发文档
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  def currentWebview(): PlusAndroidInstanceObject = js.native
  
  /**
    * 获取对象（类对象/实例对象）的属性值
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  def getAttribute(): Any = js.native
  def getAttribute(obj: Unit, name: String): Any = js.native
  def getAttribute(obj: PlusAndroidInstanceObject): Any = js.native
  def getAttribute(obj: PlusAndroidInstanceObject, name: String): Any = js.native
  
  /**
    * 实现Interface的方法
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  def implements(): PlusAndroidInstanceObject = js.native
  def implements(name: String): PlusAndroidInstanceObject = js.native
  def implements(name: String, obj: Any): PlusAndroidInstanceObject = js.native
  def implements(name: Unit, obj: Any): PlusAndroidInstanceObject = js.native
  
  /**
    * 导入Java类对象
    * 导入类对象后，就可以通过.操作符直接调用对象（类对象/实例对象）的方法。
    *     注意：导入类对象将会消耗较多的系统资源，通常不应该导入过多的类对象，可以使用plus.android.invoke()来调用未导入类实例对象的方法。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  def importClass(): PlusAndroidClassObject = js.native
  def importClass(classname: String): PlusAndroidClassObject = js.native
  
  /**
    * 调用对象（类对象/实例对象）的方法
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  def invoke(): Any = js.native
  def invoke(obj: Unit, name: String): Any = js.native
  def invoke(obj: Unit, name: String, args: Any): Any = js.native
  def invoke(obj: Unit, name: Unit, args: Any): Any = js.native
  def invoke(obj: PlusAndroidInstanceObject): Any = js.native
  def invoke(obj: PlusAndroidInstanceObject, name: String): Any = js.native
  def invoke(obj: PlusAndroidInstanceObject, name: String, args: Any): Any = js.native
  def invoke(obj: PlusAndroidInstanceObject, name: Unit, args: Any): Any = js.native
  
  /**
    * 创建实例对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  def newObject(): PlusAndroidInstanceObject = js.native
  def newObject(classname: String): PlusAndroidInstanceObject = js.native
  def newObject(classname: String, args: Any): PlusAndroidInstanceObject = js.native
  def newObject(classname: Unit, args: Any): PlusAndroidInstanceObject = js.native
  
  /**
    * 获取应用主Activity实例对象
    * Android平台完整Java类名为android.app.Activity，完整API请参考Android开发文档
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  def runtimeMainActivity(): PlusAndroidInstanceObject = js.native
  
  /**
    * 设置对象（类对象/实例对象）的属性值
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/android.html](http://www.html5plus.org/doc/zh_cn/android.html)
    */
  def setAttribute(): Unit = js.native
  def setAttribute(obj: Unit, name: String): Unit = js.native
  def setAttribute(obj: Unit, name: String, value: Any): Unit = js.native
  def setAttribute(obj: Unit, name: Unit, value: Any): Unit = js.native
  def setAttribute(obj: PlusAndroidInstanceObject): Unit = js.native
  def setAttribute(obj: PlusAndroidInstanceObject, name: String): Unit = js.native
  def setAttribute(obj: PlusAndroidInstanceObject, name: String, value: Any): Unit = js.native
  def setAttribute(obj: PlusAndroidInstanceObject, name: Unit, value: Any): Unit = js.native
}
