package typings.html5plus

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bluetooth模块用于管理蓝牙设备，搜索附近蓝牙设备、连接实现数据通信等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
  */
@js.native
trait PlusBluetooth extends js.Object {
  /**
    * 蓝牙设备信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var BluetoothDeviceInfo: js.UndefOr[PlusBluetoothBluetoothDeviceInfo] = js.native
  /**
    * 蓝牙设备服务信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var BluetoothService: js.UndefOr[PlusBluetoothBluetoothService] = js.native
  /**
    * 蓝牙设备特征值
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var Bluetoothcharacteristic: js.UndefOr[PlusBluetoothBluetoothcharacteristic] = js.native
  /**
    * 蓝牙设备特征值支持的操作类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var BluetoothcharacteristicProperties: js.UndefOr[PlusBluetoothBluetoothcharacteristicProperties] = js.native
  /**
    * 断开与低功耗蓝牙设备的连接
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def closeBLEConnection(): Unit = js.native
  def closeBLEConnection(deviceId: String): Unit = js.native
  def closeBLEConnection(deviceId: String, success: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def closeBLEConnection(
    deviceId: String,
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def closeBLEConnection(
    deviceId: String,
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit],
    complete: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 关闭蓝牙模块
    * 断开所有已经建立的连接，释放系统资源，要求在蓝牙功能使用完成后调用（于openBluetoothAdapter成对使用）。
    * 	关闭成功后触发options参数中的success回调，失败触发options参数中的fail回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def closeBluetoothAdapter(): Unit = js.native
  def closeBluetoothAdapter(success: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def closeBluetoothAdapter(success: js.Function1[/* result */ js.Any, Unit], fail: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def closeBluetoothAdapter(
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit],
    complete: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 连接低功耗蓝牙设备
    * 若之前已有搜索过某个蓝牙设备，并成功建立连接，可直接传入之前搜索获取的deviceId尝试连接该设备，无需进行搜索操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def createBLEConnection(): Unit = js.native
  def createBLEConnection(deviceId: String): Unit = js.native
  def createBLEConnection(deviceId: String, timeout: Double): Unit = js.native
  def createBLEConnection(deviceId: String, timeout: Double, success: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def createBLEConnection(
    deviceId: String,
    timeout: Double,
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def createBLEConnection(
    deviceId: String,
    timeout: Double,
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit],
    complete: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 获取蓝牙设备指定服务中所有特征值(characteristic)
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def getBLEDeviceCharacteristics(): Unit = js.native
  def getBLEDeviceCharacteristics(deviceId: String): Unit = js.native
  def getBLEDeviceCharacteristics(deviceId: String, serviceId: String): Unit = js.native
  def getBLEDeviceCharacteristics(deviceId: String, serviceId: String, success: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getBLEDeviceCharacteristics(
    deviceId: String,
    serviceId: String,
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getBLEDeviceCharacteristics(
    deviceId: String,
    serviceId: String,
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit],
    complete: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 获取蓝牙设备的所有服务(service)
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def getBLEDeviceServices(): Unit = js.native
  def getBLEDeviceServices(deviceId: String): Unit = js.native
  def getBLEDeviceServices(deviceId: String, success: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getBLEDeviceServices(
    deviceId: String,
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getBLEDeviceServices(
    deviceId: String,
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit],
    complete: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 获取本机蓝牙适配器状态
    * 获取成功后触发options参数中的success回调，失败触发options参数中的fail回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def getBluetoothAdapterState(): Unit = js.native
  def getBluetoothAdapterState(success: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getBluetoothAdapterState(success: js.Function1[/* result */ js.Any, Unit], fail: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getBluetoothAdapterState(
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit],
    complete: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 获取已搜索到的蓝牙设备
    * 包括已经和本机处于连接状态的设备。
    * 	获取成功后触发options参数中的success回调，失败触发options参数中的fail回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def getBluetoothDevices(): Unit = js.native
  def getBluetoothDevices(success: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getBluetoothDevices(success: js.Function1[/* result */ js.Any, Unit], fail: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getBluetoothDevices(
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit],
    complete: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 根据uuid获取处于已连接的设备
    * 获取成功后触发options参数中的success回调，失败触发options参数中的fail回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def getConnectedBluetoothDevices(): Unit = js.native
  def getConnectedBluetoothDevices(services: js.Array[_]): Unit = js.native
  def getConnectedBluetoothDevices(services: js.Array[_], success: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def getConnectedBluetoothDevices(
    services: js.Array[_],
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def getConnectedBluetoothDevices(
    services: js.Array[_],
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit],
    complete: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 启用低功耗蓝牙设备特征值变化时的notify功能，订阅特征值
    * 蓝牙设备服务的特征值必须支持notify或indicate才可以成功调用。
    * 另外，必须先启用notifyBLECharacteristicValueChange才能监听到设备characteristicValueChange事件,即特征值发生变化时通过onBLECharacteristicValueChange注册的事件回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def notifyBLECharacteristicValueChange(
    deviceId: js.UndefOr[String],
    serviceId: js.UndefOr[String],
    characteristicId: js.UndefOr[String],
    state: js.UndefOr[Boolean],
    success: js.UndefOr[js.Function1[/* result */ js.Any, Unit]],
    fail: js.UndefOr[js.Function1[/* result */ js.Any, Unit]],
    complete: js.UndefOr[js.Function1[/* result */ js.Any, Unit]]
  ): Unit = js.native
  /**
    * 监听低功耗蓝牙设备的特征值变化事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def onBLECharacteristicValueChange(): Unit = js.native
  def onBLECharacteristicValueChange(callback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  /**
    * 监听低功耗蓝牙设备连接状态变化事件
    * 包括开发者主动连接或断开连接，设备丢失，连接异常断开等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def onBLEConnectionStateChange(): Unit = js.native
  def onBLEConnectionStateChange(callback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  /**
    * 监听蓝牙适配器状态变化事件
    * 蓝牙适配器状态发生变化时触发回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def onBluetoothAdapterStateChange(): Unit = js.native
  def onBluetoothAdapterStateChange(changeCB: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  /**
    * 监听搜索到新设备的事件
    * 搜索到新设备时触发回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def onBluetoothDeviceFound(): Unit = js.native
  def onBluetoothDeviceFound(callback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  /**
    * 初始化蓝牙模块
    * 初始化成功后触发options参数中的success回调，失败触发options参数中的fail回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def openBluetoothAdapter(): Unit = js.native
  def openBluetoothAdapter(success: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def openBluetoothAdapter(success: js.Function1[/* result */ js.Any, Unit], fail: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def openBluetoothAdapter(
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit],
    complete: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 读取低功耗蓝牙设备指定特征值的二进制数据值
    * 指定的特征值需支持read操作才可以成功调用。
    * 	并行调用多次可能导致读取失败，读取的数据需要在onBLECharacteristicValueChange方法注册的回调中获取。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def readBLECharacteristicValue(
    deviceId: js.UndefOr[String],
    serviceId: js.UndefOr[String],
    characteristicId: js.UndefOr[String],
    success: js.UndefOr[js.Function1[/* result */ js.Any, Unit]],
    fail: js.UndefOr[js.Function1[/* result */ js.Any, Unit]],
    complete: js.UndefOr[js.Function1[/* result */ js.Any, Unit]]
  ): Unit = js.native
  /**
    * 开始搜索附近的蓝牙设备
    * 此操作比较耗费系统资源，请在搜索并连接到设备后调用stopBluetoothDevicesDiscovery方法停止搜索。
    * 	搜索成功后触发options参数中的success回调，失败触发options参数中的fail回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def startBluetoothDevicesDiscovery(
    services: js.UndefOr[js.Array[_]],
    allowDuplicatesKey: js.UndefOr[Boolean],
    interval: js.UndefOr[Double],
    success: js.UndefOr[js.Function1[/* result */ js.Any, Unit]],
    fail: js.UndefOr[js.Function1[/* result */ js.Any, Unit]],
    complete: js.UndefOr[js.Function1[/* result */ js.Any, Unit]]
  ): Unit = js.native
  /**
    * 停止搜寻附近的蓝牙外围设备
    * 若已经找到需要的蓝牙设备并不需要继续搜索时，应该调用该接口停止蓝牙搜索。
    * 	停止成功后触发options参数中的success回调，失败触发options参数中的fail回调。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def stopBluetoothDevicesDiscovery(): Unit = js.native
  def stopBluetoothDevicesDiscovery(success: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def stopBluetoothDevicesDiscovery(success: js.Function1[/* result */ js.Any, Unit], fail: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def stopBluetoothDevicesDiscovery(
    success: js.Function1[/* result */ js.Any, Unit],
    fail: js.Function1[/* result */ js.Any, Unit],
    complete: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  /**
    * 向低功耗蓝牙设备指定特征值写入二进制数据
    * 指定的特征值需支持write操作才可以成功调用。
    * 	并行调用多次可能导致读取失败，系统可能会限制单次传输的数据大小，超过最大字节数后可能会发生写入错误，建议每次写入不超过20字节。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  def writeBLECharacteristicValue(
    deviceId: js.UndefOr[String],
    serviceId: js.UndefOr[String],
    characteristicId: js.UndefOr[String],
    value: js.UndefOr[ArrayBuffer],
    success: js.UndefOr[js.Function1[/* result */ js.Any, Unit]],
    fail: js.UndefOr[js.Function1[/* result */ js.Any, Unit]],
    complete: js.UndefOr[js.Function1[/* result */ js.Any, Unit]]
  ): Unit = js.native
}

