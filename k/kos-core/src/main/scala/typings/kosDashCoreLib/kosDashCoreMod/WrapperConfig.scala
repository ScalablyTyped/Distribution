package typings
package kosDashCoreLib.kosDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperConfig extends js.Object {
  var autoLoad: js.UndefOr[scala.Boolean] = js.undefined
  var autoReset: js.UndefOr[scala.Boolean] = js.undefined
  var model: KosModel[_]
  var namespace: js.UndefOr[java.lang.String] = js.undefined
}

object WrapperConfig {
  @scala.inline
  def apply(
    model: KosModel[_],
    autoLoad: js.UndefOr[scala.Boolean] = js.undefined,
    autoReset: js.UndefOr[scala.Boolean] = js.undefined,
    namespace: java.lang.String = null
  ): WrapperConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("model")(model)
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(autoReset)) __obj.updateDynamic("autoReset")(autoReset)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[WrapperConfig]
  }
}

