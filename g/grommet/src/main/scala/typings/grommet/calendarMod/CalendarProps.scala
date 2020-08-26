package typings.grommet.calendarMod

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

@js.native
trait CalendarProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  var animate: js.UndefOr[AnimateType] = js.native
  var bounds: js.UndefOr[js.Array[String]] = js.native
  var date: js.UndefOr[String] = js.native
  var dates: js.UndefOr[js.Array[String | js.Array[String]]] = js.native
  var daysOfWeek: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[js.Array[String | js.Array[String]]] = js.native
  var firstDayOfWeek: js.UndefOr[`0` | `1`] = js.native
  var gridArea: js.UndefOr[GridAreaType] = js.native
  var header: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var locale: js.UndefOr[String] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var onReference: js.UndefOr[js.Function1[/* reference */ String, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* select */ js.Array[String], _]] = js.native
  var range: js.UndefOr[Boolean] = js.native
  var reference: js.UndefOr[String] = js.native
  var showAdjacentDays: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[small | medium | large | String] = js.native
}

object CalendarProps {
  @scala.inline
  def apply(): CalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarProps]
  }
  @scala.inline
  implicit class CalendarPropsOps[Self <: CalendarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    @scala.inline
    def setAlignSelf(value: AlignSelfType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setAnimate(value: AnimateType): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBoundsVarargs(value: String*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: js.Array[String]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDatesVarargs(value: (String | js.Array[String])*): Self = this.set("dates", js.Array(value :_*))
    @scala.inline
    def setDates(value: js.Array[String | js.Array[String]]): Self = this.set("dates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDates: Self = this.set("dates", js.undefined)
    @scala.inline
    def setDaysOfWeek(value: Boolean): Self = this.set("daysOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaysOfWeek: Self = this.set("daysOfWeek", js.undefined)
    @scala.inline
    def setDisabledVarargs(value: (String | js.Array[String])*): Self = this.set("disabled", js.Array(value :_*))
    @scala.inline
    def setDisabled(value: js.Array[String | js.Array[String]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFirstDayOfWeek(value: `0` | `1`): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    @scala.inline
    def setHeader(value: /* repeated */ js.Any => _): Self = this.set("header", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOnReference(value: /* reference */ String => Unit): Self = this.set("onReference", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReference: Self = this.set("onReference", js.undefined)
    @scala.inline
    def setOnSelect(value: /* select */ js.Array[String] => _): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setReference(value: String): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    @scala.inline
    def setShowAdjacentDays(value: Boolean): Self = this.set("showAdjacentDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAdjacentDays: Self = this.set("showAdjacentDays", js.undefined)
    @scala.inline
    def setSize(value: small | medium | large | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

