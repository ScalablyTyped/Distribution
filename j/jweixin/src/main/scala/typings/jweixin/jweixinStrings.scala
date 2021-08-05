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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jweixinStrings {
  
  @js.native
  sealed trait `0` extends StObject
  inline def `0`: `0` = "0".asInstanceOf[`0`]
  
  @js.native
  sealed trait `1` extends StObject
  inline def `1`: `1` = "1".asInstanceOf[`1`]
  
  @js.native
  sealed trait `2` extends StObject
  inline def `2`: `2` = "2".asInstanceOf[`2`]
  
  @js.native
  sealed trait `2g`
    extends StObject
       with networkType
  inline def `2g`: `2g` = "2g".asInstanceOf[`2g`]
  
  @js.native
  sealed trait `3g`
    extends StObject
       with networkType
  inline def `3g`: `3g` = "3g".asInstanceOf[`3g`]
  
  @js.native
  sealed trait `4g`
    extends StObject
       with networkType
  inline def `4g`: `4g` = "4g".asInstanceOf[`4g`]
  
  @js.native
  sealed trait addCard
    extends StObject
       with ApiMethod
  inline def addCard: addCard = "addCard".asInstanceOf[addCard]
  
  @js.native
  sealed trait album
    extends StObject
       with ImageSourceType
       with VideoSourceType
  inline def album: album = "album".asInstanceOf[album]
  
  @js.native
  sealed trait barCode
    extends StObject
       with scanType
  inline def barCode: barCode = "barCode".asInstanceOf[barCode]
  
  @js.native
  sealed trait camera
    extends StObject
       with ImageSourceType
       with VideoSourceType
  inline def camera: camera = "camera".asInstanceOf[camera]
  
  @js.native
  sealed trait chooseCard
    extends StObject
       with ApiMethod
  inline def chooseCard: chooseCard = "chooseCard".asInstanceOf[chooseCard]
  
  @js.native
  sealed trait chooseImage
    extends StObject
       with ApiMethod
  inline def chooseImage: chooseImage = "chooseImage".asInstanceOf[chooseImage]
  
  @js.native
  sealed trait chooseWXPay
    extends StObject
       with ApiMethod
  inline def chooseWXPay: chooseWXPay = "chooseWXPay".asInstanceOf[chooseWXPay]
  
  @js.native
  sealed trait closeWindow
    extends StObject
       with ApiMethod
  inline def closeWindow: closeWindow = "closeWindow".asInstanceOf[closeWindow]
  
  @js.native
  sealed trait compressed
    extends StObject
       with ImageSizeType
  inline def compressed: compressed = "compressed".asInstanceOf[compressed]
  
  @js.native
  sealed trait downloadImage
    extends StObject
       with ApiMethod
  inline def downloadImage: downloadImage = "downloadImage".asInstanceOf[downloadImage]
  
  @js.native
  sealed trait downloadVoice
    extends StObject
       with ApiMethod
  inline def downloadVoice: downloadVoice = "downloadVoice".asInstanceOf[downloadVoice]
  
  @js.native
  sealed trait gcj02 extends StObject
  inline def gcj02: gcj02 = "gcj02".asInstanceOf[gcj02]
  
  @js.native
  sealed trait getLocation
    extends StObject
       with ApiMethod
  inline def getLocation: getLocation = "getLocation".asInstanceOf[getLocation]
  
  @js.native
  sealed trait getNetworkType
    extends StObject
       with ApiMethod
  inline def getNetworkType: getNetworkType = "getNetworkType".asInstanceOf[getNetworkType]
  
  @js.native
  sealed trait hideAllNonBaseMenuItem
    extends StObject
       with ApiMethod
  inline def hideAllNonBaseMenuItem: hideAllNonBaseMenuItem = "hideAllNonBaseMenuItem".asInstanceOf[hideAllNonBaseMenuItem]
  
  @js.native
  sealed trait hideMenuItems
    extends StObject
       with ApiMethod
  inline def hideMenuItems: hideMenuItems = "hideMenuItems".asInstanceOf[hideMenuItems]
  
  @js.native
  sealed trait hideOptionMenu
    extends StObject
       with ApiMethod
  inline def hideOptionMenu: hideOptionMenu = "hideOptionMenu".asInstanceOf[hideOptionMenu]
  
  @js.native
  sealed trait link extends StObject
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait menuItemColonaddContact
    extends StObject
       with menuBase
  inline def menuItemColonaddContact: menuItemColonaddContact = "menuItem:addContact".asInstanceOf[menuItemColonaddContact]
  
  @js.native
  sealed trait menuItemColoncopyUrl
    extends StObject
       with menuProtected
  inline def menuItemColoncopyUrl: menuItemColoncopyUrl = "menuItem:copyUrl".asInstanceOf[menuItemColoncopyUrl]
  
  @js.native
  sealed trait menuItemColondayMode
    extends StObject
       with menuBase
  inline def menuItemColondayMode: menuItemColondayMode = "menuItem:dayMode".asInstanceOf[menuItemColondayMode]
  
  @js.native
  sealed trait menuItemColondelete
    extends StObject
       with menuProtected
  inline def menuItemColondelete: menuItemColondelete = "menuItem:delete".asInstanceOf[menuItemColondelete]
  
  @js.native
  sealed trait menuItemColoneditTag
    extends StObject
       with menuProtected
  inline def menuItemColoneditTag: menuItemColoneditTag = "menuItem:editTag".asInstanceOf[menuItemColoneditTag]
  
  @js.native
  sealed trait menuItemColonexposeArticle
    extends StObject
       with menuBase
  inline def menuItemColonexposeArticle: menuItemColonexposeArticle = "menuItem:exposeArticle".asInstanceOf[menuItemColonexposeArticle]
  
  @js.native
  sealed trait menuItemColonfavorite
    extends StObject
       with menuShare
  inline def menuItemColonfavorite: menuItemColonfavorite = "menuItem:favorite".asInstanceOf[menuItemColonfavorite]
  
  @js.native
  sealed trait menuItemColonnightMode
    extends StObject
       with menuBase
  inline def menuItemColonnightMode: menuItemColonnightMode = "menuItem:nightMode".asInstanceOf[menuItemColonnightMode]
  
  @js.native
  sealed trait menuItemColonopenWithQQBrowser
    extends StObject
       with menuProtected
  inline def menuItemColonopenWithQQBrowser: menuItemColonopenWithQQBrowser = "menuItem:openWithQQBrowser".asInstanceOf[menuItemColonopenWithQQBrowser]
  
  @js.native
  sealed trait menuItemColonopenWithSafari
    extends StObject
       with menuProtected
  inline def menuItemColonopenWithSafari: menuItemColonopenWithSafari = "menuItem:openWithSafari".asInstanceOf[menuItemColonopenWithSafari]
  
  @js.native
  sealed trait menuItemColonoriginPage
    extends StObject
       with menuProtected
  inline def menuItemColonoriginPage: menuItemColonoriginPage = "menuItem:originPage".asInstanceOf[menuItemColonoriginPage]
  
  @js.native
  sealed trait menuItemColonprofile
    extends StObject
       with menuBase
  inline def menuItemColonprofile: menuItemColonprofile = "menuItem:profile".asInstanceOf[menuItemColonprofile]
  
  @js.native
  sealed trait menuItemColonreadMode
    extends StObject
       with menuProtected
  inline def menuItemColonreadMode: menuItemColonreadMode = "menuItem:readMode".asInstanceOf[menuItemColonreadMode]
  
  @js.native
  sealed trait menuItemColonrefresh
    extends StObject
       with menuBase
  inline def menuItemColonrefresh: menuItemColonrefresh = "menuItem:refresh".asInstanceOf[menuItemColonrefresh]
  
  @js.native
  sealed trait menuItemColonsetFont
    extends StObject
       with menuBase
  inline def menuItemColonsetFont: menuItemColonsetFont = "menuItem:setFont".asInstanceOf[menuItemColonsetFont]
  
  @js.native
  sealed trait menuItemColonshareColonQZone
    extends StObject
       with menuShare
  inline def menuItemColonshareColonQZone: menuItemColonshareColonQZone = "menuItem:share:QZone".asInstanceOf[menuItemColonshareColonQZone]
  
  @js.native
  sealed trait menuItemColonshareColonappMessage
    extends StObject
       with menuShare
  inline def menuItemColonshareColonappMessage: menuItemColonshareColonappMessage = "menuItem:share:appMessage".asInstanceOf[menuItemColonshareColonappMessage]
  
  @js.native
  sealed trait menuItemColonshareColonbrand
    extends StObject
       with menuProtected
  inline def menuItemColonshareColonbrand: menuItemColonshareColonbrand = "menuItem:share:brand".asInstanceOf[menuItemColonshareColonbrand]
  
  @js.native
  sealed trait menuItemColonshareColonemail
    extends StObject
       with menuProtected
  inline def menuItemColonshareColonemail: menuItemColonshareColonemail = "menuItem:share:email".asInstanceOf[menuItemColonshareColonemail]
  
  @js.native
  sealed trait menuItemColonshareColonfacebook
    extends StObject
       with menuShare
  inline def menuItemColonshareColonfacebook: menuItemColonshareColonfacebook = "menuItem:share:facebook".asInstanceOf[menuItemColonshareColonfacebook]
  
  @js.native
  sealed trait menuItemColonshareColonqq
    extends StObject
       with menuShare
  inline def menuItemColonshareColonqq: menuItemColonshareColonqq = "menuItem:share:qq".asInstanceOf[menuItemColonshareColonqq]
  
  @js.native
  sealed trait menuItemColonshareColontimeline
    extends StObject
       with menuShare
  inline def menuItemColonshareColontimeline: menuItemColonshareColontimeline = "menuItem:share:timeline".asInstanceOf[menuItemColonshareColontimeline]
  
  @js.native
  sealed trait menuItemColonshareColonweiboApp
    extends StObject
       with menuShare
  inline def menuItemColonshareColonweiboApp: menuItemColonshareColonweiboApp = "menuItem:share:weiboApp".asInstanceOf[menuItemColonshareColonweiboApp]
  
  @js.native
  sealed trait music extends StObject
  inline def music: music = "music".asInstanceOf[music]
  
  @js.native
  sealed trait onMenuShareAppMessage
    extends StObject
       with ApiMethod
  inline def onMenuShareAppMessage: onMenuShareAppMessage = "onMenuShareAppMessage".asInstanceOf[onMenuShareAppMessage]
  
  @js.native
  sealed trait onMenuShareQQ
    extends StObject
       with ApiMethod
  inline def onMenuShareQQ: onMenuShareQQ = "onMenuShareQQ".asInstanceOf[onMenuShareQQ]
  
  @js.native
  sealed trait onMenuShareQZone
    extends StObject
       with ApiMethod
  inline def onMenuShareQZone: onMenuShareQZone = "onMenuShareQZone".asInstanceOf[onMenuShareQZone]
  
  @js.native
  sealed trait onMenuShareTimeline
    extends StObject
       with ApiMethod
  inline def onMenuShareTimeline: onMenuShareTimeline = "onMenuShareTimeline".asInstanceOf[onMenuShareTimeline]
  
  @js.native
  sealed trait onMenuShareWeibo
    extends StObject
       with ApiMethod
  inline def onMenuShareWeibo: onMenuShareWeibo = "onMenuShareWeibo".asInstanceOf[onMenuShareWeibo]
  
  @js.native
  sealed trait onVoicePlayEnd
    extends StObject
       with ApiMethod
  inline def onVoicePlayEnd: onVoicePlayEnd = "onVoicePlayEnd".asInstanceOf[onVoicePlayEnd]
  
  @js.native
  sealed trait onVoiceRecordEnd
    extends StObject
       with ApiMethod
  inline def onVoiceRecordEnd: onVoiceRecordEnd = "onVoiceRecordEnd".asInstanceOf[onVoiceRecordEnd]
  
  @js.native
  sealed trait openCard
    extends StObject
       with ApiMethod
  inline def openCard: openCard = "openCard".asInstanceOf[openCard]
  
  @js.native
  sealed trait openLocation
    extends StObject
       with ApiMethod
  inline def openLocation: openLocation = "openLocation".asInstanceOf[openLocation]
  
  @js.native
  sealed trait openProductSpecificView
    extends StObject
       with ApiMethod
  inline def openProductSpecificView: openProductSpecificView = "openProductSpecificView".asInstanceOf[openProductSpecificView]
  
  @js.native
  sealed trait original
    extends StObject
       with ImageSizeType
  inline def original: original = "original".asInstanceOf[original]
  
  @js.native
  sealed trait pauseVoice
    extends StObject
       with ApiMethod
  inline def pauseVoice: pauseVoice = "pauseVoice".asInstanceOf[pauseVoice]
  
  @js.native
  sealed trait playVoice
    extends StObject
       with ApiMethod
  inline def playVoice: playVoice = "playVoice".asInstanceOf[playVoice]
  
  @js.native
  sealed trait previewImage
    extends StObject
       with ApiMethod
  inline def previewImage: previewImage = "previewImage".asInstanceOf[previewImage]
  
  @js.native
  sealed trait qrCode
    extends StObject
       with scanType
  inline def qrCode: qrCode = "qrCode".asInstanceOf[qrCode]
  
  @js.native
  sealed trait scanQRCode
    extends StObject
       with ApiMethod
  inline def scanQRCode: scanQRCode = "scanQRCode".asInstanceOf[scanQRCode]
  
  @js.native
  sealed trait showAllNonBaseMenuItem
    extends StObject
       with ApiMethod
  inline def showAllNonBaseMenuItem: showAllNonBaseMenuItem = "showAllNonBaseMenuItem".asInstanceOf[showAllNonBaseMenuItem]
  
  @js.native
  sealed trait showMenuItems
    extends StObject
       with ApiMethod
  inline def showMenuItems: showMenuItems = "showMenuItems".asInstanceOf[showMenuItems]
  
  @js.native
  sealed trait showOptionMenu
    extends StObject
       with ApiMethod
  inline def showOptionMenu: showOptionMenu = "showOptionMenu".asInstanceOf[showOptionMenu]
  
  @js.native
  sealed trait startRecord
    extends StObject
       with ApiMethod
  inline def startRecord: startRecord = "startRecord".asInstanceOf[startRecord]
  
  @js.native
  sealed trait stopRecord
    extends StObject
       with ApiMethod
  inline def stopRecord: stopRecord = "stopRecord".asInstanceOf[stopRecord]
  
  @js.native
  sealed trait stopVoice
    extends StObject
       with ApiMethod
  inline def stopVoice: stopVoice = "stopVoice".asInstanceOf[stopVoice]
  
  @js.native
  sealed trait translateVoice
    extends StObject
       with ApiMethod
  inline def translateVoice: translateVoice = "translateVoice".asInstanceOf[translateVoice]
  
  @js.native
  sealed trait uploadImage
    extends StObject
       with ApiMethod
  inline def uploadImage: uploadImage = "uploadImage".asInstanceOf[uploadImage]
  
  @js.native
  sealed trait uploadVoice
    extends StObject
       with ApiMethod
  inline def uploadVoice: uploadVoice = "uploadVoice".asInstanceOf[uploadVoice]
  
  @js.native
  sealed trait video或link extends StObject
  inline def video或link: video或link = "video\u6216link".asInstanceOf[video或link]
  
  @js.native
  sealed trait wgs84 extends StObject
  inline def wgs84: wgs84 = "wgs84".asInstanceOf[wgs84]
  
  @js.native
  sealed trait wifi
    extends StObject
       with networkType
  inline def wifi: wifi = "wifi".asInstanceOf[wifi]
}
