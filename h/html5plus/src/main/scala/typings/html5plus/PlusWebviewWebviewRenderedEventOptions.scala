package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webview窗口rendered事件参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewRenderedEventOptions extends js.Object {
  /**
    * 判断窗口渲染完成间隔时间
    * 单位为ms（毫秒），默认值为150ms。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var interval: js.UndefOr[Double] = js.undefined
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
  var `type`: js.UndefOr[String] = js.undefined
}

object PlusWebviewWebviewRenderedEventOptions {
  @scala.inline
  def apply(interval: js.UndefOr[Double] = js.undefined, `type`: String = null): PlusWebviewWebviewRenderedEventOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWebviewWebviewRenderedEventOptions]
  }
}

