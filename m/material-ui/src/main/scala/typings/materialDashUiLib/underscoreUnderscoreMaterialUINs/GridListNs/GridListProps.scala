package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.GridListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridListProps extends js.Object {
  var cellHeight: js.UndefOr[scala.Double | materialDashUiLib.materialDashUiLibStrings.auto] = js.undefined
  var cols: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object GridListProps {
  @scala.inline
  def apply(
    cellHeight: scala.Double | materialDashUiLib.materialDashUiLibStrings.auto = null,
    cols: scala.Int | scala.Double = null,
    padding: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): GridListProps = {
    val __obj = js.Dynamic.literal()
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GridListProps]
  }
}

