package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 蓝牙设备服务信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
  */
trait PlusBluetoothBluetoothService extends js.Object {
  /**
    * 是否为设备的主服务
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  /**
    * 蓝牙设备服务的uuid
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var uuid: js.UndefOr[String] = js.undefined
}

object PlusBluetoothBluetoothService {
  @scala.inline
  def apply(isPrimary: js.UndefOr[Boolean] = js.undefined, uuid: String = null): PlusBluetoothBluetoothService = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary.get.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusBluetoothBluetoothService]
  }
}

