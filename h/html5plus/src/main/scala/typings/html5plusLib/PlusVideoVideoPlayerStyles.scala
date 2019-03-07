package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 视频播放控件参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
trait PlusVideoVideoPlayerStyles extends js.Object {
  /**
    * 是否自动播放
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否显示默认播放控件
    * 默认值为true。
    * 	包括播放/暂停按钮、播放进度、时间等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否显示弹幕按钮
    * 默认值为false。
    * 	注意：仅在控件构造时设置有效，不能动态更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `danmu-btn`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 弹幕列表
    * 弹幕JSON对象包括属性：text（String类型，弹幕文本类容），color（String类型，弹幕颜色，格式为#RRGGBB），time（Number类型，弹幕出现的时间，单位为秒）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `danmu-list`: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 设置全屏时视频的方向
    * 不指定则根据宽高比自动判断。
    * 	有效值为： 0（正常竖向）, 90（屏幕逆时针90度）, -90（屏幕顺时针90度）。
    * 	默认值为-90。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var direction: js.UndefOr[scala.Double] = js.undefined
  /**
    * 视频长度
    * 单位为秒（s）。
    * 	注意：仅在视频开始播放前设置有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * 是否展示弹幕
    * 默认值为false。
    * 	注意：仅在控件构造时设置有效，不能动态更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `enable-danmu`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否开启控制进度的手势
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `enable-progress-gesture`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * VideoPlayer控件的高度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的高度。
    * 	默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 视频初始播放位置
    * 单位为秒（s）。
    * 	注意：仅在视频开始播放前设置有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `initial-time`: js.UndefOr[scala.Double] = js.undefined
  /**
    * VideoPlayer控件左上角的水平偏移量
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的宽度；
    * 		自动计算，如"auto"，根据width值自动计算，相对于父Webview窗口水平居中。
    * 	默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var left: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 是否循环播放
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否静音播放
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 当视频大小与 video 容器大小不一致时，视频的表现形式
    * 有效值为：contain（包含），fill（填充），cover（覆盖）。
    * 	默认值为contain。
    * 	仅Android平台支持。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var objectFit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * VideoPlayer控件在Webview窗口的布局模式
    * 可取值：
    * 		"static" - 静态布局模式，如果页面存在滚动条则随窗口内容滚动；
    * 		"absolute" - 绝对布局模式，如果页面存在滚动条不随窗口内容滚动；
    * 	默认值为"static"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 视频封面的图片网络资源地址
    * 如果 controls 属性值为 false 则设置 poster 无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var poster: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 是否显示视频中间的播放按钮
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-center-play-btn`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否显示全屏按钮
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-fullscreen-btn`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否显示视频底部控制栏的播放按钮
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-play-btn`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否显示播放进度
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-progress`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 视频资源地址
    * 支持本地地址，也支持网络地址及直播流（RTMP）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /**
    * VideoPlayer控件左上角的垂直偏移量
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的高度；
    * 		自动计算，如"auto",根据height值自动计算，相对于父Webview窗口垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var top: js.UndefOr[java.lang.String] = js.undefined
  /**
    * VideoPlayer控件的宽度
    * 可取值：
    * 		像素值，如"100px"；
    * 		百分比，如"10%"，相对于父Webview窗口的宽度。
    * 	默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object PlusVideoVideoPlayerStyles {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    `danmu-btn`: js.UndefOr[scala.Boolean] = js.undefined,
    `danmu-list`: js.Array[_] = null,
    direction: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    `enable-danmu`: js.UndefOr[scala.Boolean] = js.undefined,
    `enable-progress-gesture`: js.UndefOr[scala.Boolean] = js.undefined,
    height: java.lang.String = null,
    `initial-time`: scala.Int | scala.Double = null,
    left: java.lang.String = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    objectFit: java.lang.String = null,
    position: java.lang.String = null,
    poster: java.lang.String = null,
    `show-center-play-btn`: js.UndefOr[scala.Boolean] = js.undefined,
    `show-fullscreen-btn`: js.UndefOr[scala.Boolean] = js.undefined,
    `show-play-btn`: js.UndefOr[scala.Boolean] = js.undefined,
    `show-progress`: js.UndefOr[scala.Boolean] = js.undefined,
    src: java.lang.String = null,
    top: java.lang.String = null,
    width: java.lang.String = null
  ): PlusVideoVideoPlayerStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (!js.isUndefined(`danmu-btn`)) __obj.updateDynamic("danmu-btn")(`danmu-btn`)
    if (`danmu-list` != null) __obj.updateDynamic("danmu-list")(`danmu-list`)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(`enable-danmu`)) __obj.updateDynamic("enable-danmu")(`enable-danmu`)
    if (!js.isUndefined(`enable-progress-gesture`)) __obj.updateDynamic("enable-progress-gesture")(`enable-progress-gesture`)
    if (height != null) __obj.updateDynamic("height")(height)
    if (`initial-time` != null) __obj.updateDynamic("initial-time")(`initial-time`.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (objectFit != null) __obj.updateDynamic("objectFit")(objectFit)
    if (position != null) __obj.updateDynamic("position")(position)
    if (poster != null) __obj.updateDynamic("poster")(poster)
    if (!js.isUndefined(`show-center-play-btn`)) __obj.updateDynamic("show-center-play-btn")(`show-center-play-btn`)
    if (!js.isUndefined(`show-fullscreen-btn`)) __obj.updateDynamic("show-fullscreen-btn")(`show-fullscreen-btn`)
    if (!js.isUndefined(`show-play-btn`)) __obj.updateDynamic("show-play-btn")(`show-play-btn`)
    if (!js.isUndefined(`show-progress`)) __obj.updateDynamic("show-progress")(`show-progress`)
    if (src != null) __obj.updateDynamic("src")(src)
    if (top != null) __obj.updateDynamic("top")(top)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PlusVideoVideoPlayerStyles]
  }
}

