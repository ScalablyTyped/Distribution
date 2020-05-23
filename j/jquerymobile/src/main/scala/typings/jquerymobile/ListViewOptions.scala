package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewOptions extends js.Object {
  var autodividers: js.UndefOr[Boolean] = js.undefined
  var autodividersSelector: js.UndefOr[js.Function1[/* jq */ js.UndefOr[JQuery], String]] = js.undefined
  var countTheme: js.UndefOr[String] = js.undefined
  var defaults: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dividerTheme: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var filterCallback: js.UndefOr[js.Function] = js.undefined
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  var filterTheme: js.UndefOr[String] = js.undefined
  var headerTheme: js.UndefOr[String] = js.undefined
  var initSelector: js.UndefOr[String] = js.undefined
  var inset: js.UndefOr[Boolean] = js.undefined
  var splitIcon: js.UndefOr[String] = js.undefined
  var splitTheme: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object ListViewOptions {
  @scala.inline
  def apply(
    autodividers: js.UndefOr[Boolean] = js.undefined,
    autodividersSelector: /* jq */ js.UndefOr[JQuery] => String = null,
    countTheme: String = null,
    defaults: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dividerTheme: String = null,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterCallback: js.Function = null,
    filterPlaceholder: String = null,
    filterTheme: String = null,
    headerTheme: String = null,
    initSelector: String = null,
    inset: js.UndefOr[Boolean] = js.undefined,
    splitIcon: String = null,
    splitTheme: String = null,
    theme: String = null
  ): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autodividers)) __obj.updateDynamic("autodividers")(autodividers.get.asInstanceOf[js.Any])
    if (autodividersSelector != null) __obj.updateDynamic("autodividersSelector")(js.Any.fromFunction1(autodividersSelector))
    if (countTheme != null) __obj.updateDynamic("countTheme")(countTheme.asInstanceOf[js.Any])
    if (!js.isUndefined(defaults)) __obj.updateDynamic("defaults")(defaults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (dividerTheme != null) __obj.updateDynamic("dividerTheme")(dividerTheme.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.get.asInstanceOf[js.Any])
    if (filterCallback != null) __obj.updateDynamic("filterCallback")(filterCallback.asInstanceOf[js.Any])
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (filterTheme != null) __obj.updateDynamic("filterTheme")(filterTheme.asInstanceOf[js.Any])
    if (headerTheme != null) __obj.updateDynamic("headerTheme")(headerTheme.asInstanceOf[js.Any])
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset.get.asInstanceOf[js.Any])
    if (splitIcon != null) __obj.updateDynamic("splitIcon")(splitIcon.asInstanceOf[js.Any])
    if (splitTheme != null) __obj.updateDynamic("splitTheme")(splitTheme.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewOptions]
  }
}

