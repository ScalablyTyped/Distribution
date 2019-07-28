package typings.atIonicCore.distTypesGlobalConfigMod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/global/config", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val config: Config = js.native
  def configFromSession(win: Window): js.Any = js.native
  def configFromURL(win: Window): js.Any = js.native
  def saveConfig(win: Window, c: js.Any): Unit = js.native
}

