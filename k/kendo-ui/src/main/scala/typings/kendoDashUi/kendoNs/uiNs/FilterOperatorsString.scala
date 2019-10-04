package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOperatorsString extends js.Object {
  var contains: js.UndefOr[String] = js.undefined
  var doesnotcontain: js.UndefOr[String] = js.undefined
  var endswith: js.UndefOr[String] = js.undefined
  @JSName("eq")
  var eq_FFilterOperatorsString: js.UndefOr[String] = js.undefined
  var isempty: js.UndefOr[String] = js.undefined
  var isnotempty: js.UndefOr[String] = js.undefined
  var isnotnull: js.UndefOr[String] = js.undefined
  var isnotnullorempty: js.UndefOr[String] = js.undefined
  var isnull: js.UndefOr[String] = js.undefined
  var isnullorempty: js.UndefOr[String] = js.undefined
  var neq: js.UndefOr[String] = js.undefined
  var startswith: js.UndefOr[String] = js.undefined
}

object FilterOperatorsString {
  @scala.inline
  def apply(
    contains: String = null,
    doesnotcontain: String = null,
    endswith: String = null,
    eq: String = null,
    isempty: String = null,
    isnotempty: String = null,
    isnotnull: String = null,
    isnotnullorempty: String = null,
    isnull: String = null,
    isnullorempty: String = null,
    neq: String = null,
    startswith: String = null
  ): FilterOperatorsString = {
    val __obj = js.Dynamic.literal()
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (doesnotcontain != null) __obj.updateDynamic("doesnotcontain")(doesnotcontain)
    if (endswith != null) __obj.updateDynamic("endswith")(endswith)
    if (eq != null) __obj.updateDynamic("eq")(eq)
    if (isempty != null) __obj.updateDynamic("isempty")(isempty)
    if (isnotempty != null) __obj.updateDynamic("isnotempty")(isnotempty)
    if (isnotnull != null) __obj.updateDynamic("isnotnull")(isnotnull)
    if (isnotnullorempty != null) __obj.updateDynamic("isnotnullorempty")(isnotnullorempty)
    if (isnull != null) __obj.updateDynamic("isnull")(isnull)
    if (isnullorempty != null) __obj.updateDynamic("isnullorempty")(isnullorempty)
    if (neq != null) __obj.updateDynamic("neq")(neq)
    if (startswith != null) __obj.updateDynamic("startswith")(startswith)
    __obj.asInstanceOf[FilterOperatorsString]
  }
}

