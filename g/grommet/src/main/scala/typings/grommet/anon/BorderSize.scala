package typings.grommet.anon

import typings.grommet.utilsMod.BreakpointBorderSize
import typings.grommet.utilsMod.BreakpointEdgeSize
import typings.grommet.utilsMod.BreakpointSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderSize extends js.Object {
  var borderSize: js.UndefOr[BreakpointBorderSize] = js.undefined
  var edgeSize: js.UndefOr[BreakpointEdgeSize] = js.undefined
  var size: js.UndefOr[BreakpointSize] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object BorderSize {
  @scala.inline
  def apply(
    borderSize: BreakpointBorderSize = null,
    edgeSize: BreakpointEdgeSize = null,
    size: BreakpointSize = null,
    value: js.UndefOr[Double] = js.undefined
  ): BorderSize = {
    val __obj = js.Dynamic.literal()
    if (borderSize != null) __obj.updateDynamic("borderSize")(borderSize.asInstanceOf[js.Any])
    if (edgeSize != null) __obj.updateDynamic("edgeSize")(edgeSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderSize]
  }
}

