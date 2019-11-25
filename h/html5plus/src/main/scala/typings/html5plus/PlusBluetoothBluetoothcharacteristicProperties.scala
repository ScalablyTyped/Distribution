package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 蓝牙设备特征值支持的操作类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
  */
trait PlusBluetoothBluetoothcharacteristicProperties extends js.Object {
  /**
    * 特征值是否支持indicate操作
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var indicate: js.UndefOr[Boolean] = js.undefined
  /**
    * 特征值是否支持notify操作
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  @JSName("notify")
  var notify_FPlusBluetoothBluetoothcharacteristicProperties: js.UndefOr[Boolean] = js.undefined
  /**
    * 特征值是否支持read操作
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var read: js.UndefOr[Boolean] = js.undefined
  /**
    * 特征值是否支持write操作
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var write: js.UndefOr[Boolean] = js.undefined
}

object PlusBluetoothBluetoothcharacteristicProperties {
  @scala.inline
  def apply(
    indicate: js.UndefOr[Boolean] = js.undefined,
    notify: js.UndefOr[Boolean] = js.undefined,
    read: js.UndefOr[Boolean] = js.undefined,
    write: js.UndefOr[Boolean] = js.undefined
  ): PlusBluetoothBluetoothcharacteristicProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(indicate)) __obj.updateDynamic("indicate")(indicate.asInstanceOf[js.Any])
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify.asInstanceOf[js.Any])
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (!js.isUndefined(write)) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusBluetoothBluetoothcharacteristicProperties]
  }
}

