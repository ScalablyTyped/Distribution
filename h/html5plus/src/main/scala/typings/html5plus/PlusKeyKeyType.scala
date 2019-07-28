package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 按键类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
  */
trait PlusKeyKeyType extends js.Object {
  /**
    * 设备“返回”按钮按键事件
    * 如果需要改变默认“返回”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"backbutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var backbutton: js.UndefOr[String] = js.undefined
  /**
    * 键按下事件
    * 如果需要改变默认键按下的处理逻辑，则可通过plus.key.addEventListener来注册监听"keydown"事件。
    * 	可通过回调函数中KeyEvent对象的keyCode来获取按下的键值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keydown: js.UndefOr[String] = js.undefined
  /**
    * 键松开事件
    * 如果需要改变默认键松开的处理逻辑，则可通过plus.key.addEventListener来注册监听"keyup"事件。
    * 	可通过回调函数中KeyEvent对象的keyCode来获取松开的键值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keyup: js.UndefOr[String] = js.undefined
  /**
    * 长按键事件
    * 如果需要改变默认长按键的处理逻辑，则可通过plus.key.addEventListener来注册监听"longpressed"事件。
    * 	长按键时会多次触发回调函数，通过回调函数中KeyEvent对象的keyCode来获取长按的键值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var longpressed: js.UndefOr[String] = js.undefined
  /**
    * 设备“菜单”按钮按键事件
    * 如果需要改变默认“菜单”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"menubutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var menubutton: js.UndefOr[String] = js.undefined
  /**
    * 设备“搜索”按钮按键事件
    * 如果需要改变默认“搜索”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"searchbutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var searchbutton: js.UndefOr[String] = js.undefined
  /**
    * 设备“音量-”按钮按键事件
    * 如果需要改变默认“音量-”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"volumedownbutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var volumedownbutton: js.UndefOr[String] = js.undefined
  /**
    * 设备“音量+”按钮按键事件
    * 如果需要改变默认“音量+”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"volumeupbutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var volumeupbutton: js.UndefOr[String] = js.undefined
}

object PlusKeyKeyType {
  @scala.inline
  def apply(
    backbutton: String = null,
    keydown: String = null,
    keyup: String = null,
    longpressed: String = null,
    menubutton: String = null,
    searchbutton: String = null,
    volumedownbutton: String = null,
    volumeupbutton: String = null
  ): PlusKeyKeyType = {
    val __obj = js.Dynamic.literal()
    if (backbutton != null) __obj.updateDynamic("backbutton")(backbutton)
    if (keydown != null) __obj.updateDynamic("keydown")(keydown)
    if (keyup != null) __obj.updateDynamic("keyup")(keyup)
    if (longpressed != null) __obj.updateDynamic("longpressed")(longpressed)
    if (menubutton != null) __obj.updateDynamic("menubutton")(menubutton)
    if (searchbutton != null) __obj.updateDynamic("searchbutton")(searchbutton)
    if (volumedownbutton != null) __obj.updateDynamic("volumedownbutton")(volumedownbutton)
    if (volumeupbutton != null) __obj.updateDynamic("volumeupbutton")(volumeupbutton)
    __obj.asInstanceOf[PlusKeyKeyType]
  }
}

