package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleSetOptions extends js.Object {
  var collapsedIcon: js.UndefOr[String] = js.undefined
  var expandedIcon: js.UndefOr[String] = js.undefined
  var iconpos: js.UndefOr[String] = js.undefined
  var initSelector: js.UndefOr[String] = js.undefined
  var inset: js.UndefOr[Boolean] = js.undefined
  var mini: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object CollapsibleSetOptions {
  @scala.inline
  def apply(
    collapsedIcon: String = null,
    expandedIcon: String = null,
    iconpos: String = null,
    initSelector: String = null,
    inset: js.UndefOr[Boolean] = js.undefined,
    mini: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
  ): CollapsibleSetOptions = {
    val __obj = js.Dynamic.literal()
    if (collapsedIcon != null) __obj.updateDynamic("collapsedIcon")(collapsedIcon.asInstanceOf[js.Any])
    if (expandedIcon != null) __obj.updateDynamic("expandedIcon")(expandedIcon.asInstanceOf[js.Any])
    if (iconpos != null) __obj.updateDynamic("iconpos")(iconpos.asInstanceOf[js.Any])
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsibleSetOptions]
  }
}

