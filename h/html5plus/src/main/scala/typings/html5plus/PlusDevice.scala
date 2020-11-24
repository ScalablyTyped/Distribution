package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Device模块管理设备信息，用于获取手机设备的相关信息，如IMEI、IMSI、型号、厂商等。通过plus.device获取设备信息管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
  */
@js.native
trait PlusDevice extends js.Object {
  
  /**
    * 发出蜂鸣声
    * 调用此方法使得设备发出蜂鸣声。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def beep(): Unit = js.native
  def beep(times: Double): Unit = js.native
  
  /**
    * 拨打电话
    * 调用系统程序拨打电话。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def dial(): Unit = js.native
  def dial(number: js.UndefOr[scala.Nothing], confirm: Boolean): Unit = js.native
  def dial(number: String): Unit = js.native
  def dial(number: String, confirm: Boolean): Unit = js.native
  
  /**
    * 获取设备的系统音量
    * 系统音量值范围为0到1，0表示静音，1表示最大音量值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def getVolume(): Double = js.native
  
  /**
    * 设备的国际移动设备身份码
    * 调用此属性获取设备的国际移动设备身份码。
    *     如果设备不支持则返回空字符串。
    *     如果设备存在多个身份码，则以“,”字符分割拼接，如“862470039452950,862470039452943”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var imei: js.UndefOr[String] = js.native
  
  /**
    * 设备的国际移动用户识别码
    * 字符串数组类型，获取设备上插入SIM的国际移动设备身份码。
    *     如果设备支持多卡模式则返回所有SIM身份码。
    *     如果设备不支持或没有插入SIM卡则返回空数组。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var imsi: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * 获取程序是否一直保持唤醒（屏幕常亮）状态
    * 调用此方法获取程序是否一致保持唤醒状态。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def isWakelock(): Boolean = js.native
  
  /**
    * 设备的型号
    * 调用此属性获取设备的型号信息。
    *     如果设备不支持则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var model: js.UndefOr[String] = js.native
  
  /**
    * 设置设备的系统音量
    * 调用此方法调节设备的系统音量。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def setVolume(): Unit = js.native
  def setVolume(volume: Double): Unit = js.native
  
  /**
    * 设置应用是否保持唤醒（屏幕常亮）状态
    * 调用此方法设置应用是否一直保持唤醒状态，保持唤醒状态将会导致程序屏幕常亮、系统不会自动锁屏，从而导致消耗更多的电量。若未设置一直保持唤醒状态则会根据系统设置自动锁定屏幕。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def setWakelock(): Unit = js.native
  def setWakelock(lock: Boolean): Unit = js.native
  
  /**
    * 设备的唯一标识
    * 调用此属性获取设备的唯一标识号。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var uuid: js.UndefOr[String] = js.native
  
  /**
    * 设备的生产厂商
    * 调用此属性获取设备的生产厂商信息。
    *     如果设备不支持则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var vendor: js.UndefOr[String] = js.native
  
  /**
    * 设备振动
    * 调用此方法使得设备振动。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def vibrate(): Unit = js.native
  def vibrate(milliseconds: Double): Unit = js.native
}
