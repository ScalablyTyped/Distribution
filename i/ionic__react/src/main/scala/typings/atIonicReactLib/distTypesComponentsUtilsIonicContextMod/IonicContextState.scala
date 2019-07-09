package typings
package atIonicReactLib.distTypesComponentsUtilsIonicContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicContextState extends js.Object {
  var platform: js.UndefOr[atIonicReactLib.distTypesComponentsUtilsPlatformMod.Platform] = js.undefined
  def getConfig(): atIonicCoreLib.distTypesUtilsConfigMod.IonicConfig | scala.Unit
  def setConfig(config: atIonicCoreLib.distTypesUtilsConfigMod.IonicConfig): scala.Unit
}

object IonicContextState {
  @scala.inline
  def apply(
    getConfig: () => atIonicCoreLib.distTypesUtilsConfigMod.IonicConfig | scala.Unit,
    setConfig: atIonicCoreLib.distTypesUtilsConfigMod.IonicConfig => scala.Unit,
    platform: atIonicReactLib.distTypesComponentsUtilsPlatformMod.Platform = null
  ): IonicContextState = {
    val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), setConfig = js.Any.fromFunction1(setConfig))
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[IonicContextState]
  }
}

