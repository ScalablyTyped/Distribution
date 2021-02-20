package typings.jweixin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[scala.Unit]
  
  /**
    * 批量添加卡券接口
    */
  @scala.inline
  def addCard(): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addCard")().asInstanceOf[scala.Unit]
  
  /**
    * 判断当前客户端版本是否支持指定JS接口
    * 备注：checkJsApi接口是客户端6.0.2新引入的一个预留接口，第一期开放的接口均可不使用checkJsApi来检测。
    */
  @scala.inline
  def checkJsApi(params: typings.jweixin.mod.IcheckJsApi): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("checkJsApi")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 拉取适用卡券列表并获取用户选择信息
    */
  @scala.inline
  def chooseCard(params: typings.jweixin.mod.IchooseCard): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chooseCard")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 从本地相册选择图片或使用相机拍照。
    */
  @scala.inline
  def chooseImage(params: typings.jweixin.mod.IchooseImage): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chooseImage")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 发起一个微信支付请求
    */
  @scala.inline
  def chooseWXPay(params: typings.jweixin.mod.IchooseWXPay): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("chooseWXPay")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 关闭当前网页窗口接口
    */
  @scala.inline
  def closeWindow(): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("closeWindow")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def config(conf: typings.jweixin.anon.AppId): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("config")(conf.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 核销后再次赠送卡券接口
    */
  @scala.inline
  def consumeAndShareCard(params: typings.jweixin.mod.IconsumeAndShareCard): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("consumeAndShareCard")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 下载图片接口
    */
  @scala.inline
  def downloadImage(params: typings.jweixin.mod.IdownloadImage): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("downloadImage")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 下载语音接口
    */
  @scala.inline
  def downloadVoice(params: typings.jweixin.mod.IupdownloadVoice): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("downloadVoice")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def error(fn: js.Function1[/* err */ typings.jweixin.anon.ErrMsg, scala.Unit]): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")(fn.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 获取本地图片接口
    */
  @scala.inline
  def getLocalImgData(params: typings.jweixin.mod.IgetLocalImgData): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalImgData")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 获取地理位置接口
    */
  @scala.inline
  def getLocation(params: typings.jweixin.mod.IgetLocation): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 获取网络状态接口
    */
  @scala.inline
  def getNetworkType(params: typings.jweixin.mod.IgetNetworkType): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkType")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 隐藏所有非基础按钮接口
    * “基本类”按钮详见附录3
    */
  @scala.inline
  def hideAllNonBaseMenuItem(): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hideAllNonBaseMenuItem")().asInstanceOf[scala.Unit]
  
  /**
    * 批量隐藏功能按钮接口
    */
  @scala.inline
  def hideMenuItems(): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hideMenuItems")().asInstanceOf[scala.Unit]
  
  /*=============================摇一摇周边================================*/
  /*=============================界面操作================================*/
  /**
    * 隐藏右上角菜单接口
    */
  @scala.inline
  def hideOptionMenu(): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hideOptionMenu")().asInstanceOf[scala.Unit]
  
  // 所有JS接口列表
  type jsApiList = js.Array[typings.jweixin.mod.ApiMethod]
  
  // 一些特殊公众号
  type menuList = js.Array[
    typings.jweixin.mod.menuBase | typings.jweixin.mod.menuProtected | typings.jweixin.mod.menuShare
  ]
  
  /**
    * 获取“分享给朋友”按钮点击状态及自定义分享内容接口
    */
  @scala.inline
  def onMenuShareAppMessage(params: typings.jweixin.mod.IonMenuShareAppMessage): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareAppMessage")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 获取“分享到QQ”按钮点击状态及自定义分享内容接口
    */
  @scala.inline
  def onMenuShareQQ(params: typings.jweixin.mod.IonMenuShareQQ): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareQQ")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 获取“分享到QQ空间”按钮点击状态及自定义分享内容接口
    */
  @scala.inline
  def onMenuShareQZone(params: typings.jweixin.mod.IonMenuShareQZone): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareQZone")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /*=============================基础接口================================*/
  /**
    * 获取“分享到朋友圈”按钮点击状态及自定义分享内容接口
    */
  @scala.inline
  def onMenuShareTimeline(params: typings.jweixin.mod.IonMenuShareTimeline): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareTimeline")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 获取“分享到腾讯微博”按钮点击状态及自定义分享内容接口
    */
  @scala.inline
  def onMenuShareWeibo(params: typings.jweixin.mod.IonMenuShareWeibo): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onMenuShareWeibo")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 监听周边ibeacon设备接口
    */
  @scala.inline
  def onSearchBeacons(params: typings.jweixin.mod.IonSearchBeacons): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onSearchBeacons")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 监听语音播放完毕接口
    */
  @scala.inline
  def onVoicePlayEnd(params: typings.jweixin.mod.IonVoicePlayEnd): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onVoicePlayEnd")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 监听录音自动停止接口
    */
  @scala.inline
  def onVoiceRecordEnd(params: typings.jweixin.mod.IonVoiceRecordEnd): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("onVoiceRecordEnd")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 查看微信卡包中的卡券接口
    */
  @scala.inline
  def openCard(params: typings.jweixin.mod.IopenCard): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openCard")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 使用微信内置地图查看位置接口
    */
  @scala.inline
  def openLocation(params: typings.jweixin.mod.IopenLocation): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openLocation")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 跳转微信商品页接口
    */
  @scala.inline
  def openProductSpecificView(params: typings.jweixin.mod.IopenProductSpecificView): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openProductSpecificView")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 暂停播放接口
    */
  @scala.inline
  def pauseVoice(params: typings.jweixin.mod.IplaypausestopVoice): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pauseVoice")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 播放语音接口
    */
  @scala.inline
  def playVoice(params: typings.jweixin.mod.IplaypausestopVoice): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("playVoice")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 预览图片接口
    */
  @scala.inline
  def previewImage(params: typings.jweixin.mod.IpreviewImage): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ready(fn: js.Function0[scala.Unit]): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ready")(fn.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 调起微信扫一扫接口
    */
  @scala.inline
  def scanQRCode(params: typings.jweixin.mod.IscanQRCode): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("scanQRCode")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 显示所有功能按钮接口
    */
  @scala.inline
  def showAllNonBaseMenuItem(): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("showAllNonBaseMenuItem")().asInstanceOf[scala.Unit]
  
  /**
    * 批量显示功能按钮接口
    */
  @scala.inline
  def showMenuItems(params: typings.jweixin.mod.IshowMenuItems): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("showMenuItems")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 显示右上角菜单接口
    */
  @scala.inline
  def showOptionMenu(): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("showOptionMenu")().asInstanceOf[scala.Unit]
  
  /*=============================图像接口================================*/
  /*=============================音频接口================================*/
  /**
    * 开始录音接口
    */
  @scala.inline
  def startRecord(): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("startRecord")().asInstanceOf[scala.Unit]
  
  /**
    * 开启查找周边ibeacon设备接口
    * 备注：如需接入摇一摇周边功能，请参考：申请开通摇一摇周边
    */
  @scala.inline
  def startSearchBeacons(params: typings.jweixin.mod.IstartSearchBeacons): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("startSearchBeacons")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 停止录音接口
    */
  @scala.inline
  def stopRecord(params: typings.jweixin.mod.IstopRecord): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stopRecord")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 关闭查找周边ibeacon设备接口
    */
  @scala.inline
  def stopSearchBeacons(params: typings.jweixin.mod.IstopSearchBeacons): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stopSearchBeacons")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 停止播放接口
    */
  @scala.inline
  def stopVoice(params: typings.jweixin.mod.IplaypausestopVoice): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stopVoice")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 识别音频并返回识别结果接口
    */
  @scala.inline
  def translateVoice(params: typings.jweixin.mod.ItranslateVoice): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("translateVoice")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * 上传图片接口
    */
  @scala.inline
  def uploadImage(params: typings.jweixin.mod.IuploadImage): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("uploadImage")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def uploadVoice(params: typings.jweixin.mod.IupdownloadVoice): scala.Unit = typings.jweixin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("uploadVoice")(params.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
