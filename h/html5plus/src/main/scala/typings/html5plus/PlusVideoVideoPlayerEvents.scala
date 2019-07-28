package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 视频播放控件事件类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
trait PlusVideoVideoPlayerEvents extends js.Object {
  /**
    * 视频结束事件
    * 当视频播放到末尾时触发。
    * 	无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var ended: js.UndefOr[String] = js.undefined
  /**
    * 视频错误事件
    * 当视频播放出错时触发。
    * 	无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var error: js.UndefOr[String] = js.undefined
  /**
    * 视频播放全屏播放状态变化事件
    * 当视频播放进入或退出全屏时触发。
    * 	事件回调函数参数event.detail = {fullScreen:"Boolean类型，当前状态是否为全屏", direction:"String类型，vertical或horizontal"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var fullscreenchange: js.UndefOr[String] = js.undefined
  /**
    * 视频暂停事件
    * 当视频暂停播放时触发。
    * 	无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var pause: js.UndefOr[String] = js.undefined
  /**
    * 视频播放事件
    * 当视频开始/继续播放时触发。
    * 	无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var play: js.UndefOr[String] = js.undefined
  /**
    * 视频播放进度更新事件
    * 当视频播放进度变化时触发，触发频率250ms一次。
    * 	事件回调函数参数event.detail = {currentTime:"Number类型，当前播放时间（单位为秒）",duration:"Number类型，视频总长度（单位为秒）"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var timeupdate: js.UndefOr[String] = js.undefined
  /**
    * 视频缓冲事件
    * 当视频播放出现缓冲时触发。
    * 	无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var waiting: js.UndefOr[String] = js.undefined
}

object PlusVideoVideoPlayerEvents {
  @scala.inline
  def apply(
    ended: String = null,
    error: String = null,
    fullscreenchange: String = null,
    pause: String = null,
    play: String = null,
    timeupdate: String = null,
    waiting: String = null
  ): PlusVideoVideoPlayerEvents = {
    val __obj = js.Dynamic.literal()
    if (ended != null) __obj.updateDynamic("ended")(ended)
    if (error != null) __obj.updateDynamic("error")(error)
    if (fullscreenchange != null) __obj.updateDynamic("fullscreenchange")(fullscreenchange)
    if (pause != null) __obj.updateDynamic("pause")(pause)
    if (play != null) __obj.updateDynamic("play")(play)
    if (timeupdate != null) __obj.updateDynamic("timeupdate")(timeupdate)
    if (waiting != null) __obj.updateDynamic("waiting")(waiting)
    __obj.asInstanceOf[PlusVideoVideoPlayerEvents]
  }
}

