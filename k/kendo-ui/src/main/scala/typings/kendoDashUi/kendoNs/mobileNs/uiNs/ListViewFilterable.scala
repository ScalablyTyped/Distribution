package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewFilterable extends js.Object {
  var autoFilter: js.UndefOr[Boolean] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
}

object ListViewFilterable {
  @scala.inline
  def apply(
    autoFilter: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    operator: String = null,
    placeholder: String = null
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

