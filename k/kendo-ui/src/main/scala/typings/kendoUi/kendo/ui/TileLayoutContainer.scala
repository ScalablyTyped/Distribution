package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayoutContainer extends js.Object {
  var bodyTemplate: js.UndefOr[String | js.Function] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var header: js.UndefOr[TileLayoutContainerHeader] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
}

object TileLayoutContainer {
  @scala.inline
  def apply(
    bodyTemplate: String | js.Function = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    header: TileLayoutContainerHeader = null,
    rowSpan: js.UndefOr[Double] = js.undefined
  ): TileLayoutContainer = {
    val __obj = js.Dynamic.literal()
    if (bodyTemplate != null) __obj.updateDynamic("bodyTemplate")(bodyTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayoutContainer]
  }
}

