package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 按键事件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
  */
@js.native
trait PlusKeyKeyEvent extends js.Object {
  /**
    * 触发按键事件的键值
    * 键值由各系统平台定义，一些特殊按键在不同的设备上可能存在差异。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keyCode: js.UndefOr[Double] = js.native
  /**
    * 按键事件类型
    * 用于表明触发此按键事件的类型，值为KeyType中定义的值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keyType: js.UndefOr[PlusKeyKeyType] = js.native
}

object PlusKeyKeyEvent {
  @scala.inline
  def apply(): PlusKeyKeyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusKeyKeyEvent]
  }
  @scala.inline
  implicit class PlusKeyKeyEventOps[Self <: PlusKeyKeyEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyCode(value: Double): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyCode: Self = this.set("keyCode", js.undefined)
    @scala.inline
    def setKeyType(value: PlusKeyKeyType): Self = this.set("keyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", js.undefined)
  }
  
}

