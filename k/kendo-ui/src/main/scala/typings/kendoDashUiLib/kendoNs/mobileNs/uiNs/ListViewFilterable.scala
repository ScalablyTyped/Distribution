package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewFilterable extends js.Object {
  var autoFilter: js.UndefOr[scala.Boolean] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  var operator: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
}

object ListViewFilterable {
  @scala.inline
  def apply(
    autoFilter: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String = null,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    operator: java.lang.String = null,
    placeholder: java.lang.String = null
  ): ListViewFilterable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFilter)) __obj.updateDynamic("autoFilter")(autoFilter)
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[ListViewFilterable]
  }
}

