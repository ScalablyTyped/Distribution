package typings.kendoUi.kendo.ui

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
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (doesnotcontain != null) __obj.updateDynamic("doesnotcontain")(doesnotcontain.asInstanceOf[js.Any])
    if (endswith != null) __obj.updateDynamic("endswith")(endswith.asInstanceOf[js.Any])
    if (eq != null) __obj.updateDynamic("eq")(eq.asInstanceOf[js.Any])
    if (isempty != null) __obj.updateDynamic("isempty")(isempty.asInstanceOf[js.Any])
    if (isnotempty != null) __obj.updateDynamic("isnotempty")(isnotempty.asInstanceOf[js.Any])
    if (isnotnull != null) __obj.updateDynamic("isnotnull")(isnotnull.asInstanceOf[js.Any])
    if (isnotnullorempty != null) __obj.updateDynamic("isnotnullorempty")(isnotnullorempty.asInstanceOf[js.Any])
    if (isnull != null) __obj.updateDynamic("isnull")(isnull.asInstanceOf[js.Any])
    if (isnullorempty != null) __obj.updateDynamic("isnullorempty")(isnullorempty.asInstanceOf[js.Any])
    if (neq != null) __obj.updateDynamic("neq")(neq.asInstanceOf[js.Any])
    if (startswith != null) __obj.updateDynamic("startswith")(startswith.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOperatorsString]
  }
}

