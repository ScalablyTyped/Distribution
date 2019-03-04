package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectMenuOptions extends js.Object {
  var corners: js.UndefOr[scala.Boolean] = js.undefined
  var hidePlaceholderMenuItems: scala.Boolean
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var iconpos: js.UndefOr[java.lang.String] = js.undefined
  var iconshadow: js.UndefOr[scala.Boolean] = js.undefined
  var initSelector: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var mini: js.UndefOr[scala.Boolean] = js.undefined
  var nativeMenu: js.UndefOr[scala.Boolean] = js.undefined
  var overlayTheme: js.UndefOr[java.lang.String] = js.undefined
  var preventFocusZoom: js.UndefOr[scala.Boolean] = js.undefined
  var shadow: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object SelectMenuOptions {
  @scala.inline
  def apply(
    hidePlaceholderMenuItems: scala.Boolean,
    corners: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    iconpos: java.lang.String = null,
    iconshadow: js.UndefOr[scala.Boolean] = js.undefined,
    initSelector: java.lang.String = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    mini: js.UndefOr[scala.Boolean] = js.undefined,
    nativeMenu: js.UndefOr[scala.Boolean] = js.undefined,
    overlayTheme: java.lang.String = null,
    preventFocusZoom: js.UndefOr[scala.Boolean] = js.undefined,
    shadow: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null
  ): SelectMenuOptions = {
    val __obj = js.Dynamic.literal(hidePlaceholderMenuItems = hidePlaceholderMenuItems)
    if (!js.isUndefined(corners)) __obj.updateDynamic("corners")(corners)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconpos != null) __obj.updateDynamic("iconpos")(iconpos)
    if (!js.isUndefined(iconshadow)) __obj.updateDynamic("iconshadow")(iconshadow)
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini)
    if (!js.isUndefined(nativeMenu)) __obj.updateDynamic("nativeMenu")(nativeMenu)
    if (overlayTheme != null) __obj.updateDynamic("overlayTheme")(overlayTheme)
    if (!js.isUndefined(preventFocusZoom)) __obj.updateDynamic("preventFocusZoom")(preventFocusZoom)
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[SelectMenuOptions]
  }
}

