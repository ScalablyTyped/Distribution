package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.TableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends js.Object {
  var allRowsSelected: js.UndefOr[scala.Boolean] = js.undefined
  var bodyStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var fixedFooter: js.UndefOr[scala.Boolean] = js.undefined
  var fixedHeader: js.UndefOr[scala.Boolean] = js.undefined
  var footerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var headerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var multiSelectable: js.UndefOr[scala.Boolean] = js.undefined
  var onCellClick: js.UndefOr[js.Function2[/* row */ scala.Double, /* column */ scala.Double, scala.Unit]] = js.undefined
  var onCellHover: js.UndefOr[js.Function2[/* row */ scala.Double, /* column */ scala.Double, scala.Unit]] = js.undefined
  var onCellHoverExit: js.UndefOr[js.Function2[/* row */ scala.Double, /* column */ scala.Double, scala.Unit]] = js.undefined
  var onRowHover: js.UndefOr[js.Function1[/* row */ scala.Double, scala.Unit]] = js.undefined
  var onRowHoverExit: js.UndefOr[js.Function1[/* row */ scala.Double, scala.Unit]] = js.undefined
  var onRowSelection: js.UndefOr[
    js.Function1[
      /* selectedRows */ js.Array[scala.Double] | materialDashUiLib.materialDashUiLibStrings.all, 
      scala.Unit
    ]
  ] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var wrapperStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    allRowsSelected: js.UndefOr[scala.Boolean] = js.undefined,
    bodyStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    className: java.lang.String = null,
    fixedFooter: js.UndefOr[scala.Boolean] = js.undefined,
    fixedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    footerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    headerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    height: java.lang.String = null,
    multiSelectable: js.UndefOr[scala.Boolean] = js.undefined,
    onCellClick: (/* row */ scala.Double, /* column */ scala.Double) => scala.Unit = null,
    onCellHover: (/* row */ scala.Double, /* column */ scala.Double) => scala.Unit = null,
    onCellHoverExit: (/* row */ scala.Double, /* column */ scala.Double) => scala.Unit = null,
    onRowHover: /* row */ scala.Double => scala.Unit = null,
    onRowHoverExit: /* row */ scala.Double => scala.Unit = null,
    onRowSelection: /* selectedRows */ js.Array[scala.Double] | materialDashUiLib.materialDashUiLibStrings.all => scala.Unit = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    wrapperStyle: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TableProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allRowsSelected)) __obj.updateDynamic("allRowsSelected")(allRowsSelected)
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (className != null) __obj.updateDynamic("className")(className)
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
    if (style != null) __obj.updateDynamic("style")(style)
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle)
    __obj.asInstanceOf[TableProps]
  }
}

