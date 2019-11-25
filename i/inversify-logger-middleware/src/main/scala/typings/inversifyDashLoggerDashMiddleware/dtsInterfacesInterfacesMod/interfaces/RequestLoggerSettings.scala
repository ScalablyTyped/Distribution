package typings.inversifyDashLoggerDashMiddleware.dtsInterfacesInterfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLoggerSettings extends js.Object {
  var bindings: js.UndefOr[BindingLoggerSettings] = js.undefined
  var serviceIdentifier: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[TargetLoggerSettings] = js.undefined
}

object RequestLoggerSettings {
  @scala.inline
  def apply(
    bindings: BindingLoggerSettings = null,
    serviceIdentifier: js.UndefOr[Boolean] = js.undefined,
    target: TargetLoggerSettings = null
  ): RequestLoggerSettings = {
    val __obj = js.Dynamic.literal()
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceIdentifier)) __obj.updateDynamic("serviceIdentifier")(serviceIdentifier.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLoggerSettings]
  }
}

