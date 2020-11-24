package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 一组用于定义页面或控件转换效果的属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewTransition extends js.Object {
  
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
  implicit class PlusWebviewWebviewTransitionOps[Self <: PlusWebviewWebviewTransition] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setTimingfunction(value: String): Self = this.set("timingfunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingfunction: Self = this.set("timingfunction", js.undefined)
  }
}
