package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewOptions extends js.Object {
  var autodividers: js.UndefOr[scala.Boolean] = js.undefined
  var autodividersSelector: js.UndefOr[js.Function1[/* jq */ js.UndefOr[JQuery], java.lang.String]] = js.undefined
  var countTheme: js.UndefOr[java.lang.String] = js.undefined
  var defaults: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dividerTheme: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var filterCallback: js.UndefOr[js.Function] = js.undefined
  var filterPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var filterTheme: js.UndefOr[java.lang.String] = js.undefined
  var headerTheme: js.UndefOr[java.lang.String] = js.undefined
  var initSelector: js.UndefOr[java.lang.String] = js.undefined
  var inset: js.UndefOr[scala.Boolean] = js.undefined
  var splitIcon: js.UndefOr[java.lang.String] = js.undefined
  var splitTheme: js.UndefOr[java.lang.String] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object ListViewOptions {
  @scala.inline
  def apply(
    autodividers: js.UndefOr[scala.Boolean] = js.undefined,
    autodividersSelector: js.Function1[/* jq */ js.UndefOr[JQuery], java.lang.String] = null,
    countTheme: java.lang.String = null,
    defaults: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dividerTheme: java.lang.String = null,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    filterCallback: js.Function = null,
    filterPlaceholder: java.lang.String = null,
    filterTheme: java.lang.String = null,
    headerTheme: java.lang.String = null,
    initSelector: java.lang.String = null,
    inset: js.UndefOr[scala.Boolean] = js.undefined,
    splitIcon: java.lang.String = null,
    splitTheme: java.lang.String = null,
    theme: java.lang.String = null
  ): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autodividers)) __obj.updateDynamic("autodividers")(autodividers)
    if (autodividersSelector != null) __obj.updateDynamic("autodividersSelector")(autodividersSelector)
    if (countTheme != null) __obj.updateDynamic("countTheme")(countTheme)
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dividerTheme != null) __obj.updateDynamic("dividerTheme")(dividerTheme)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (filterCallback != null) __obj.updateDynamic("filterCallback")(filterCallback)
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder)
    if (filterTheme != null) __obj.updateDynamic("filterTheme")(filterTheme)
    if (headerTheme != null) __obj.updateDynamic("headerTheme")(headerTheme)
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector)
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (splitIcon != null) __obj.updateDynamic("splitIcon")(splitIcon)
    if (splitTheme != null) __obj.updateDynamic("splitTheme")(splitTheme)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ListViewOptions]
  }
}

