package typings.jqueryui

import typings.jquery.JQueryEventObject
import typings.jqueryui.JQueryUI.AccordionOptions
import typings.jqueryui.JQueryUI.AutocompleteOptions
import typings.jqueryui.JQueryUI.ButtonOptions
import typings.jqueryui.JQueryUI.DatepickerOptions
import typings.jqueryui.JQueryUI.DialogOptions
import typings.jqueryui.JQueryUI.DraggableOptions
import typings.jqueryui.JQueryUI.DroppableOptions
import typings.jqueryui.JQueryUI.JQueryPositionOptions
import typings.jqueryui.JQueryUI.MenuOptions
import typings.jqueryui.JQueryUI.ProgressbarOptions
import typings.jqueryui.JQueryUI.ResizableOptions
import typings.jqueryui.JQueryUI.SelectMenuOptions
import typings.jqueryui.JQueryUI.SelectableOptions
import typings.jqueryui.JQueryUI.SliderOptions
import typings.jqueryui.JQueryUI.SortableOptions
import typings.jqueryui.JQueryUI.SpinnerOptions
import typings.jqueryui.JQueryUI.TabsOptions
import typings.jqueryui.JQueryUI.TooltipOptions
import typings.jqueryui.JQueryUI.Widget
import typings.jqueryui.JQueryUI.WidgetCommonProperties
import typings.jqueryui.JQueryUI.WidgetOptions
import typings.jqueryui.anon.Attribute
import typings.jqueryui.anon.Call
import typings.jqueryui.anon.Expression
import typings.std.Element
import typings.std.MouseEvent
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def accordion(): JQuery = js.native
  @JSName("accordion")
  @scala.annotation.targetName("accordion_refresh")
  def accordion(methodName: "refresh"): Unit = js.native
  @JSName("accordion")
  @scala.annotation.targetName("accordion_disable")
  def accordion(methodName: "disable"): Unit = js.native
  @JSName("accordion")
  @scala.annotation.targetName("accordion_enable")
  def accordion(methodName: "enable"): Unit = js.native
  @JSName("accordion")
  @scala.annotation.targetName("accordion_destroy")
  def accordion(methodName: "destroy"): Unit = js.native
  @JSName("accordion")
  @scala.annotation.targetName("accordion_widget")
  def accordion(methodName: "widget"): JQuery = js.native
  def accordion(methodName: String): JQuery = js.native
  def accordion(optionLiteral: String, optionName: String): Any = js.native
  def accordion(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def accordion(optionLiteral: String, options: AccordionOptions): Any = js.native
  def accordion(options: AccordionOptions): JQuery = js.native
  
  def addClass(classNames: String): this.type = js.native
  def addClass(classNames: String, speed: String): this.type = js.native
  def addClass(classNames: String, speed: String, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: String, easing: String): this.type = js.native
  def addClass(classNames: String, speed: String, easing: String, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: String, easing: Unit, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: Double): this.type = js.native
  def addClass(classNames: String, speed: Double, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: Double, easing: String): this.type = js.native
  def addClass(classNames: String, speed: Double, easing: String, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: Double, easing: Unit, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: Unit, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: Unit, easing: String): this.type = js.native
  def addClass(classNames: String, speed: Unit, easing: String, callback: js.Function): this.type = js.native
  def addClass(classNames: String, speed: Unit, easing: Unit, callback: js.Function): this.type = js.native
  
  def autocomplete(): JQuery = js.native
  @JSName("autocomplete")
  @scala.annotation.targetName("autocomplete_close")
  def autocomplete(methodName: "close"): Unit = js.native
  @JSName("autocomplete")
  @scala.annotation.targetName("autocomplete_enable")
  def autocomplete(methodName: "enable"): Unit = js.native
  @JSName("autocomplete")
  @scala.annotation.targetName("autocomplete_search")
  def autocomplete(methodName: "search"): Unit = js.native
  @JSName("autocomplete")
  @scala.annotation.targetName("autocomplete_disable")
  def autocomplete(methodName: "disable"): Unit = js.native
  @JSName("autocomplete")
  @scala.annotation.targetName("autocomplete_widget")
  def autocomplete(methodName: "widget"): JQuery = js.native
  @JSName("autocomplete")
  @scala.annotation.targetName("autocomplete_destroy")
  def autocomplete(methodName: "destroy"): Unit = js.native
  @JSName("autocomplete")
  @scala.annotation.targetName("autocomplete_search")
  def autocomplete(methodName: "search", value: String): Unit = js.native
  def autocomplete(methodName: String): JQuery = js.native
  def autocomplete(optionLiteral: String, optionName: String): Any = js.native
  def autocomplete(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def autocomplete(optionLiteral: String, options: AutocompleteOptions): Any = js.native
  def autocomplete(options: AutocompleteOptions): JQuery = js.native
  
  def button(): JQuery = js.native
  @JSName("button")
  @scala.annotation.targetName("button_enable")
  def button(methodName: "enable"): Unit = js.native
  @JSName("button")
  @scala.annotation.targetName("button_destroy")
  def button(methodName: "destroy"): Unit = js.native
  @JSName("button")
  @scala.annotation.targetName("button_disable")
  def button(methodName: "disable"): Unit = js.native
  @JSName("button")
  @scala.annotation.targetName("button_widget")
  def button(methodName: "widget"): JQuery = js.native
  @JSName("button")
  @scala.annotation.targetName("button_refresh")
  def button(methodName: "refresh"): Unit = js.native
  def button(methodName: String): JQuery = js.native
  def button(optionLiteral: String, optionName: String): Any = js.native
  def button(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def button(optionLiteral: String, options: ButtonOptions): Any = js.native
  def button(options: ButtonOptions): JQuery = js.native
  
  def buttonset(): JQuery = js.native
  @JSName("buttonset")
  @scala.annotation.targetName("buttonset_disable")
  def buttonset(methodName: "disable"): Unit = js.native
  @JSName("buttonset")
  @scala.annotation.targetName("buttonset_enable")
  def buttonset(methodName: "enable"): Unit = js.native
  @JSName("buttonset")
  @scala.annotation.targetName("buttonset_destroy")
  def buttonset(methodName: "destroy"): Unit = js.native
  @JSName("buttonset")
  @scala.annotation.targetName("buttonset_widget")
  def buttonset(methodName: "widget"): JQuery = js.native
  @JSName("buttonset")
  @scala.annotation.targetName("buttonset_refresh")
  def buttonset(methodName: "refresh"): Unit = js.native
  def buttonset(methodName: String): JQuery = js.native
  def buttonset(optionLiteral: String, optionName: String): Any = js.native
  def buttonset(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def buttonset(optionLiteral: String, options: ButtonOptions): Any = js.native
  def buttonset(options: ButtonOptions): JQuery = js.native
  
  /**
    * Initialize a datepicker
    */
  def datepicker(): JQuery = js.native
  /**
    * Redraw the date picker, after having made some external modifications.
    *
    * @param methodName 'refresh'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_refresh")
  def datepicker(methodName: "refresh"): JQuery = js.native
  /**
    * Open the date picker. If the datepicker is attached to an input, the input must be visible for the datepicker to be shown.
    *
    * @param methodName 'show'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_show")
  def datepicker(methodName: "show"): JQuery = js.native
  /**
    * Close a previously opened date picker.
    *
    * @param methodName 'hide'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_hide")
  def datepicker(methodName: "hide"): JQuery = js.native
  /**
    * Returns a jQuery object containing the datepicker.
    *
    * @param methodName 'widget'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_widget")
  def datepicker(methodName: "widget"): JQuery = js.native
  /**
    * Determine whether a date picker has been disabled.
    *
    * @param methodName 'isDisabled'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_isDisabled")
  def datepicker(methodName: "isDisabled"): Boolean = js.native
  /**
    * Returns the current date for the datepicker or null if no date has been selected.
    *
    * @param methodName 'getDate'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_getDate")
  def datepicker(methodName: "getDate"): js.Date = js.native
  /**
    * Removes the datepicker functionality completely. This will return the element back to its pre-init state.
    *
    * @param methodName 'destroy'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_destroy")
  def datepicker(methodName: "destroy"): JQuery = js.native
  /**
    * Opens the datepicker in a dialog box.
    *
    * @param methodName 'dialog'
    * @param date The initial date.
    * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
    * @param settings The new settings for the date picker.
    * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: String): JQuery = js.native
  /**
    * Sets the date for the datepicker. The new date may be a Date object or a string in the current date format (e.g., "01/26/2009"), a number of days from today (e.g., +7) or a string of values and periods ("y" for years, "m" for months, "w" for weeks, "d" for days, e.g., "+1m +7d"), or null to clear the selected date.
    *
    * @param methodName 'setDate'
    * @param date The new date.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_setDate")
  def datepicker(methodName: "setDate", date: String): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: String, onSelect: js.Function0[Unit]): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(
    methodName: "dialog",
    date: String,
    onSelect: js.Function0[Unit],
    settings: Unit,
    pos: js.Array[Double]
  ): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: String, onSelect: js.Function0[Unit], settings: Unit, pos: MouseEvent): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: String, onSelect: js.Function0[Unit], settings: DatepickerOptions): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(
    methodName: "dialog",
    date: String,
    onSelect: js.Function0[Unit],
    settings: DatepickerOptions,
    pos: js.Array[Double]
  ): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(
    methodName: "dialog",
    date: String,
    onSelect: js.Function0[Unit],
    settings: DatepickerOptions,
    pos: MouseEvent
  ): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: String, onSelect: Unit, settings: Unit, pos: js.Array[Double]): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: String, onSelect: Unit, settings: Unit, pos: MouseEvent): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: String, onSelect: Unit, settings: DatepickerOptions): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(
    methodName: "dialog",
    date: String,
    onSelect: Unit,
    settings: DatepickerOptions,
    pos: js.Array[Double]
  ): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: String, onSelect: Unit, settings: DatepickerOptions, pos: MouseEvent): JQuery = js.native
  /**
    * Sets the date for the datepicker. The new date may be a Date object or a string in the current date format (e.g., "01/26/2009"), a number of days from today (e.g., +7) or a string of values and periods ("y" for years, "m" for months, "w" for weeks, "d" for days, e.g., "+1m +7d"), or null to clear the selected date.
    *
    * @param methodName 'setDate'
    * @param date The new date.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_setDate")
  def datepicker(methodName: "setDate", date: js.Date): JQuery = js.native
  /**
    * Opens the datepicker in a dialog box.
    *
    * @param methodName 'dialog'
    * @param date The initial date.
    * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
    * @param settings The new settings for the date picker.
    * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: js.Date): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: js.Date, onSelect: js.Function0[Unit]): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(
    methodName: "dialog",
    date: js.Date,
    onSelect: js.Function0[Unit],
    settings: Unit,
    pos: js.Array[Double]
  ): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: js.Date, onSelect: js.Function0[Unit], settings: Unit, pos: MouseEvent): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: js.Date, onSelect: js.Function0[Unit], settings: DatepickerOptions): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(
    methodName: "dialog",
    date: js.Date,
    onSelect: js.Function0[Unit],
    settings: DatepickerOptions,
    pos: js.Array[Double]
  ): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(
    methodName: "dialog",
    date: js.Date,
    onSelect: js.Function0[Unit],
    settings: DatepickerOptions,
    pos: MouseEvent
  ): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: js.Date, onSelect: Unit, settings: Unit, pos: js.Array[Double]): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: js.Date, onSelect: Unit, settings: Unit, pos: MouseEvent): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: js.Date, onSelect: Unit, settings: DatepickerOptions): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(
    methodName: "dialog",
    date: js.Date,
    onSelect: Unit,
    settings: DatepickerOptions,
    pos: js.Array[Double]
  ): JQuery = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_dialog")
  def datepicker(methodName: "dialog", date: js.Date, onSelect: Unit, settings: DatepickerOptions, pos: MouseEvent): JQuery = js.native
  /**
    * Get the altFormat option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'altFormat'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_altFormat")
  def datepicker(methodName: "option", optionName: "altFormat"): String = js.native
  /**
    * Get the beforeShow option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'beforeShowDay'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_beforeShowDay")
  def datepicker(methodName: "option", optionName: "beforeShowDay"): js.Function1[/* date */ js.Date, js.Array[Any]] = js.native
  /**
    * Get the defaultDate option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'defaultDate'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_defaultDate")
  def datepicker(methodName: "option", optionName: "defaultDate"): Any = js.native
  /**
    * Get the dayNamesShort option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dayNamesShort'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_dayNamesShort")
  def datepicker(methodName: "option", optionName: "dayNamesShort"): js.Array[String] = js.native
  /**
    * Get the firstDay option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'firstDay'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_firstDay")
  def datepicker(methodName: "option", optionName: "firstDay"): Double = js.native
  /**
    * Get the duration option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'duration'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_duration")
  def datepicker(methodName: "option", optionName: "duration"): String = js.native
  /**
    * Get the changeYear option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'changeYear'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_changeYear")
  def datepicker(methodName: "option", optionName: "changeYear"): Boolean = js.native
  /**
    * Get the beforeShow option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'beforeShow'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_beforeShow")
  def datepicker(methodName: "option", optionName: "beforeShow"): js.Function2[/* input */ Element, /* inst */ Any, DatepickerOptions] = js.native
  /**
    * Get the endDate after initialization
    *
    * @param methodName 'option'
    * @param optionName 'endDate'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_endDate")
  def datepicker(methodName: "option", optionName: "endDate"): js.Date = js.native
  /**
    * Get the buttonImage option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'buttonImage'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_buttonImage")
  def datepicker(methodName: "option", optionName: "buttonImage"): String = js.native
  /**
    * Get the gotoCurrent option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'gotoCurrent'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_gotoCurrent")
  def datepicker(methodName: "option", optionName: "gotoCurrent"): Boolean = js.native
  /**
    * Get the changeMonth option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'changeMonth'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_changeMonth")
  def datepicker(methodName: "option", optionName: "changeMonth"): Boolean = js.native
  /**
    * Get the buttonImageOnly option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'buttonImageOnly'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_buttonImageOnly")
  def datepicker(methodName: "option", optionName: "buttonImageOnly"): Boolean = js.native
  /**
    * Get the autohide option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'autohide'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_autohide")
  def datepicker(methodName: "option", optionName: "autohide"): Boolean = js.native
  /**
    * Get the dateFormat option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dateFormat'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_dateFormat")
  def datepicker(methodName: "option", optionName: "dateFormat"): String = js.native
  /**
    * Get the currentText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'currentText'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_currentText")
  def datepicker(methodName: "option", optionName: "currentText"): String = js.native
  /**
    * Get the closeText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'closeText'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_closeText")
  def datepicker(methodName: "option", optionName: "closeText"): String = js.native
  /**
    * Get the autoSize option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'autoSize'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_autoSize")
  def datepicker(methodName: "option", optionName: "autoSize"): Boolean = js.native
  /**
    * Get the constrainInput option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'constrainInput'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_constrainInput")
  def datepicker(methodName: "option", optionName: "constrainInput"): Boolean = js.native
  /**
    * Get the dayNames option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dayNames'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_dayNames")
  def datepicker(methodName: "option", optionName: "dayNames"): js.Array[String] = js.native
  /**
    * Get the calculateWeek option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'calculateWeek'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_calculateWeek")
  def datepicker(methodName: "option", optionName: "calculateWeek"): js.Function1[/* date */ js.Date, String] = js.native
  /**
    * Get the appendText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'appendText'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_appendText")
  def datepicker(methodName: "option", optionName: "appendText"): String = js.native
  /**
    * Get the dayNamesMin option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dayNamesMin'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_dayNamesMin")
  def datepicker(methodName: "option", optionName: "dayNamesMin"): js.Array[String] = js.native
  /**
    * Get the altField option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'altField'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_altField")
  def datepicker(methodName: "option", optionName: "altField"): Any = js.native
  /**
    * Get the buttonText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'buttonText'
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_buttonText")
  def datepicker(methodName: "option", optionName: "buttonText"): String = js.native
  /**
    * Set the altField option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'altField'
    * @param altFieldValue An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_altField")
  def datepicker(methodName: "option", optionName: "altField", altFieldValue: String): JQuery = js.native
  /**
    * Set the altField option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'altField'
    * @param altFieldValue An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_altField")
  def datepicker(methodName: "option", optionName: "altField", altFieldValue: JQuery): JQuery = js.native
  /**
    * Set the altField option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'altField'
    * @param altFieldValue An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_altField")
  def datepicker(methodName: "option", optionName: "altField", altFieldValue: Element): JQuery = js.native
  /**
    * Set the altFormat option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'altFormat'
    * @param altFormatValue The dateFormat to be used for the altField option. This allows one date format to be shown to the user for selection purposes, while a different format is actually sent behind the scenes. For a full list of the possible formats see the formatDate function
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_altFormat")
  def datepicker(methodName: "option", optionName: "altFormat", altFormatValue: String): JQuery = js.native
  /**
    * Set the appendText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'appendText'
    * @param appendTextValue The text to display after each date field, e.g., to show the required format.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_appendText")
  def datepicker(methodName: "option", optionName: "appendText", appendTextValue: String): JQuery = js.native
  /**
    * Set the autoSize option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'autoSize'
    * @param autoSizeValue Set to true to automatically resize the input field to accommodate dates in the current dateFormat.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_autoSize")
  def datepicker(methodName: "option", optionName: "autoSize", autoSizeValue: Boolean): JQuery = js.native
  /**
    * Set the beforeShow option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'beforeShowDay'
    * @param beforeShowDayValue A function that takes a date as a parameter and must return an array with:
    * [0]: true/false indicating whether or not this date is selectable
    * [1]: a CSS class name to add to the date's cell or "" for the default presentation
    * [2]: an optional popup tooltip for this date
    * The function is called for each day in the datepicker before it is displayed.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_beforeShowDay")
  def datepicker(
    methodName: "option",
    optionName: "beforeShowDay",
    beforeShowDayValue: js.Function1[/* date */ js.Date, js.Array[Any]]
  ): JQuery = js.native
  /**
    * Set the beforeShow option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'beforeShow'
    * @param beforeShowValue A function that takes an input field and current datepicker instance and returns an options object to update the datepicker with. It is called just before the datepicker is displayed.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_beforeShow")
  def datepicker(
    methodName: "option",
    optionName: "beforeShow",
    beforeShowValue: js.Function2[/* input */ Element, /* inst */ Any, DatepickerOptions]
  ): JQuery = js.native
  /**
    * Set the buttonImageOnly option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'buttonImageOnly'
    * @param buttonImageOnlyValue Whether the button image should be rendered by itself instead of inside a button element. This option is only relevant if the buttonImage option has also been set.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_buttonImageOnly")
  def datepicker(methodName: "option", optionName: "buttonImageOnly", buttonImageOnlyValue: Boolean): JQuery = js.native
  /**
    * Set the buttonImage option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'buttonImage'
    * @param buttonImageValue A URL of an image to use to display the datepicker when the showOn option is set to "button" or "both". If set, the buttonText option becomes the alt value and is not directly displayed.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_buttonImage")
  def datepicker(methodName: "option", optionName: "buttonImage", buttonImageValue: String): JQuery = js.native
  /**
    * Set the buttonText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'buttonText'
    * @param buttonTextValue The text to display on the trigger button. Use in conjunction with the showOn option set to "button" or "both".
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_buttonText")
  def datepicker(methodName: "option", optionName: "buttonText", buttonTextValue: String): JQuery = js.native
  /**
    * Set the calculateWeek option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'calculateWeek'
    * @param calculateWeekValue A function to calculate the week of the year for a given date. The default implementation uses the ISO 8601 definition: weeks start on a Monday; the first week of the year contains the first Thursday of the year.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_calculateWeek")
  def datepicker(
    methodName: "option",
    optionName: "calculateWeek",
    calculateWeekValue: js.Function1[/* date */ js.Date, String]
  ): JQuery = js.native
  /**
    * Set the changeMonth option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'changeMonth'
    * @param changeMonthValue Whether the month should be rendered as a dropdown instead of text.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_changeMonth")
  def datepicker(methodName: "option", optionName: "changeMonth", changeMonthValue: Boolean): JQuery = js.native
  /**
    * Set the changeYear option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'changeYear'
    * @param changeYearValue Whether the year should be rendered as a dropdown instead of text. Use the yearRange option to control which years are made available for selection.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_changeYear")
  def datepicker(methodName: "option", optionName: "changeYear", changeYearValue: Boolean): JQuery = js.native
  /**
    * Set the closeText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'closeText'
    * @param closeTextValue The text to display for the close link. Use the showButtonPanel option to display this button.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_closeText")
  def datepicker(methodName: "option", optionName: "closeText", closeTextValue: String): JQuery = js.native
  /**
    * Set the constrainInput option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'constrainInput'
    * @param constrainInputValue When true, entry in the input field is constrained to those characters allowed by the current dateFormat option.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_constrainInput")
  def datepicker(methodName: "option", optionName: "constrainInput", constrainInputValue: Boolean): JQuery = js.native
  /**
    * Set the currentText option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'currentText'
    * @param currentTextValue The text to display for the current day link. Use the showButtonPanel option to display this button.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_currentText")
  def datepicker(methodName: "option", optionName: "currentText", currentTextValue: String): JQuery = js.native
  /**
    * Set the dateFormat option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dateFormat'
    * @param dateFormatValue The format for parsed and displayed dates. For a full list of the possible formats see the formatDate function.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_dateFormat")
  def datepicker(methodName: "option", optionName: "dateFormat", dateFormatValue: String): JQuery = js.native
  /**
    * Set the dayNamesMin option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dayNamesMin'
    * @param dayNamesMinValue The list of minimised day names, starting from Sunday, for use as column headers within the datepicker.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_dayNamesMin")
  def datepicker(methodName: "option", optionName: "dayNamesMin", dayNamesMinValue: js.Array[String]): JQuery = js.native
  /**
    * Set the dayNamesShort option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dayNamesShort'
    * @param dayNamesShortValue The list of abbreviated day names, starting from Sunday, for use as requested via the dateFormat option.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_dayNamesShort")
  def datepicker(methodName: "option", optionName: "dayNamesShort", dayNamesShortValue: js.Array[String]): JQuery = js.native
  /**
    * Set the dayNames option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'dayNames'
    * @param dayNamesValue The list of long day names, starting from Sunday, for use as requested via the dateFormat option.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_dayNames")
  def datepicker(methodName: "option", optionName: "dayNames", dayNamesValue: js.Array[String]): JQuery = js.native
  /**
    * Set the defaultDate option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'defaultDate'
    * @param defaultDateValue A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_defaultDate")
  def datepicker(methodName: "option", optionName: "defaultDate", defaultDateValue: String): JQuery = js.native
  /**
    * Set the defaultDate option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'defaultDate'
    * @param defaultDateValue A date object containing the default date.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_defaultDate")
  def datepicker(methodName: "option", optionName: "defaultDate", defaultDateValue: js.Date): JQuery = js.native
  /**
    * Set the defaultDate option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'defaultDate'
    * @param defaultDateValue A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_defaultDate")
  def datepicker(methodName: "option", optionName: "defaultDate", defaultDateValue: Double): JQuery = js.native
  /**
    * Set the duration option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'duration'
    * @param durationValue Control the speed at which the datepicker appears, it may be a time in milliseconds or a string representing one of the three predefined speeds ("slow", "normal", "fast").
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_duration")
  def datepicker(methodName: "option", optionName: "duration", durationValue: String): JQuery = js.native
  /**
    * Set the firstDay option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'firstDay'
    * @param firstDayValue Set the first day of the week: Sunday is 0, Monday is 1, etc.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_firstDay")
  def datepicker(methodName: "option", optionName: "firstDay", firstDayValue: Double): JQuery = js.native
  /**
    * Set the gotoCurrent option, after initialization
    *
    * @param methodName 'option'
    * @param optionName 'gotoCurrent'
    * @param gotoCurrentValue When true, the current day link moves to the currently selected date instead of today.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option_gotoCurrent")
  def datepicker(methodName: "option", optionName: "gotoCurrent", gotoCurrentValue: Boolean): JQuery = js.native
  /**
    * Gets the value currently associated with the specified optionName.
    *
    * @param methodName 'option'
    * @param optionName The name of the option to get.
    */
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option")
  def datepicker(methodName: "option", optionName: String): Any = js.native
  @JSName("datepicker")
  @scala.annotation.targetName("datepicker_option")
  def datepicker(methodName: "option", optionName: String, otherParams: Any*): Any = js.native
  // Used for getting and setting options
  def datepicker(methodName: String, otherParams: Any*): Any = js.native
  /**
    * Initialize a datepicker with the given options
    */
  def datepicker(options: DatepickerOptions): JQuery = js.native
  
  def dialog(): JQuery = js.native
  @JSName("dialog")
  @scala.annotation.targetName("dialog_isOpen")
  def dialog(methodName: "isOpen"): Boolean = js.native
  @JSName("dialog")
  @scala.annotation.targetName("dialog_widget")
  def dialog(methodName: "widget"): JQuery = js.native
  @JSName("dialog")
  @scala.annotation.targetName("dialog_moveToTop")
  def dialog(methodName: "moveToTop"): JQuery = js.native
  @JSName("dialog")
  @scala.annotation.targetName("dialog_destroy")
  def dialog(methodName: "destroy"): JQuery = js.native
  @JSName("dialog")
  @scala.annotation.targetName("dialog_open")
  def dialog(methodName: "open"): JQuery = js.native
  @JSName("dialog")
  @scala.annotation.targetName("dialog_close")
  def dialog(methodName: "close"): JQuery = js.native
  def dialog(methodName: String): JQuery = js.native
  def dialog(optionLiteral: String, optionName: String): Any = js.native
  def dialog(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def dialog(optionLiteral: String, options: DialogOptions): Any = js.native
  def dialog(options: DialogOptions): JQuery = js.native
  
  def disableSelection(): JQuery = js.native
  
  def draggable(): JQuery = js.native
  @JSName("draggable")
  @scala.annotation.targetName("draggable_disable")
  def draggable(methodName: "disable"): Unit = js.native
  @JSName("draggable")
  @scala.annotation.targetName("draggable_enable")
  def draggable(methodName: "enable"): Unit = js.native
  @JSName("draggable")
  @scala.annotation.targetName("draggable_destroy")
  def draggable(methodName: "destroy"): Unit = js.native
  @JSName("draggable")
  @scala.annotation.targetName("draggable_widget")
  def draggable(methodName: "widget"): JQuery = js.native
  def draggable(methodName: String): JQuery = js.native
  def draggable(optionLiteral: String, optionName: String): Any = js.native
  def draggable(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def draggable(optionLiteral: String, options: DraggableOptions): Any = js.native
  def draggable(options: DraggableOptions): JQuery = js.native
  
  def droppable(): JQuery = js.native
  @JSName("droppable")
  @scala.annotation.targetName("droppable_widget")
  def droppable(methodName: "widget"): JQuery = js.native
  @JSName("droppable")
  @scala.annotation.targetName("droppable_enable")
  def droppable(methodName: "enable"): Unit = js.native
  @JSName("droppable")
  @scala.annotation.targetName("droppable_disable")
  def droppable(methodName: "disable"): Unit = js.native
  @JSName("droppable")
  @scala.annotation.targetName("droppable_destroy")
  def droppable(methodName: "destroy"): Unit = js.native
  def droppable(methodName: String): JQuery = js.native
  def droppable(optionLiteral: String, optionName: String): Any = js.native
  def droppable(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def droppable(optionLiteral: String, options: DraggableOptions): Any = js.native
  def droppable(options: DroppableOptions): JQuery = js.native
  
  def effect(effect: String): this.type = js.native
  def effect(effect: String, options: Any): this.type = js.native
  def effect(effect: String, options: Any, duration: String): this.type = js.native
  def effect(effect: String, options: Any, duration: String, complete: js.Function): this.type = js.native
  def effect(effect: String, options: Any, duration: Double): this.type = js.native
  def effect(effect: String, options: Any, duration: Double, complete: js.Function): this.type = js.native
  def effect(effect: String, options: Any, duration: Unit, complete: js.Function): this.type = js.native
  def effect(effect: String, options: Unit, duration: String): this.type = js.native
  def effect(effect: String, options: Unit, duration: String, complete: js.Function): this.type = js.native
  def effect(effect: String, options: Unit, duration: Double): this.type = js.native
  def effect(effect: String, options: Unit, duration: Double, complete: js.Function): this.type = js.native
  def effect(effect: String, options: Unit, duration: Unit, complete: js.Function): this.type = js.native
  def effect(options: Any): this.type = js.native
  
  def enableSelection(): JQuery = js.native
  
  def focus(delay: Double): JQuery = js.native
  def focus(delay: Double, callback: js.Function): JQuery = js.native
  
  def hide(effect: String): this.type = js.native
  def hide(effect: String, options: Any): this.type = js.native
  def hide(effect: String, options: Any, duration: String): this.type = js.native
  def hide(effect: String, options: Any, duration: String, complete: js.Function): this.type = js.native
  def hide(effect: String, options: Any, duration: Double): this.type = js.native
  def hide(effect: String, options: Any, duration: Double, complete: js.Function): this.type = js.native
  def hide(effect: String, options: Any, duration: Unit, complete: js.Function): this.type = js.native
  def hide(effect: String, options: Unit, duration: String): this.type = js.native
  def hide(effect: String, options: Unit, duration: String, complete: js.Function): this.type = js.native
  def hide(effect: String, options: Unit, duration: Double): this.type = js.native
  def hide(effect: String, options: Unit, duration: Double, complete: js.Function): this.type = js.native
  def hide(effect: String, options: Unit, duration: Unit, complete: js.Function): this.type = js.native
  def hide(options: Any): this.type = js.native
  
  var jQuery: JQueryStatic = js.native
  
  def menu(): JQuery = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_collapse")
  def menu(methodName: "collapse"): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_refresh")
  def menu(methodName: "refresh"): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_nextPage")
  def menu(methodName: "nextPage"): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_collapseAll")
  def menu(methodName: "collapseAll"): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_previousPage")
  def menu(methodName: "previousPage"): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_isFirstItem")
  def menu(methodName: "isFirstItem"): Boolean = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_select")
  def menu(methodName: "select"): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_destroy")
  def menu(methodName: "destroy"): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_next")
  def menu(methodName: "next"): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_widget")
  def menu(methodName: "widget"): JQuery = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_blur")
  def menu(methodName: "blur"): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_isLastItem")
  def menu(methodName: "isLastItem"): Boolean = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_previous")
  def menu(methodName: "previous"): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_disable")
  def menu(methodName: "disable"): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_enable")
  def menu(methodName: "enable"): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_collapseAll")
  def menu(methodName: "collapseAll", event: Unit, all: Boolean): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_collapseAll")
  def menu(methodName: "collapseAll", event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_next")
  def menu(methodName: "next", event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_select")
  def menu(methodName: "select", event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_collapse")
  def menu(methodName: "collapse", event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_nextPage")
  def menu(methodName: "nextPage", event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_previousPage")
  def menu(methodName: "previousPage", event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_previous")
  def menu(methodName: "previous", event: JQueryEventObject): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_collapseAll")
  def menu(methodName: "collapseAll", event: JQueryEventObject, all: Boolean): Unit = js.native
  @JSName("menu")
  @scala.annotation.targetName("menu_focus")
  def menu(methodName: "focus", event: JQueryEventObject, item: JQuery): Unit = js.native
  def menu(methodName: String): JQuery = js.native
  def menu(methodName: String, event: JQueryEventObject, item: JQuery): Unit = js.native
  def menu(optionLiteral: String, optionName: String): Any = js.native
  def menu(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def menu(optionLiteral: String, options: MenuOptions): Any = js.native
  def menu(options: MenuOptions): JQuery = js.native
  @JSName("menu")
  var menu_Original: Call = js.native
  
  def position(options: JQueryPositionOptions): JQuery = js.native
  
  def progressbar(): JQuery = js.native
  @JSName("progressbar")
  @scala.annotation.targetName("progressbar_widget")
  def progressbar(methodName: "widget"): JQuery = js.native
  @JSName("progressbar")
  @scala.annotation.targetName("progressbar_enable")
  def progressbar(methodName: "enable"): Unit = js.native
  @JSName("progressbar")
  @scala.annotation.targetName("progressbar_value")
  def progressbar(methodName: "value"): Any = js.native
  @JSName("progressbar")
  @scala.annotation.targetName("progressbar_disable")
  def progressbar(methodName: "disable"): Unit = js.native
  @JSName("progressbar")
  @scala.annotation.targetName("progressbar_destroy")
  def progressbar(methodName: "destroy"): Unit = js.native
  @JSName("progressbar")
  @scala.annotation.targetName("progressbar_refresh")
  def progressbar(methodName: "refresh"): Unit = js.native
  @JSName("progressbar")
  @scala.annotation.targetName("progressbar_value")
  def progressbar(methodName: "value", value: Boolean): Unit = js.native
  // number or boolean
  @JSName("progressbar")
  @scala.annotation.targetName("progressbar_value")
  def progressbar(methodName: "value", value: Double): Unit = js.native
  def progressbar(methodName: String): JQuery = js.native
  def progressbar(optionLiteral: String, optionName: String): Any = js.native
  def progressbar(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def progressbar(optionLiteral: String, options: ProgressbarOptions): Any = js.native
  def progressbar(options: ProgressbarOptions): JQuery = js.native
  
  def removeClass(classNames: String): this.type = js.native
  def removeClass(classNames: String, speed: String): this.type = js.native
  def removeClass(classNames: String, speed: String, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: String, easing: String): this.type = js.native
  def removeClass(classNames: String, speed: String, easing: String, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: String, easing: Unit, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: Double): this.type = js.native
  def removeClass(classNames: String, speed: Double, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: Double, easing: String): this.type = js.native
  def removeClass(classNames: String, speed: Double, easing: String, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: Double, easing: Unit, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: Unit, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: Unit, easing: String): this.type = js.native
  def removeClass(classNames: String, speed: Unit, easing: String, callback: js.Function): this.type = js.native
  def removeClass(classNames: String, speed: Unit, easing: Unit, callback: js.Function): this.type = js.native
  
  def removeUniqueId(): JQuery = js.native
  
  def resizable(): JQuery = js.native
  @JSName("resizable")
  @scala.annotation.targetName("resizable_disable")
  def resizable(methodName: "disable"): Unit = js.native
  @JSName("resizable")
  @scala.annotation.targetName("resizable_enable")
  def resizable(methodName: "enable"): Unit = js.native
  @JSName("resizable")
  @scala.annotation.targetName("resizable_destroy")
  def resizable(methodName: "destroy"): Unit = js.native
  @JSName("resizable")
  @scala.annotation.targetName("resizable_widget")
  def resizable(methodName: "widget"): JQuery = js.native
  def resizable(methodName: String): JQuery = js.native
  def resizable(optionLiteral: String, optionName: String): Any = js.native
  def resizable(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def resizable(optionLiteral: String, options: ResizableOptions): Any = js.native
  def resizable(options: ResizableOptions): JQuery = js.native
  
  def scrollParent(): JQuery = js.native
  
  def selectable(): JQuery = js.native
  @JSName("selectable")
  @scala.annotation.targetName("selectable_widget")
  def selectable(methodName: "widget"): JQuery = js.native
  @JSName("selectable")
  @scala.annotation.targetName("selectable_enable")
  def selectable(methodName: "enable"): Unit = js.native
  @JSName("selectable")
  @scala.annotation.targetName("selectable_disable")
  def selectable(methodName: "disable"): Unit = js.native
  @JSName("selectable")
  @scala.annotation.targetName("selectable_destroy")
  def selectable(methodName: "destroy"): Unit = js.native
  def selectable(methodName: String): JQuery = js.native
  def selectable(optionLiteral: String, optionName: String): Any = js.native
  def selectable(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def selectable(optionLiteral: String, options: SelectableOptions): Any = js.native
  def selectable(options: SelectableOptions): JQuery = js.native
  
  def selectmenu(): JQuery = js.native
  @JSName("selectmenu")
  @scala.annotation.targetName("selectmenu_close")
  def selectmenu(methodName: "close"): JQuery = js.native
  @JSName("selectmenu")
  @scala.annotation.targetName("selectmenu_destroy")
  def selectmenu(methodName: "destroy"): JQuery = js.native
  @JSName("selectmenu")
  @scala.annotation.targetName("selectmenu_widget")
  def selectmenu(methodName: "widget"): JQuery = js.native
  @JSName("selectmenu")
  @scala.annotation.targetName("selectmenu_open")
  def selectmenu(methodName: "open"): JQuery = js.native
  @JSName("selectmenu")
  @scala.annotation.targetName("selectmenu_instance")
  def selectmenu(methodName: "instance"): Any = js.native
  @JSName("selectmenu")
  @scala.annotation.targetName("selectmenu_menuWidget")
  def selectmenu(methodName: "menuWidget"): JQuery = js.native
  @JSName("selectmenu")
  @scala.annotation.targetName("selectmenu_enable")
  def selectmenu(methodName: "enable"): JQuery = js.native
  @JSName("selectmenu")
  @scala.annotation.targetName("selectmenu_disable")
  def selectmenu(methodName: "disable"): JQuery = js.native
  @JSName("selectmenu")
  @scala.annotation.targetName("selectmenu_refresh")
  def selectmenu(methodName: "refresh"): JQuery = js.native
  def selectmenu(methodName: String): JQuery = js.native
  def selectmenu(optionLiteral: String, optionName: String): Any = js.native
  def selectmenu(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def selectmenu(optionLiteral: String, options: SelectMenuOptions): Any = js.native
  def selectmenu(options: SelectMenuOptions): JQuery = js.native
  
  def show(effect: String): this.type = js.native
  def show(effect: String, options: Any): this.type = js.native
  def show(effect: String, options: Any, duration: String): this.type = js.native
  def show(effect: String, options: Any, duration: String, complete: js.Function): this.type = js.native
  def show(effect: String, options: Any, duration: Double): this.type = js.native
  def show(effect: String, options: Any, duration: Double, complete: js.Function): this.type = js.native
  def show(effect: String, options: Any, duration: Unit, complete: js.Function): this.type = js.native
  def show(effect: String, options: Unit, duration: String): this.type = js.native
  def show(effect: String, options: Unit, duration: String, complete: js.Function): this.type = js.native
  def show(effect: String, options: Unit, duration: Double): this.type = js.native
  def show(effect: String, options: Unit, duration: Double, complete: js.Function): this.type = js.native
  def show(effect: String, options: Unit, duration: Unit, complete: js.Function): this.type = js.native
  def show(options: Any): this.type = js.native
  
  def slider(): JQuery = js.native
  @JSName("slider")
  @scala.annotation.targetName("slider_refresh")
  def slider(methodName: "refresh"): Unit = js.native
  @JSName("slider")
  @scala.annotation.targetName("slider_widget")
  def slider(methodName: "widget"): JQuery = js.native
  @JSName("slider")
  @scala.annotation.targetName("slider_disable")
  def slider(methodName: "disable"): Unit = js.native
  @JSName("slider")
  @scala.annotation.targetName("slider_destroy")
  def slider(methodName: "destroy"): Unit = js.native
  @JSName("slider")
  @scala.annotation.targetName("slider_values")
  def slider(methodName: "values"): js.Array[Double] = js.native
  @JSName("slider")
  @scala.annotation.targetName("slider_value")
  def slider(methodName: "value"): Double = js.native
  @JSName("slider")
  @scala.annotation.targetName("slider_enable")
  def slider(methodName: "enable"): Unit = js.native
  @JSName("slider")
  @scala.annotation.targetName("slider_values")
  def slider(methodName: "values", index: Double): Double = js.native
  @JSName("slider")
  @scala.annotation.targetName("slider_values")
  def slider(methodName: "values", index: Double, value: Double): Unit = js.native
  @JSName("slider")
  @scala.annotation.targetName("slider_value")
  def slider(methodName: "value", value: Double): Unit = js.native
  @JSName("slider")
  @scala.annotation.targetName("slider_values")
  def slider(methodName: "values", values: js.Array[Double]): Unit = js.native
  def slider(methodName: String): JQuery = js.native
  def slider(methodName: String, index: Double, value: Double): Unit = js.native
  def slider(methodName: String, values: js.Array[Double]): Unit = js.native
  def slider(optionLiteral: String, optionName: String): Any = js.native
  def slider(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def slider(optionLiteral: String, options: SliderOptions): Any = js.native
  def slider(options: SliderOptions): JQuery = js.native
  
  def sortable(): JQuery = js.native
  @JSName("sortable")
  @scala.annotation.targetName("sortable_disable")
  def sortable(methodName: "disable"): Unit = js.native
  @JSName("sortable")
  @scala.annotation.targetName("sortable_destroy")
  def sortable(methodName: "destroy"): Unit = js.native
  @JSName("sortable")
  @scala.annotation.targetName("sortable_widget")
  def sortable(methodName: "widget"): JQuery = js.native
  @JSName("sortable")
  @scala.annotation.targetName("sortable_toArray")
  def sortable(methodName: "toArray"): js.Array[String] = js.native
  @JSName("sortable")
  @scala.annotation.targetName("sortable_serialize")
  def sortable(methodName: "serialize"): String = js.native
  @JSName("sortable")
  @scala.annotation.targetName("sortable_enable")
  def sortable(methodName: "enable"): Unit = js.native
  @JSName("sortable")
  @scala.annotation.targetName("sortable_toArray")
  def sortable(methodName: "toArray", options: Attribute): js.Array[String] = js.native
  @JSName("sortable")
  @scala.annotation.targetName("sortable_serialize")
  def sortable(methodName: "serialize", options: Expression): String = js.native
  def sortable(methodName: String): JQuery = js.native
  def sortable(optionLiteral: String, optionName: String): Any = js.native
  def sortable(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def sortable(optionLiteral: String, options: SortableOptions): Any = js.native
  def sortable(options: SortableOptions): JQuery = js.native
  
  def spinner(): JQuery = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_pageUp")
  def spinner(methodName: "pageUp"): Unit = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_enable")
  def spinner(methodName: "enable"): Unit = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_disable")
  def spinner(methodName: "disable"): Unit = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_destroy")
  def spinner(methodName: "destroy"): Unit = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_pageDown")
  def spinner(methodName: "pageDown"): Unit = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_stepDown")
  def spinner(methodName: "stepDown"): Unit = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_stepUp")
  def spinner(methodName: "stepUp"): Unit = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_widget")
  def spinner(methodName: "widget"): JQuery = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_value")
  def spinner(methodName: "value"): Double = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_pageUp")
  def spinner(methodName: "pageUp", pages: Double): Unit = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_pageDown")
  def spinner(methodName: "pageDown", pages: Double): Unit = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_stepDown")
  def spinner(methodName: "stepDown", steps: Double): Unit = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_stepUp")
  def spinner(methodName: "stepUp", steps: Double): Unit = js.native
  @JSName("spinner")
  @scala.annotation.targetName("spinner_value")
  def spinner(methodName: "value", value: Double): Unit = js.native
  def spinner(methodName: String): JQuery = js.native
  def spinner(optionLiteral: String, optionName: String): Any = js.native
  def spinner(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def spinner(optionLiteral: String, options: SpinnerOptions): Any = js.native
  def spinner(options: SpinnerOptions): JQuery = js.native
  
  def switchClass(removeClassName: String, addClassName: String): this.type = js.native
  def switchClass(removeClassName: String, addClassName: String, duration: String): this.type = js.native
  def switchClass(removeClassName: String, addClassName: String, duration: String, easing: String): this.type = js.native
  def switchClass(
    removeClassName: String,
    addClassName: String,
    duration: String,
    easing: String,
    complete: js.Function
  ): this.type = js.native
  def switchClass(
    removeClassName: String,
    addClassName: String,
    duration: String,
    easing: Unit,
    complete: js.Function
  ): this.type = js.native
  def switchClass(removeClassName: String, addClassName: String, duration: Double): this.type = js.native
  def switchClass(removeClassName: String, addClassName: String, duration: Double, easing: String): this.type = js.native
  def switchClass(
    removeClassName: String,
    addClassName: String,
    duration: Double,
    easing: String,
    complete: js.Function
  ): this.type = js.native
  def switchClass(
    removeClassName: String,
    addClassName: String,
    duration: Double,
    easing: Unit,
    complete: js.Function
  ): this.type = js.native
  def switchClass(removeClassName: String, addClassName: String, duration: Unit, easing: String): this.type = js.native
  def switchClass(
    removeClassName: String,
    addClassName: String,
    duration: Unit,
    easing: String,
    complete: js.Function
  ): this.type = js.native
  def switchClass(removeClassName: String, addClassName: String, duration: Unit, easing: Unit, complete: js.Function): this.type = js.native
  
  def tabs(): JQuery = js.native
  @JSName("tabs")
  @scala.annotation.targetName("tabs_destroy")
  def tabs(methodName: "destroy"): Unit = js.native
  @JSName("tabs")
  @scala.annotation.targetName("tabs_disable")
  def tabs(methodName: "disable"): Unit = js.native
  @JSName("tabs")
  @scala.annotation.targetName("tabs_refresh")
  def tabs(methodName: "refresh"): Unit = js.native
  @JSName("tabs")
  @scala.annotation.targetName("tabs_enable")
  def tabs(methodName: "enable"): Unit = js.native
  @JSName("tabs")
  @scala.annotation.targetName("tabs_widget")
  def tabs(methodName: "widget"): JQuery = js.native
  @JSName("tabs")
  @scala.annotation.targetName("tabs_select")
  def tabs(methodName: "select", index: Double): JQuery = js.native
  @JSName("tabs")
  @scala.annotation.targetName("tabs_enable")
  def tabs(methodName: "enable", index: Double): Unit = js.native
  @JSName("tabs")
  @scala.annotation.targetName("tabs_load")
  def tabs(methodName: "load", index: Double): Unit = js.native
  @JSName("tabs")
  @scala.annotation.targetName("tabs_disable")
  def tabs(methodName: "disable", index: Double): Unit = js.native
  def tabs(methodName: String): JQuery = js.native
  def tabs(optionLiteral: String, optionName: String): Any = js.native
  def tabs(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def tabs(optionLiteral: String, options: TabsOptions): Any = js.native
  def tabs(options: TabsOptions): JQuery = js.native
  
  def toggle(effect: String): this.type = js.native
  def toggle(effect: String, options: Any): this.type = js.native
  def toggle(effect: String, options: Any, duration: String): this.type = js.native
  def toggle(effect: String, options: Any, duration: String, complete: js.Function): this.type = js.native
  def toggle(effect: String, options: Any, duration: Double): this.type = js.native
  def toggle(effect: String, options: Any, duration: Double, complete: js.Function): this.type = js.native
  def toggle(effect: String, options: Any, duration: Unit, complete: js.Function): this.type = js.native
  def toggle(effect: String, options: Unit, duration: String): this.type = js.native
  def toggle(effect: String, options: Unit, duration: String, complete: js.Function): this.type = js.native
  def toggle(effect: String, options: Unit, duration: Double): this.type = js.native
  def toggle(effect: String, options: Unit, duration: Double, complete: js.Function): this.type = js.native
  def toggle(effect: String, options: Unit, duration: Unit, complete: js.Function): this.type = js.native
  def toggle(options: Any): this.type = js.native
  
  def toggleClass(className: String): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: String): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: String, easing: String): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: String, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: String, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Double): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Double, easing: String): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Double, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Double, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Unit, easing: String): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Unit, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Boolean, duration: Unit, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: String, easing: String): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: String, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: String, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Double): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Double, easing: String): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Double, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Double, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Unit, easing: String): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Unit, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, aswitch: Unit, duration: Unit, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, duration: String): this.type = js.native
  def toggleClass(className: String, duration: String, easing: String): this.type = js.native
  def toggleClass(className: String, duration: String, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, duration: String, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, duration: Double): this.type = js.native
  def toggleClass(className: String, duration: Double, easing: String): this.type = js.native
  def toggleClass(className: String, duration: Double, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, duration: Double, easing: Unit, complete: js.Function): this.type = js.native
  def toggleClass(className: String, duration: Unit, easing: String): this.type = js.native
  def toggleClass(className: String, duration: Unit, easing: String, complete: js.Function): this.type = js.native
  def toggleClass(className: String, duration: Unit, easing: Unit, complete: js.Function): this.type = js.native
  
  def tooltip(): JQuery = js.native
  @JSName("tooltip")
  @scala.annotation.targetName("tooltip_destroy")
  def tooltip(methodName: "destroy"): Unit = js.native
  @JSName("tooltip")
  @scala.annotation.targetName("tooltip_open")
  def tooltip(methodName: "open"): Unit = js.native
  @JSName("tooltip")
  @scala.annotation.targetName("tooltip_enable")
  def tooltip(methodName: "enable"): Unit = js.native
  @JSName("tooltip")
  @scala.annotation.targetName("tooltip_widget")
  def tooltip(methodName: "widget"): JQuery = js.native
  @JSName("tooltip")
  @scala.annotation.targetName("tooltip_close")
  def tooltip(methodName: "close"): Unit = js.native
  @JSName("tooltip")
  @scala.annotation.targetName("tooltip_disable")
  def tooltip(methodName: "disable"): Unit = js.native
  def tooltip(methodName: String): JQuery = js.native
  def tooltip(optionLiteral: String, optionName: String): Any = js.native
  def tooltip(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def tooltip(optionLiteral: String, options: TooltipOptions): Any = js.native
  def tooltip(options: TooltipOptions): JQuery = js.native
  
  def uniqueId(): JQuery = js.native
  
  def widget(methodName: String): JQuery = js.native
  def widget(optionLiteral: String, optionName: String): Any = js.native
  def widget(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def widget(optionLiteral: String, options: WidgetOptions): Any = js.native
  def widget(options: AccordionOptions): JQuery = js.native
  def widget(options: WidgetOptions): JQuery = js.native
  def widget[T](name: String, base: js.Function, prototype: T & (ThisType[T & WidgetCommonProperties])): JQuery = js.native
  def widget[T](name: String, prototype: T & (ThisType[T & WidgetCommonProperties])): JQuery = js.native
  @JSName("widget")
  var widget_Original: Widget = js.native
  
  def zIndex(): Double = js.native
  def zIndex(zIndex: Double): JQuery = js.native
}
