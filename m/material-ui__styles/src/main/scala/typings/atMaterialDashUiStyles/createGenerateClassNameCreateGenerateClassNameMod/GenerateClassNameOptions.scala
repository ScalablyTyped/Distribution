package typings.atMaterialDashUiStyles.createGenerateClassNameCreateGenerateClassNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateClassNameOptions extends js.Object {
  var disableGlobal: js.UndefOr[Boolean] = js.undefined
  var productionPrefix: js.UndefOr[String] = js.undefined
  var seed: js.UndefOr[String] = js.undefined
}

object GenerateClassNameOptions {
  @scala.inline
  def apply(
    disableGlobal: js.UndefOr[Boolean] = js.undefined,
    productionPrefix: String = null,
    seed: String = null
  ): GenerateClassNameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableGlobal)) __obj.updateDynamic("disableGlobal")(disableGlobal.asInstanceOf[js.Any])
    if (productionPrefix != null) __obj.updateDynamic("productionPrefix")(productionPrefix.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateClassNameOptions]
  }
}

