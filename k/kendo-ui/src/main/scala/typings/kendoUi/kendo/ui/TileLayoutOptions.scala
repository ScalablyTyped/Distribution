package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileLayoutOptions extends js.Object {
  var columns: js.UndefOr[Double] = js.undefined
  var columnsWidth: js.UndefOr[String | Double] = js.undefined
  var containers: js.UndefOr[js.Array[TileLayoutContainer]] = js.undefined
  var gap: js.UndefOr[TileLayoutGap] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var reorder: js.UndefOr[js.Function1[/* e */ TileLayoutReorderEvent, Unit]] = js.undefined
  var reorderable: js.UndefOr[Boolean] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[js.Function1[/* e */ TileLayoutResizeEvent, Unit]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var rowsHeight: js.UndefOr[String | Double] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object TileLayoutOptions {
  @scala.inline
  def apply(
    columns: js.UndefOr[Double] = js.undefined,
    columnsWidth: String | Double = null,
    containers: js.Array[TileLayoutContainer] = null,
    gap: TileLayoutGap = null,
    height: String | Double = null,
    name: String = null,
    reorder: /* e */ TileLayoutReorderEvent => Unit = null,
    reorderable: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    resize: /* e */ TileLayoutResizeEvent => Unit = null,
    rows: js.UndefOr[Double] = js.undefined,
    rowsHeight: String | Double = null,
    width: String | Double = null
  ): TileLayoutOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.get.asInstanceOf[js.Any])
    if (columnsWidth != null) __obj.updateDynamic("columnsWidth")(columnsWidth.asInstanceOf[js.Any])
    if (containers != null) __obj.updateDynamic("containers")(containers.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (reorder != null) __obj.updateDynamic("reorder")(js.Any.fromFunction1(reorder))
    if (!js.isUndefined(reorderable)) __obj.updateDynamic("reorderable")(reorderable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (rowsHeight != null) __obj.updateDynamic("rowsHeight")(rowsHeight.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayoutOptions]
  }
}

