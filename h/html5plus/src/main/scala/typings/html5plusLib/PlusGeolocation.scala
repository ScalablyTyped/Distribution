package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Geolocation模块管理设备位置信息，用于获取地理位置信息，如经度、纬度等。通过plus.geolocation可获取设备位置管理对象。虽然W3C已经提供标准API获取位置信息，但在某些平台存在差异或未实现，为了保持各平台的统一性，定义此规范接口获取位置信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
  */
@js.native
trait PlusGeolocation extends js.Object {
  /**
    * JSON对象，地址信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var Address: js.UndefOr[PlusGeolocationAddress] = js.native
  /**
    * JSON对象，地理坐标信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var Coordinates: js.UndefOr[PlusGeolocationCoordinates] = js.native
  /**
    * JSON对象，定位错误信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var GeolocationError: js.UndefOr[PlusGeolocationGeolocationError] = js.native
  /**
    * JSON对象，设备位置信息数据
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var Position: js.UndefOr[PlusGeolocationPosition] = js.native
  /**
    * JSON对象，监听设备位置信息参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  var PositionOptions: js.UndefOr[PlusGeolocationPositionOptions] = js.native
  /**
    * 关闭监听设备位置信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  def clearWatch(): scala.Unit = js.native
  def clearWatch(watchId: scala.Double): scala.Unit = js.native
  /**
    * 获取当前设备位置信息
    * 位置信息将通过手机GPS设备或其它信息如IP地址、移动网络信号获取，由于获取位置信息可能需要较长的时间，当成功获取位置信息后将通过successCB回调函数返回。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  def getCurrentPosition(): scala.Unit = js.native
  def getCurrentPosition(successCB: js.Function1[/* result */ PlusGeolocationPosition, scala.Unit]): scala.Unit = js.native
  def getCurrentPosition(
    successCB: js.Function1[/* result */ PlusGeolocationPosition, scala.Unit],
    errorCB: js.Function1[/* result */ PlusGeolocationGeolocationError, scala.Unit]
  ): scala.Unit = js.native
  def getCurrentPosition(
    successCB: js.Function1[/* result */ PlusGeolocationPosition, scala.Unit],
    errorCB: js.Function1[/* result */ PlusGeolocationGeolocationError, scala.Unit],
    options: PlusGeolocationPositionOptions
  ): scala.Unit = js.native
  /**
    * 监听设备位置变化信息
    * 位置信息将通过手机GPS设备或其它信息如IP地址、移动网络信号获取。
    * 	当位置信息更新后将通过successCB回调函数返回。
    * 	位置信息获取失败则调用回调函数errorCB。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/geolocation.html](http://www.html5plus.org/doc/zh_cn/geolocation.html)
    */
  def watchPosition(): scala.Double = js.native
  def watchPosition(successCB: js.Function1[/* result */ PlusGeolocationPosition, scala.Unit]): scala.Double = js.native
  def watchPosition(
    successCB: js.Function1[/* result */ PlusGeolocationPosition, scala.Unit],
    errorCB: js.Function1[/* result */ PlusGeolocationGeolocationError, scala.Unit]
  ): scala.Double = js.native
  def watchPosition(
    successCB: js.Function1[/* result */ PlusGeolocationPosition, scala.Unit],
    errorCB: js.Function1[/* result */ PlusGeolocationGeolocationError, scala.Unit],
    option: PlusGeolocationPositionOptions
  ): scala.Double = js.native
}

