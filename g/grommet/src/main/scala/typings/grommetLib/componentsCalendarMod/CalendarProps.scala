package typings
package grommetLib.componentsCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var alignSelf: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var bounds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var date: js.UndefOr[java.lang.String] = js.undefined
  var dates: js.UndefOr[js.Array[java.lang.String | js.Array[java.lang.String]]] = js.undefined
  var daysOfWeek: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[js.Array[java.lang.String | js.Array[java.lang.String]]] = js.undefined
  var firstDayOfWeek: js.UndefOr[grommetLib.grommetLibStrings.`0` | grommetLib.grommetLibStrings.`1`] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var header: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
  var onReference: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var range: js.UndefOr[scala.Boolean] = js.undefined
  var reference: js.UndefOr[java.lang.String] = js.undefined
  var showAdjacentDays: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | java.lang.String
  ] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply(
    a11yTitle: java.lang.String = null,
    alignSelf: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    bounds: js.Array[java.lang.String] = null,
    date: java.lang.String = null,
    dates: js.Array[java.lang.String | js.Array[java.lang.String]] = null,
    daysOfWeek: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.Array[java.lang.String | js.Array[java.lang.String]] = null,
    firstDayOfWeek: grommetLib.grommetLibStrings.`0` | grommetLib.grommetLibStrings.`1` = null,
    gridArea: java.lang.String = null,
    header: /* repeated */ js.Any => _ = null,
    locale: java.lang.String = null,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String = null,
    onReference: /* repeated */ js.Any => _ = null,
    onSelect: /* repeated */ js.Any => _ = null,
    range: js.UndefOr[scala.Boolean] = js.undefined,
    reference: java.lang.String = null,
    showAdjacentDays: js.UndefOr[scala.Boolean] = js.undefined,
    size: grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | java.lang.String = null
  ): CalendarProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (date != null) __obj.updateDynamic("date")(date)
    if (dates != null) __obj.updateDynamic("dates")(dates)
    if (!js.isUndefined(daysOfWeek)) __obj.updateDynamic("daysOfWeek")(daysOfWeek)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (header != null) __obj.updateDynamic("header")(js.Any.fromFunction1(header))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onReference != null) __obj.updateDynamic("onReference")(js.Any.fromFunction1(onReference))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (reference != null) __obj.updateDynamic("reference")(reference)
    if (!js.isUndefined(showAdjacentDays)) __obj.updateDynamic("showAdjacentDays")(showAdjacentDays)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps]
  }
}

