package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video模块管理多媒体视频相关能力，可用创建视频播放控件，直播推流控件等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
@js.native
trait PlusVideo extends js.Object {
  /**
    * 直播推流控件对象
    * LivePusher对象表示直播推流控件对象，在窗口中显示捕获视频，实时推送到流媒体（RTMP）服务器。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var LivePusher: js.UndefOr[PlusVideoLivePusher] = js.native
  /**
    * 直播推流控件事件类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var LivePusherEvents: js.UndefOr[PlusVideoLivePusherEvents] = js.native
  /**
    * 直播推流控件配置选项
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var LivePusherStyles: js.UndefOr[PlusVideoLivePusherStyles] = js.native
  /**
    * 视频播放控件对象
    * VideoPlayer对象表示视频播放控件对象，在窗口中播放视频，可支持本地视频(mp4/flv)，网络视频地址（mp4/flv/m3u8）及流媒体（rtmp/hls/rtsp）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var VideoPlayer: js.UndefOr[PlusVideoVideoPlayer] = js.native
  /**
    * 视频播放控件事件类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var VideoPlayerEvents: js.UndefOr[PlusVideoVideoPlayerEvents] = js.native
  /**
    * 视频播放控件参数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var VideoPlayerStyles: js.UndefOr[PlusVideoVideoPlayerStyles] = js.native
  /**
    * 创建LivePusher对象
    * 调用此方法创建后并不会显示，需要调用Webview窗口的append方法将其添加到Webview窗口后才能显示。
    * 	注意：此时需要通过styles参数的top/left/width/height属性设置控件的位置及大小。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def createLivePusher(): PlusVideoLivePusher = js.native
  def createLivePusher(id: String): PlusVideoLivePusher = js.native
  def createLivePusher(id: String, styles: PlusVideoLivePusherStyles): PlusVideoLivePusher = js.native
  /**
    * 创建VideoPlayer对象
    * 调用此方法创建后并不会显示，需要调用Webview窗口的append方法将其添加到Webview窗口后才能显示。
    * 	注意：此时需要通过styles参数的top/left/width/height属性设置控件的位置及大小。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def createVideoPlayer(): PlusVideoVideoPlayer = js.native
  def createVideoPlayer(id: String): PlusVideoVideoPlayer = js.native
  def createVideoPlayer(id: String, styles: PlusVideoVideoPlayerStyles): PlusVideoVideoPlayer = js.native
  /**
    * 查找已经创建的LivePusher对象
    * 查找指定id的LivePusher对象，如果不存在则返回null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def getLivePusherById(): PlusVideoLivePusher = js.native
  def getLivePusherById(id: String): PlusVideoLivePusher = js.native
  /**
    * 查找已经创建的VideoPlayer对象
    * 查找指定id的VideoPlayer对象，如果不存在则返回null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def getVideoPlayerById(): PlusVideoVideoPlayer = js.native
  def getVideoPlayerById(id: String): PlusVideoVideoPlayer = js.native
}

