package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.materialDashUiStrings.all
import typings.materialDashUi.tableMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.TableNs.TableProps
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Table
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.tableMod.default].asInstanceOf[String | js.Object]
  def apply(
    allRowsSelected: js.UndefOr[Boolean] = js.undefined,
    bodyStyle: CSSProperties = null,
    fixedFooter: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    footerStyle: CSSProperties = null,
    headerStyle: CSSProperties = null,
    height: String = null,
    multiSelectable: js.UndefOr[Boolean] = js.undefined,
    onCellClick: (/* row */ Double, /* column */ Double) => Unit = null,
    onCellHover: (/* row */ Double, /* column */ Double) => Unit = null,
    onCellHoverExit: (/* row */ Double, /* column */ Double) => Unit = null,
    onRowHover: /* row */ Double => Unit = null,
    onRowHoverExit: /* row */ Double => Unit = null,
    onRowSelection: /* selectedRows */ js.Array[Double] | all => Unit = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    wrapperStyle: CSSProperties = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allRowsSelected)) __obj.updateDynamic("allRowsSelected")(allRowsSelected)
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (!js.isUndefined(fixedFooter)) __obj.updateDynamic("fixedFooter")(fixedFooter)
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle)
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle)
    if (height != null) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable)
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (onCellHover != null) __obj.updateDynamic("onCellHover")(js.Any.fromFunction2(onCellHover))
    if (onCellHoverExit != null) __obj.updateDynamic("onCellHoverExit")(js.Any.fromFunction2(onCellHoverExit))
    if (onRowHover != null) __obj.updateDynamic("onRowHover")(js.Any.fromFunction1(onRowHover))
    if (onRowHoverExit != null) __obj.updateDynamic("onRowHoverExit")(js.Any.fromFunction1(onRowHoverExit))
    if (onRowSelection != null) __obj.updateDynamic("onRowSelection")(js.Any.fromFunction1(onRowSelection))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableProps
}

