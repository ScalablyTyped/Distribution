package typings.materializeDashCss.MNs

import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimepickerOptions extends js.Object {
  /**
    * Automatically close picker when minute is selected.
    * @default false;
    */
  var autoClose: Boolean
  /**
    * Specify a selector for a DOM element to render the calendar in, by default it will be placed before the input.
    */
  var container: String
  /**
    * Default time to set on the timepicker 'now' or '13:14'
    * @default 'now';
    */
  var defaultTime: String
  /**
    * Duration of the transition from/to the hours/minutes view.
    * @default 350
    */
  var duration: Double
  /**
    * Millisecond offset from the defaultTime.
    * @default 0
    */
  var fromNow: Double
  /**
    * Internationalization options
    */
  var i18n: Partial[InternationalizationOptions]
  /**
    * Show the clear button in the Timepicker
    * @default false
    */
  var showClearBtn: Boolean
  /**
    * Use 12 hour AM/PM clock instead of 24 hour clock.
    * @default true
    */
  var twelveHour: Boolean
  /**
    * Vibrate device when dragging clock hand.
    * @default true
    */
  var vibrate: Boolean
  /**
    * Callback function called after modal is closed
    * @default null
    */
  def onCloseEnd(`this`: Modal, el: Element): Unit
  /**
    * Callback function called before modal is closed
    * @default null
    */
  def onCloseStart(`this`: Modal, el: Element): Unit
  /**
    * Callback function called after modal is opened
    * @default null
    */
  def onOpenEnd(`this`: Modal, el: Element): Unit
  /**
    * Callback function called before modal is opened
    * @default null
    */
  def onOpenStart(`this`: Modal, el: Element): Unit
  /**
    * Callback function when a time is selected
    * @default null
    */
  def onSelect(`this`: Modal, hour: Double, minute: Double): Unit
}

object TimepickerOptions {
  @scala.inline
  def apply(
    autoClose: Boolean,
    container: String,
    defaultTime: String,
    duration: Double,
    fromNow: Double,
    i18n: Partial[InternationalizationOptions],
    onCloseEnd: (Modal, Element) => Unit,
    onCloseStart: (Modal, Element) => Unit,
    onOpenEnd: (Modal, Element) => Unit,
    onOpenStart: (Modal, Element) => Unit,
    onSelect: (Modal, Double, Double) => Unit,
    showClearBtn: Boolean,
    twelveHour: Boolean,
    vibrate: Boolean
  ): TimepickerOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose, container = container, defaultTime = defaultTime, duration = duration, fromNow = fromNow, i18n = i18n, onCloseEnd = js.Any.fromFunction2(onCloseEnd), onCloseStart = js.Any.fromFunction2(onCloseStart), onOpenEnd = js.Any.fromFunction2(onOpenEnd), onOpenStart = js.Any.fromFunction2(onOpenStart), onSelect = js.Any.fromFunction3(onSelect), showClearBtn = showClearBtn, twelveHour = twelveHour, vibrate = vibrate)
  
    __obj.asInstanceOf[TimepickerOptions]
  }
}

