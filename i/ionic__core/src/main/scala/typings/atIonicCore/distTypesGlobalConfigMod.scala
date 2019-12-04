package typings.atIonicCore

import typings.atIonicCore.distTypesGlobalConfigMod.Config
import typings.atIonicCore.distTypesUtilsConfigMod.IonicConfig
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/global/config", JSImport.Namespace)
@js.native
object distTypesGlobalConfigMod extends js.Object {
  @js.native
  class Config () extends js.Object {
    var m: js.Any = js.native
    def get(key: String): js.Any = js.native
    def get(key: String, fallback: js.Any): js.Any = js.native
    def getBoolean(key: String): Boolean = js.native
    def getBoolean(key: String, fallback: Boolean): Boolean = js.native
    def getNumber(key: String): Double = js.native
    def getNumber(key: String, fallback: Double): Double = js.native
    def reset(configObj: IonicConfig): Unit = js.native
    def set(key: String, value: js.Any): Unit = js.native
  }
  
  val config: Config = js.native
  def configFromSession(win: Window): js.Any = js.native
  def configFromURL(win: Window): js.Any = js.native
  def saveConfig(win: Window, c: js.Any): Unit = js.native
}

