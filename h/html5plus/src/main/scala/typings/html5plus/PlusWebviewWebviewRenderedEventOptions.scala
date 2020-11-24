package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Webview窗口rendered事件参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewRenderedEventOptions extends js.Object {
  
  /**
    * 判断窗口渲染完成间隔时间
    * 单位为ms（毫秒），默认值为150ms。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * 判断窗口渲染完成类型
    * 可取值：
    *     "top"-从顶部向下偏移22px横线截屏检测渲染是否完成；
    *     "bottom"-从底部向上偏移25px横线检测渲染是否完成；
    *     "center"-从中间横线检测渲染是否完成；
    *     "auto"为全屏检测（左、中、右三条竖线）。
    *     默认值为"auto"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `type`: js.UndefOr[String] = js.native
}
object PlusWebviewWebviewRenderedEventOptions {
  
  @scala.inline
  def apply(): PlusWebviewWebviewRenderedEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewRenderedEventOptions]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewRenderedEventOptionsOps[Self <: PlusWebviewWebviewRenderedEventOptions] (val x: Self) extends AnyVal {
    
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
