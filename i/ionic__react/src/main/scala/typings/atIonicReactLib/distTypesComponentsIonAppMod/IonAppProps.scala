package typings
package atIonicReactLib.distTypesComponentsIonAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonAppProps extends js.Object {
  var initialConfig: js.UndefOr[atIonicCoreLib.distTypesUtilsConfigMod.IonicConfig] = js.undefined
}

object IonAppProps {
  @scala.inline
  def apply(initialConfig: atIonicCoreLib.distTypesUtilsConfigMod.IonicConfig = null): IonAppProps = {
    val __obj = js.Dynamic.literal()
    if (initialConfig != null) __obj.updateDynamic("initialConfig")(initialConfig)
    __obj.asInstanceOf[IonAppProps]
  }
}

