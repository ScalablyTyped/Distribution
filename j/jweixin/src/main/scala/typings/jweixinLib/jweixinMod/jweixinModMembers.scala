package typings
package jweixinLib.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jweixin", JSImport.Namespace)
@js.native
object jweixinModMembers extends js.Object {
  def apply(): scala.Unit = js.native
  /**
  	 * 批量添加卡券接口
  	 */
  def addCard(): scala.Unit = js.native
  /**
  	 * 判断当前客户端版本是否支持指定JS接口
  	 * 备注：checkJsApi接口是客户端6.0.2新引入的一个预留接口，第一期开放的接口均可不使用checkJsApi来检测。
  	 */
  def checkJsApi(params: jweixinLib.jweixinMod.wxNs.IcheckJsApi): scala.Unit = js.native
  /**
  	 * 拉取适用卡券列表并获取用户选择信息
  	 */
  def chooseCard(params: jweixinLib.jweixinMod.wxNs.IchooseCard): scala.Unit = js.native
  /**
  	 * 从本地相册选择图片或使用相机拍照。
  	 */
  def chooseImage(params: jweixinLib.jweixinMod.wxNs.IchooseImage): scala.Unit = js.native
  /**
  	 * 发起一个微信支付请求
  	 */
  def chooseWXPay(params: jweixinLib.jweixinMod.wxNs.IchooseWXPay): scala.Unit = js.native
  /**
  	 * 关闭当前网页窗口接口
  	 */
  def closeWindow(): scala.Unit = js.native
  def config(conf: jweixinLib.Anon_NonceStr): scala.Unit = js.native
  /**
  	 * 核销后再次赠送卡券接口
  	 */
  def consumeAndShareCard(params: jweixinLib.jweixinMod.wxNs.IconsumeAndShareCard): scala.Unit = js.native
  /**
  	 * 下载图片接口
  	 */
  def downloadImage(params: jweixinLib.jweixinMod.wxNs.IdownloadImage): scala.Unit = js.native
  /**
  	 * 下载语音接口
  	 */
  def downloadVoice(params: jweixinLib.jweixinMod.wxNs.IupdownloadVoice): scala.Unit = js.native
  def error(fn: js.Function1[/* err */ jweixinLib.Anon_ErrMsgString, scala.Unit]): scala.Unit = js.native
  /**
  	 * 获取本地图片接口
  	 */
  def getLocalImgData(params: jweixinLib.jweixinMod.wxNs.IgetLocalImgData): scala.Unit = js.native
  /**
  	 * 获取地理位置接口
  	 */
  def getLocation(params: jweixinLib.jweixinMod.wxNs.IgetLocation): scala.Unit = js.native
  /**
  	 * 获取网络状态接口
  	 */
  def getNetworkType(params: jweixinLib.jweixinMod.wxNs.IgetNetworkType): scala.Unit = js.native
  /**
  	 * 隐藏所有非基础按钮接口
  	 * “基本类”按钮详见附录3
  	 */
  def hideAllNonBaseMenuItem(): scala.Unit = js.native
  /**
  	 * 批量隐藏功能按钮接口
  	 */
  def hideMenuItems(): scala.Unit = js.native
  /*=============================摇一摇周边================================*/
  /*=============================界面操作================================*/
  
  /**
  	 * 隐藏右上角菜单接口
  	 */
  def hideOptionMenu(): scala.Unit = js.native
  /**
  	 * 获取“分享给朋友”按钮点击状态及自定义分享内容接口
  	 */
  def onMenuShareAppMessage(params: jweixinLib.jweixinMod.wxNs.IonMenuShareAppMessage): scala.Unit = js.native
  /**
  	 * 获取“分享到QQ”按钮点击状态及自定义分享内容接口
  	 */
  def onMenuShareQQ(params: jweixinLib.jweixinMod.wxNs.IonMenuShareQQ): scala.Unit = js.native
  /**
  	 * 获取“分享到QQ空间”按钮点击状态及自定义分享内容接口
  	 */
  def onMenuShareQZone(params: jweixinLib.jweixinMod.wxNs.IonMenuShareQZone): scala.Unit = js.native
  /*=============================基础接口================================*/
  /**
  	 * 获取“分享到朋友圈”按钮点击状态及自定义分享内容接口
  	 */
  def onMenuShareTimeline(params: jweixinLib.jweixinMod.wxNs.IonMenuShareTimeline): scala.Unit = js.native
  /**
  	 * 获取“分享到腾讯微博”按钮点击状态及自定义分享内容接口
  	 */
  def onMenuShareWeibo(params: jweixinLib.jweixinMod.wxNs.IonMenuShareWeibo): scala.Unit = js.native
  /**
  	 * 监听周边ibeacon设备接口
  	 */
  def onSearchBeacons(params: jweixinLib.jweixinMod.wxNs.IonSearchBeacons): scala.Unit = js.native
  /**
  	 * 监听语音播放完毕接口
  	 */
  def onVoicePlayEnd(params: jweixinLib.jweixinMod.wxNs.IonVoicePlayEnd): scala.Unit = js.native
  /**
  	 * 监听录音自动停止接口
  	 */
  def onVoiceRecordEnd(params: jweixinLib.jweixinMod.wxNs.IonVoiceRecordEnd): scala.Unit = js.native
  /**
  	 * 查看微信卡包中的卡券接口
  	 */
  def openCard(params: jweixinLib.jweixinMod.wxNs.IopenCard): scala.Unit = js.native
  /**
  	 * 使用微信内置地图查看位置接口
  	 */
  def openLocation(params: jweixinLib.jweixinMod.wxNs.IopenLocation): scala.Unit = js.native
  /**
  	 * 跳转微信商品页接口
  	 */
  def openProductSpecificView(params: jweixinLib.jweixinMod.wxNs.IopenProductSpecificView): scala.Unit = js.native
  /**
  	 * 暂停播放接口
  	 */
  def pauseVoice(params: jweixinLib.jweixinMod.wxNs.IplaypausestopVoice): scala.Unit = js.native
  /**
  	 * 播放语音接口
  	 */
  def playVoice(params: jweixinLib.jweixinMod.wxNs.IplaypausestopVoice): scala.Unit = js.native
  /**
  	 * 预览图片接口
  	 */
  def previewImage(params: jweixinLib.jweixinMod.wxNs.IpreviewImage): scala.Unit = js.native
  def ready(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
  	 * 调起微信扫一扫接口
  	 */
  def scanQRCode(params: jweixinLib.jweixinMod.wxNs.IscanQRCode): scala.Unit = js.native
  /**
  	 * 显示所有功能按钮接口
  	 */
  def showAllNonBaseMenuItem(): scala.Unit = js.native
  /**
  	 * 批量显示功能按钮接口
  	 */
  def showMenuItems(params: jweixinLib.jweixinMod.wxNs.IshowMenuItems): scala.Unit = js.native
  /**
  	 * 显示右上角菜单接口
  	 */
  def showOptionMenu(): scala.Unit = js.native
  /*=============================图像接口================================*/
  /*=============================音频接口================================*/
  /**
  	 * 开始录音接口
  	 */
  def startRecord(): scala.Unit = js.native
  /**
  	 * 开启查找周边ibeacon设备接口
  	 * 备注：如需接入摇一摇周边功能，请参考：申请开通摇一摇周边
  	 */
  def startSearchBeacons(params: jweixinLib.jweixinMod.wxNs.IstartSearchBeacons): scala.Unit = js.native
  /**
  	 * 停止录音接口
  	 */
  def stopRecord(params: jweixinLib.jweixinMod.wxNs.IstopRecord): scala.Unit = js.native
  /**
  	 * 关闭查找周边ibeacon设备接口
  	 */
  def stopSearchBeacons(params: jweixinLib.jweixinMod.wxNs.IstopSearchBeacons): scala.Unit = js.native
  /**
  	 * 停止播放接口
  	 */
  def stopVoice(params: jweixinLib.jweixinMod.wxNs.IplaypausestopVoice): scala.Unit = js.native
  /**
  	 * 识别音频并返回识别结果接口
  	 */
  def translateVoice(params: jweixinLib.jweixinMod.wxNs.ItranslateVoice): scala.Unit = js.native
  /**
  	 * 上传图片接口
  	 */
  def uploadImage(params: jweixinLib.jweixinMod.wxNs.IuploadImage): scala.Unit = js.native
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
  def uploadVoice(params: jweixinLib.jweixinMod.wxNs.IupdownloadVoice): scala.Unit = js.native
}

