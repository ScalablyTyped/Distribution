package typings.grommet.componentsDropMod

import typings.grommet.Anon_Auto
import typings.grommet.Anon_BottomLeft
import typings.grommet.grommetStrings.auto
import typings.grommet.grommetStrings.hidden
import typings.grommet.grommetStrings.scroll
import typings.grommet.grommetStrings.visible
import typings.grommet.utilsMod.ElevationType
import typings.grommet.utilsMod.KeyboardType
import typings.react.reactMod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropProps extends js.Object {
  var align: js.UndefOr[Anon_BottomLeft] = js.undefined
  var elevation: js.UndefOr[ElevationType] = js.undefined
  var onClickOutside: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onEsc: js.UndefOr[KeyboardType] = js.undefined
  var overflow: js.UndefOr[auto | hidden | scroll | visible | Anon_Auto | String] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var restrictFocus: js.UndefOr[Boolean] = js.undefined
  var stretch: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[js.Object] = js.undefined
}

object DropProps {
  @scala.inline
  def apply(
    align: Anon_BottomLeft = null,
    elevation: ElevationType = null,
    onClickOutside: /* repeated */ js.Any => _ = null,
    onEsc: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    overflow: auto | hidden | scroll | visible | Anon_Auto | String = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    responsive: js.UndefOr[Boolean] = js.undefined,
    restrictFocus: js.UndefOr[Boolean] = js.undefined,
    stretch: js.UndefOr[Boolean] = js.undefined,
    target: js.Object = null
  ): DropProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1(onClickOutside))
    if (onEsc != null) __obj.updateDynamic("onEsc")(js.Any.fromFunction1(onEsc))
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (!js.isUndefined(restrictFocus)) __obj.updateDynamic("restrictFocus")(restrictFocus)
    if (!js.isUndefined(stretch)) __obj.updateDynamic("stretch")(stretch)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DropProps]
  }
}

