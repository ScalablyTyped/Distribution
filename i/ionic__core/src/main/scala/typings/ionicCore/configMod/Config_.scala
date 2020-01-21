package typings.ionicCore.configMod

import typings.ionicCore.utilsConfigMod.IonicConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/global/config", "Config")
@js.native
class Config_ () extends js.Object {
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

