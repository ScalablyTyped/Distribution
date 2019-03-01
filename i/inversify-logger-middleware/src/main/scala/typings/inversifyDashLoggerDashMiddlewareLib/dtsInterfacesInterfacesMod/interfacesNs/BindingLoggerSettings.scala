package typings
package inversifyDashLoggerDashMiddlewareLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingLoggerSettings extends js.Object {
  var activated: js.UndefOr[scala.Boolean] = js.undefined
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var constraint: js.UndefOr[scala.Boolean] = js.undefined
  var dynamicValue: js.UndefOr[scala.Boolean] = js.undefined
  var factory: js.UndefOr[scala.Boolean] = js.undefined
  var implementationType: js.UndefOr[scala.Boolean] = js.undefined
  var onActivation: js.UndefOr[scala.Boolean] = js.undefined
  var provider: js.UndefOr[scala.Boolean] = js.undefined
  var scope: js.UndefOr[scala.Boolean] = js.undefined
  var serviceIdentifier: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
}

object BindingLoggerSettings {
  @scala.inline
  def apply(
    activated: js.UndefOr[scala.Boolean] = js.undefined,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    constraint: js.UndefOr[scala.Boolean] = js.undefined,
    dynamicValue: js.UndefOr[scala.Boolean] = js.undefined,
    factory: js.UndefOr[scala.Boolean] = js.undefined,
    implementationType: js.UndefOr[scala.Boolean] = js.undefined,
    onActivation: js.UndefOr[scala.Boolean] = js.undefined,
    provider: js.UndefOr[scala.Boolean] = js.undefined,
    scope: js.UndefOr[scala.Boolean] = js.undefined,
    serviceIdentifier: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: js.UndefOr[scala.Boolean] = js.undefined
  ): BindingLoggerSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activated)) __obj.updateDynamic("activated")(activated)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(constraint)) __obj.updateDynamic("constraint")(constraint)
    if (!js.isUndefined(dynamicValue)) __obj.updateDynamic("dynamicValue")(dynamicValue)
    if (!js.isUndefined(factory)) __obj.updateDynamic("factory")(factory)
    if (!js.isUndefined(implementationType)) __obj.updateDynamic("implementationType")(implementationType)
    if (!js.isUndefined(onActivation)) __obj.updateDynamic("onActivation")(onActivation)
    if (!js.isUndefined(provider)) __obj.updateDynamic("provider")(provider)
    if (!js.isUndefined(scope)) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(serviceIdentifier)) __obj.updateDynamic("serviceIdentifier")(serviceIdentifier)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BindingLoggerSettings]
  }
}

