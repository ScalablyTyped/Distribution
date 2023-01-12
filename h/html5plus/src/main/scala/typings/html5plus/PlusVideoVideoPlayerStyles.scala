package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 视频播放控件参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
trait PlusVideoVideoPlayerStyles extends StObject {
  
  /**
    * 是否自动播放
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否显示默认播放控件
    * 默认值为true。
    *     包括播放/暂停按钮、播放进度、时间等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var controls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否显示弹幕按钮
    * 默认值为false。
    *     注意：仅在控件构造时设置有效，不能动态更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `danmu-btn`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 弹幕列表
    * 弹幕JSON对象包括属性：text（String类型，弹幕文本类容），color（String类型，弹幕颜色，格式为#RRGGBB），time（Number类型，弹幕出现的时间，单位为秒）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `danmu-list`: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * 设置全屏时视频的方向
    * 不指定则根据宽高比自动判断。
    *     有效值为： 0（正常竖向）, 90（屏幕逆时针90度）, -90（屏幕顺时针90度）。
    *     默认值为-90。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var direction: js.UndefOr[Double] = js.undefined
  
  /**
    * 视频长度
    * 单位为秒（s）。
    *     注意：仅在视频开始播放前设置有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * 是否展示弹幕
    * 默认值为false。
    *     注意：仅在控件构造时设置有效，不能动态更新。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `enable-danmu`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否开启控制进度的手势
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `enable-progress-gesture`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * VideoPlayer控件的高度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的高度。
    *     默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * 视频初始播放位置
    * 单位为秒（s）。
    *     注意：仅在视频开始播放前设置有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `initial-time`: js.UndefOr[Double] = js.undefined
  
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
  var left: js.UndefOr[String] = js.undefined
  
  /**
    * 是否循环播放
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否静音播放
    * 默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var muted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 当视频大小与 video 容器大小不一致时，视频的表现形式
    * 有效值为：contain（包含），fill（填充），cover（覆盖）。
    *     默认值为contain。
    *     仅Android平台支持。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var objectFit: js.UndefOr[String] = js.undefined
  
  /**
    * VideoPlayer控件在Webview窗口的布局模式
    * 可取值：
    *         "static" - 静态布局模式，如果页面存在滚动条则随窗口内容滚动；
    *         "absolute" - 绝对布局模式，如果页面存在滚动条不随窗口内容滚动；
    *     默认值为"static"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * 视频封面的图片网络资源地址
    * 如果 controls 属性值为 false 则设置 poster 无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var poster: js.UndefOr[String] = js.undefined
  
  /**
    * 是否显示视频中间的播放按钮
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-center-play-btn`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否显示全屏按钮
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-fullscreen-btn`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否显示视频底部控制栏的播放按钮
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-play-btn`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否显示播放进度
    * 默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var `show-progress`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 视频资源地址
    * 支持本地地址，也支持网络地址及直播流（RTMP）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var src: js.UndefOr[String] = js.undefined
  
  /**
    * VideoPlayer控件左上角的垂直偏移量
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的高度；
    *         自动计算，如"auto",根据height值自动计算，相对于父Webview窗口垂直居中。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var top: js.UndefOr[String] = js.undefined
  
  /**
    * VideoPlayer控件的宽度
    * 可取值：
    *         像素值，如"100px"；
    *         百分比，如"10%"，相对于父Webview窗口的宽度。
    *     默认值为"100%"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var width: js.UndefOr[String] = js.undefined
}
object PlusVideoVideoPlayerStyles {
  
  inline def apply(): PlusVideoVideoPlayerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusVideoVideoPlayerStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusVideoVideoPlayerStyles] (val x: Self) extends AnyVal {
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def `setDanmu-btn`(value: Boolean): Self = StObject.set(x, "danmu-btn", value.asInstanceOf[js.Any])
    
    inline def `setDanmu-btnUndefined`: Self = StObject.set(x, "danmu-btn", js.undefined)
    
    inline def `setDanmu-list`(value: js.Array[Any]): Self = StObject.set(x, "danmu-list", value.asInstanceOf[js.Any])
    
    inline def `setDanmu-listUndefined`: Self = StObject.set(x, "danmu-list", js.undefined)
    
    inline def `setDanmu-listVarargs`(value: Any*): Self = StObject.set(x, "danmu-list", js.Array(value*))
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def `setEnable-danmu`(value: Boolean): Self = StObject.set(x, "enable-danmu", value.asInstanceOf[js.Any])
    
    inline def `setEnable-danmuUndefined`: Self = StObject.set(x, "enable-danmu", js.undefined)
    
    inline def `setEnable-progress-gesture`(value: Boolean): Self = StObject.set(x, "enable-progress-gesture", value.asInstanceOf[js.Any])
    
    inline def `setEnable-progress-gestureUndefined`: Self = StObject.set(x, "enable-progress-gesture", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def `setInitial-time`(value: Double): Self = StObject.set(x, "initial-time", value.asInstanceOf[js.Any])
    
    inline def `setInitial-timeUndefined`: Self = StObject.set(x, "initial-time", js.undefined)
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setObjectFit(value: String): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
    
    inline def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def `setShow-center-play-btn`(value: Boolean): Self = StObject.set(x, "show-center-play-btn", value.asInstanceOf[js.Any])
    
    inline def `setShow-center-play-btnUndefined`: Self = StObject.set(x, "show-center-play-btn", js.undefined)
    
    inline def `setShow-fullscreen-btn`(value: Boolean): Self = StObject.set(x, "show-fullscreen-btn", value.asInstanceOf[js.Any])
    
    inline def `setShow-fullscreen-btnUndefined`: Self = StObject.set(x, "show-fullscreen-btn", js.undefined)
    
    inline def `setShow-play-btn`(value: Boolean): Self = StObject.set(x, "show-play-btn", value.asInstanceOf[js.Any])
    
    inline def `setShow-play-btnUndefined`: Self = StObject.set(x, "show-play-btn", js.undefined)
    
    inline def `setShow-progress`(value: Boolean): Self = StObject.set(x, "show-progress", value.asInstanceOf[js.Any])
    
    inline def `setShow-progressUndefined`: Self = StObject.set(x, "show-progress", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
