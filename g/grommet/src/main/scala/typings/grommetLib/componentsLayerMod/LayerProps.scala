package typings
package grommetLib.componentsLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerProps extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var animation: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.slide | grommetLib.grommetLibStrings.fadeIn | scala.Boolean
  ] = js.undefined
  var full: js.UndefOr[
    scala.Boolean | grommetLib.grommetLibStrings.vertical | grommetLib.grommetLibStrings.horizontal
  ] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.Anon_BottomHorizontal | java.lang.String
  ] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var onClickOutside: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onEsc: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[
    grommetLib.grommetLibStrings.bottom | grommetLib.grommetLibStrings.`bottom-left` | grommetLib.grommetLibStrings.`bottom-right` | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.hidden | grommetLib.grommetLibStrings.left | grommetLib.grommetLibStrings.right | grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.`top-left` | grommetLib.grommetLibStrings.`top-right`
  ] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
}

object LayerProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animation: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.slide | grommetLib.grommetLibStrings.fadeIn | scala.Boolean = null,
    full: scala.Boolean | grommetLib.grommetLibStrings.vertical | grommetLib.grommetLibStrings.horizontal = null,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.Anon_BottomHorizontal | java.lang.String = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    onClickOutside: /* repeated */ js.Any => _ = null,
    onEsc: /* repeated */ js.Any => _ = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    position: grommetLib.grommetLibStrings.bottom | grommetLib.grommetLibStrings.`bottom-left` | grommetLib.grommetLibStrings.`bottom-right` | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.hidden | grommetLib.grommetLibStrings.left | grommetLib.grommetLibStrings.right | grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.`top-left` | grommetLib.grommetLibStrings.`top-right` = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined
  ): LayerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (full != null) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1(onClickOutside))
    if (onEsc != null) __obj.updateDynamic("onEsc")(js.Any.fromFunction1(onEsc))
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    __obj.asInstanceOf[LayerProps]
  }
}

