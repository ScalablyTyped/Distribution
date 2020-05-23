package typings.lodashDecorators.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceChainContext extends js.Object {
  var getter: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[Boolean] = js.undefined
  var property: js.UndefOr[Boolean] = js.undefined
  var setter: js.UndefOr[Boolean] = js.undefined
  var value: js.Any
}

object InstanceChainContext {
  @scala.inline
  def apply(
    value: js.Any,
    getter: js.UndefOr[Boolean] = js.undefined,
    method: js.UndefOr[Boolean] = js.undefined,
    property: js.UndefOr[Boolean] = js.undefined,
    setter: js.UndefOr[Boolean] = js.undefined
  ): InstanceChainContext = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(getter)) __obj.updateDynamic("getter")(getter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(method)) __obj.updateDynamic("method")(method.get.asInstanceOf[js.Any])
    if (!js.isUndefined(property)) __obj.updateDynamic("property")(property.get.asInstanceOf[js.Any])
    if (!js.isUndefined(setter)) __obj.updateDynamic("setter")(setter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceChainContext]
  }
}

