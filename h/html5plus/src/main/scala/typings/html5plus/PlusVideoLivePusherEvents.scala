package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 直播推流控件事件类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
  */
@js.native
trait PlusVideoLivePusherEvents extends StObject {
  
  /**
    * 渲染错误事件
    * 当推流发生错误是触发。
    *     事件回调函数参数event={type:"事件类型，此时为error",target:"触发此事件的直播推流控件对象",detail:{code:"错误编码，参考后面错误码说明",message:"描述信息"}}。
    *     其中code错误码：
    *     1001 - 用户禁止使用摄像头；
    *     1002 - 用户禁止使用录音。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var error: js.UndefOr[String] = js.native
  
  /**
    * 网络状态通知事件
    * 当推流的网络状态发生变化时触发。
    *     事件回调函数参数event={type:"事件类型，此时为netstatus",target:"触发此事件的直播推流控件对象",detail:{videoBitrate:"视频码率",audioBitrate:"音频码率",videoFPS:"视频帧率",netSpeed:"推流网速",videoWidth:"视频宽度",videoHeight:"视频高度"}}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var netstatus: js.UndefOr[String] = js.native
  
  /**
    * 状态变化事件
    * 当推流连接服务器状态变化时触发。
    *     事件回调函数参数event={type:"事件类型，此时为statechange",target:"触发此事件的直播推流控件对象",detail:{code:"状态码，参考后面状态码说明",message:"描述信息"}}。
    *     其中code状态码：
    *     1001 - 已经连接推流服务器；
    *     1002 - 已经与服务器握手完毕,开始推流；
    *     1003 - 打开摄像头成功；
    *     1004 - 录屏启动成功；
    *     1005 - 推流动态调整分辨率；
    *     1006 - 推流动态调整码率；
    *     1007 - 首帧画面采集完成；
    *     1008 - 编码器启动；
    *     -1301 - 打开摄像头失败；
    *     -1302 - 打开麦克风失败；
    *     -1303 - 视频编码失败；
    *     -1304 - 音频编码失败；
    *     -1305 - 不支持的视频分辨率；
    *     -1306 - 不支持的音频采样率；
    *     -1307 - 网络断连，且经多次重连抢救无效，更多重试请自行重启推流；
    *     -1308 - 开始录屏失败，可能是被用户拒绝；
    *     -1309 - 录屏失败，不支持的Android系统版本，需要5.0以上的系统；
    *     -1310 - 录屏被其他应用打断了；
    *     -1311 - Android Mic打开成功，但是录不到音频数据；
    *     -1312 - 录屏动态切横竖屏失败；
    *     1101 - 网络状况不佳：上行带宽太小，上传数据受阻；
    *     1102 - 网络断连, 已启动自动重连；
    *     1103 - 硬编码启动失败,采用软编码；
    *     1104 - 视频编码失败；
    *     1105 - 新美颜软编码启动失败，采用老的软编码；
    *     1106 - 新美颜软编码启动失败，采用老的软编码；
    *     3001 - RTMP -DNS解析失败；
    *     3002 - RTMP服务器连接失败；
    *     3003 - RTMP服务器握手失败；
    *     3004 - RTMP服务器主动断开，请检查推流地址的合法性或防盗链有效期；
    *     3005 - RTMP 读/写失败。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/video.html](http://www.html5plus.org/doc/zh_cn/video.html)
    */
  var statechange: js.UndefOr[String] = js.native
}
object PlusVideoLivePusherEvents {
  
  @scala.inline
  def apply(): PlusVideoLivePusherEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusVideoLivePusherEvents]
  }
  
  @scala.inline
  implicit class PlusVideoLivePusherEventsMutableBuilder[Self <: PlusVideoLivePusherEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setNetstatus(value: String): Self = StObject.set(x, "netstatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetstatusUndefined: Self = StObject.set(x, "netstatus", js.undefined)
    
    @scala.inline
    def setStatechange(value: String): Self = StObject.set(x, "statechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatechangeUndefined: Self = StObject.set(x, "statechange", js.undefined)
  }
}
