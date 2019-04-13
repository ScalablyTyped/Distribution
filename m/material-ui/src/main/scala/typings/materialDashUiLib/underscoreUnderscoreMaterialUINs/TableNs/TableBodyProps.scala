package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.TableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBodyProps extends js.Object {
  /** @deprecated Instead, use property on Table */
  var allRowsSelected: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var deselectOnClickaway: js.UndefOr[scala.Boolean] = js.undefined
  var displayRowCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /** @deprecated Instead, use property on Table */
  var multiSelectable: js.UndefOr[scala.Boolean] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellClick: js.UndefOr[js.Function2[/* row */ scala.Double, /* column */ scala.Double, scala.Unit]] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellHover: js.UndefOr[js.Function2[/* row */ scala.Double, /* column */ scala.Double, scala.Unit]] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellHoverExit: js.UndefOr[js.Function2[/* row */ scala.Double, /* column */ scala.Double, scala.Unit]] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowHover: js.UndefOr[js.Function1[/* row */ scala.Double, scala.Unit]] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowHoverExit: js.UndefOr[js.Function1[/* row */ scala.Double, scala.Unit]] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowSelection: js.UndefOr[
    js.Function1[/* selectedRows */ js.Array[scala.Double] | java.lang.String, scala.Unit]
  ] = js.undefined
  var preScanRows: js.UndefOr[scala.Boolean] = js.undefined
  /** @deprecated Instead, use property on Table */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var showRowHover: js.UndefOr[scala.Boolean] = js.undefined
  var stripedRows: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object TableBodyProps {
  @scala.inline
  def apply(
    allRowsSelected: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    deselectOnClickaway: js.UndefOr[scala.Boolean] = js.undefined,
    displayRowCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    multiSelectable: js.UndefOr[scala.Boolean] = js.undefined,
    onCellClick: (/* row */ scala.Double, /* column */ scala.Double) => scala.Unit = null,
    onCellHover: (/* row */ scala.Double, /* column */ scala.Double) => scala.Unit = null,
    onCellHoverExit: (/* row */ scala.Double, /* column */ scala.Double) => scala.Unit = null,
    onRowHover: /* row */ scala.Double => scala.Unit = null,
    onRowHoverExit: /* row */ scala.Double => scala.Unit = null,
    onRowSelection: /* selectedRows */ js.Array[scala.Double] | java.lang.String => scala.Unit = null,
    preScanRows: js.UndefOr[scala.Boolean] = js.undefined,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    showRowHover: js.UndefOr[scala.Boolean] = js.undefined,
    stripedRows: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
  ): TableBodyProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allRowsSelected)) __obj.updateDynamic("allRowsSelected")(allRowsSelected)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(deselectOnClickaway)) __obj.updateDynamic("deselectOnClickaway")(deselectOnClickaway)
    if (!js.isUndefined(displayRowCheckbox)) __obj.updateDynamic("displayRowCheckbox")(displayRowCheckbox)
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable)
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (onCellHover != null) __obj.updateDynamic("onCellHover")(js.Any.fromFunction2(onCellHover))
    if (onCellHoverExit != null) __obj.updateDynamic("onCellHoverExit")(js.Any.fromFunction2(onCellHoverExit))
    if (onRowHover != null) __obj.updateDynamic("onRowHover")(js.Any.fromFunction1(onRowHover))
    if (onRowHoverExit != null) __obj.updateDynamic("onRowHoverExit")(js.Any.fromFunction1(onRowHoverExit))
    if (onRowSelection != null) __obj.updateDynamic("onRowSelection")(js.Any.fromFunction1(onRowSelection))
    if (!js.isUndefined(preScanRows)) __obj.updateDynamic("preScanRows")(preScanRows)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(showRowHover)) __obj.updateDynamic("showRowHover")(showRowHover)
    if (!js.isUndefined(stripedRows)) __obj.updateDynamic("stripedRows")(stripedRows)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TableBodyProps]
  }
}

