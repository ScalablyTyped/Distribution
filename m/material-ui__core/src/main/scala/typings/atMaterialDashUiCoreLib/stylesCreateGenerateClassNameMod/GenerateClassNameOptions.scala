package typings
package atMaterialDashUiCoreLib.stylesCreateGenerateClassNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateClassNameOptions extends js.Object {
  var dangerouslyUseGlobalCSS: js.UndefOr[scala.Boolean] = js.undefined
  var productionPrefix: js.UndefOr[java.lang.String] = js.undefined
  var seed: js.UndefOr[java.lang.String] = js.undefined
}

object GenerateClassNameOptions {
  @scala.inline
  def apply(
    dangerouslyUseGlobalCSS: js.UndefOr[scala.Boolean] = js.undefined,
    productionPrefix: java.lang.String = null,
    seed: java.lang.String = null
  ): GenerateClassNameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dangerouslyUseGlobalCSS)) __obj.updateDynamic("dangerouslyUseGlobalCSS")(dangerouslyUseGlobalCSS)
    if (productionPrefix != null) __obj.updateDynamic("productionPrefix")(productionPrefix)
    if (seed != null) __obj.updateDynamic("seed")(seed)
    __obj.asInstanceOf[GenerateClassNameOptions]
  }
}

