package typings.atIonicCore.distTypesInterfaceMod

import typings.atIonicCore.atIonicCoreStrings.android
import typings.atIonicCore.atIonicCoreStrings.capacitor
import typings.atIonicCore.atIonicCoreStrings.cordova
import typings.atIonicCore.atIonicCoreStrings.desktop
import typings.atIonicCore.atIonicCoreStrings.electron
import typings.atIonicCore.atIonicCoreStrings.hybrid
import typings.atIonicCore.atIonicCoreStrings.ionViewDidEnter
import typings.atIonicCore.atIonicCoreStrings.ionViewDidLeave
import typings.atIonicCore.atIonicCoreStrings.ionViewWillEnter
import typings.atIonicCore.atIonicCoreStrings.ionViewWillLeave
import typings.atIonicCore.atIonicCoreStrings.ionViewWillUnload
import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.ipad
import typings.atIonicCore.atIonicCoreStrings.iphone
import typings.atIonicCore.atIonicCoreStrings.mobile
import typings.atIonicCore.atIonicCoreStrings.mobileweb
import typings.atIonicCore.atIonicCoreStrings.phablet
import typings.atIonicCore.atIonicCoreStrings.pwa
import typings.atIonicCore.atIonicCoreStrings.tablet
import typings.atIonicCore.distTypesUtilsConfigMod.IonicConfig
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/interface", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val LIFECYCLE_DID_ENTER: ionViewDidEnter = js.native
  val LIFECYCLE_DID_LEAVE: ionViewDidLeave = js.native
  val LIFECYCLE_WILL_ENTER: ionViewWillEnter = js.native
  val LIFECYCLE_WILL_LEAVE: ionViewWillLeave = js.native
  val LIFECYCLE_WILL_UNLOAD: ionViewWillUnload = js.native
  val config: typings.atIonicCore.distTypesGlobalConfigMod.Config = js.native
  def configFromSession(win: Window): js.Any = js.native
  def configFromURL(win: Window): js.Any = js.native
  def getPlatforms(win: js.Any): js.Array[String] = js.native
  def isPlatform(
    win: Window,
    platform: ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ): Boolean = js.native
  def saveConfig(win: Window, c: js.Any): Unit = js.native
  def setupConfig(config: IonicConfig): js.Any = js.native
}

