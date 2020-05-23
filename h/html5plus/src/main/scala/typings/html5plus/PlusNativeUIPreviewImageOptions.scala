package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，图片预览的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
trait PlusNativeUIPreviewImageOptions extends js.Object {
  /**
    * 图片预览的背景颜色
    * 颜色值格式为"#RRGGBB"，如"#FF0000"表示为红色背景。
    *     默认值为黑色（"#000000"）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var background: js.UndefOr[String] = js.undefined
  /**
    * 默认显示图片的索引值
    * 索引值从0开始，默认值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var current: js.UndefOr[Double] = js.undefined
  /**
    * 图片指示器样式
    * 可取值：
    *         "default" - 默认指示器（底部圆点样式）；
    *         "number" - 顶部数字指示器（顶部居中显示，文字为%当前图片索引值（从1开始）%/%图片总数%）；
    *         "none" - 不显示指示器。
    *     默认值为"default"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var indicator: js.UndefOr[String] = js.undefined
  /**
    * 是否可循环预览
    * 可取值：
    *         "true" - 支持循环预览；
    *         "false" - 不支持循环预览。
    *     默认值为"false"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var loop: js.UndefOr[Boolean] = js.undefined
}

object PlusNativeUIPreviewImageOptions {
  @scala.inline
  def apply(
    background: String = null,
    current: js.UndefOr[Double] = js.undefined,
    indicator: String = null,
    loop: js.UndefOr[Boolean] = js.undefined
  ): PlusNativeUIPreviewImageOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.get.asInstanceOf[js.Any])
    if (indicator != null) __obj.updateDynamic("indicator")(indicator.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusNativeUIPreviewImageOptions]
  }
}

