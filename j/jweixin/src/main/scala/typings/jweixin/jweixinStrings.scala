package typings.jweixin

import typings.jweixin.jweixinMod.ApiMethod
import typings.jweixin.jweixinMod.ImageSizeType
import typings.jweixin.jweixinMod.ImageSourceType
import typings.jweixin.jweixinMod.VideoSourceType
import typings.jweixin.jweixinMod.menuBase
import typings.jweixin.jweixinMod.menuProtected
import typings.jweixin.jweixinMod.menuShare
import typings.jweixin.jweixinMod.networkType
import typings.jweixin.jweixinMod.scanType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jweixinStrings {
  @js.native
  sealed trait `0` extends js.Object
  
  @js.native
  sealed trait `1` extends js.Object
  
  @js.native
  sealed trait `2` extends js.Object
  
  @js.native
  sealed trait `2g` extends networkType
  
  @js.native
  sealed trait `3g` extends networkType
  
  @js.native
  sealed trait `4g` extends networkType
  
  @js.native
  sealed trait addCard extends ApiMethod
  
  @js.native
  sealed trait album
    extends ImageSourceType
       with VideoSourceType
  
  @js.native
  sealed trait barCode extends scanType
  
  @js.native
  sealed trait camera
    extends ImageSourceType
       with VideoSourceType
  
  @js.native
  sealed trait chooseCard extends ApiMethod
  
  @js.native
  sealed trait chooseImage extends ApiMethod
  
  @js.native
  sealed trait chooseWXPay extends ApiMethod
  
  @js.native
  sealed trait closeWindow extends ApiMethod
  
  @js.native
  sealed trait compressed extends ImageSizeType
  
  @js.native
  sealed trait downloadImage extends ApiMethod
  
  @js.native
  sealed trait downloadVoice extends ApiMethod
  
  @js.native
  sealed trait gcj02 extends js.Object
  
  @js.native
  sealed trait getLocation extends ApiMethod
  
  @js.native
  sealed trait getNetworkType extends ApiMethod
  
  @js.native
  sealed trait hideAllNonBaseMenuItem extends ApiMethod
  
  @js.native
  sealed trait hideMenuItems extends ApiMethod
  
  @js.native
  sealed trait hideOptionMenu extends ApiMethod
  
  @js.native
  sealed trait link extends js.Object
  
  @js.native
  sealed trait `menuItem:addContact` extends menuBase
  
  @js.native
  sealed trait `menuItem:copyUrl` extends menuProtected
  
  @js.native
  sealed trait `menuItem:dayMode` extends menuBase
  
  @js.native
  sealed trait `menuItem:delete` extends menuProtected
  
  @js.native
  sealed trait `menuItem:editTag` extends menuProtected
  
  @js.native
  sealed trait `menuItem:exposeArticle` extends menuBase
  
  @js.native
  sealed trait `menuItem:favorite` extends menuShare
  
  @js.native
  sealed trait `menuItem:nightMode` extends menuBase
  
  @js.native
  sealed trait `menuItem:openWithQQBrowser` extends menuProtected
  
  @js.native
  sealed trait `menuItem:openWithSafari` extends menuProtected
  
  @js.native
  sealed trait `menuItem:originPage` extends menuProtected
  
  @js.native
  sealed trait `menuItem:profile` extends menuBase
  
  @js.native
  sealed trait `menuItem:readMode` extends menuProtected
  
  @js.native
  sealed trait `menuItem:refresh` extends menuBase
  
  @js.native
  sealed trait `menuItem:setFont` extends menuBase
  
  @js.native
  sealed trait `menuItem:share:QZone` extends menuShare
  
  @js.native
  sealed trait `menuItem:share:appMessage` extends menuShare
  
  @js.native
  sealed trait `menuItem:share:brand` extends menuProtected
  
  @js.native
  sealed trait `menuItem:share:email` extends menuProtected
  
  @js.native
  sealed trait `menuItem:share:facebook` extends menuShare
  
  @js.native
  sealed trait `menuItem:share:qq` extends menuShare
  
  @js.native
  sealed trait `menuItem:share:timeline` extends menuShare
  
  @js.native
  sealed trait `menuItem:share:weiboApp` extends menuShare
  
  @js.native
  sealed trait music extends js.Object
  
  @js.native
  sealed trait onMenuShareAppMessage extends ApiMethod
  
  @js.native
  sealed trait onMenuShareQQ extends ApiMethod
  
  @js.native
  sealed trait onMenuShareQZone extends ApiMethod
  
  @js.native
  sealed trait onMenuShareTimeline extends ApiMethod
  
  @js.native
  sealed trait onMenuShareWeibo extends ApiMethod
  
  @js.native
  sealed trait onVoicePlayEnd extends ApiMethod
  
  @js.native
  sealed trait onVoiceRecordEnd extends ApiMethod
  
  @js.native
  sealed trait openCard extends ApiMethod
  
  @js.native
  sealed trait openLocation extends ApiMethod
  
  @js.native
  sealed trait openProductSpecificView extends ApiMethod
  
  @js.native
  sealed trait original extends ImageSizeType
  
  @js.native
  sealed trait pauseVoice extends ApiMethod
  
  @js.native
  sealed trait playVoice extends ApiMethod
  
  @js.native
  sealed trait previewImage extends ApiMethod
  
  @js.native
  sealed trait qrCode extends scanType
  
  @js.native
  sealed trait scanQRCode extends ApiMethod
  
  @js.native
  sealed trait showAllNonBaseMenuItem extends ApiMethod
  
  @js.native
  sealed trait showMenuItems extends ApiMethod
  
  @js.native
  sealed trait showOptionMenu extends ApiMethod
  
  @js.native
  sealed trait startRecord extends ApiMethod
  
  @js.native
  sealed trait stopRecord extends ApiMethod
  
  @js.native
  sealed trait stopVoice extends ApiMethod
  
  @js.native
  sealed trait translateVoice extends ApiMethod
  
  @js.native
  sealed trait uploadImage extends ApiMethod
  
  @js.native
  sealed trait uploadVoice extends ApiMethod
  
  @js.native
  sealed trait videoBACKSLASHu6216link extends js.Object
  
  @js.native
  sealed trait wgs84 extends js.Object
  
  @js.native
  sealed trait wifi extends networkType
  
  @scala.inline
  def `0`: `0` = "0".asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = "1".asInstanceOf[`1`]
  @scala.inline
  def `2`: `2` = "2".asInstanceOf[`2`]
  @scala.inline
  def `2g`: `2g` = "2g".asInstanceOf[`2g`]
  @scala.inline
  def `3g`: `3g` = "3g".asInstanceOf[`3g`]
  @scala.inline
  def `4g`: `4g` = "4g".asInstanceOf[`4g`]
  @scala.inline
  def addCard: addCard = "addCard".asInstanceOf[addCard]
  @scala.inline
  def album: album = "album".asInstanceOf[album]
  @scala.inline
  def barCode: barCode = "barCode".asInstanceOf[barCode]
  @scala.inline
  def camera: camera = "camera".asInstanceOf[camera]
  @scala.inline
  def chooseCard: chooseCard = "chooseCard".asInstanceOf[chooseCard]
  @scala.inline
  def chooseImage: chooseImage = "chooseImage".asInstanceOf[chooseImage]
  @scala.inline
  def chooseWXPay: chooseWXPay = "chooseWXPay".asInstanceOf[chooseWXPay]
  @scala.inline
  def closeWindow: closeWindow = "closeWindow".asInstanceOf[closeWindow]
  @scala.inline
  def compressed: compressed = "compressed".asInstanceOf[compressed]
  @scala.inline
  def downloadImage: downloadImage = "downloadImage".asInstanceOf[downloadImage]
  @scala.inline
  def downloadVoice: downloadVoice = "downloadVoice".asInstanceOf[downloadVoice]
  @scala.inline
  def gcj02: gcj02 = "gcj02".asInstanceOf[gcj02]
  @scala.inline
  def getLocation: getLocation = "getLocation".asInstanceOf[getLocation]
  @scala.inline
  def getNetworkType: getNetworkType = "getNetworkType".asInstanceOf[getNetworkType]
  @scala.inline
  def hideAllNonBaseMenuItem: hideAllNonBaseMenuItem = "hideAllNonBaseMenuItem".asInstanceOf[hideAllNonBaseMenuItem]
  @scala.inline
  def hideMenuItems: hideMenuItems = "hideMenuItems".asInstanceOf[hideMenuItems]
  @scala.inline
  def hideOptionMenu: hideOptionMenu = "hideOptionMenu".asInstanceOf[hideOptionMenu]
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  @scala.inline
  def `menuItem:addContact`: `menuItem:addContact` = "menuItem:addContact".asInstanceOf[`menuItem:addContact`]
  @scala.inline
  def `menuItem:copyUrl`: `menuItem:copyUrl` = "menuItem:copyUrl".asInstanceOf[`menuItem:copyUrl`]
  @scala.inline
  def `menuItem:dayMode`: `menuItem:dayMode` = "menuItem:dayMode".asInstanceOf[`menuItem:dayMode`]
  @scala.inline
  def `menuItem:delete`: `menuItem:delete` = "menuItem:delete".asInstanceOf[`menuItem:delete`]
  @scala.inline
  def `menuItem:editTag`: `menuItem:editTag` = "menuItem:editTag".asInstanceOf[`menuItem:editTag`]
  @scala.inline
  def `menuItem:exposeArticle`: `menuItem:exposeArticle` = "menuItem:exposeArticle".asInstanceOf[`menuItem:exposeArticle`]
  @scala.inline
  def `menuItem:favorite`: `menuItem:favorite` = "menuItem:favorite".asInstanceOf[`menuItem:favorite`]
  @scala.inline
  def `menuItem:nightMode`: `menuItem:nightMode` = "menuItem:nightMode".asInstanceOf[`menuItem:nightMode`]
  @scala.inline
  def `menuItem:openWithQQBrowser`: `menuItem:openWithQQBrowser` = "menuItem:openWithQQBrowser".asInstanceOf[`menuItem:openWithQQBrowser`]
  @scala.inline
  def `menuItem:openWithSafari`: `menuItem:openWithSafari` = "menuItem:openWithSafari".asInstanceOf[`menuItem:openWithSafari`]
  @scala.inline
  def `menuItem:originPage`: `menuItem:originPage` = "menuItem:originPage".asInstanceOf[`menuItem:originPage`]
  @scala.inline
  def `menuItem:profile`: `menuItem:profile` = "menuItem:profile".asInstanceOf[`menuItem:profile`]
  @scala.inline
  def `menuItem:readMode`: `menuItem:readMode` = "menuItem:readMode".asInstanceOf[`menuItem:readMode`]
  @scala.inline
  def `menuItem:refresh`: `menuItem:refresh` = "menuItem:refresh".asInstanceOf[`menuItem:refresh`]
  @scala.inline
  def `menuItem:setFont`: `menuItem:setFont` = "menuItem:setFont".asInstanceOf[`menuItem:setFont`]
  @scala.inline
  def `menuItem:share:QZone`: `menuItem:share:QZone` = "menuItem:share:QZone".asInstanceOf[`menuItem:share:QZone`]
  @scala.inline
  def `menuItem:share:appMessage`: `menuItem:share:appMessage` = "menuItem:share:appMessage".asInstanceOf[`menuItem:share:appMessage`]
  @scala.inline
  def `menuItem:share:brand`: `menuItem:share:brand` = "menuItem:share:brand".asInstanceOf[`menuItem:share:brand`]
  @scala.inline
  def `menuItem:share:email`: `menuItem:share:email` = "menuItem:share:email".asInstanceOf[`menuItem:share:email`]
  @scala.inline
  def `menuItem:share:facebook`: `menuItem:share:facebook` = "menuItem:share:facebook".asInstanceOf[`menuItem:share:facebook`]
  @scala.inline
  def `menuItem:share:qq`: `menuItem:share:qq` = "menuItem:share:qq".asInstanceOf[`menuItem:share:qq`]
  @scala.inline
  def `menuItem:share:timeline`: `menuItem:share:timeline` = "menuItem:share:timeline".asInstanceOf[`menuItem:share:timeline`]
  @scala.inline
  def `menuItem:share:weiboApp`: `menuItem:share:weiboApp` = "menuItem:share:weiboApp".asInstanceOf[`menuItem:share:weiboApp`]
  @scala.inline
  def music: music = "music".asInstanceOf[music]
  @scala.inline
  def onMenuShareAppMessage: onMenuShareAppMessage = "onMenuShareAppMessage".asInstanceOf[onMenuShareAppMessage]
  @scala.inline
  def onMenuShareQQ: onMenuShareQQ = "onMenuShareQQ".asInstanceOf[onMenuShareQQ]
  @scala.inline
  def onMenuShareQZone: onMenuShareQZone = "onMenuShareQZone".asInstanceOf[onMenuShareQZone]
  @scala.inline
  def onMenuShareTimeline: onMenuShareTimeline = "onMenuShareTimeline".asInstanceOf[onMenuShareTimeline]
  @scala.inline
  def onMenuShareWeibo: onMenuShareWeibo = "onMenuShareWeibo".asInstanceOf[onMenuShareWeibo]
  @scala.inline
  def onVoicePlayEnd: onVoicePlayEnd = "onVoicePlayEnd".asInstanceOf[onVoicePlayEnd]
  @scala.inline
  def onVoiceRecordEnd: onVoiceRecordEnd = "onVoiceRecordEnd".asInstanceOf[onVoiceRecordEnd]
  @scala.inline
  def openCard: openCard = "openCard".asInstanceOf[openCard]
  @scala.inline
  def openLocation: openLocation = "openLocation".asInstanceOf[openLocation]
  @scala.inline
  def openProductSpecificView: openProductSpecificView = "openProductSpecificView".asInstanceOf[openProductSpecificView]
  @scala.inline
  def original: original = "original".asInstanceOf[original]
  @scala.inline
  def pauseVoice: pauseVoice = "pauseVoice".asInstanceOf[pauseVoice]
  @scala.inline
  def playVoice: playVoice = "playVoice".asInstanceOf[playVoice]
  @scala.inline
  def previewImage: previewImage = "previewImage".asInstanceOf[previewImage]
  @scala.inline
  def qrCode: qrCode = "qrCode".asInstanceOf[qrCode]
  @scala.inline
  def scanQRCode: scanQRCode = "scanQRCode".asInstanceOf[scanQRCode]
  @scala.inline
  def showAllNonBaseMenuItem: showAllNonBaseMenuItem = "showAllNonBaseMenuItem".asInstanceOf[showAllNonBaseMenuItem]
  @scala.inline
  def showMenuItems: showMenuItems = "showMenuItems".asInstanceOf[showMenuItems]
  @scala.inline
  def showOptionMenu: showOptionMenu = "showOptionMenu".asInstanceOf[showOptionMenu]
  @scala.inline
  def startRecord: startRecord = "startRecord".asInstanceOf[startRecord]
  @scala.inline
  def stopRecord: stopRecord = "stopRecord".asInstanceOf[stopRecord]
  @scala.inline
  def stopVoice: stopVoice = "stopVoice".asInstanceOf[stopVoice]
  @scala.inline
  def translateVoice: translateVoice = "translateVoice".asInstanceOf[translateVoice]
  @scala.inline
  def uploadImage: uploadImage = "uploadImage".asInstanceOf[uploadImage]
  @scala.inline
  def uploadVoice: uploadVoice = "uploadVoice".asInstanceOf[uploadVoice]
  @scala.inline
  def videoBACKSLASHu6216link: videoBACKSLASHu6216link = "video\u6216link".asInstanceOf[videoBACKSLASHu6216link]
  @scala.inline
  def wgs84: wgs84 = "wgs84".asInstanceOf[wgs84]
  @scala.inline
  def wifi: wifi = "wifi".asInstanceOf[wifi]
}

