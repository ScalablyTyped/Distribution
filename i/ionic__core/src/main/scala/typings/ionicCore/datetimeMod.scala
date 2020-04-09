package typings.ionicCore

import typings.ionicCore.componentsMod._Global_.HTMLIonDatetimeElement
import typings.ionicCore.datetimeInterfaceMod.DatetimeChangeEventDetail
import typings.ionicCore.datetimeInterfaceMod.DatetimeOptions
import typings.ionicCore.mod.StyleEventDetail
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/datetime/datetime", JSImport.Namespace)
@js.native
object datetimeMod extends js.Object {
  @js.native
  class Datetime () extends ComponentInterface {
    var buttonEl: js.UndefOr[js.Any] = js.native
    var calcMinMax: js.Any = js.native
    /**
      * The text to display on the picker's cancel button.
      */
    var cancelText: String = js.native
    var datetimeMax: js.Any = js.native
    var datetimeMin: js.Any = js.native
    var datetimeValue: js.Any = js.native
    /**
      * Full day of the week names. This can be used to provide
      * locale names for each day in the week. Defaults to English.
      */
    var dayNames: js.UndefOr[js.Array[String] | String] = js.native
    /**
      * Short abbreviated day of the week names. This can be used to provide
      * locale names for each day in the week. Defaults to English.
      */
    var dayShortNames: js.UndefOr[js.Array[String] | String] = js.native
    /**
      * Values used to create the list of selectable days. By default
      * every day is shown for the given month. However, to control exactly which days of
      * the month to display, the `dayValues` input can take a number, an array of numbers, or
      * a string of comma separated numbers. Note that even if the array days have an invalid
      * number for the selected month, like `31` in February, it will correctly not show
      * days which are not valid for the selected month.
      */
    var dayValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
    /**
      * If `true`, the user cannot interact with the datetime.
      */
    var disabled: Boolean = js.native
    /**
      * The display format of the date and time as text that shows
      * within the item. When the `pickerFormat` input is not used, then the
      * `displayFormat` is used for both display the formatted text, and determining
      * the datetime picker's columns. See the `pickerFormat` input description for
      * more info. Defaults to `MMM D, YYYY`.
      */
    var displayFormat: String = js.native
    /**
      * The timezone to use for display purposes only. See
      * [Date.prototype.toLocaleString()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toLocaleString)
      * for a list of supported timezones. If no value is provided, the
      * component will default to displaying times in the user's local timezone.
      */
    var displayTimezone: js.UndefOr[String] = js.native
    /**
      * The text to display on the picker's "Done" button.
      */
    var doneText: String = js.native
    var el: HTMLIonDatetimeElement = js.native
    var emitStyle: js.Any = js.native
    var generateColumns: js.Any = js.native
    var generatePickerOptions: js.Any = js.native
    var hasValue: js.Any = js.native
    /**
      * Values used to create the list of selectable hours. By default
      * the hour values range from `0` to `23` for 24-hour, or `1` to `12` for 12-hour. However,
      * to control exactly which hours to display, the `hourValues` input can take a number, an
      * array of numbers, or a string of comma separated numbers.
      */
    var hourValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
    var inputId: js.Any = js.native
    /**
      * Emitted when the datetime loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    /**
      * Emitted when the datetime selection was cancelled.
      */
    var ionCancel: EventEmitter[Unit] = js.native
    /**
      * Emitted when the value (selected date) has changed.
      */
    var ionChange: EventEmitter[DatetimeChangeEventDetail] = js.native
    /**
      * Emitted when the datetime has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    var isExpanded: Boolean = js.native
    var locale: js.Any = js.native
    /**
      * The maximum datetime allowed. Value must be a date string
      * following the
      * [ISO 8601 datetime format standard](https://www.w3.org/TR/NOTE-datetime),
      * `1996-12-19`. The format does not have to be specific to an exact
      * datetime. For example, the maximum could just be the year, such as `1994`.
      * Defaults to the end of this year.
      */
    var max: js.UndefOr[String] = js.native
    /**
      * The minimum datetime allowed. Value must be a date string
      * following the
      * [ISO 8601 datetime format standard](https://www.w3.org/TR/NOTE-datetime),
      * such as `1996-12-19`. The format does not have to be specific to an exact
      * datetime. For example, the minimum could just be the year, such as `1994`.
      * Defaults to the beginning of the year, 100 years ago from today.
      */
    var min: js.UndefOr[String] = js.native
    /**
      * Values used to create the list of selectable minutes. By default
      * the minutes range from `0` to `59`. However, to control exactly which minutes to display,
      * the `minuteValues` input can take a number, an array of numbers, or a string of comma
      * separated numbers. For example, if the minute selections should only be every 15 minutes,
      * then this input value would be `minuteValues="0,15,30,45"`.
      */
    var minuteValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
    /**
      * Full names for each month name. This can be used to provide
      * locale month names. Defaults to English.
      */
    var monthNames: js.UndefOr[js.Array[String] | String] = js.native
    /**
      * Short abbreviated names for each month name. This can be used to provide
      * locale month names. Defaults to English.
      */
    var monthShortNames: js.UndefOr[js.Array[String] | String] = js.native
    /**
      * Values used to create the list of selectable months. By default
      * the month values range from `1` to `12`. However, to control exactly which months to
      * display, the `monthValues` input can take a number, an array of numbers, or a string of
      * comma separated numbers. For example, if only summer months should be shown, then this
      * input value would be `monthValues="6,7,8"`. Note that month numbers do *not* have a
      * zero-based index, meaning January's value is `1`, and December's is `12`.
      */
    var monthValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    var onBlur: js.Any = js.native
    var onClick: js.Any = js.native
    var onFocus: js.Any = js.native
    /**
      * The format of the date and time picker columns the user selects.
      * A datetime input can have one or many datetime parts, each getting their
      * own column which allow individual selection of that particular datetime part. For
      * example, year and month columns are two individually selectable columns which help
      * choose an exact date from the datetime picker. Each column follows the string
      * parse format. Defaults to use `displayFormat`.
      */
    var pickerFormat: js.UndefOr[String] = js.native
    /**
      * Any additional options that the picker interface can accept.
      * See the [Picker API docs](../picker) for the picker options.
      */
    var pickerOptions: js.UndefOr[DatetimeOptions] = js.native
    /**
      * The text to display when there's no date selected yet.
      * Using lowercase to match the input attribute
      */
    var placeholder: js.UndefOr[String | Null] = js.native
    /**
      * If `true`, the datetime appears normal but is not interactive.
      */
    var readonly: Boolean = js.native
    var setFocus: js.Any = js.native
    var updateDatetimeValue: js.Any = js.native
    var validateColumn: js.Any = js.native
    var validateColumns: js.Any = js.native
    /**
      * The value of the datetime as a valid ISO 8601 datetime string.
      */
    var value: js.UndefOr[String | Null] = js.native
    /**
      * Values used to create the list of selectable years. By default
      * the year values range between the `min` and `max` datetime inputs. However, to
      * control exactly which years to display, the `yearValues` input can take a number, an array
      * of numbers, or string of comma separated numbers. For example, to show upcoming and
      * recent leap years, then this input's value would be `yearValues="2024,2020,2016,2012,2008"`.
      */
    var yearValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MDatetime(): Unit = js.native
    /* protected */ def disabledChanged(): Unit = js.native
    /**
      * Opens the datetime overlay.
      */
    def open(): js.Promise[Unit] = js.native
    @JSName("render")
    def render_MDatetime(): js.Any = js.native
    /* private */ def text(): js.Any = js.native
    /**
      * Update the datetime value when the value changes
      */
    /* protected */ def valueChanged(): Unit = js.native
  }
  
}

