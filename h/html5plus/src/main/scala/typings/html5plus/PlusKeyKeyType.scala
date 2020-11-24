package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 按键类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
  */
@js.native
trait PlusKeyKeyType extends js.Object {
  
  /**
    * 设备“返回”按钮按键事件
    * 如果需要改变默认“返回”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"backbutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var backbutton: js.UndefOr[String] = js.native
  
  /**
    * 键按下事件
    * 如果需要改变默认键按下的处理逻辑，则可通过plus.key.addEventListener来注册监听"keydown"事件。
    *     可通过回调函数中KeyEvent对象的keyCode来获取按下的键值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keydown: js.UndefOr[String] = js.native
  
  /**
    * 键松开事件
    * 如果需要改变默认键松开的处理逻辑，则可通过plus.key.addEventListener来注册监听"keyup"事件。
    *     可通过回调函数中KeyEvent对象的keyCode来获取松开的键值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keyup: js.UndefOr[String] = js.native
  
  /**
    * 长按键事件
    * 如果需要改变默认长按键的处理逻辑，则可通过plus.key.addEventListener来注册监听"longpressed"事件。
    *     长按键时会多次触发回调函数，通过回调函数中KeyEvent对象的keyCode来获取长按的键值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var longpressed: js.UndefOr[String] = js.native
  
  /**
    * 设备“菜单”按钮按键事件
    * 如果需要改变默认“菜单”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"menubutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var menubutton: js.UndefOr[String] = js.native
  
  /**
    * 设备“搜索”按钮按键事件
    * 如果需要改变默认“搜索”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"searchbutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var searchbutton: js.UndefOr[String] = js.native
  
  /**
    * 设备“音量-”按钮按键事件
    * 如果需要改变默认“音量-”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"volumedownbutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var volumedownbutton: js.UndefOr[String] = js.native
  
  /**
    * 设备“音量+”按钮按键事件
    * 如果需要改变默认“音量+”按钮的处理逻辑，则可通过plus.key.addEventListener来注册监听"volumeupbutton"事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var volumeupbutton: js.UndefOr[String] = js.native
}
object PlusKeyKeyType {
  
  @scala.inline
  def apply(): PlusKeyKeyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusKeyKeyType]
  }
  
  @scala.inline
  implicit class PlusKeyKeyTypeOps[Self <: PlusKeyKeyType] (val x: Self) extends AnyVal {
    
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
    def setBackbutton(value: String): Self = this.set("backbutton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackbutton: Self = this.set("backbutton", js.undefined)
    
    @scala.inline
    def setKeydown(value: String): Self = this.set("keydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    
    @scala.inline
    def setKeyup(value: String): Self = this.set("keyup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyup: Self = this.set("keyup", js.undefined)
    
    @scala.inline
    def setLongpressed(value: String): Self = this.set("longpressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongpressed: Self = this.set("longpressed", js.undefined)
    
    @scala.inline
    def setMenubutton(value: String): Self = this.set("menubutton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenubutton: Self = this.set("menubutton", js.undefined)
    
    @scala.inline
    def setSearchbutton(value: String): Self = this.set("searchbutton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchbutton: Self = this.set("searchbutton", js.undefined)
    
    @scala.inline
    def setVolumedownbutton(value: String): Self = this.set("volumedownbutton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumedownbutton: Self = this.set("volumedownbutton", js.undefined)
    
    @scala.inline
    def setVolumeupbutton(value: String): Self = this.set("volumeupbutton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeupbutton: Self = this.set("volumeupbutton", js.undefined)
  }
}
