package typings.materializeCss.anon

import typings.std.Date
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.DatepickerOptions> */
@js.native
trait PartialDatepickerOptions extends js.Object {
  
  var autoClose: js.UndefOr[Boolean] = js.native
  
  var container: js.UndefOr[Element] = js.native
  
  var defaultDate: js.UndefOr[Date] = js.native
  
  var disableDayFn: js.UndefOr[js.Function1[/* day */ Date, Boolean]] = js.native
  
  var disableWeekends: js.UndefOr[Boolean] = js.native
  
  var events: js.UndefOr[js.Array[String]] = js.native
  
  var firstDay: js.UndefOr[Double] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var i18n: js.UndefOr[
    Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
    ]
  ] = js.native
  
  var isRTL: js.UndefOr[Boolean] = js.native
  
  var maxDate: js.UndefOr[Date] = js.native
  
  var minDate: js.UndefOr[Date] = js.native
  
  var onClose: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
  
  var onDraw: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
  
  var onOpen: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
  
  var onSelect: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* selectedDate */ Date, Unit]] = js.native
  
  var parse: js.UndefOr[js.Function2[/* value */ String, /* format */ String, Date]] = js.native
  
  var setDefaultDate: js.UndefOr[Boolean] = js.native
  
  var showClearBtn: js.UndefOr[Boolean] = js.native
  
  var showDaysInNextAndPreviousMonths: js.UndefOr[Boolean] = js.native
  
  var showMonthAfterYear: js.UndefOr[Boolean] = js.native
  
  var yearRange: js.UndefOr[Double | js.Array[Double]] = js.native
}
object PartialDatepickerOptions {
  
  @scala.inline
  def apply(): PartialDatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDatepickerOptions]
  }
  
  @scala.inline
  implicit class PartialDatepickerOptionsOps[Self <: PartialDatepickerOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    
    @scala.inline
    def setContainer(value: Element): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDefaultDate(value: Date): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    
    @scala.inline
    def setDisableDayFn(value: /* day */ Date => Boolean): Self = this.set("disableDayFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDisableDayFn: Self = this.set("disableDayFn", js.undefined)
    
    @scala.inline
    def setDisableWeekends(value: Boolean): Self = this.set("disableWeekends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableWeekends: Self = this.set("disableWeekends", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFirstDay(value: Double): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDay: Self = this.set("firstDay", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setI18n(
      value: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
        ]
    ): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setOnClose(value: js.ThisFunction0[PartialDatepickerOptions, Unit]): Self = this.set("onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnDraw(value: js.ThisFunction0[PartialDatepickerOptions, Unit]): Self = this.set("onDraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDraw: Self = this.set("onDraw", js.undefined)
    
    @scala.inline
    def setOnOpen(value: js.ThisFunction0[PartialDatepickerOptions, Unit]): Self = this.set("onOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnSelect(value: js.ThisFunction1[PartialDatepickerOptions, /* selectedDate */ Date, Unit]): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setParse(value: (/* value */ String, /* format */ String) => Date): Self = this.set("parse", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    
    @scala.inline
    def setSetDefaultDate(value: Boolean): Self = this.set("setDefaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetDefaultDate: Self = this.set("setDefaultDate", js.undefined)
    
    @scala.inline
    def setShowClearBtn(value: Boolean): Self = this.set("showClearBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClearBtn: Self = this.set("showClearBtn", js.undefined)
    
    @scala.inline
    def setShowDaysInNextAndPreviousMonths(value: Boolean): Self = this.set("showDaysInNextAndPreviousMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDaysInNextAndPreviousMonths: Self = this.set("showDaysInNextAndPreviousMonths", js.undefined)
    
    @scala.inline
    def setShowMonthAfterYear(value: Boolean): Self = this.set("showMonthAfterYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMonthAfterYear: Self = this.set("showMonthAfterYear", js.undefined)
    
    @scala.inline
    def setYearRangeVarargs(value: Double*): Self = this.set("yearRange", js.Array(value :_*))
    
    @scala.inline
    def setYearRange(value: Double | js.Array[Double]): Self = this.set("yearRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearRange: Self = this.set("yearRange", js.undefined)
  }
}
