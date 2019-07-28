package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * iBeacon模块用于搜索附件的iBeacon设备（*请使用HBuilderX并更新到最新版本*）。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
  */
@js.native
trait PlusIbeacon extends js.Object {
  /**
    * iBeacon设备信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var IBeaconInfo: js.UndefOr[PlusIbeaconIBeaconInfo] = js.native
  /**
    * 获取已搜索到的iBeacon设备
    * 获取成功后触发successCB回调，失败触发errorCB回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  def getBeacons(): Unit = js.native
  def getBeacons(success: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getBeacons(success: js.Function1[/* result */ js.Any, Unit], fail: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getBeacons(
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit],
    complete: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 监听iBeacon服务状态变化
    * iBeacon服务状态变化时触发changeCB回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  def onBeaconServiceChange(): Unit = js.native
  def onBeaconServiceChange(changeCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  /**
    * 监听iBeacon设备更新
    * iBeacon设备更新后触发updateCB回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  def onBeaconUpdate(): Unit = js.native
  def onBeaconUpdate(updateCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  /**
    * 开始搜索附近的iBeacon设备
    * 搜索成功后触发successCB回调，失败触发errorCB回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  def startBeaconDiscovery(): Unit = js.native
  def startBeaconDiscovery(uuids: js.Array[_]): Unit = js.native
  def startBeaconDiscovery(uuids: js.Array[_], ignoretoothAvailable: Boolean): Unit = js.native
  def startBeaconDiscovery(
    uuids: js.Array[_],
    ignoretoothAvailable: Boolean,
    success: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def startBeaconDiscovery(
    uuids: js.Array[_],
    ignoretoothAvailable: Boolean,
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def startBeaconDiscovery(
    uuids: js.Array[_],
    ignoretoothAvailable: Boolean,
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit],
    complete: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 停止搜索附近的iBeacon设备
    * 取消成功后触发successCB回调，失败触发errorCB回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  def stopBeaconDiscovery(): Unit = js.native
  def stopBeaconDiscovery(success: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def stopBeaconDiscovery(success: js.Function1[/* result */ js.Any, Unit], fail: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def stopBeaconDiscovery(
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit],
    complete: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
}

