package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Webview窗口滑动事件数据
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
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
  var direction: js.UndefOr[String] = js.native
  
  /**
    * 当前操作窗口标识
    * 当type值为"start"/"move"时，保存当前操作窗口（或View控件）的标识；
    *     当type值为"end"时保存滑动操作后显示窗口（或View控件）的标识（即result值为"true"则认为关联窗口显示，result值为false则认为主窗口显示）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 关联窗口标识
    * 滑动操作关联窗口（或View控件）的标识。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var otherId: js.UndefOr[String] = js.native
  
  /**
    * 滑动进度
    * 滑动进度位置信息，取值范围为0-100，如20表示滑动了总距离的20%：
    *     当type值为"start"时progress值为0；
    *     当type值为"end"时如果result为true则progress值为0，如果result为false则progress值为100；
    *     当type值为"move"时，保存当前滑动的进度信息（注：多次触发move事件）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var progress: js.UndefOr[Double] = js.native
  
  /**
    * 窗口滑动结果
    * 可取值：
    *     "true" - 表示滑动操作成功；
    *     "false" - 表示滑动操作失败（恢复到滑动前的状态）；
    *     "undefined" - 无状态值（当type值为"end"时返回此值）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var result: js.UndefOr[String] = js.native
  
  /**
    * 主窗口标识
    * 滑动操作主窗口（或View控件）的标识。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var targetId: js.UndefOr[String] = js.native
  
  /**
    * 窗口滑动类型
    * 可取值：
    *     "start" - 表示开始滑动操作；
    *     "move" - 表示正在滑动；
    *     "end" - 表示滑动操作结束。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `type`: js.UndefOr[String] = js.native
}
object PlusWebviewWebviewDragEvent {
  
  @scala.inline
  def apply(): PlusWebviewWebviewDragEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewDragEvent]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewDragEventOps[Self <: PlusWebviewWebviewDragEvent] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setOtherId(value: String): Self = this.set("otherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherId: Self = this.set("otherId", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
