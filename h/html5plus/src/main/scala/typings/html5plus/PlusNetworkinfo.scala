package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * networkinfo模块用于获取网络信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
  */
trait PlusNetworkinfo extends js.Object {
  /**
    * 蜂窝移动2G网络
    * 网络状态常量，当前设备连接到蜂窝移动2G网络，固定值为4。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_CELL2G: js.UndefOr[Double] = js.undefined
  /**
    * 蜂窝移动3G网络
    * 网络状态常量，当前设备连接到蜂窝移动3G网络，固定值为5。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_CELL3G: js.UndefOr[Double] = js.undefined
  /**
    * 蜂窝移动4G网络
    * 网络状态常量，当前设备连接到蜂窝移动4G网络，固定值为6。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_CELL4G: js.UndefOr[Double] = js.undefined
  /**
    * 有线网络
    * 网络状态常量，当前设备连接到有线网络，固定值为2。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_ETHERNET: js.UndefOr[Double] = js.undefined
  /**
    * 未连接网络
    * 网络状态常量，当前设备网络未连接网络，固定值为1。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_NONE: js.UndefOr[Double] = js.undefined
  /**
    * 网络连接状态未知
    * 网络状态常量，表示当前设备网络状态未知，固定值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_UNKNOW: js.UndefOr[Double] = js.undefined
  /**
    * 无线WIFI网络
    * 网络状态常量，当前设备连接到无线WIFI网络，固定值为3。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var CONNECTION_WIFI: js.UndefOr[Double] = js.undefined
  /**
    * 获取设备当前连接的网络类型
    * 获取当前设备连接的网络类型，返回值为网络类型常量，可取值CONNECTION_*常量。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  def getCurrentType(): Double
}

object PlusNetworkinfo {
  @scala.inline
  def apply(
    getCurrentType: () => Double,
    CONNECTION_CELL2G: js.UndefOr[Double] = js.undefined,
    CONNECTION_CELL3G: js.UndefOr[Double] = js.undefined,
    CONNECTION_CELL4G: js.UndefOr[Double] = js.undefined,
    CONNECTION_ETHERNET: js.UndefOr[Double] = js.undefined,
    CONNECTION_NONE: js.UndefOr[Double] = js.undefined,
    CONNECTION_UNKNOW: js.UndefOr[Double] = js.undefined,
    CONNECTION_WIFI: js.UndefOr[Double] = js.undefined
  ): PlusNetworkinfo = {
    val __obj = js.Dynamic.literal(getCurrentType = js.Any.fromFunction0(getCurrentType))
    if (!js.isUndefined(CONNECTION_CELL2G)) __obj.updateDynamic("CONNECTION_CELL2G")(CONNECTION_CELL2G.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CONNECTION_CELL3G)) __obj.updateDynamic("CONNECTION_CELL3G")(CONNECTION_CELL3G.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CONNECTION_CELL4G)) __obj.updateDynamic("CONNECTION_CELL4G")(CONNECTION_CELL4G.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CONNECTION_ETHERNET)) __obj.updateDynamic("CONNECTION_ETHERNET")(CONNECTION_ETHERNET.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CONNECTION_NONE)) __obj.updateDynamic("CONNECTION_NONE")(CONNECTION_NONE.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CONNECTION_UNKNOW)) __obj.updateDynamic("CONNECTION_UNKNOW")(CONNECTION_UNKNOW.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CONNECTION_WIFI)) __obj.updateDynamic("CONNECTION_WIFI")(CONNECTION_WIFI.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusNetworkinfo]
  }
}

