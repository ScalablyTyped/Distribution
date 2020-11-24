package typings.html5plus

import typings.html5plus.html5plusStrings.bounce
import typings.html5plus.html5plusStrings.followFinger
import typings.html5plus.html5plusStrings.left
import typings.html5plus.html5plusStrings.ltr
import typings.html5plus.html5plusStrings.right
import typings.html5plus.html5plusStrings.rtl
import typings.html5plus.html5plusStrings.silent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 窗口手势操作参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewDragOptions extends js.Object {
  
  /**
    * 滑屏操作回调事件触发步长
    * 用于设置滑屏回调事件触发频率，取值范围为1-100，值越小触发频率越高，值越大触发频率越小，默认值为20。
    *     如设置值为20，则表示滑屏操作移动距离超过可移动范围的20%则触发一次回调事件，可通过回调函数参数（WebviewDragEvent）的progress属性获取。
    *     注意：触发频率过大会影响效率，开发者需谨慎设置此值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var callbackStep: js.UndefOr[Double] = js.native
  
  /**
    * 设置的手势类型
    * 可取值：
    *     可取值：
    *     "rtl" - 从右向左滑动手势；
    *     "left" - 向左滑动手势，与rtl一致；
    *     "ltr" - 从左向右滑动手势；
    *     "right" - 向右滑动手势，与ltr一致。
    * - rtl: 从右向左滑动手势
    * - left: 向左滑动手势，与rtl一致
    * - ltr: 从左向右滑动手势
    * - right: 向右滑动手势，与ltr一致
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var direction: js.UndefOr[rtl | left | ltr | right] = js.native
  
  /**
    * 滑动手势模式
    * 可取值：
    *     "followFinger" - 当前Webview窗口跟随手指滑动；
    *     "silent" - 当前Webview窗口不跟随手指滑动；
    *     "bounce" - 当前Webview窗口自动回弹（松手后窗口恢复到拖动前的位置）,通常可通过设置此模式来实现Tab项无法继续滑动切换自动回弹效果。
    * - followFinger: 当前Webview窗口跟随手指滑动
    * - silent: 当前Webview窗口不跟随手指滑动
    * - bounce: 当前Webview窗口自动回弹
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var moveMode: js.UndefOr[followFinger | silent | bounce] = js.native
}
object PlusWebviewWebviewDragOptions {
  
  @scala.inline
  def apply(): PlusWebviewWebviewDragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewDragOptions]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewDragOptionsOps[Self <: PlusWebviewWebviewDragOptions] (val x: Self) extends AnyVal {
    
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
    def setCallbackStep(value: Double): Self = this.set("callbackStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackStep: Self = this.set("callbackStep", js.undefined)
    
    @scala.inline
    def setDirection(value: rtl | left | ltr | right): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setMoveMode(value: followFinger | silent | bounce): Self = this.set("moveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveMode: Self = this.set("moveMode", js.undefined)
  }
}
