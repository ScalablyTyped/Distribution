package typings.inversifyLoggerMiddleware.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingLoggerSettings extends js.Object {
  var activated: js.UndefOr[Boolean] = js.undefined
  var cache: js.UndefOr[Boolean] = js.undefined
  var constraint: js.UndefOr[Boolean] = js.undefined
  var dynamicValue: js.UndefOr[Boolean] = js.undefined
  var factory: js.UndefOr[Boolean] = js.undefined
  var implementationType: js.UndefOr[Boolean] = js.undefined
  var onActivation: js.UndefOr[Boolean] = js.undefined
  var provider: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[Boolean] = js.undefined
  var serviceIdentifier: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[Boolean] = js.undefined
}

object BindingLoggerSettings {
  @scala.inline
  def apply(
    activated: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    constraint: js.UndefOr[Boolean] = js.undefined,
    dynamicValue: js.UndefOr[Boolean] = js.undefined,
    factory: js.UndefOr[Boolean] = js.undefined,
    implementationType: js.UndefOr[Boolean] = js.undefined,
    onActivation: js.UndefOr[Boolean] = js.undefined,
    provider: js.UndefOr[Boolean] = js.undefined,
    scope: js.UndefOr[Boolean] = js.undefined,
    serviceIdentifier: js.UndefOr[Boolean] = js.undefined,
    `type`: js.UndefOr[Boolean] = js.undefined
  ): BindingLoggerSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activated)) __obj.updateDynamic("activated")(activated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(constraint)) __obj.updateDynamic("constraint")(constraint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicValue)) __obj.updateDynamic("dynamicValue")(dynamicValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(factory)) __obj.updateDynamic("factory")(factory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(implementationType)) __obj.updateDynamic("implementationType")(implementationType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onActivation)) __obj.updateDynamic("onActivation")(onActivation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(provider)) __obj.updateDynamic("provider")(provider.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scope)) __obj.updateDynamic("scope")(scope.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceIdentifier)) __obj.updateDynamic("serviceIdentifier")(serviceIdentifier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingLoggerSettings]
  }
}

