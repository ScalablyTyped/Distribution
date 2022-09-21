package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Accelerometer模块管理设备加速度传感器，用于获取设备加速度信息，包括x（屏幕水平方向）、y（垂直屏幕水平方向）、z（垂直屏幕平面方向）三个方向的加速度信息。通过plus.accelerometer获取设备加速度传感器管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
  */
@js.native
trait PlusAccelerometer extends StObject {
  
  /**
    * 设备加速度信息对象
    * JSON对象，保存获取设备的加速度信息，包括x、y、z三个方向的加速度信息。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var Acceleration: js.UndefOr[PlusAccelerometerAcceleration] = js.native
  
  /**
    * 监听设备加速度感应器参数
    * JSON对象，用于设置获取设备加速度信息的参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var AccelerometerOption: js.UndefOr[PlusAccelerometerAccelerometerOption] = js.native
  
  /**
    * 关闭监听设备加速度信息
    * 关闭监听设备加速度信息，应用关闭调用watchAcceleration方法的开启的监听操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  def clearWatch(): Unit = js.native
  def clearWatch(watchId: Double): Unit = js.native
  
  /**
    * 获取当前设备的加速度信息
    * 加速度是设备在当前方向上所做相对运动变化（增、减量）的运动传感器。加速度信息包括x、y、z三个方向的信息。
    *     加速度信息可通过successCB回调函数返回。加速度信息获取失败则调用回调函数errorCB。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  def getCurrentAcceleration(): Unit = js.native
  def getCurrentAcceleration(successCB: js.Function1[/* result */ PlusAccelerometerAcceleration, Unit]): Unit = js.native
  def getCurrentAcceleration(
    successCB: js.Function1[/* result */ PlusAccelerometerAcceleration, Unit],
    errorCB: js.Function1[/* result */ Any, Unit]
  ): Unit = js.native
  def getCurrentAcceleration(successCB: Unit, errorCB: js.Function1[/* result */ Any, Unit]): Unit = js.native
  
  /**
    * 监听设备加速度变化信息
    * 加速度是设备在当前方向上所做相对运动变化（增、减量）的运动传感器。加速度信息包括x、y、z三个方向的信息。
    * watchAcceleration每隔固定时间就获取一次设备的加速度信息，通过successCB回调函数返回。可通过option的frequency参数设定获取设备加速度信息的时间间隔。
    * 加速度信息获取失败则调用回调函数errorCB。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  def watchAcceleration(): Double = js.native
  def watchAcceleration(successCB: js.Function1[/* result */ PlusAccelerometerAcceleration, Unit]): Double = js.native
  def watchAcceleration(
    successCB: js.Function1[/* result */ PlusAccelerometerAcceleration, Unit],
    errorCB: js.Function1[/* result */ Any, Unit]
  ): Double = js.native
  def watchAcceleration(
    successCB: js.Function1[/* result */ PlusAccelerometerAcceleration, Unit],
    errorCB: js.Function1[/* result */ Any, Unit],
    options: PlusAccelerometerAccelerometerOption
  ): Double = js.native
  def watchAcceleration(
    successCB: js.Function1[/* result */ PlusAccelerometerAcceleration, Unit],
    errorCB: Unit,
    options: PlusAccelerometerAccelerometerOption
  ): Double = js.native
  def watchAcceleration(successCB: Unit, errorCB: js.Function1[/* result */ Any, Unit]): Double = js.native
  def watchAcceleration(
    successCB: Unit,
    errorCB: js.Function1[/* result */ Any, Unit],
    options: PlusAccelerometerAccelerometerOption
  ): Double = js.native
  def watchAcceleration(successCB: Unit, errorCB: Unit, options: PlusAccelerometerAccelerometerOption): Double = js.native
}
