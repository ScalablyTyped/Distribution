package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableOptions extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var defaults: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var enhanced: js.UndefOr[scala.Boolean] = js.undefined
  var filterCallback: js.UndefOr[Anon_Index] = js.undefined
  var filterPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var filterReveal: js.UndefOr[scala.Boolean] = js.undefined
  var filterTheme: js.UndefOr[java.lang.String] = js.undefined
  var input: js.Any
}

object FilterableOptions {
  @scala.inline
  def apply(
    input: js.Any,
    children: js.Any = null,
    defaults: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    enhanced: js.UndefOr[scala.Boolean] = js.undefined,
    filterCallback: Anon_Index = null,
    filterPlaceholder: java.lang.String = null,
    filterReveal: js.UndefOr[scala.Boolean] = js.undefined,
    filterTheme: java.lang.String = null
  ): FilterableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(enhanced)) __obj.updateDynamic("enhanced")(enhanced)
    if (filterCallback != null) __obj.updateDynamic("filterCallback")(filterCallback)
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder)
    if (!js.isUndefined(filterReveal)) __obj.updateDynamic("filterReveal")(filterReveal)
    if (filterTheme != null) __obj.updateDynamic("filterTheme")(filterTheme)
    __obj.asInstanceOf[FilterableOptions]
  }
}

