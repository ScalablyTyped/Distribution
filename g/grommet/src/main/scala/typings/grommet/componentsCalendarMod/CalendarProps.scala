package typings.grommet.componentsCalendarMod

import typings.grommet.grommetNumbers.`0`
import typings.grommet.grommetNumbers.`1`
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.AnimateType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var animate: js.UndefOr[AnimateType] = js.undefined
  var bounds: js.UndefOr[js.Array[String]] = js.undefined
  var date: js.UndefOr[String] = js.undefined
  var dates: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
  var daysOfWeek: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
  var firstDayOfWeek: js.UndefOr[`0` | `1`] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var header: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var onReference: js.UndefOr[js.Function1[/* reference */ String, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var reference: js.UndefOr[String] = js.undefined
  var showAdjacentDays: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | String] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    bounds: js.Array[String] = null,
    date: String = null,
    dates: js.Array[String | js.Array[String]] = null,
    daysOfWeek: js.UndefOr[Boolean] = js.undefined,
    disabled: js.Array[String | js.Array[String]] = null,
    firstDayOfWeek: `0` | `1` = null,
    gridArea: GridAreaType = null,
    header: /* repeated */ js.Any => _ = null,
    locale: String = null,
    margin: MarginType = null,
    onReference: /* reference */ String => Unit = null,
    onSelect: /* repeated */ js.Any => _ = null,
    range: js.UndefOr[Boolean] = js.undefined,
    reference: String = null,
    showAdjacentDays: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | String = null
  ): CalendarProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf)
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

