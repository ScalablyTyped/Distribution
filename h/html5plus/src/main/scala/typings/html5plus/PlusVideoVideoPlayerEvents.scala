package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 视频播放控件事件类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
trait PlusVideoVideoPlayerEvents extends StObject {
  
  /**
    * 视频结束事件
    * 当视频播放到末尾时触发。
    *     无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var ended: js.UndefOr[String] = js.undefined
  
  /**
    * 视频错误事件
    * 当视频播放出错时触发。
    *     无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var error: js.UndefOr[String] = js.undefined
  
  /**
    * 视频播放全屏播放状态变化事件
    * 当视频播放进入或退出全屏时触发。
    *     事件回调函数参数event.detail = {fullScreen:"Boolean类型，当前状态是否为全屏", direction:"String类型，vertical或horizontal"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var fullscreenchange: js.UndefOr[String] = js.undefined
  
  /**
    * 视频暂停事件
    * 当视频暂停播放时触发。
    *     无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var pause: js.UndefOr[String] = js.undefined
  
  /**
    * 视频播放事件
    * 当视频开始/继续播放时触发。
    *     无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var play: js.UndefOr[String] = js.undefined
  
  /**
    * 视频播放进度更新事件
    * 当视频播放进度变化时触发，触发频率250ms一次。
    *     事件回调函数参数event.detail = {currentTime:"Number类型，当前播放时间（单位为秒）",duration:"Number类型，视频总长度（单位为秒）"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var timeupdate: js.UndefOr[String] = js.undefined
  
  /**
    * 视频缓冲事件
    * 当视频播放出现缓冲时触发。
    *     无事件回调函数参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var waiting: js.UndefOr[String] = js.undefined
}
object PlusVideoVideoPlayerEvents {
  
  @scala.inline
  def apply(): PlusVideoVideoPlayerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusVideoVideoPlayerEvents]
  }
  
  @scala.inline
  implicit class PlusVideoVideoPlayerEventsMutableBuilder[Self <: PlusVideoVideoPlayerEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnded(value: String): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndedUndefined: Self = StObject.set(x, "ended", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFullscreenchange(value: String): Self = StObject.set(x, "fullscreenchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenchangeUndefined: Self = StObject.set(x, "fullscreenchange", js.undefined)
    
    @scala.inline
    def setPause(value: String): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    @scala.inline
    def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    @scala.inline
    def setTimeupdate(value: String): Self = StObject.set(x, "timeupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeupdateUndefined: Self = StObject.set(x, "timeupdate", js.undefined)
    
    @scala.inline
    def setWaiting(value: String): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitingUndefined: Self = StObject.set(x, "waiting", js.undefined)
  }
}
