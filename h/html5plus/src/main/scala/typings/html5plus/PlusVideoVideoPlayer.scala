package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 视频播放控件对象
  * VideoPlayer对象表示视频播放控件对象，在窗口中播放视频，可支持本地视频(mp4/flv)，网络视频地址（mp4/flv/m3u8）及流媒体（rtmp/hls/rtsp）。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
@js.native
trait PlusVideoVideoPlayer extends js.Object {
  /**
    * 监听视频播放控件事件
    * 向视频播放控件添加事件监听器，当指定的事件发生时，将触发listener函数的执行。 
    *     可多次调用此方法向视频播放控件添加多个监听器，当监听的事件发生时，将按照添加的先后顺序执行。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def addEventListener(): Unit = js.native
  def addEventListener(event: js.UndefOr[scala.Nothing], listener: js.UndefOr[scala.Nothing], capture: Boolean): Unit = js.native
  def addEventListener(event: js.UndefOr[scala.Nothing], listener: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def addEventListener(
    event: js.UndefOr[scala.Nothing],
    listener: js.Function1[/* result */ js.Any, Unit],
    capture: Boolean
  ): Unit = js.native
  def addEventListener(event: PlusVideoVideoPlayerEvents): Unit = js.native
  def addEventListener(event: PlusVideoVideoPlayerEvents, listener: js.UndefOr[scala.Nothing], capture: Boolean): Unit = js.native
  def addEventListener(event: PlusVideoVideoPlayerEvents, listener: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def addEventListener(
    event: PlusVideoVideoPlayerEvents,
    listener: js.Function1[/* result */ js.Any, Unit],
    capture: Boolean
  ): Unit = js.native
  /**
    * 关闭视频播放控件
    * 关闭操作将释放控件所有资源，不再可用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def close(): Unit = js.native
  /**
    * 退出全屏
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def exitFullScreen(): Unit = js.native
  /**
    * 隐藏视频播放控件
    * 隐藏只是控件不可见，控件依然存在并且不改变播放状态。
    *     如果控件已经隐藏，则操作无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def hide(): Unit = js.native
  /**
    * 暂停视频
    * 如果视频未处于播放状态，则操作无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def pause(): Unit = js.native
  /**
    * 播放视频
    * 如果视频已经处于播放状态，则操作无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def play(): Unit = js.native
  /**
    * 设置倍速播放
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def playbackRate(): Unit = js.native
  def playbackRate(rate: Double): Unit = js.native
  /**
    * 切换到全屏
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def requestFullScreen(): Unit = js.native
  def requestFullScreen(direction: Double): Unit = js.native
  /**
    * 跳转到指定位置
    * 如果视频未处于播放状态，则操作无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def seek(): Unit = js.native
  def seek(position: Double): Unit = js.native
  /**
    * 发送弹幕
    * 如果视频未处于播放状态，则操作无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def sendDanmu(): Unit = js.native
  def sendDanmu(danmu: js.Any): Unit = js.native
  /**
    * 设置视频播放控件参数（将废弃，使用setStyles）
    * 用于动态更新视频播放控件的配置选项。
    *     注意：有些选项无法动态更新，只能创建时进行设置，详情参考VideoPlayerStyles。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def setOptions(): Unit = js.native
  def setOptions(options: PlusVideoVideoPlayerStyles): Unit = js.native
  /**
    * 设置视频播放控件参数
    * 用于动态更新视频播放控件的配置参数。
    *     注意：有些选项无法动态更新，只能创建时进行设置，详情参考VideoPlayerStyles。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def setStyles(): Unit = js.native
  def setStyles(styles: PlusVideoVideoPlayerStyles): Unit = js.native
  /**
    * 显示视频播放控件
    * 将隐藏的控件显示出来（回复到隐藏前的状态）。
    *     如果控件已经显示，则操作无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def show(): Unit = js.native
  /**
    * 停止播放视频
    * 如果视频未处于播放或暂停状态，则操作无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def stop(): Unit = js.native
}

