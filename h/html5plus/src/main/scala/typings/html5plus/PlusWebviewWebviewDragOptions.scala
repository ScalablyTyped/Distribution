package typings.html5plus

import typings.html5plus.html5plusStrings.bounce
import typings.html5plus.html5plusStrings.followFinger
import typings.html5plus.html5plusStrings.left
import typings.html5plus.html5plusStrings.ltr
import typings.html5plus.html5plusStrings.right
import typings.html5plus.html5plusStrings.rtl
import typings.html5plus.html5plusStrings.silent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 窗口手势操作参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewDragOptions extends StObject {
  
  /**
    * 滑屏操作回调事件触发步长
    * 用于设置滑屏回调事件触发频率，取值范围为1-100，值越小触发频率越高，值越大触发频率越小，默认值为20。
    *     如设置值为20，则表示滑屏操作移动距离超过可移动范围的20%则触发一次回调事件，可通过回调函数参数（WebviewDragEvent）的progress属性获取。
    *     注意：触发频率过大会影响效率，开发者需谨慎设置此值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var callbackStep: js.UndefOr[Double] = js.undefined
  
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
  var direction: js.UndefOr[rtl | left | ltr | right] = js.undefined
  
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
  var moveMode: js.UndefOr[followFinger | silent | bounce] = js.undefined
}
object PlusWebviewWebviewDragOptions {
  
  @scala.inline
  def apply(): PlusWebviewWebviewDragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewDragOptions]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewDragOptionsMutableBuilder[Self <: PlusWebviewWebviewDragOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackStep(value: Double): Self = StObject.set(x, "callbackStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackStepUndefined: Self = StObject.set(x, "callbackStep", js.undefined)
    
    @scala.inline
    def setDirection(value: rtl | left | ltr | right): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setMoveMode(value: followFinger | silent | bounce): Self = StObject.set(x, "moveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveModeUndefined: Self = StObject.set(x, "moveMode", js.undefined)
  }
}
