package typings
package atIonicCoreLib.distTypesUtilsPlatformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/platform", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getPlatforms(win: js.Any): js.Array[java.lang.String] = js.native
  def isPlatform(
    win: stdLib.Window,
    platform: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.ipad | atIonicCoreLib.atIonicCoreLibStrings.iphone | atIonicCoreLib.atIonicCoreLibStrings.android | atIonicCoreLib.atIonicCoreLibStrings.phablet | atIonicCoreLib.atIonicCoreLibStrings.tablet | atIonicCoreLib.atIonicCoreLibStrings.cordova | atIonicCoreLib.atIonicCoreLibStrings.capacitor | atIonicCoreLib.atIonicCoreLibStrings.electron | atIonicCoreLib.atIonicCoreLibStrings.pwa | atIonicCoreLib.atIonicCoreLibStrings.mobile | atIonicCoreLib.atIonicCoreLibStrings.mobileweb | atIonicCoreLib.atIonicCoreLibStrings.desktop | atIonicCoreLib.atIonicCoreLibStrings.hybrid
  ): scala.Boolean = js.native
  def setupPlatforms(win: js.Any): js.Array[java.lang.String] = js.native
  def testUserAgent(win: stdLib.Window, expr: stdLib.RegExp): scala.Boolean = js.native
}

