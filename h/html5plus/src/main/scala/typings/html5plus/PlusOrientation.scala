package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Orientation模块管理设备的方向信息，包括alpha、beta、gamma三个方向信息，通过plus.orientation可获取设备方向管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
  */
@js.native
trait PlusOrientation extends StObject {
  
  /**
    * JSON对象，监听设备方向感应器参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var OrientationOption: js.UndefOr[PlusOrientationOrientationOption] = js.native
  
  /**
    * JSON对象，设备方向信息数据
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var Rotation: js.UndefOr[PlusOrientationRotation] = js.native
  
  /**
    * 关闭监听设备方向信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  def clearWatch(): Unit = js.native
  def clearWatch(watchId: Double): Unit = js.native
  
  /**
    * 获取当前设备的方向信息，包括alpha、beta、gamma三个方向信息
    * 方向信息是设备相对于水平初始方向分别以z、x、y轴为轴心旋转的角度，对应值为alpha、beta、gamma三个方向的信息。 方向信息可通过successCB回调函数返回。方向信息获取失败则调用回调函数errorCB
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  def getCurrentOrientation(): Unit = js.native
  def getCurrentOrientation(successCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getCurrentOrientation(successCB: js.Function1[/* result */ String, Unit]): Unit = js.native
  def getCurrentOrientation(
    successCB: js.Function1[/* result */ String, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * 监听设备方向信息的变化
    * 方向信息是设备相对于水平初始方向分别以z、x、y轴为轴心旋转的角度，对应值为alpha、beta、gamma三个方向的信息。watchOrientation每隔固定时间就获取一次设备的方向信息，通过successCB回调函数返回。可通过option的frequency参数设定获取设备方向信息的时间间隔。方向信息获取失败则调用回调函数errorCB。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  def watchOrientation(): Double = js.native
  def watchOrientation(
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.UndefOr[scala.Nothing],
    option: PlusOrientationOrientationOption
  ): Double = js.native
  def watchOrientation(successCB: js.UndefOr[scala.Nothing], errorCB: js.Function1[/* result */ js.Any, Unit]): Double = js.native
  def watchOrientation(
    successCB: js.UndefOr[scala.Nothing],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    option: PlusOrientationOrientationOption
  ): Double = js.native
  def watchOrientation(successCB: js.Function1[/* result */ String, Unit]): Double = js.native
  def watchOrientation(
    successCB: js.Function1[/* result */ String, Unit],
    errorCB: js.UndefOr[scala.Nothing],
    option: PlusOrientationOrientationOption
  ): Double = js.native
  def watchOrientation(
    successCB: js.Function1[/* result */ String, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit]
  ): Double = js.native
  def watchOrientation(
    successCB: js.Function1[/* result */ String, Unit],
    errorCB: js.Function1[/* result */ js.Any, Unit],
    option: PlusOrientationOrientationOption
  ): Double = js.native
}
