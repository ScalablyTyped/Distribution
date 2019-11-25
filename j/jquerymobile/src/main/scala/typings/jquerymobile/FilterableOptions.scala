package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableOptions extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var defaults: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var enhanced: js.UndefOr[Boolean] = js.undefined
  var filterCallback: js.UndefOr[js.Function2[/* index */ Double, /* searchValue */ js.UndefOr[String], Boolean]] = js.undefined
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  var filterReveal: js.UndefOr[Boolean] = js.undefined
  var filterTheme: js.UndefOr[String] = js.undefined
  var input: js.Any
}

object FilterableOptions {
  @scala.inline
  def apply(
    input: js.Any,
    children: js.Any = null,
    defaults: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enhanced: js.UndefOr[Boolean] = js.undefined,
    filterCallback: (/* index */ Double, /* searchValue */ js.UndefOr[String]) => Boolean = null,
    filterPlaceholder: String = null,
    filterReveal: js.UndefOr[Boolean] = js.undefined,
    filterTheme: String = null
  ): FilterableOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enhanced)) __obj.updateDynamic("enhanced")(enhanced.asInstanceOf[js.Any])
    if (filterCallback != null) __obj.updateDynamic("filterCallback")(js.Any.fromFunction2(filterCallback))
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(filterReveal)) __obj.updateDynamic("filterReveal")(filterReveal.asInstanceOf[js.Any])
    if (filterTheme != null) __obj.updateDynamic("filterTheme")(filterTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterableOptions]
  }
}

