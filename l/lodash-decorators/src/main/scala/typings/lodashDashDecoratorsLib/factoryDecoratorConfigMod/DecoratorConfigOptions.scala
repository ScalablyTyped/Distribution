package typings
package lodashDashDecoratorsLib.factoryDecoratorConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratorConfigOptions extends js.Object {
  var bound: js.UndefOr[scala.Boolean] = js.undefined
  var getter: js.UndefOr[scala.Boolean] = js.undefined
  var method: js.UndefOr[scala.Boolean] = js.undefined
  var optionalParams: js.UndefOr[scala.Boolean] = js.undefined
  var property: js.UndefOr[scala.Boolean] = js.undefined
  var setter: js.UndefOr[scala.Boolean] = js.undefined
}

object DecoratorConfigOptions {
  @scala.inline
  def apply(
    bound: js.UndefOr[scala.Boolean] = js.undefined,
    getter: js.UndefOr[scala.Boolean] = js.undefined,
    method: js.UndefOr[scala.Boolean] = js.undefined,
    optionalParams: js.UndefOr[scala.Boolean] = js.undefined,
    property: js.UndefOr[scala.Boolean] = js.undefined,
    setter: js.UndefOr[scala.Boolean] = js.undefined
  ): DecoratorConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bound)) __obj.updateDynamic("bound")(bound)
    if (!js.isUndefined(getter)) __obj.updateDynamic("getter")(getter)
    if (!js.isUndefined(method)) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(optionalParams)) __obj.updateDynamic("optionalParams")(optionalParams)
    if (!js.isUndefined(property)) __obj.updateDynamic("property")(property)
    if (!js.isUndefined(setter)) __obj.updateDynamic("setter")(setter)
    __obj.asInstanceOf[DecoratorConfigOptions]
  }
}

