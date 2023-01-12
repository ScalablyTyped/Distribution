package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 按键类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
  */
trait PlusKeyKeyType extends StObject {
  
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
    *     可通过回调函数中KeyEvent对象的keyCode来获取按下的键值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keydown: js.UndefOr[String] = js.undefined
  
  /**
    * 键松开事件
    * 如果需要改变默认键松开的处理逻辑，则可通过plus.key.addEventListener来注册监听"keyup"事件。
    *     可通过回调函数中KeyEvent对象的keyCode来获取松开的键值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/key.html](http://www.html5plus.org/doc/zh_cn/key.html)
    */
  var keyup: js.UndefOr[String] = js.undefined
  
  /**
    * 长按键事件
    * 如果需要改变默认长按键的处理逻辑，则可通过plus.key.addEventListener来注册监听"longpressed"事件。
    *     长按键时会多次触发回调函数，通过回调函数中KeyEvent对象的keyCode来获取长按的键值。
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
  
  inline def apply(): PlusKeyKeyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusKeyKeyType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusKeyKeyType] (val x: Self) extends AnyVal {
    
    inline def setBackbutton(value: String): Self = StObject.set(x, "backbutton", value.asInstanceOf[js.Any])
    
    inline def setBackbuttonUndefined: Self = StObject.set(x, "backbutton", js.undefined)
    
    inline def setKeydown(value: String): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
    
    inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
    
    inline def setKeyup(value: String): Self = StObject.set(x, "keyup", value.asInstanceOf[js.Any])
    
    inline def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
    
    inline def setLongpressed(value: String): Self = StObject.set(x, "longpressed", value.asInstanceOf[js.Any])
    
    inline def setLongpressedUndefined: Self = StObject.set(x, "longpressed", js.undefined)
    
    inline def setMenubutton(value: String): Self = StObject.set(x, "menubutton", value.asInstanceOf[js.Any])
    
    inline def setMenubuttonUndefined: Self = StObject.set(x, "menubutton", js.undefined)
    
    inline def setSearchbutton(value: String): Self = StObject.set(x, "searchbutton", value.asInstanceOf[js.Any])
    
    inline def setSearchbuttonUndefined: Self = StObject.set(x, "searchbutton", js.undefined)
    
    inline def setVolumedownbutton(value: String): Self = StObject.set(x, "volumedownbutton", value.asInstanceOf[js.Any])
    
    inline def setVolumedownbuttonUndefined: Self = StObject.set(x, "volumedownbutton", js.undefined)
    
    inline def setVolumeupbutton(value: String): Self = StObject.set(x, "volumeupbutton", value.asInstanceOf[js.Any])
    
    inline def setVolumeupbuttonUndefined: Self = StObject.set(x, "volumeupbutton", js.undefined)
  }
}
