package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 直播推流控件对象
  * LivePusher对象表示直播推流控件对象，在窗口中显示捕获视频，实时推送到流媒体（RTMP）服务器。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
@js.native
trait PlusVideoLivePusher extends js.Object {
  /**
    * 监听直播推流控件事件
    * 向直播推流控件添加事件监听器，当指定的事件发生时，将触发listener函数的执行。 
    *     可多次调用此方法向直播推流控件添加多个监听器，当监听的事件发生时，将按照添加的先后顺序执行。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def addEventListener(): Unit = js.native
  def addEventListener(event: PlusVideoLivePusherEvents): Unit = js.native
  def addEventListener(event: PlusVideoLivePusherEvents, listener: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def addEventListener(
    event: PlusVideoLivePusherEvents,
    listener: js.Function1[/* result */ js.Any, Unit],
    capture: Boolean
  ): Unit = js.native
  /**
    * 关闭直播推流控件
    * 关闭操作将释放控件所有资源，不再可用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def close(): Unit = js.native
  /**
    * 暂停推流
    * 如果未处于推流状态，则操作无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def pause(): Unit = js.native
  /**
    * 预览摄像头采集数据
    * 调用摄像头采集图像数据，并在推流控件中预览（此时不会向服务器推流，需调用start方法才开始推流）。
    *     注意：为了确保预览窗口大小正确，应该在创建控件后延时一定的时间（如500ms）进行预览。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def preview(): Unit = js.native
  /**
    * 恢复推流
    * 如果未处于暂停状态，则操作无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def resume(): Unit = js.native
  /**
    * 设置直播推流控件参数（将废弃，使用setStyles）
    * 用于动态更新直播推流控件的配置选项。
    *     注意：有些选项无法动态更新，只能创建时进行设置，详情参考LivePusherStyles。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def setOptions(): Unit = js.native
  def setOptions(options: PlusVideoLivePusherStyles): Unit = js.native
  /**
    * 设置直播推流控件参数
    * 用于动态更新直播推流控件的配置参数。
    *     注意：有些选项无法动态更新，只能创建时进行设置，详情参考LivePusherStyles。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def setStyles(): Unit = js.native
  def setStyles(styles: PlusVideoLivePusherStyles): Unit = js.native
  /**
    * 快照
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def snapshot(): Unit = js.native
  def snapshot(successCB: js.Function0[Unit]): Unit = js.native
  def snapshot(successCB: js.Function0[Unit], errorCB: js.Function0[Unit]): Unit = js.native
  /**
    * 开始推流
    * 如果已经处于推流状态，则操作无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def start(): Unit = js.native
  def start(successCB: js.Function0[Unit]): Unit = js.native
  def start(successCB: js.Function0[Unit], errorCB: js.Function0[Unit]): Unit = js.native
  /**
    * 停止推流
    * 如果未处于推流状态，则操作无效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def stop(): Unit = js.native
  def stop(options: js.Any): Unit = js.native
  /**
    * 切换前后摄像头
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  def switchCamera(): Unit = js.native
}

