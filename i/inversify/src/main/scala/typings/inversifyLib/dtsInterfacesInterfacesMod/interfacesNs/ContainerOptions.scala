package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerOptions extends js.Object {
  var autoBindInjectable: js.UndefOr[scala.Boolean] = js.undefined
  var defaultScope: js.UndefOr[BindingScope] = js.undefined
  var skipBaseClassChecks: js.UndefOr[scala.Boolean] = js.undefined
}

object ContainerOptions {
  @scala.inline
  def apply(
    autoBindInjectable: js.UndefOr[scala.Boolean] = js.undefined,
    defaultScope: BindingScope = null,
    skipBaseClassChecks: js.UndefOr[scala.Boolean] = js.undefined
  ): ContainerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBindInjectable)) __obj.updateDynamic("autoBindInjectable")(autoBindInjectable)
    if (defaultScope != null) __obj.updateDynamic("defaultScope")(defaultScope)
    if (!js.isUndefined(skipBaseClassChecks)) __obj.updateDynamic("skipBaseClassChecks")(skipBaseClassChecks)
    __obj.asInstanceOf[ContainerOptions]
  }
}

