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
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var restrictFocus: js.UndefOr[scala.Boolean] = js.undefined
  var stretch: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.Object
}

object DropProps {
  @scala.inline
  def apply(
    target: js.Object,
    align: grommetLib.Anon_BottomLeft = null,
    elevation: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String = null,
    onClickOutside: js.Function1[/* repeated */ js.Any, _] = null,
    onEsc: js.Function1[/* repeated */ js.Any, _] = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    restrictFocus: js.UndefOr[scala.Boolean] = js.undefined,
    stretch: js.UndefOr[scala.Boolean] = js.undefined
  ): DropProps = {
    val __obj = js.Dynamic.literal(target = target)
    if (align != null) __obj.updateDynamic("align")(align)
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(onClickOutside)
    if (onEsc != null) __obj.updateDynamic("onEsc")(onEsc)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (!js.isUndefined(restrictFocus)) __obj.updateDynamic("restrictFocus")(restrictFocus)
    if (!js.isUndefined(stretch)) __obj.updateDynamic("stretch")(stretch)
    __obj.asInstanceOf[DropProps]
  }
}

