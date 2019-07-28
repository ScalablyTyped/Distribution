package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Screen模块管理设备屏幕信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
  */
@js.native
trait PlusScreen extends js.Object {
  /**
    * 设备屏幕水平方向的密度
    * 设备屏幕的密度为每英寸所显示的像素点数，密度越高显示清晰度越高，单位为dpi。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var dpiX: js.UndefOr[Double] = js.native
  /**
    * 设备屏幕垂直方向的密度
    * 设备屏幕的密度为每英寸所显示的像素点数，密度越高显示清晰度越高，单位为dpi。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var dpiY: js.UndefOr[Double] = js.native
  /**
    * 设备屏幕高度分辨率
    * 设备屏幕区域包括系统状态栏显示区域和应用显示区域，screen获取的是设备屏幕总区域的逻辑分辨率，单位为px。
    * 	如果需要获取实际分辨率则需要乘以比例值scale。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var resolutionHeight: js.UndefOr[Double] = js.native
  /**
    * 设备屏幕宽度分辨率
    * 设备屏幕区域包括系统状态栏显示区域和应用显示区域，screen获取的是设备屏幕总区域的分辨率，单位为px。
    * 	如果需要获取实际分辨率则需要乘以比例值scale。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var resolutionWidth: js.UndefOr[Double] = js.native
  /**
    * 逻辑分辨率与实际分辨率的比例
    * 屏幕分辨率分逻辑分辨率率和实际分辨率，在html页面中使用的像素值都是相对于逻辑分辨率，此值就是逻辑分辨率和实际分辨率的比例，实际分辨率=逻辑分辨率*比例。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * 获取屏幕亮度值
    * 屏幕亮度值范围为0到1，0表示最低亮度值，1表示最高亮度值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def getBrightness(): Double = js.native
  /**
    * 锁定屏幕方向
    * 锁定屏幕方向后屏幕只能按锁定的屏幕方向显示，关闭当前页面后仍然有效。
    * 	可再次调用此方法修改屏幕锁定方向或调用unlockOrientation()方法恢复到应用的默认值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def lockOrientation(): Unit = js.native
  def lockOrientation(orientation: String): Unit = js.native
  /**
    * 设置屏幕亮度
    * 调用此方法调节设备屏幕亮度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def setBrightness(): Unit = js.native
  def setBrightness(brightness: Double): Unit = js.native
  /**
    * 解除锁定屏幕方向
    * 解除锁定屏幕方向后将恢复应用默认的屏幕显示方向（通常为应用打包发布时设置的方向）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def unlockOrientation(): Unit = js.native
}

