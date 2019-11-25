package typings.inversify.dtsInterfacesInterfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerOptions extends js.Object {
  var autoBindInjectable: js.UndefOr[Boolean] = js.undefined
  var defaultScope: js.UndefOr[BindingScope] = js.undefined
  var skipBaseClassChecks: js.UndefOr[Boolean] = js.undefined
}

object ContainerOptions {
  @scala.inline
  def apply(
    autoBindInjectable: js.UndefOr[Boolean] = js.undefined,
    defaultScope: BindingScope = null,
    skipBaseClassChecks: js.UndefOr[Boolean] = js.undefined
  ): ContainerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBindInjectable)) __obj.updateDynamic("autoBindInjectable")(autoBindInjectable.asInstanceOf[js.Any])
    if (defaultScope != null) __obj.updateDynamic("defaultScope")(defaultScope.asInstanceOf[js.Any])
    if (!js.isUndefined(skipBaseClassChecks)) __obj.updateDynamic("skipBaseClassChecks")(skipBaseClassChecks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerOptions]
  }
}

