package typings
package jweixinLib.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wxNs {
  type ApiMethod = jweixinLib.jweixinLibStrings.onMenuShareTimeline | jweixinLib.jweixinLibStrings.onMenuShareAppMessage | jweixinLib.jweixinLibStrings.onMenuShareQQ | jweixinLib.jweixinLibStrings.onMenuShareWeibo | jweixinLib.jweixinLibStrings.onMenuShareQZone | jweixinLib.jweixinLibStrings.startRecord | jweixinLib.jweixinLibStrings.stopRecord | jweixinLib.jweixinLibStrings.onVoiceRecordEnd | jweixinLib.jweixinLibStrings.playVoice | jweixinLib.jweixinLibStrings.pauseVoice | jweixinLib.jweixinLibStrings.stopVoice | jweixinLib.jweixinLibStrings.onVoicePlayEnd | jweixinLib.jweixinLibStrings.uploadVoice | jweixinLib.jweixinLibStrings.downloadVoice | jweixinLib.jweixinLibStrings.chooseImage | jweixinLib.jweixinLibStrings.previewImage | jweixinLib.jweixinLibStrings.uploadImage | jweixinLib.jweixinLibStrings.downloadImage | jweixinLib.jweixinLibStrings.translateVoice | jweixinLib.jweixinLibStrings.getNetworkType | jweixinLib.jweixinLibStrings.openLocation | jweixinLib.jweixinLibStrings.getLocation | jweixinLib.jweixinLibStrings.hideOptionMenu | jweixinLib.jweixinLibStrings.showOptionMenu | jweixinLib.jweixinLibStrings.hideMenuItems | jweixinLib.jweixinLibStrings.showMenuItems | jweixinLib.jweixinLibStrings.hideAllNonBaseMenuItem | jweixinLib.jweixinLibStrings.showAllNonBaseMenuItem | jweixinLib.jweixinLibStrings.closeWindow | jweixinLib.jweixinLibStrings.scanQRCode | jweixinLib.jweixinLibStrings.chooseWXPay | jweixinLib.jweixinLibStrings.openProductSpecificView | jweixinLib.jweixinLibStrings.addCard | jweixinLib.jweixinLibStrings.chooseCard | jweixinLib.jweixinLibStrings.openCard
  type ImageSizeType = jweixinLib.jweixinLibStrings.original | jweixinLib.jweixinLibStrings.compressed
  type ImageSourceType = jweixinLib.jweixinLibStrings.album | jweixinLib.jweixinLibStrings.camera
  type VideoSourceType = jweixinLib.jweixinLibStrings.album | jweixinLib.jweixinLibStrings.camera
  // 所有JS接口列表
  type jsApiList = js.Array[ApiMethod]
  // 所有菜单项列表
  // 基本类
  type menuBase = jweixinLib.jweixinLibStrings.`menuItem:exposeArticle` | jweixinLib.jweixinLibStrings.`menuItem:setFont` | jweixinLib.jweixinLibStrings.`menuItem:dayMode` | jweixinLib.jweixinLibStrings.`menuItem:nightMode` | jweixinLib.jweixinLibStrings.`menuItem:refresh` | jweixinLib.jweixinLibStrings.`menuItem:profile` | jweixinLib.jweixinLibStrings.`menuItem:addContact`
  type menuList = js.Array[menuBase | menuProtected | menuShare]
  // 保护类
  type menuProtected = jweixinLib.jweixinLibStrings.`menuItem:editTag` | jweixinLib.jweixinLibStrings.`menuItem:delete` | jweixinLib.jweixinLibStrings.`menuItem:copyUrl` | jweixinLib.jweixinLibStrings.`menuItem:originPage` | jweixinLib.jweixinLibStrings.`menuItem:readMode` | jweixinLib.jweixinLibStrings.`menuItem:openWithQQBrowser` | jweixinLib.jweixinLibStrings.`menuItem:openWithSafari` | jweixinLib.jweixinLibStrings.`menuItem:share:email` | jweixinLib.jweixinLibStrings.`menuItem:share:brand`
  // 传播类
  type menuShare = jweixinLib.jweixinLibStrings.`menuItem:share:appMessage` | jweixinLib.jweixinLibStrings.`menuItem:share:timeline` | jweixinLib.jweixinLibStrings.`menuItem:share:qq` | jweixinLib.jweixinLibStrings.`menuItem:share:weiboApp` | jweixinLib.jweixinLibStrings.`menuItem:favorite` | jweixinLib.jweixinLibStrings.`menuItem:share:facebook` | jweixinLib.jweixinLibStrings.`menuItem:share:QZone`
  /*=============================智能接口================================*/
  
  /*=============================设备信息================================*/
  type networkType = jweixinLib.jweixinLibStrings.`2g` | jweixinLib.jweixinLibStrings.`3g` | jweixinLib.jweixinLibStrings.`4g` | jweixinLib.jweixinLibStrings.wifi
  /*=============================界面操作================================*/
  /*=============================微信扫一扫================================*/
  
  type scanType = jweixinLib.jweixinLibStrings.qrCode | jweixinLib.jweixinLibStrings.barCode
}
