package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleSetOptions extends js.Object {
  var collapsedIcon: js.UndefOr[java.lang.String] = js.undefined
  var expandedIcon: js.UndefOr[java.lang.String] = js.undefined
  var iconpos: js.UndefOr[java.lang.String] = js.undefined
  var initSelector: js.UndefOr[java.lang.String] = js.undefined
  var inset: js.UndefOr[scala.Boolean] = js.undefined
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object CollapsibleSetOptions {
  @scala.inline
  def apply(
    collapsedIcon: java.lang.String = null,
    expandedIcon: java.lang.String = null,
    iconpos: java.lang.String = null,
    initSelector: java.lang.String = null,
    inset: js.UndefOr[scala.Boolean] = js.undefined,
    mini: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null
  ): CollapsibleSetOptions = {
    val __obj = js.Dynamic.literal()
    if (collapsedIcon != null) __obj.updateDynamic("collapsedIcon")(collapsedIcon)
    if (expandedIcon != null) __obj.updateDynamic("expandedIcon")(expandedIcon)
    if (iconpos != null) __obj.updateDynamic("iconpos")(iconpos)
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector)
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CollapsibleSetOptions]
  }
}

