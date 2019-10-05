package typings.grommet.componentsLayerMod

import typings.grommet.grommetStrings.`bottom-left`
import typings.grommet.grommetStrings.`bottom-right`
import typings.grommet.grommetStrings.`top-left`
import typings.grommet.grommetStrings.`top-right`
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.fadeIn
import typings.grommet.grommetStrings.hidden
import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.slide
import typings.grommet.grommetStrings.top
import typings.grommet.grommetStrings.vertical
import typings.grommet.utilsMod.AnimateType
import typings.grommet.utilsMod.KeyboardType
import typings.grommet.utilsMod.MarginType
import typings.react.reactMod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerProps extends js.Object {
  var animate: js.UndefOr[AnimateType] = js.undefined
  var animation: js.UndefOr[none | slide | fadeIn | Boolean] = js.undefined
  var full: js.UndefOr[Boolean | vertical | horizontal] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var onClickOutside: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onEsc: js.UndefOr[KeyboardType] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[
    bottom | `bottom-left` | `bottom-right` | center | hidden | left | right | top | `top-left` | `top-right`
  ] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
}

object LayerProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    animation: none | slide | fadeIn | Boolean = null,
    full: Boolean | vertical | horizontal = null,
    margin: MarginType = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    onClickOutside: /* repeated */ js.Any => _ = null,
    onEsc: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    position: bottom | `bottom-left` | `bottom-right` | center | hidden | left | right | top | `top-left` | `top-right` = null,
    responsive: js.UndefOr[Boolean] = js.undefined
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

