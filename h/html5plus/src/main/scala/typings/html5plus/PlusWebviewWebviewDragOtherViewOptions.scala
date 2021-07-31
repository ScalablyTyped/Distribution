package typings.html5plus

import typings.html5plus.html5plusStrings.follow
import typings.html5plus.html5plusStrings.silent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 手势操作关联对象参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewDragOtherViewOptions extends StObject {
  
  /**
    * 滑动模式
    * 可取值：
    *     "follow" - 同步跟随主Webview窗口滑动；
    *     "silent" - 不跟随主Webview窗口滑动。
    * - follow: 同步跟随主Webview窗口滑动
    * - silent: 不跟随主Webview窗口滑动
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var moveMode: js.UndefOr[follow | silent] = js.undefined
  
  /**
    * 手势关联对象
    * 可取值Webview窗口的id（String类型）、Webview窗口对象、原生View窗口对象（plus.nativeObj.View）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var view: js.UndefOr[String] = js.undefined
}
object PlusWebviewWebviewDragOtherViewOptions {
  
  @scala.inline
  def apply(): PlusWebviewWebviewDragOtherViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewDragOtherViewOptions]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewDragOtherViewOptionsMutableBuilder[Self <: PlusWebviewWebviewDragOtherViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMoveMode(value: follow | silent): Self = StObject.set(x, "moveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveModeUndefined: Self = StObject.set(x, "moveMode", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
