package typings.atIonicReact.distTypesComponentsUtilsIonicContextMod

import typings.atIonicReact.distTypesComponentsUtilsPlatformMod.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicContextState extends js.Object {
  var platform: js.UndefOr[Platform] = js.undefined
  def getConfig(): (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IonicConfig */ js.Any) | Unit
  def setConfig(
    config: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IonicConfig */ js.Any
  ): Unit
}

object IonicContextState {
  @scala.inline
  def apply(
    getConfig: () => (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IonicConfig */ js.Any) | Unit,
    setConfig: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IonicConfig */ js.Any => Unit,
    platform: Platform = null
  ): IonicContextState = {
    val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), setConfig = js.Any.fromFunction1(setConfig))
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[IonicContextState]
  }
}

