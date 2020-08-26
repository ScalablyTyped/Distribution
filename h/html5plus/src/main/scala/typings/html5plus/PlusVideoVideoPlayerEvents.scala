package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 视频播放控件事件类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
@js.native
trait PlusVideoVideoPlayerEvents extends js.Object {
  /**
    * 视频结束事件
    * 当视频播放到末尾时触发。
    *     无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var ended: js.UndefOr[String] = js.native
  /**
    * 视频错误事件
    * 当视频播放出错时触发。
    *     无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var error: js.UndefOr[String] = js.native
  /**
    * 视频播放全屏播放状态变化事件
    * 当视频播放进入或退出全屏时触发。
    *     事件回调函数参数event.detail = {fullScreen:"Boolean类型，当前状态是否为全屏", direction:"String类型，vertical或horizontal"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var fullscreenchange: js.UndefOr[String] = js.native
  /**
    * 视频暂停事件
    * 当视频暂停播放时触发。
    *     无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var pause: js.UndefOr[String] = js.native
  /**
    * 视频播放事件
    * 当视频开始/继续播放时触发。
    *     无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var play: js.UndefOr[String] = js.native
  /**
    * 视频播放进度更新事件
    * 当视频播放进度变化时触发，触发频率250ms一次。
    *     事件回调函数参数event.detail = {currentTime:"Number类型，当前播放时间（单位为秒）",duration:"Number类型，视频总长度（单位为秒）"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var timeupdate: js.UndefOr[String] = js.native
  /**
    * 视频缓冲事件
    * 当视频播放出现缓冲时触发。
    *     无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var waiting: js.UndefOr[String] = js.native
}

object PlusVideoVideoPlayerEvents {
  @scala.inline
  def apply(): PlusVideoVideoPlayerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusVideoVideoPlayerEvents]
  }
  @scala.inline
  implicit class PlusVideoVideoPlayerEventsOps[Self <: PlusVideoVideoPlayerEvents] (val x: Self) extends AnyVal {
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
    def setEnded(value: String): Self = this.set("ended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnded: Self = this.set("ended", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFullscreenchange(value: String): Self = this.set("fullscreenchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreenchange: Self = this.set("fullscreenchange", js.undefined)
    @scala.inline
    def setPause(value: String): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setPlay(value: String): Self = this.set("play", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    @scala.inline
    def setTimeupdate(value: String): Self = this.set("timeupdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeupdate: Self = this.set("timeupdate", js.undefined)
    @scala.inline
    def setWaiting(value: String): Self = this.set("waiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaiting: Self = this.set("waiting", js.undefined)
  }
  
}

