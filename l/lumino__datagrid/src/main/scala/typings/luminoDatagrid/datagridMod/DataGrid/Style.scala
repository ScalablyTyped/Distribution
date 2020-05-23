package typings.luminoDatagrid.datagridMod.DataGrid

import typings.luminoDatagrid.anon.Color1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which defines the style for a data grid.
  *
  * #### Notes
  * All style colors support the full CSS color syntax.
  */
trait Style extends js.Object {
  /**
    * The background color for the body cells.
    *
    * This color is layered on top of the `voidColor`.
    */
  val backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * A function which returns the background color for a column.
    *
    * This color is layered on top of the `backgroundColor` and can
    * be used to implement "zebra striping" of the grid columns.
    */
  val columnBackgroundColor: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  /**
    * The border color for the cursor.
    */
  val cursorBorderColor: js.UndefOr[String] = js.undefined
  /**
    * The fill color for the cursor.
    */
  val cursorFillColor: js.UndefOr[String] = js.undefined
  /**
    * The color for the grid lines of the body cells.
    *
    * The grid lines are draw on top of the cell contents.
    */
  val gridLineColor: js.UndefOr[String] = js.undefined
  /**
    * The background color for the header cells.
    *
    * This color is layered on top of the `voidColor`.
    */
  val headerBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    * The color for the grid lines of the header cells.
    *
    * The grid lines are draw on top of the cell contents.
    */
  val headerGridLineColor: js.UndefOr[String] = js.undefined
  /**
    * The color for the horizontal grid lines of the header cells.
    *
    * This overrides the `headerGridLineColor` option.
    */
  val headerHorizontalGridLineColor: js.UndefOr[String] = js.undefined
  /**
    * The border color for a header selection.
    */
  val headerSelectionBorderColor: js.UndefOr[String] = js.undefined
  /**
    * The fill color for a header selection.
    */
  val headerSelectionFillColor: js.UndefOr[String] = js.undefined
  /**
    * The color for the vertical grid lines of the header cells.
    *
    * This overrides the `headerGridLineColor` option.
    */
  val headerVerticalGridLineColor: js.UndefOr[String] = js.undefined
  /**
    * The color for the horizontal grid lines of the body cells.
    *
    * This overrides the `gridLineColor` option.
    */
  val horizontalGridLineColor: js.UndefOr[String] = js.undefined
  /**
    * A function which returns the background color for a row.
    *
    * This color is layered on top of the `backgroundColor` and can
    * be used to implement "zebra striping" of the grid rows.
    */
  val rowBackgroundColor: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  /**
    * The drop shadow effect when the grid is scrolled.
    */
  val scrollShadow: js.UndefOr[Color1] = js.undefined
  /**
    * The border color for a selection.
    */
  val selectionBorderColor: js.UndefOr[String] = js.undefined
  /**
    * The fill color for a selection.
    */
  val selectionFillColor: js.UndefOr[String] = js.undefined
  /**
    * The color for the vertical grid lines of the body cells.
    *
    * This overrides the `gridLineColor` option.
    */
  val verticalGridLineColor: js.UndefOr[String] = js.undefined
  /**
    * The void color for the data grid.
    *
    * This is the base fill color for the entire data grid.
    */
  val voidColor: js.UndefOr[String] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    columnBackgroundColor: /* index */ Double => String = null,
    cursorBorderColor: String = null,
    cursorFillColor: String = null,
    gridLineColor: String = null,
    headerBackgroundColor: String = null,
    headerGridLineColor: String = null,
    headerHorizontalGridLineColor: String = null,
    headerSelectionBorderColor: String = null,
    headerSelectionFillColor: String = null,
    headerVerticalGridLineColor: String = null,
    horizontalGridLineColor: String = null,
    rowBackgroundColor: /* index */ Double => String = null,
    scrollShadow: Color1 = null,
    selectionBorderColor: String = null,
    selectionFillColor: String = null,
    verticalGridLineColor: String = null,
    voidColor: String = null
  ): Style = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (columnBackgroundColor != null) __obj.updateDynamic("columnBackgroundColor")(js.Any.fromFunction1(columnBackgroundColor))
    if (cursorBorderColor != null) __obj.updateDynamic("cursorBorderColor")(cursorBorderColor.asInstanceOf[js.Any])
    if (cursorFillColor != null) __obj.updateDynamic("cursorFillColor")(cursorFillColor.asInstanceOf[js.Any])
    if (gridLineColor != null) __obj.updateDynamic("gridLineColor")(gridLineColor.asInstanceOf[js.Any])
    if (headerBackgroundColor != null) __obj.updateDynamic("headerBackgroundColor")(headerBackgroundColor.asInstanceOf[js.Any])
    if (headerGridLineColor != null) __obj.updateDynamic("headerGridLineColor")(headerGridLineColor.asInstanceOf[js.Any])
    if (headerHorizontalGridLineColor != null) __obj.updateDynamic("headerHorizontalGridLineColor")(headerHorizontalGridLineColor.asInstanceOf[js.Any])
    if (headerSelectionBorderColor != null) __obj.updateDynamic("headerSelectionBorderColor")(headerSelectionBorderColor.asInstanceOf[js.Any])
    if (headerSelectionFillColor != null) __obj.updateDynamic("headerSelectionFillColor")(headerSelectionFillColor.asInstanceOf[js.Any])
    if (headerVerticalGridLineColor != null) __obj.updateDynamic("headerVerticalGridLineColor")(headerVerticalGridLineColor.asInstanceOf[js.Any])
    if (horizontalGridLineColor != null) __obj.updateDynamic("horizontalGridLineColor")(horizontalGridLineColor.asInstanceOf[js.Any])
    if (rowBackgroundColor != null) __obj.updateDynamic("rowBackgroundColor")(js.Any.fromFunction1(rowBackgroundColor))
    if (scrollShadow != null) __obj.updateDynamic("scrollShadow")(scrollShadow.asInstanceOf[js.Any])
    if (selectionBorderColor != null) __obj.updateDynamic("selectionBorderColor")(selectionBorderColor.asInstanceOf[js.Any])
    if (selectionFillColor != null) __obj.updateDynamic("selectionFillColor")(selectionFillColor.asInstanceOf[js.Any])
    if (verticalGridLineColor != null) __obj.updateDynamic("verticalGridLineColor")(verticalGridLineColor.asInstanceOf[js.Any])
    if (voidColor != null) __obj.updateDynamic("voidColor")(voidColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

