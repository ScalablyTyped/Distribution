package typings.html5plus

import typings.html5plus.html5plusStrings.shrink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webview窗口内容动画参数
  * 指定动画的类型、持续时间等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewContentAnimationOptions extends js.Object {
  /**
    * 动画持续时间
    * 单位为毫秒，默认值为200ms。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * 动画帧数
    * 必须为大于0的整数，默认值为12。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var frames: js.UndefOr[Double] = js.native
  /**
    * 动画作用区域
    * 支持以下属性：
    *     top - 区域距离控件顶部的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的高度）,默认值为'0px'；
    *     bottom - 区域距离控件底部的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的高度）,默认值为'0px'；
    *     left - 区域距离控件左侧的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的宽度）,默认值为'0px'；
    *     right - 区域距离控件右侧的偏移量，属性值可取像素值（如"100px"），百分比（如"10%"，相对于控件的宽度）,默认值为'0px'。
    *     如“{top:'44px',bottom:'48px'}”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var region: js.UndefOr[js.Any] = js.native
  /**
    * 动画类型
    * 可取值："shrink" - 从上到下分块收缩清除窗口动画。
    * - shrink: 从上到下分块清除动画
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `type`: js.UndefOr[shrink] = js.native
}

object PlusWebviewWebviewContentAnimationOptions {
  @scala.inline
  def apply(): PlusWebviewWebviewContentAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewContentAnimationOptions]
  }
  @scala.inline
  implicit class PlusWebviewWebviewContentAnimationOptionsOps[Self <: PlusWebviewWebviewContentAnimationOptions] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFrames(value: Double): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    @scala.inline
    def setRegion(value: js.Any): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setType(value: shrink): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

