package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * View控件事件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
@js.native
trait PlusNativeObjViewEvents extends js.Object {
  
  /**
    * 点击事件
    * 当手指点击屏幕时触发。
    *     注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var click: js.UndefOr[String] = js.native
  
  /**
    * 双击事件
    * 双击屏幕时触发。
    *     注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var doubleclick: js.UndefOr[String] = js.native
  
  /**
    * 结束触屏事件
    * 当手指从屏幕上离开的时候触发。
    *     注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var touchend: js.UndefOr[String] = js.native
  
  /**
    * 触摸滑屏事件
    * 当手指在屏幕上滑动的时候连续地触发。
    *     注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var touchmove: js.UndefOr[String] = js.native
  
  /**
    * 开始触屏事件
    * 当手指触摸屏幕时候触发。
    *     注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var touchstart: js.UndefOr[String] = js.native
}
object PlusNativeObjViewEvents {
  
  @scala.inline
  def apply(): PlusNativeObjViewEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeObjViewEvents]
  }
  
  @scala.inline
  implicit class PlusNativeObjViewEventsOps[Self <: PlusNativeObjViewEvents] (val x: Self) extends AnyVal {
    
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
    def setClick(value: String): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setDoubleclick(value: String): Self = this.set("doubleclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleclick: Self = this.set("doubleclick", js.undefined)
    
    @scala.inline
    def setTouchend(value: String): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchend: Self = this.set("touchend", js.undefined)
    
    @scala.inline
    def setTouchmove(value: String): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchmove: Self = this.set("touchmove", js.undefined)
    
    @scala.inline
    def setTouchstart(value: String): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchstart: Self = this.set("touchstart", js.undefined)
  }
}
