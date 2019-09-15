package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.tableTableBodyMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.TableNs.TableBodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object TableBody
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.tableTableBodyMod.default].asInstanceOf[String | js.Object]
  def apply(
    allRowsSelected: js.UndefOr[Boolean] = js.undefined,
    deselectOnClickaway: js.UndefOr[Boolean] = js.undefined,
    displayRowCheckbox: js.UndefOr[Boolean] = js.undefined,
    multiSelectable: js.UndefOr[Boolean] = js.undefined,
    onCellClick: (/* row */ Double, /* column */ Double) => Unit = null,
    onCellHover: (/* row */ Double, /* column */ Double) => Unit = null,
    onCellHoverExit: (/* row */ Double, /* column */ Double) => Unit = null,
    onRowHover: /* row */ Double => Unit = null,
    onRowHoverExit: /* row */ Double => Unit = null,
    onRowSelection: /* selectedRows */ js.Array[Double] | String => Unit = null,
    preScanRows: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    showRowHover: js.UndefOr[Boolean] = js.undefined,
    stripedRows: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allRowsSelected)) __obj.updateDynamic("allRowsSelected")(allRowsSelected)
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
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableBodyProps
}

