package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.tableTableRowMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.TableNs.TableRowProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, selected, className */
object TableRow
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.tableTableRowMod.default].asInstanceOf[String | js.Object]
  def apply(
    displayBorder: js.UndefOr[Boolean] = js.undefined,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    hovered: js.UndefOr[Boolean] = js.undefined,
    onCellClick: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, /* column */ Double) => Unit = null,
    onCellHover: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, /* column */ Double) => Unit = null,
    onCellHoverExit: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, /* column */ Double) => Unit = null,
    onRowClick: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double) => Unit = null,
    onRowHover: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double) => Unit = null,
    onRowHoverExit: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double) => Unit = null,
    rowNumber: Int | Double = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    striped: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayBorder)) __obj.updateDynamic("displayBorder")(displayBorder)
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable)
    if (!js.isUndefined(hovered)) __obj.updateDynamic("hovered")(hovered)
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction3(onCellClick))
    if (onCellHover != null) __obj.updateDynamic("onCellHover")(js.Any.fromFunction3(onCellHover))
    if (onCellHoverExit != null) __obj.updateDynamic("onCellHoverExit")(js.Any.fromFunction3(onCellHoverExit))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (onRowHover != null) __obj.updateDynamic("onRowHover")(js.Any.fromFunction2(onRowHover))
    if (onRowHoverExit != null) __obj.updateDynamic("onRowHoverExit")(js.Any.fromFunction2(onRowHoverExit))
    if (rowNumber != null) __obj.updateDynamic("rowNumber")(rowNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableRowProps
}

