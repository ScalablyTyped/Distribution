package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Proximity模块管理设备距离传感器，可获取当前设备的接近距离信息，通过plus.proximity可获取设备距离传感管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/proximity.html](http://www.html5plus.org/doc/zh_cn/proximity.html)
  */
@js.native
trait PlusProximity extends js.Object {
  
  /**
    * 关闭监听设备接近距离变化
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/proximity.html](http://www.html5plus.org/doc/zh_cn/proximity.html)
    */
  def clearWatch(): Unit = js.native
  def clearWatch(watchId: Double): Unit = js.native
  
  /**
    * 获取当前设备的接近距离信息
    * 获取当前接近设备的距离信息，距离值单位为厘米。如果感应器无法获取准确的距离值，则在接近设备时返回0，否则返回Infinity。 获取成功则调用successCB回调函数返接近回距离值。获取失败则调用errorCB回调函数错误信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/proximity.html](http://www.html5plus.org/doc/zh_cn/proximity.html)
    */
  def getCurrentProximity(): Unit = js.native
  def getCurrentProximity(successCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getCurrentProximity(successCB: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def getCurrentProximity(
    successCB: js.Function1[/* result */ Double, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 监听设备接近距离的变化
    * watchProximity将监听设备的接近距离信息变化事件，当接近距离发生变化时通过changeCB回调函数返回距离值。监听距离变化事件失败则通过errorCB回调函数返回错误信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/proximity.html](http://www.html5plus.org/doc/zh_cn/proximity.html)
    */
  def watchProximity(): Double = js.native
  def watchProximity(changeCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Double = js.native
  def watchProximity(changeCB: js.Function1[/* result */ Double, Unit]): Double = js.native
  def watchProximity(
    changeCB: js.Function1[/* result */ Double, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Double = js.native
}
