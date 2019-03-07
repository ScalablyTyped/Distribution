package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 按键事件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
  */
trait PlusKeyKeyEvent extends js.Object {
  /**
    * 触发按键事件的键值
    * 键值由各系统平台定义，一些特殊按键在不同的设备上可能存在差异。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keyCode: js.UndefOr[scala.Double] = js.undefined
  /**
    * 按键事件类型
    * 用于表明触发此按键事件的类型，值为KeyType中定义的值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keyType: js.UndefOr[PlusKeyKeyType] = js.undefined
}

object PlusKeyKeyEvent {
  @scala.inline
  def apply(keyCode: scala.Int | scala.Double = null, keyType: PlusKeyKeyType = null): PlusKeyKeyEvent = {
    val __obj = js.Dynamic.literal()
    if (keyCode != null) __obj.updateDynamic("keyCode")(keyCode.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType)
    __obj.asInstanceOf[PlusKeyKeyEvent]
  }
}

