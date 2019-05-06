package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonDatetime extends js.Object {
  /**
    * The text to display on the picker's cancel button.
    */
  var cancelText: java.lang.String
  /**
    * Full day of the week names. This can be used to provide locale names for each day in the week. Defaults to English.
    */
  var dayNames: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /**
    * Short abbreviated day of the week names. This can be used to provide locale names for each day in the week. Defaults to English.
    */
  var dayShortNames: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /**
    * Values used to create the list of selectable days. By default every day is shown for the given month. However, to control exactly which days of the month to display, the `dayValues` input can take a number, an array of numbers, or a string of comma separated numbers. Note that even if the array days have an invalid number for the selected month, like `31` in February, it will correctly not show days which are not valid for the selected month.
    */
  var dayValues: js.UndefOr[js.Array[scala.Double] | scala.Double | java.lang.String] = js.undefined
  /**
    * If `true`, the user cannot interact with the datetime.
    */
  var disabled: scala.Boolean
  /**
    * The display format of the date and time as text that shows within the item. When the `pickerFormat` input is not used, then the `displayFormat` is used for both display the formatted text, and determining the datetime picker's columns. See the `pickerFormat` input description for more info. Defaults to `MMM D, YYYY`.
    */
  var displayFormat: java.lang.String
  /**
    * The text to display on the picker's "Done" button.
    */
  var doneText: java.lang.String
  /**
    * Values used to create the list of selectable hours. By default the hour values range from `0` to `23` for 24-hour, or `1` to `12` for 12-hour. However, to control exactly which hours to display, the `hourValues` input can take a number, an array of numbers, or a string of comma separated numbers.
    */
  var hourValues: js.UndefOr[js.Array[scala.Double] | scala.Double | java.lang.String] = js.undefined
  /**
    * The maximum datetime allowed. Value must be a date string following the [ISO 8601 datetime format standard](https://www.w3.org/TR/NOTE-datetime), `1996-12-19`. The format does not have to be specific to an exact datetime. For example, the maximum could just be the year, such as `1994`. Defaults to the end of this year.
    */
  var max: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The minimum datetime allowed. Value must be a date string following the [ISO 8601 datetime format standard](https://www.w3.org/TR/NOTE-datetime), such as `1996-12-19`. The format does not have to be specific to an exact datetime. For example, the minimum could just be the year, such as `1994`. Defaults to the beginning of the year, 100 years ago from today.
    */
  var min: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Values used to create the list of selectable minutes. By default the minutes range from `0` to `59`. However, to control exactly which minutes to display, the `minuteValues` input can take a number, an array of numbers, or a string of comma separated numbers. For example, if the minute selections should only be every 15 minutes, then this input value would be `minuteValues="0,15,30,45"`.
    */
  var minuteValues: js.UndefOr[js.Array[scala.Double] | scala.Double | java.lang.String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * Full names for each month name. This can be used to provide locale month names. Defaults to English.
    */
  var monthNames: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /**
    * Short abbreviated names for each month name. This can be used to provide locale month names. Defaults to English.
    */
  var monthShortNames: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /**
    * Values used to create the list of selectable months. By default the month values range from `1` to `12`. However, to control exactly which months to display, the `monthValues` input can take a number, an array of numbers, or a string of comma separated numbers. For example, if only summer months should be shown, then this input value would be `monthValues="6,7,8"`. Note that month numbers do *not* have a zero-based index, meaning January's value is `1`, and December's is `12`.
    */
  var monthValues: js.UndefOr[js.Array[scala.Double] | scala.Double | java.lang.String] = js.undefined
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: java.lang.String
  /**
    * The format of the date and time picker columns the user selects. A datetime input can have one or many datetime parts, each getting their own column which allow individual selection of that particular datetime part. For example, year and month columns are two individually selectable columns which help choose an exact date from the datetime picker. Each column follows the string parse format. Defaults to use `displayFormat`.
    */
  var pickerFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Any additional options that the picker interface can accept. See the [Picker API docs](../picker) for the picker options.
    */
  var pickerOptions: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DatetimeOptions */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DatetimeOptions */ js.Any
  ] = js.undefined
  /**
    * The text to display when there's no date selected yet. Using lowercase to match the input attribute
    */
  var placeholder: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * If `true`, the datetime appears normal but is not interactive.
    */
  var readonly: scala.Boolean
  /**
    * The value of the datetime as a valid ISO 8601 datetime string.
    */
  var value: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Values used to create the list of selectable years. By default the year values range between the `min` and `max` datetime inputs. However, to control exactly which years to display, the `yearValues` input can take a number, an array of numbers, or string of comma separated numbers. For example, to show upcoming and recent leap years, then this input's value would be `yearValues="2024,2020,2016,2012,2008"`.
    */
  var yearValues: js.UndefOr[js.Array[scala.Double] | scala.Double | java.lang.String] = js.undefined
  /**
    * Opens the datetime overlay.
    */
  def open(): js.Promise[scala.Unit]
}

object IonDatetime {
  @scala.inline
  def apply(
    cancelText: java.lang.String,
    disabled: scala.Boolean,
    displayFormat: java.lang.String,
    doneText: java.lang.String,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    name: java.lang.String,
    open: () => js.Promise[scala.Unit],
    readonly: scala.Boolean,
    dayNames: js.Array[java.lang.String] | java.lang.String = null,
    dayShortNames: js.Array[java.lang.String] | java.lang.String = null,
    dayValues: js.Array[scala.Double] | scala.Double | java.lang.String = null,
    hourValues: js.Array[scala.Double] | scala.Double | java.lang.String = null,
    max: java.lang.String = null,
    min: java.lang.String = null,
    minuteValues: js.Array[scala.Double] | scala.Double | java.lang.String = null,
    monthNames: js.Array[java.lang.String] | java.lang.String = null,
    monthShortNames: js.Array[java.lang.String] | java.lang.String = null,
    monthValues: js.Array[scala.Double] | scala.Double | java.lang.String = null,
    pickerFormat: java.lang.String = null,
    pickerOptions: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DatetimeOptions */ js.Any = null,
    placeholder: java.lang.String = null,
    value: java.lang.String = null,
    yearValues: js.Array[scala.Double] | scala.Double | java.lang.String = null
  ): IonDatetime = {
    val __obj = js.Dynamic.literal(cancelText = cancelText, disabled = disabled, displayFormat = displayFormat, doneText = doneText, mode = mode, name = name, open = js.Any.fromFunction0(open), readonly = readonly)
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames.asInstanceOf[js.Any])
    if (dayShortNames != null) __obj.updateDynamic("dayShortNames")(dayShortNames.asInstanceOf[js.Any])
    if (dayValues != null) __obj.updateDynamic("dayValues")(dayValues.asInstanceOf[js.Any])
    if (hourValues != null) __obj.updateDynamic("hourValues")(hourValues.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (minuteValues != null) __obj.updateDynamic("minuteValues")(minuteValues.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (monthShortNames != null) __obj.updateDynamic("monthShortNames")(monthShortNames.asInstanceOf[js.Any])
    if (monthValues != null) __obj.updateDynamic("monthValues")(monthValues.asInstanceOf[js.Any])
    if (pickerFormat != null) __obj.updateDynamic("pickerFormat")(pickerFormat)
    if (pickerOptions != null) __obj.updateDynamic("pickerOptions")(pickerOptions)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (value != null) __obj.updateDynamic("value")(value)
    if (yearValues != null) __obj.updateDynamic("yearValues")(yearValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonDatetime]
  }
}

