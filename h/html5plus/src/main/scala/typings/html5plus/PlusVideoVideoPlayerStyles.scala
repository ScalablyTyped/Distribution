package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 视频播放控件参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
@js.native
trait PlusVideoVideoPlayerStyles extends js.Object {
  /**
    * 是否自动播放
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示默认播放控件
    * 默认值为true。
    *     包括播放/暂停按钮、播放进度、时间等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var controls: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示弹幕按钮
    * 默认值为false。
    *     注意：仅在控件构造时设置有效，不能动态更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `danmu-btn`: js.UndefOr[Boolean] = js.native
  /**
    * 弹幕列表
    * 弹幕JSON对象包括属性：text（String类型，弹幕文本类容），color（String类型，弹幕颜色，格式为#RRGGBB），time（Number类型，弹幕出现的时间，单位为秒）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `danmu-list`: js.UndefOr[js.Array[_]] = js.native
  /**
    * 设置全屏时视频的方向
    * 不指定则根据宽高比自动判断。
    *     有效值为： 0（正常竖向）, 90（屏幕逆时针90度）, -90（屏幕顺时针90度）。
    *     默认值为-90。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var direction: js.UndefOr[Double] = js.native
  /**
    * 视频长度
    * 单位为秒（s）。
    *     注意：仅在视频开始播放前设置有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * 是否展示弹幕
    * 默认值为false。
    *     注意：仅在控件构造时设置有效，不能动态更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `enable-danmu`: js.UndefOr[Boolean] = js.native
  /**
    * 是否开启控制进度的手势
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `enable-progress-gesture`: js.UndefOr[Boolean] = js.native
  /**
    * VideoPlayer控件的高度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的高度。
    *     默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var height: js.UndefOr[String] = js.native
  /**
    * 视频初始播放位置
    * 单位为秒（s）。
    *     注意：仅在视频开始播放前设置有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `initial-time`: js.UndefOr[Double] = js.native
  /**
    * VideoPlayer控件左上角的水平偏移量
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的宽度；
    *         自动计算，如"auto"，根据width值自动计算，相对于父Webview窗口水平居中。
    *     默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var left: js.UndefOr[String] = js.native
  /**
    * 是否循环播放
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * 是否静音播放
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var muted: js.UndefOr[Boolean] = js.native
  /**
    * 当视频大小与 video 容器大小不一致时，视频的表现形式
    * 有效值为：contain（包含），fill（填充），cover（覆盖）。
    *     默认值为contain。
    *     仅Android平台支持。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var objectFit: js.UndefOr[String] = js.native
  /**
    * VideoPlayer控件在Webview窗口的布局模式
    * 可取值：
    *         "static" - 静态布局模式，如果页面存在滚动条则随窗口内容滚动；
    *         "absolute" - 绝对布局模式，如果页面存在滚动条不随窗口内容滚动；
    *     默认值为"static"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var position: js.UndefOr[String] = js.native
  /**
    * 视频封面的图片网络资源地址
    * 如果 controls 属性值为 false 则设置 poster 无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var poster: js.UndefOr[String] = js.native
  /**
    * 是否显示视频中间的播放按钮
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-center-play-btn`: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示全屏按钮
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-fullscreen-btn`: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示视频底部控制栏的播放按钮
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-play-btn`: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示播放进度
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-progress`: js.UndefOr[Boolean] = js.native
  /**
    * 视频资源地址
    * 支持本地地址，也支持网络地址及直播流（RTMP）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var src: js.UndefOr[String] = js.native
  /**
    * VideoPlayer控件左上角的垂直偏移量
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的高度；
    *         自动计算，如"auto",根据height值自动计算，相对于父Webview窗口垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var top: js.UndefOr[String] = js.native
  /**
    * VideoPlayer控件的宽度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的宽度。
    *     默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var width: js.UndefOr[String] = js.native
}

object PlusVideoVideoPlayerStyles {
  @scala.inline
  def apply(): PlusVideoVideoPlayerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusVideoVideoPlayerStyles]
  }
  @scala.inline
  implicit class PlusVideoVideoPlayerStylesOps[Self <: PlusVideoVideoPlayerStyles] (val x: Self) extends AnyVal {
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
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def `setDanmu-btn`(value: Boolean): Self = this.set("danmu-btn", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDanmu-btn`: Self = this.set("danmu-btn", js.undefined)
    @scala.inline
    def `setDanmu-listVarargs`(value: js.Any*): Self = this.set("danmu-list", js.Array(value :_*))
    @scala.inline
    def `setDanmu-list`(value: js.Array[_]): Self = this.set("danmu-list", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDanmu-list`: Self = this.set("danmu-list", js.undefined)
    @scala.inline
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def `setEnable-danmu`(value: Boolean): Self = this.set("enable-danmu", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteEnable-danmu`: Self = this.set("enable-danmu", js.undefined)
    @scala.inline
    def `setEnable-progress-gesture`(value: Boolean): Self = this.set("enable-progress-gesture", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteEnable-progress-gesture`: Self = this.set("enable-progress-gesture", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def `setInitial-time`(value: Double): Self = this.set("initial-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInitial-time`: Self = this.set("initial-time", js.undefined)
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setObjectFit(value: String): Self = this.set("objectFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectFit: Self = this.set("objectFit", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
    @scala.inline
    def `setShow-center-play-btn`(value: Boolean): Self = this.set("show-center-play-btn", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShow-center-play-btn`: Self = this.set("show-center-play-btn", js.undefined)
    @scala.inline
    def `setShow-fullscreen-btn`(value: Boolean): Self = this.set("show-fullscreen-btn", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShow-fullscreen-btn`: Self = this.set("show-fullscreen-btn", js.undefined)
    @scala.inline
    def `setShow-play-btn`(value: Boolean): Self = this.set("show-play-btn", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShow-play-btn`: Self = this.set("show-play-btn", js.undefined)
    @scala.inline
    def `setShow-progress`(value: Boolean): Self = this.set("show-progress", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShow-progress`: Self = this.set("show-progress", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

