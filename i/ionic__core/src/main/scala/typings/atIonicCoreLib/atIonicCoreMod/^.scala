package typings
package atIonicCoreLib.atIonicCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val LIFECYCLE_DID_ENTER: atIonicCoreLib.atIonicCoreLibStrings.ionViewDidEnter = js.native
  val LIFECYCLE_DID_LEAVE: atIonicCoreLib.atIonicCoreLibStrings.ionViewDidLeave = js.native
  val LIFECYCLE_WILL_ENTER: atIonicCoreLib.atIonicCoreLibStrings.ionViewWillEnter = js.native
  val LIFECYCLE_WILL_LEAVE: atIonicCoreLib.atIonicCoreLibStrings.ionViewWillLeave = js.native
  val LIFECYCLE_WILL_UNLOAD: atIonicCoreLib.atIonicCoreLibStrings.ionViewWillUnload = js.native
  val config: atIonicCoreLib.distTypesGlobalConfigMod.Config = js.native
  def configFromSession(win: stdLib.Window): js.Any = js.native
  def configFromURL(win: stdLib.Window): js.Any = js.native
  def getPlatforms(win: js.Any): js.Array[java.lang.String] = js.native
  def isPlatform(
    win: stdLib.Window,
    platform: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.ipad | atIonicCoreLib.atIonicCoreLibStrings.iphone | atIonicCoreLib.atIonicCoreLibStrings.android | atIonicCoreLib.atIonicCoreLibStrings.phablet | atIonicCoreLib.atIonicCoreLibStrings.tablet | atIonicCoreLib.atIonicCoreLibStrings.cordova | atIonicCoreLib.atIonicCoreLibStrings.capacitor | atIonicCoreLib.atIonicCoreLibStrings.electron | atIonicCoreLib.atIonicCoreLibStrings.pwa | atIonicCoreLib.atIonicCoreLibStrings.mobile | atIonicCoreLib.atIonicCoreLibStrings.mobileweb | atIonicCoreLib.atIonicCoreLibStrings.desktop | atIonicCoreLib.atIonicCoreLibStrings.hybrid
  ): scala.Boolean = js.native
  def saveConfig(win: stdLib.Window, c: js.Any): scala.Unit = js.native
  def setupConfig(config: atIonicCoreLib.distTypesUtilsConfigMod.IonicConfig): js.Any = js.native
}

