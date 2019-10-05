package typings.griddleDashReact.griddleDashReactMod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionSettings extends js.Object {
  // TODO: Unused?
  // The minimum column width
  var defaultColumnWidth: js.UndefOr[Double | String] = js.undefined
  // TODO: Unused?
  // Disable pointer events while scrolling to improve performance
  var disablePointerEvents: js.UndefOr[Boolean] = js.undefined
  // TODO: Unused?
  // Whether or not the header should be fixed
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  // The minimum row height
  var rowHeight: js.UndefOr[Double | String] = js.undefined
  // The height of the table
  var tableHeight: js.UndefOr[Double | String] = js.undefined
  // The width of the table
  var tableWidth: js.UndefOr[Double | String] = js.undefined
}

object PositionSettings {
  @scala.inline
  def apply(
    defaultColumnWidth: Double | String = null,
    disablePointerEvents: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    rowHeight: Double | String = null,
    tableHeight: Double | String = null,
    tableWidth: Double | String = null
  ): PositionSettings = {
    val __obj = js.Dynamic.literal()
    if (defaultColumnWidth != null) __obj.updateDynamic("defaultColumnWidth")(defaultColumnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePointerEvents)) __obj.updateDynamic("disablePointerEvents")(disablePointerEvents)
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (tableHeight != null) __obj.updateDynamic("tableHeight")(tableHeight.asInstanceOf[js.Any])
    if (tableWidth != null) __obj.updateDynamic("tableWidth")(tableWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionSettings]
  }
}

