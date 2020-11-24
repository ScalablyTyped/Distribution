package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.datetimeInterfaceMod.DatetimeChangeEventDetail
import typings.ionicCore.datetimeInterfaceMod.DatetimeOptions
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonDatetime extends js.Object {
  
  /**
    * The text to display on the picker's cancel button.
    */
  var cancelText: js.UndefOr[String] = js.native
  
  /**
    * Full day of the week names. This can be used to provide locale names for each day in the week. Defaults to English.
    */
  var dayNames: js.UndefOr[js.Array[String] | String] = js.native
  
  /**
    * Short abbreviated day of the week names. This can be used to provide locale names for each day in the week. Defaults to English. Defaults to: `['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']`
    */
  var dayShortNames: js.UndefOr[js.Array[String] | String] = js.native
  
  /**
    * Values used to create the list of selectable days. By default every day is shown for the given month. However, to control exactly which days of the month to display, the `dayValues` input can take a number, an array of numbers, or a string of comma separated numbers. Note that even if the array days have an invalid number for the selected month, like `31` in February, it will correctly not show days which are not valid for the selected month.
    */
  var dayValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
  
  /**
    * If `true`, the user cannot interact with the datetime.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The display format of the date and time as text that shows within the item. When the `pickerFormat` input is not used, then the `displayFormat` is used for both display the formatted text, and determining the datetime picker's columns. See the `pickerFormat` input description for more info. Defaults to `MMM D, YYYY`.
    */
  var displayFormat: js.UndefOr[String] = js.native
  
  /**
    * The timezone to use for display purposes only. See [Date.prototype.toLocaleString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toLocaleString) for a list of supported timezones. If no value is provided, the component will default to displaying times in the user's local timezone.
    */
  var displayTimezone: js.UndefOr[String] = js.native
  
  /**
    * The text to display on the picker's "Done" button.
    */
  var doneText: js.UndefOr[String] = js.native
  
  /**
    * Values used to create the list of selectable hours. By default the hour values range from `0` to `23` for 24-hour, or `1` to `12` for 12-hour. However, to control exactly which hours to display, the `hourValues` input can take a number, an array of numbers, or a string of comma separated numbers.
    */
  var hourValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
  
  /**
    * The maximum datetime allowed. Value must be a date string following the [ISO 8601 datetime format standard](https://www.w3.org/TR/NOTE-datetime), `1996-12-19`. The format does not have to be specific to an exact datetime. For example, the maximum could just be the year, such as `1994`. Defaults to the end of this year.
    */
  var max: js.UndefOr[String] = js.native
  
  /**
    * The minimum datetime allowed. Value must be a date string following the [ISO 8601 datetime format standard](https://www.w3.org/TR/NOTE-datetime), such as `1996-12-19`. The format does not have to be specific to an exact datetime. For example, the minimum could just be the year, such as `1994`. Defaults to the beginning of the year, 100 years ago from today.
    */
  var min: js.UndefOr[String] = js.native
  
  /**
    * Values used to create the list of selectable minutes. By default the minutes range from `0` to `59`. However, to control exactly which minutes to display, the `minuteValues` input can take a number, an array of numbers, or a string of comma separated numbers. For example, if the minute selections should only be every 15 minutes, then this input value would be `minuteValues="0,15,30,45"`.
    */
  var minuteValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * Full names for each month name. This can be used to provide locale month names. Defaults to English.
    */
  var monthNames: js.UndefOr[js.Array[String] | String] = js.native
  
  /**
    * Short abbreviated names for each month name. This can be used to provide locale month names. Defaults to English.
    */
  var monthShortNames: js.UndefOr[js.Array[String] | String] = js.native
  
  /**
    * Values used to create the list of selectable months. By default the month values range from `1` to `12`. However, to control exactly which months to display, the `monthValues` input can take a number, an array of numbers, or a string of comma separated numbers. For example, if only summer months should be shown, then this input value would be `monthValues="6,7,8"`. Note that month numbers do *not* have a zero-based index, meaning January's value is `1`, and December's is `12`.
    */
  var monthValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Emitted when the datetime loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * Emitted when the datetime selection was cancelled.
    */
  var onIonCancel: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * Emitted when the value (selected date) has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[DatetimeChangeEventDetail], Unit]] = js.native
  
  /**
    * Emitted when the datetime has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * The format of the date and time picker columns the user selects. A datetime input can have one or many datetime parts, each getting their own column which allow individual selection of that particular datetime part. For example, year and month columns are two individually selectable columns which help choose an exact date from the datetime picker. Each column follows the string parse format. Defaults to use `displayFormat`.
    */
  var pickerFormat: js.UndefOr[String] = js.native
  
  /**
    * Any additional options that the picker interface can accept. See the [Picker API docs](../picker) for the picker options.
    */
  var pickerOptions: js.UndefOr[DatetimeOptions] = js.native
  
  /**
    * The text to display when there's no date selected yet. Using lowercase to match the input attribute
    */
  var placeholder: js.UndefOr[String | Null] = js.native
  
  /**
    * If `true`, the datetime appears normal but is not interactive.
    */
  var readonly: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of the datetime as a valid ISO 8601 datetime string.
    */
  var value: js.UndefOr[String | Null] = js.native
  
  /**
    * Values used to create the list of selectable years. By default the year values range between the `min` and `max` datetime inputs. However, to control exactly which years to display, the `yearValues` input can take a number, an array of numbers, or string of comma separated numbers. For example, to show upcoming and recent leap years, then this input's value would be `yearValues="2024,2020,2016,2012,2008"`.
    */
  var yearValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
}
object IonDatetime {
  
  @scala.inline
  def apply(): IonDatetime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonDatetime]
  }
  
  @scala.inline
  implicit class IonDatetimeOps[Self <: IonDatetime] (val x: Self) extends AnyVal {
    
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
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    
    @scala.inline
    def setDayNamesVarargs(value: String*): Self = this.set("dayNames", js.Array(value :_*))
    
    @scala.inline
    def setDayNames(value: js.Array[String] | String): Self = this.set("dayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayNames: Self = this.set("dayNames", js.undefined)
    
    @scala.inline
    def setDayShortNamesVarargs(value: String*): Self = this.set("dayShortNames", js.Array(value :_*))
    
    @scala.inline
    def setDayShortNames(value: js.Array[String] | String): Self = this.set("dayShortNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayShortNames: Self = this.set("dayShortNames", js.undefined)
    
    @scala.inline
    def setDayValuesVarargs(value: Double*): Self = this.set("dayValues", js.Array(value :_*))
    
    @scala.inline
    def setDayValues(value: js.Array[Double] | Double | String): Self = this.set("dayValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayValues: Self = this.set("dayValues", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisplayFormat(value: String): Self = this.set("displayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayFormat: Self = this.set("displayFormat", js.undefined)
    
    @scala.inline
    def setDisplayTimezone(value: String): Self = this.set("displayTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayTimezone: Self = this.set("displayTimezone", js.undefined)
    
    @scala.inline
    def setDoneText(value: String): Self = this.set("doneText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoneText: Self = this.set("doneText", js.undefined)
    
    @scala.inline
    def setHourValuesVarargs(value: Double*): Self = this.set("hourValues", js.Array(value :_*))
    
    @scala.inline
    def setHourValues(value: js.Array[Double] | Double | String): Self = this.set("hourValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourValues: Self = this.set("hourValues", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinuteValuesVarargs(value: Double*): Self = this.set("minuteValues", js.Array(value :_*))
    
    @scala.inline
    def setMinuteValues(value: js.Array[Double] | Double | String): Self = this.set("minuteValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteValues: Self = this.set("minuteValues", js.undefined)
    
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("monthNames", js.Array(value :_*))
    
    @scala.inline
    def setMonthNames(value: js.Array[String] | String): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthNames: Self = this.set("monthNames", js.undefined)
    
    @scala.inline
    def setMonthShortNamesVarargs(value: String*): Self = this.set("monthShortNames", js.Array(value :_*))
    
    @scala.inline
    def setMonthShortNames(value: js.Array[String] | String): Self = this.set("monthShortNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthShortNames: Self = this.set("monthShortNames", js.undefined)
    
    @scala.inline
    def setMonthValuesVarargs(value: Double*): Self = this.set("monthValues", js.Array(value :_*))
    
    @scala.inline
    def setMonthValues(value: js.Array[Double] | Double | String): Self = this.set("monthValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthValues: Self = this.set("monthValues", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnIonBlur(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonBlur: Self = this.set("onIonBlur", js.undefined)
    
    @scala.inline
    def setOnIonCancel(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonCancel: Self = this.set("onIonCancel", js.undefined)
    
    @scala.inline
    def setOnIonChange(value: /* event */ CustomEvent[DatetimeChangeEventDetail] => Unit): Self = this.set("onIonChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonChange: Self = this.set("onIonChange", js.undefined)
    
    @scala.inline
    def setOnIonFocus(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonFocus: Self = this.set("onIonFocus", js.undefined)
    
    @scala.inline
    def setPickerFormat(value: String): Self = this.set("pickerFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerFormat: Self = this.set("pickerFormat", js.undefined)
    
    @scala.inline
    def setPickerOptions(value: DatetimeOptions): Self = this.set("pickerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerOptions: Self = this.set("pickerOptions", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPlaceholderNull: Self = this.set("placeholder", null)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
    
    @scala.inline
    def setYearValuesVarargs(value: Double*): Self = this.set("yearValues", js.Array(value :_*))
    
    @scala.inline
    def setYearValues(value: js.Array[Double] | Double | String): Self = this.set("yearValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearValues: Self = this.set("yearValues", js.undefined)
  }
}
