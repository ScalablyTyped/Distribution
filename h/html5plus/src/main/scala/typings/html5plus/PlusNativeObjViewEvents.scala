package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * View控件事件
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
  */
trait PlusNativeObjViewEvents extends js.Object {
  /**
    * 点击事件
    * 当手指点击屏幕时触发。
    *     注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var click: js.UndefOr[String] = js.undefined
  /**
    * 双击事件
    * 双击屏幕时触发。
    *     注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var doubleclick: js.UndefOr[String] = js.undefined
  /**
    * 结束触屏事件
    * 当手指从屏幕上离开的时候触发。
    *     注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var touchend: js.UndefOr[String] = js.undefined
  /**
    * 触摸滑屏事件
    * 当手指在屏幕上滑动的时候连续地触发。
    *     注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var touchmove: js.UndefOr[String] = js.undefined
  /**
    * 开始触屏事件
    * 当手指触摸屏幕时候触发。
    *     注意：如果将View控件设置为不拦截触屏事件（view.interceptTouchEvent(false)）则不会触发此事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeobj.html](http://www.html5plus.org/doc/zh_cn/nativeobj.html)
    */
  var touchstart: js.UndefOr[String] = js.undefined
}

object PlusNativeObjViewEvents {
  @scala.inline
  def apply(
    click: String = null,
    doubleclick: String = null,
    touchend: String = null,
    touchmove: String = null,
    touchstart: String = null
  ): PlusNativeObjViewEvents = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (doubleclick != null) __obj.updateDynamic("doubleclick")(doubleclick.asInstanceOf[js.Any])
    if (touchend != null) __obj.updateDynamic("touchend")(touchend.asInstanceOf[js.Any])
    if (touchmove != null) __obj.updateDynamic("touchmove")(touchmove.asInstanceOf[js.Any])
    if (touchstart != null) __obj.updateDynamic("touchstart")(touchstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusNativeObjViewEvents]
  }
}

