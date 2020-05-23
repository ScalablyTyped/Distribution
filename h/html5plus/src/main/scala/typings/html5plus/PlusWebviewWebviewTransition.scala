package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 一组用于定义页面或控件转换效果的属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewTransition extends js.Object {
  /**
    * 变换持续的时间
    * 默认值为0，即无动画效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var duration: js.UndefOr[String] = js.undefined
  /**
    * 产生变换效果的属性
    * 默认值为"all"，暂不支持其它值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var property: js.UndefOr[String] = js.undefined
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
  var timingfunction: js.UndefOr[String] = js.undefined
}

object PlusWebviewWebviewTransition {
  @scala.inline
  def apply(duration: String = null, property: String = null, timingfunction: String = null): PlusWebviewWebviewTransition = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (timingfunction != null) __obj.updateDynamic("timingfunction")(timingfunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWebviewWebviewTransition]
  }
}

