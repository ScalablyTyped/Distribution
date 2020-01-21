package typings.jweixin

import typings.jweixin.mod.ApiMethod
import typings.jweixin.mod.ImageSizeType
import typings.jweixin.mod.ImageSourceType
import typings.jweixin.mod.VideoSourceType
import typings.jweixin.mod.menuBase
import typings.jweixin.mod.menuProtected
import typings.jweixin.mod.menuShare
import typings.jweixin.mod.networkType
import typings.jweixin.mod.scanType
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
  sealed trait menuItemColonaddContact extends menuBase
  
  @js.native
  sealed trait menuItemColoncopyUrl extends menuProtected
  
  @js.native
  sealed trait menuItemColondayMode extends menuBase
  
  @js.native
  sealed trait menuItemColondelete extends menuProtected
  
  @js.native
  sealed trait menuItemColoneditTag extends menuProtected
  
  @js.native
  sealed trait menuItemColonexposeArticle extends menuBase
  
  @js.native
  sealed trait menuItemColonfavorite extends menuShare
  
  @js.native
  sealed trait menuItemColonnightMode extends menuBase
  
  @js.native
  sealed trait menuItemColonopenWithQQBrowser extends menuProtected
  
  @js.native
  sealed trait menuItemColonopenWithSafari extends menuProtected
  
  @js.native
  sealed trait menuItemColonoriginPage extends menuProtected
  
  @js.native
  sealed trait menuItemColonprofile extends menuBase
  
  @js.native
  sealed trait menuItemColonreadMode extends menuProtected
  
  @js.native
  sealed trait menuItemColonrefresh extends menuBase
  
  @js.native
  sealed trait menuItemColonsetFont extends menuBase
  
  @js.native
  sealed trait menuItemColonshareColonQZone extends menuShare
  
  @js.native
  sealed trait menuItemColonshareColonappMessage extends menuShare
  
  @js.native
  sealed trait menuItemColonshareColonbrand extends menuProtected
  
  @js.native
  sealed trait menuItemColonshareColonemail extends menuProtected
  
  @js.native
  sealed trait menuItemColonshareColonfacebook extends menuShare
  
  @js.native
  sealed trait menuItemColonshareColonqq extends menuShare
  
  @js.native
  sealed trait menuItemColonshareColontimeline extends menuShare
  
  @js.native
  sealed trait menuItemColonshareColonweiboApp extends menuShare
  
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
  sealed trait video或link extends js.Object
  
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
  def menuItemColonaddContact: menuItemColonaddContact = "menuItem:addContact".asInstanceOf[menuItemColonaddContact]
  @scala.inline
  def menuItemColoncopyUrl: menuItemColoncopyUrl = "menuItem:copyUrl".asInstanceOf[menuItemColoncopyUrl]
  @scala.inline
  def menuItemColondayMode: menuItemColondayMode = "menuItem:dayMode".asInstanceOf[menuItemColondayMode]
  @scala.inline
  def menuItemColondelete: menuItemColondelete = "menuItem:delete".asInstanceOf[menuItemColondelete]
  @scala.inline
  def menuItemColoneditTag: menuItemColoneditTag = "menuItem:editTag".asInstanceOf[menuItemColoneditTag]
  @scala.inline
  def menuItemColonexposeArticle: menuItemColonexposeArticle = "menuItem:exposeArticle".asInstanceOf[menuItemColonexposeArticle]
  @scala.inline
  def menuItemColonfavorite: menuItemColonfavorite = "menuItem:favorite".asInstanceOf[menuItemColonfavorite]
  @scala.inline
  def menuItemColonnightMode: menuItemColonnightMode = "menuItem:nightMode".asInstanceOf[menuItemColonnightMode]
  @scala.inline
  def menuItemColonopenWithQQBrowser: menuItemColonopenWithQQBrowser = "menuItem:openWithQQBrowser".asInstanceOf[menuItemColonopenWithQQBrowser]
  @scala.inline
  def menuItemColonopenWithSafari: menuItemColonopenWithSafari = "menuItem:openWithSafari".asInstanceOf[menuItemColonopenWithSafari]
  @scala.inline
  def menuItemColonoriginPage: menuItemColonoriginPage = "menuItem:originPage".asInstanceOf[menuItemColonoriginPage]
  @scala.inline
  def menuItemColonprofile: menuItemColonprofile = "menuItem:profile".asInstanceOf[menuItemColonprofile]
  @scala.inline
  def menuItemColonreadMode: menuItemColonreadMode = "menuItem:readMode".asInstanceOf[menuItemColonreadMode]
  @scala.inline
  def menuItemColonrefresh: menuItemColonrefresh = "menuItem:refresh".asInstanceOf[menuItemColonrefresh]
  @scala.inline
  def menuItemColonsetFont: menuItemColonsetFont = "menuItem:setFont".asInstanceOf[menuItemColonsetFont]
  @scala.inline
  def menuItemColonshareColonQZone: menuItemColonshareColonQZone = "menuItem:share:QZone".asInstanceOf[menuItemColonshareColonQZone]
  @scala.inline
  def menuItemColonshareColonappMessage: menuItemColonshareColonappMessage = "menuItem:share:appMessage".asInstanceOf[menuItemColonshareColonappMessage]
  @scala.inline
  def menuItemColonshareColonbrand: menuItemColonshareColonbrand = "menuItem:share:brand".asInstanceOf[menuItemColonshareColonbrand]
  @scala.inline
  def menuItemColonshareColonemail: menuItemColonshareColonemail = "menuItem:share:email".asInstanceOf[menuItemColonshareColonemail]
  @scala.inline
  def menuItemColonshareColonfacebook: menuItemColonshareColonfacebook = "menuItem:share:facebook".asInstanceOf[menuItemColonshareColonfacebook]
  @scala.inline
  def menuItemColonshareColonqq: menuItemColonshareColonqq = "menuItem:share:qq".asInstanceOf[menuItemColonshareColonqq]
  @scala.inline
  def menuItemColonshareColontimeline: menuItemColonshareColontimeline = "menuItem:share:timeline".asInstanceOf[menuItemColonshareColontimeline]
  @scala.inline
  def menuItemColonshareColonweiboApp: menuItemColonshareColonweiboApp = "menuItem:share:weiboApp".asInstanceOf[menuItemColonshareColonweiboApp]
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
  def video或link: video或link = "video\u6216link".asInstanceOf[video或link]
  @scala.inline
  def wgs84: wgs84 = "wgs84".asInstanceOf[wgs84]
  @scala.inline
  def wifi: wifi = "wifi".asInstanceOf[wifi]
}

