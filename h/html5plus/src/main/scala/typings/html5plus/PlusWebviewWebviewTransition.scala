package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 一组用于定义页面或控件转换效果的属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewTransition extends StObject {
  
  /**
    * 变换持续的时间
    * 默认值为0，即无动画效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var duration: js.UndefOr[String] = js.native
  
  /**
    * 产生变换效果的属性
    * 默认值为"all"，暂不支持其它值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var property: js.UndefOr[String] = js.native
  
  /**
    * 窗口变换效果
    * 可取值：
    *     "linear"：匀速变化，匀速动画效果；
    *     "ease-in"：匀加速变化，逐渐变快的动画效果；
    *     "ease-out"：匀减速变化，逐渐变慢的动画效果；
    *     "ease-in-out"：先加速后减速变化，先变快后变慢的动画效果。
    *     默认值为"ease-in-out"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var timingfunction: js.UndefOr[String] = js.native
}
object PlusWebviewWebviewTransition {
  
  @scala.inline
  def apply(): PlusWebviewWebviewTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewTransition]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewTransitionMutableBuilder[Self <: PlusWebviewWebviewTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setTimingfunction(value: String): Self = StObject.set(x, "timingfunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingfunctionUndefined: Self = StObject.set(x, "timingfunction", js.undefined)
  }
}
