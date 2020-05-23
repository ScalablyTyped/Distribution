package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webview窗口滑动事件数据
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewDragEvent extends js.Object {
  /**
    * 手势类型
    * 可取值：
    *     "rtl" - 从右向左滑动手势；
    *     "left" - 向左滑动手势，与rtl一致；
    *     "ltr" - 从左向右滑动手势；
    *     "right" - 向右滑动手势，与ltr一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var direction: js.UndefOr[String] = js.undefined
  /**
    * 当前操作窗口标识
    * 当type值为"start"/"move"时，保存当前操作窗口（或View控件）的标识；
    *     当type值为"end"时保存滑动操作后显示窗口（或View控件）的标识（即result值为"true"则认为关联窗口显示，result值为false则认为主窗口显示）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * 关联窗口标识
    * 滑动操作关联窗口（或View控件）的标识。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var otherId: js.UndefOr[String] = js.undefined
  /**
    * 滑动进度
    * 滑动进度位置信息，取值范围为0-100，如20表示滑动了总距离的20%：
    *     当type值为"start"时progress值为0；
    *     当type值为"end"时如果result为true则progress值为0，如果result为false则progress值为100；
    *     当type值为"move"时，保存当前滑动的进度信息（注：多次触发move事件）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var progress: js.UndefOr[Double] = js.undefined
  /**
    * 窗口滑动结果
    * 可取值：
    *     "true" - 表示滑动操作成功；
    *     "false" - 表示滑动操作失败（恢复到滑动前的状态）；
    *     "undefined" - 无状态值（当type值为"end"时返回此值）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var result: js.UndefOr[String] = js.undefined
  /**
    * 主窗口标识
    * 滑动操作主窗口（或View控件）的标识。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var targetId: js.UndefOr[String] = js.undefined
  /**
    * 窗口滑动类型
    * 可取值：
    *     "start" - 表示开始滑动操作；
    *     "move" - 表示正在滑动；
    *     "end" - 表示滑动操作结束。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object PlusWebviewWebviewDragEvent {
  @scala.inline
  def apply(
    direction: String = null,
    id: String = null,
    otherId: String = null,
    progress: js.UndefOr[Double] = js.undefined,
    result: String = null,
    targetId: String = null,
    `type`: String = null
  ): PlusWebviewWebviewDragEvent = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (otherId != null) __obj.updateDynamic("otherId")(otherId.asInstanceOf[js.Any])
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWebviewWebviewDragEvent]
  }
}

