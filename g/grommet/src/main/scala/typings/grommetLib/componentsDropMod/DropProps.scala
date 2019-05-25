package typings
package grommetLib.componentsDropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropProps extends js.Object {
  var align: js.UndefOr[grommetLib.Anon_BottomLeft] = js.undefined
  var elevation: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String
  ] = js.undefined
  var onClickOutside: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onEsc: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var overflow: js.UndefOr[
    grommetLib.grommetLibStrings.auto | grommetLib.grommetLibStrings.hidden | grommetLib.grommetLibStrings.scroll | grommetLib.grommetLibStrings.visible | grommetLib.Anon_Auto | java.lang.String
  ] = js.undefined
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var restrictFocus: js.UndefOr[scala.Boolean] = js.undefined
  var stretch: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[js.Object] = js.undefined
}

object DropProps {
  @scala.inline
  def apply(
    align: grommetLib.Anon_BottomLeft = null,
    elevation: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String = null,
    onClickOutside: /* repeated */ js.Any => _ = null,
    onEsc: /* repeated */ js.Any => _ = null,
    overflow: grommetLib.grommetLibStrings.auto | grommetLib.grommetLibStrings.hidden | grommetLib.grommetLibStrings.scroll | grommetLib.grommetLibStrings.visible | grommetLib.Anon_Auto | java.lang.String = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    restrictFocus: js.UndefOr[scala.Boolean] = js.undefined,
    stretch: js.UndefOr[scala.Boolean] = js.undefined,
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

