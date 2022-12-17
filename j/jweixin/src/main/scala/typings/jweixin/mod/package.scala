package typings.jweixin.mod

import typings.jweixin.anon.AppId
import typings.jweixin.anon.ErrMsg
import typings.jweixin.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]

/**
  * 批量添加卡券接口
  */
inline def addCard(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCard")().asInstanceOf[Unit]

/**
  * 判断当前客户端版本是否支持指定JS接口
  * 备注：checkJsApi接口是客户端6.0.2新引入的一个预留接口，第一期开放的接口均可不使用checkJsApi来检测。
  */
inline def checkJsApi(params: IcheckJsApi): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkJsApi")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 拉取适用卡券列表并获取用户选择信息
  */
inline def chooseCard(params: IchooseCard): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseCard")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 从本地相册选择图片或使用相机拍照。
  */
inline def chooseImage(params: IchooseImage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseImage")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 发起一个微信支付请求
  */
inline def chooseWXPay(params: IchooseWXPay): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseWXPay")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 关闭当前网页窗口接口
  */
inline def closeWindow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeWindow")().asInstanceOf[Unit]

inline def config(conf: AppId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(conf.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 核销后再次赠送卡券接口
  */
inline def consumeAndShareCard(params: IconsumeAndShareCard): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("consumeAndShareCard")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 下载图片接口
  */
inline def downloadImage(params: IdownloadImage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadImage")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 下载语音接口
  */
inline def downloadVoice(params: IupdownloadVoice): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadVoice")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def error(fn: js.Function1[/* err */ ErrMsg, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 获取本地图片接口
  */
inline def getLocalImgData(params: IgetLocalImgData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalImgData")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 获取地理位置接口
  */
inline def getLocation(params: IgetLocation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 获取网络状态接口
  */
inline def getNetworkType(params: IgetNetworkType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkType")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 隐藏所有非基础按钮接口
  * “基本类”按钮详见附录3
  */
inline def hideAllNonBaseMenuItem(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAllNonBaseMenuItem")().asInstanceOf[Unit]

/**
  * 批量隐藏功能按钮接口
  */
inline def hideMenuItems(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideMenuItems")().asInstanceOf[Unit]

/*=============================摇一摇周边================================*/
/*=============================界面操作================================*/
/**
  * 隐藏右上角菜单接口
  */
inline def hideOptionMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideOptionMenu")().asInstanceOf[Unit]

/**
  * 获取“分享给朋友”按钮点击状态及自定义分享内容接口
  */
inline def onMenuShareAppMessage(params: IonMenuShareAppMessage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareAppMessage")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 获取“分享到QQ”按钮点击状态及自定义分享内容接口
  */
inline def onMenuShareQQ(params: IonMenuShareQQ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareQQ")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 获取“分享到QQ空间”按钮点击状态及自定义分享内容接口
  */
inline def onMenuShareQZone(params: IonMenuShareQZone): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareQZone")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/*=============================基础接口================================*/
/**
  * 获取“分享到朋友圈”按钮点击状态及自定义分享内容接口
  */
inline def onMenuShareTimeline(params: IonMenuShareTimeline): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareTimeline")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 获取“分享到腾讯微博”按钮点击状态及自定义分享内容接口
  */
inline def onMenuShareWeibo(params: IonMenuShareWeibo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareWeibo")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 监听周边ibeacon设备接口
  */
inline def onSearchBeacons(params: IonSearchBeacons): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSearchBeacons")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 监听语音播放完毕接口
  */
inline def onVoicePlayEnd(params: IonVoicePlayEnd): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onVoicePlayEnd")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 监听录音自动停止接口
  */
inline def onVoiceRecordEnd(params: IonVoiceRecordEnd): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onVoiceRecordEnd")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 查看微信卡包中的卡券接口
  */
inline def openCard(params: IopenCard): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openCard")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 使用微信内置地图查看位置接口
  */
inline def openLocation(params: IopenLocation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openLocation")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 跳转微信商品页接口
  */
inline def openProductSpecificView(params: IopenProductSpecificView): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openProductSpecificView")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 暂停播放接口
  */
inline def pauseVoice(params: IplaypausestopVoice): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseVoice")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 播放语音接口
  */
inline def playVoice(params: IplaypausestopVoice): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playVoice")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 预览图片接口
  */
inline def previewImage(params: IpreviewImage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ready(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 调起微信扫一扫接口
  */
inline def scanQRCode(params: IscanQRCode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scanQRCode")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 显示所有功能按钮接口
  */
inline def showAllNonBaseMenuItem(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showAllNonBaseMenuItem")().asInstanceOf[Unit]

/**
  * 批量显示功能按钮接口
  */
inline def showMenuItems(params: IshowMenuItems): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showMenuItems")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 显示右上角菜单接口
  */
inline def showOptionMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showOptionMenu")().asInstanceOf[Unit]

/*=============================图像接口================================*/
/*=============================音频接口================================*/
/**
  * 开始录音接口
  */
inline def startRecord(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startRecord")().asInstanceOf[Unit]

/**
  * 开启查找周边ibeacon设备接口
  * 备注：如需接入摇一摇周边功能，请参考：申请开通摇一摇周边
  */
inline def startSearchBeacons(params: IstartSearchBeacons): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startSearchBeacons")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 停止录音接口
  */
inline def stopRecord(params: IstopRecord): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopRecord")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 关闭查找周边ibeacon设备接口
  */
inline def stopSearchBeacons(params: IstopSearchBeacons): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopSearchBeacons")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 停止播放接口
  */
inline def stopVoice(params: IplaypausestopVoice): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopVoice")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 识别音频并返回识别结果接口
  */
inline def translateVoice(params: ItranslateVoice): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("translateVoice")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 上传图片接口
  */
inline def uploadImage(params: IuploadImage): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadImage")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * 上传语音接口
  * 备注：上传语音有效期3天，可用微信多媒体接口下载语音到自己的服务器
  * ，此处获得的 serverId 即 media_id，参考文档
  * ../12 / 58bfcfabbd501c7cd77c19bd9cfa8354.html
  * 目前多媒体文件下载接口的频率限制为10000次/ 天，
  * 如需要调高频率，请邮件weixin - open@qq.com,
  * 邮件主题为【申请多媒体接口调用量】，请对你的项目进行简单描述，
  * 附上产品体验链接，并对用户量和使用量进行说明。
  */
inline def uploadVoice(params: IupdownloadVoice): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadVoice")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]

// 所有JS接口列表
type jsApiList = js.Array[ApiMethod]

// 一些特殊公众号
type menuList = js.Array[menuBase | menuProtected | menuShare]
